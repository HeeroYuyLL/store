import axios from 'axios'
import { message } from 'antd'
import qs from 'qs'
import { BACK_BASE_URL } from './utils/constants'
import { getItem, removeItem } from './utils/store'

// 全局默认值
axios.defaults.baseURL = BACK_BASE_URL;
axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';
// axios.defaults.timeout = 5000;

// 添加请求拦截器
axios.interceptors.request.use(function(config) {
    // 在发送请求之前在header里加入token，并转换参数为form形式提交
    config.data = qs.stringify(config.data);
    // 判断是否存在token，如果存在的话，则每个http header都加上token
    const userInfo = JSON.parse(getItem("token"));
    if (userInfo && userInfo.token) {
        config.headers.Authorization = userInfo.token;
    }
	return config;
}, function(error) {
    // 对请求错误做些什么
    errorHandle(error);
});

// 添加响应拦截器
axios.interceptors.response.use(function(response) {
	// 对响应数据做点什么
    if (response.data && response.data.code !== '200') {
        if (response.data.code === '402') {
            // 删除localStorage里的用户信息
            removeItem("token");
            window.location.href = "/login";
            return null;
        }
        const errorMsg = response.data.text ? response.data.text : response.data.code;
        message.error(errorMsg);
        return null;
	}
    return response.data;
}, function(error) {
    // 对响应错误做点什么
    errorHandle(error);
});

function errorHandle(error) {
    if (error.response) {
        // 请求已发出，但服务器响应的状态码不在 2xx 范围内
        console.log(error.response.data);
        console.log(error.response.status);
        console.log(error.response.headers);
    } else {
        // Something happened in setting up the request that triggered an Error
        console.log('Error', JSON.stringify(error));      
    }
    message.error("服务器请求失败：" + error.message);
}