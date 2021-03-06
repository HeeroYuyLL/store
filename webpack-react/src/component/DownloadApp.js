//import React from 'react';
import './css/styles.css';

class DownloadApp extends React.Component {	
	// 静态属性是ES7才支持的语法
	static defaultProps = {
		domain: "https://app.starcharge.com/"
	}

	render() {
		return (
			<div className="carbon_btn">
				<a href={this.props.domain + "downloadApp.do"}>下载星星充电</a>
			</div>
		);
	}
  
}
/* ES6可以定义静态方法
DownloadApp.defaultProps = {
    domain: "https://app.starcharge.com/"
}
*/
export default DownloadApp;
