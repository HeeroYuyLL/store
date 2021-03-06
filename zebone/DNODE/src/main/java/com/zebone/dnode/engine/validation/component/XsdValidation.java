package com.zebone.dnode.engine.validation.component;

import com.zebone.dnode.engine.validation.dto.ValidationResult;
import com.zebone.dnode.engine.validation.dto.XsdValidationPara;


/**
 * xsd组件校验接口
 * @author 陈阵 
 * @date 2013-8-3 上午8:28:44
 */
public interface XsdValidation {
	
	/**
	 * 验证重复性、可选性
	 * @return ValidationResult 校验结果
	 * @author 陈阵 
	 * @date 2013-8-3 上午8:31:48
	 */
	public ValidationResult validation(XsdValidationPara xsdValidationPara);
	
	
}
