package com.zebone.dnode.engine.validation.component;

import com.zebone.dnode.engine.validation.dto.FieldTypeValidationPara;
import com.zebone.dnode.engine.validation.dto.ValidationResult;




/**
 * 值域验证接口类
 * @author 陈阵 
 * @date 2013-7-31 下午2:18:55
 */
public interface FieldTypeValidation {
	
	/**
	 * 验证接口方法
	 * @param fieldTypeValidationPara
	 * @author 陈阵 
	 * @date 2013-7-31 下午2:19:18
	 */
	ValidationResult validation(FieldTypeValidationPara fieldTypeValidationPara);
}
