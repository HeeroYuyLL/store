var getDatasByPage = function(){
	var data = "{";
	$(".tasksj").find("input[type='hidden']").each(function(){
		data += $(this).attr("name")+":'"+$(this).val()+"',";
	});
	$(".tasksj").find("input[type='text']").each(function(){
		data += $(this).attr("name")+":'"+$(this).val()+"',";
	});
	$(".tasksj").find("select").each(function(){
		data += $(this).attr("name")+":'"+$(this).val()+"',";
	});
	
	var taskFreq = "";
	var taskTimeSm = "";
	var timelx = $("#timelx").val();
	var date = new Date();
	if(timelx == 1){
		taskFreq = "";
		taskTimeSm = ";1;;;;;;";
		if($("input[name='sfcf']").attr("checked")){
			
		}
	}else if(timelx == 2){
		var a = $("#secondTime").val();
		var b = $("#minuteTime").val();
		if(a!=''){
			taskTimeSm = ";2;"+a+";;;;;";
			taskFreq = "0/"+a+" * * * * ?";
		}
		if(b!=''){
			taskFreq = "0 0/"+b+" * * * ?";
			taskTimeSm = ";2;;"+b+";;;;";
		}
	}else if(timelx == 3){
		if($("input[name='sfcf']").attr("checked")){
			taskFreq = "0 "+$("#minute").val()+" "+$("#hour").val()+" * * ?";
			taskTimeSm = "1;3;;;"+$("#hour").val()+";"+$("#minute").val()+";;";
		}else{
			var day = date.getDate();
			var month = date.getMonth()+1;
			var year = date.getFullYear();
			taskFreq = "0 "+$("#minute").val()+" "+$("#hour").val()+" "+day+" "+month+" ? "+year;
			taskTimeSm = ";3;;;"+$("#hour").val()+";"+$("#minute").val()+";;";
		}
	}else if(timelx == 4){
		taskFreq = "0 "+$("#minute").val()+" "+$("#hour").val()+" ? * "+$("#week").val();
		taskTimeSm = ";4;;;"+$("#hour").val()+";"+$("#minute").val()+";"+$("#week").val()+";";
	}else if(timelx == 5){
		if($("input[name='sfcf']").attr("checked")){
			taskFreq = "0 "+$("#minute").val()+" "+$("#hour").val()+" "+$("#day").val()+" * ?";
			taskTimeSm = "1;5;;;"+$("#hour").val()+";"+$("#minute").val()+";;"+$("#day").val();
		}else{
			var month = date.getMonth()+1;
			var year = date.getFullYear();
			taskFreq = "0 "+$("#minute").val()+" "+$("#hour").val()+" "+$("#day").val()+" "+month+" ? "+year;
			taskTimeSm = ";5;;;"+$("#hour").val()+";"+$("#minute").val()+";;"+$("#day").val();
		}
	}
	
	data += "taskFreq:'"+taskFreq+"',";
	data += "taskFreqSm:'"+taskTimeSm+"',";
	
	var clearData="";
	$("#colDiv").find(".colConf").each(function(){
		var obj = this;
		var a = "";
		$(obj).find("select").each(function(){
			if($(this).val() != '-1' && $(this).val() != ''){
				a += $(this).attr("clearType")+";"+$(this).val()+"~";
			}
		});
		if($(obj).find("input[type='text']").val()!= ''){
			a += "0;"+$(obj).find("input[type='text']").val()+"~";
		}
		if(a.length>0){
			clearData +=$(obj).find("input[type='hidden']").val()+"~";
			a = a.substring(0,a.length-1);
			clearData += a + "^";
		}
	});
	if(clearData.length > 1) clearData = clearData.substring(0,clearData.length-1);
	data += "clearData:'"+clearData+"'}";
	return data;
};
var saveDatas = function(data){
	$.ajax({
		url:'clear/clearInfoSave.zb',
		type: 'POST',
		cache: false,
		data: eval('('+data+')'),
		dataType: 'json',
		success: function(res){
			$(document.body).unmask();
			if(res.success){
				JDialog.tip(res.msg);
				$("input[name='id']").val(res.id);
				$("input[name='taskId']").val(res.taskId);
			}else{
				JDialog.tip(res.msg);
			}
		},
		error: function(XMLHttpRequest, textStatus, errorThrown){
			JDialog.tip("服务器异常，保存失败...");
			$(document.body).unmask();
		}
	});
};

var setCompantent = function(obj,bool,type){
	obj.attr("disabled",bool);
	if(bool) {
		if(type == "select"){
			obj.selectOption("");
		}else if(type=="text"){
			obj.val("");
		}
	}
};

