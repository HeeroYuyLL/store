import React from 'react'
import { withRouter } from 'react-router-dom'
import { LOGIN_UNCHECK_URLS } from '../../utils/constants'

// 登录认证过滤器
@withRouter
class AuthFilter extends React.Component {
    componentWillMount() {
        // 判断url是否需要校验
        let pathname = this.props.location.pathname;
        if (LOGIN_UNCHECK_URLS.indexOf(pathname) > -1) {
            return;
        }
        // 判断是否有登录信息
        if (!localStorage.getItem("token")) {
            // 没有则跳转到login页面
            this.props.history.push('/login');
        } 
    }

    render() {        
        return null;
    }
}

export default AuthFilter;