var timelxConf = function(timelx){
	if(timelx == 1){
		$("input[name='sfcf']").attr("checked",false);
		$("input[name='sfcf']").attr("disabled",true);
		setCompantent($("#secondTime"),true,"text");
		setCompantent($("#minuteTime"),true,"text");
		setCompantent($("#hour"),true,"text");
		setCompantent($("#minute"),true,"text");
		setCompantent($("#week"),true,"select");
		setCompantent($("#day"),true,"text");
	}else if(timelx == 2){
		$("input[name='sfcf']").attr("checked",false);
		$("input[name='sfcf']").attr("disabled",true);
		setCompantent($("#secondTime"),false,"text");
		setCompantent($("#minuteTime"),false,"text");
		setCompantent($("#hour"),true,"text");
		setCompantent($("#minute"),true,"text");
		setCompantent($("#week"),true,"select");
		setCompantent($("#day"),true,"text");
	}else if(timelx == 3){
		$("input[name='sfcf']").attr("disabled",false);
		setCompantent($("#secondTime"),true,"text");
		setCompantent($("#minuteTime"),true,"text");
		setCompantent($("#hour"),false,"text");
		setCompantent($("#minute"),false,"text");
		setCompantent($("#week"),true,"select");
		setCompantent($("#day"),true,"text");
	}else if(timelx == 4){
		$("input[name='sfcf']").attr("checked",false);
		$("input[name='sfcf']").attr("disabled",true);
		setCompantent($("#secondTime"),true,"text");
		setCompantent($("#minuteTime"),true,"text");
		setCompantent($("#hour"),false,"text");
		setCompantent($("#minute"),false,"text");
		setCompantent($("#week"),false,"select");
		setCompantent($("#day"),true,"text");
	}else if(timelx == 5){
		$("input[name='sfcf']").attr("disabled",false);
		setCompantent($("#secondTime"),true,"text");
		setCompantent($("#minuteTime"),true,"text");
		setCompantent($("#hour"),false,"text");
		setCompantent($("#minute"),false,"text");
		setCompantent($("#week"),true,"select");
		setCompantent($("#day"),false,"text");
	}
};
$(function(){
	$("#colDiv").height($(document.body).height()-290);
	
	$("#savebtn").click(function(){
		var tableId = $("input[name='tableId']").val();
		if(!tableId){
			JDialog.tip('请选择清洗表再进行配置');
			return;
		}
		//检查数据填入是否合格
		if(!checkAll("checkForm")){
			JDialog.tip('请检查表单填写的数据');
			return;
		}
		if($("#timelx").val() == 2){
			var a = $("#secondTime").val();
			var b = $("#minuteTime").val();
			if((a!=''&&b!='')||(a=='' && b=='')){
				JDialog.tip('时间间隔秒和分钟对一个进行设置');
				return;
			}
		}
		$(document.body).mask("正在保存，请稍后...");
		var datas = getDatasByPage();
		saveDatas(datas);
	});
	
	$("#publishbtn").click(function(){
		var id = $("input[name='id']").val();
		if(!id){
			JDialog.tip('请选择有任务的清洗表再发布');
			return;
		}
		var s = "";
		if($("input[name='deployFlag']").val() == '1'){
			s = "取消";
		}
		$(document.body).mask("正在"+s+"发布，请稍后...");
		$.ajax({
			url:'clear/clearInfoPublish.zb',
			type: 'POST',
			cache: false,
			data: eval("({id:'"+id+"'})"),
			dataType: 'json',
			success: function(res){
				$(document.body).unmask();
				if(res.success){
					JDialog.tip(s+"发布成功");
					$("input[name='deployFlag']").val(res.deployFlag);
					var str = "";
					if(res.deployFlag =='1'){
						$("#publishbtn").find("span").text("已发布");
					}else{
						$("#publishbtn").find("span").text("发布");
					}
				}else{
					JDialog.tip(s+"发布失败");
				}
			},
			error: function(XMLHttpRequest, textStatus, errorThrown){
				JDialog.tip("服务器异常，操作失败...");
				$(document.body).unmask();
			}
		});
	});
	
	$("#timelx").change(function(){
		var timelx = $(this).val();
		timelxConf(timelx);
	});
	
	$("#secondTime").checkForm(function(){
		var val = $.trim($("#secondTime").val());
		var reg = /^([1-9]\d*|0)$/;
		if(val.length>0){
			if(reg.test(val)){
				
			}else{
				return "请输入整数";
			}
		}
		return "";
	});
	
	$("#minuteTime").checkForm(function(){
		var val = $.trim($("#minuteTime").val());
		var reg = /^([1-9]\d*|0)$/;
		if(val.length>0){
			if(reg.test(val)){
				
			}else{
				return "请输入整数";
			}
		}
		return "";
	});
	
	$("#hour").checkForm(function(){
		var val = $.trim($("#hour").val());
		var reg = /^([1-9]\d*|0)$/;
		if(val.length>0){
			if(reg.test(val)){
				if(parseInt(val)>23){
					return "请输入0~23间的整数";
				}
			}else{
				return "请输入0~23间的整数";
			}
		}else{
			if(!$("#hour").attr("disabled")) return "请输入0~23间的整数";
		}
		return "";
	});
	
	$("#minute").checkForm(function(){
		var val = $.trim($("#minute").val());
		var reg = /^([1-9]\d*|0)$/;
		if(val.length>0){
			if(reg.test(val)){
				if(parseInt(val)>59){
					return "请输入0~59间的整数";
				}
			}else{
				return "请输入0~59间的整数";
			}
		}else{
			if(!$("#minute").attr("disabled")) return "请输入0~59间的整数";
		}
		return "";
	});
	
	$("#day").checkForm(function(){
		var val = $.trim($("#day").val());
		var reg = /^([1-9]\d*)$/;
		var date = new Date();
		date.setMonth(date.getMonth()+1);
		date.setDate(1);
		date.setDate(date.getDate()-1);
		var day = date.getDate();
		if(val.length>0){
			if(reg.test(val)){
				if(parseInt(val)>day){
					return "请输入1~"+day+"间的整数";
				}
			}else{
				return "请输入1~"+day+"间的整数";
			}
		}else{
			if(!$("#day").attr("disabled")) return "请输入1~"+day+"间的整数";
		}
		return "";
	});
	
	if(tasksjpz!=''){
		var str = tasksjpz.split(";");
		if(str[0]==1){
			$("input[name='sfcf']").attr("checked",true);
		}
		$("#timelx").selectOption(str[1]);
		$("#secondTime").val(str[2]);
		$("#minuteTime").val(str[3]);
		$("#hour").val(str[4]);
		$("#minute").val(str[5]);
		$("#week").selectOption(str[6]);
		$("#day").val(str[7]);
		timelxConf(str[1]);
	}
})