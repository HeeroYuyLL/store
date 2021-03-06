package com.zebone.dip.ws.resource.pojo;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("request")
public class FamilyRequest {

	@XStreamAlias("head")
	private RequestHead requestHead;
	
	@XStreamAlias("body")
	private FamilyBody body;
	
	
	
	public RequestHead getRequestHead() {
		return requestHead;
	}

	public void setRequestHead(RequestHead requestHead) {
		this.requestHead = requestHead;
	}

	public FamilyBody getBody() {
		return body;
	}

	public void setBody(FamilyBody body) {
		this.body = body;
	}

	public static class FamilyBody{
		@XStreamAlias("item")
		private RequestFamilyParam family;

		public RequestFamilyParam getFamily() {
			return family;
		}

		public void setFamily(RequestFamilyParam family) {
			this.family = family;
		}
	}
	
	public static class RequestFamilyParam{
		/**
		 * 家庭id
		 */
		private String famiId;
		
		/**
		 * 家庭档案编号
		 */
		private String famiCode;
		
		/**
		 * 房东姓名
		 */
		private String landlordName;

		/**
		 * 房东电话
		 */
		@XStreamAlias("landlordTEL")
		private String landlordTel;

		/**
		 * 户主姓名
		 */
		private String householdName;

		/**
		 * 户籍人口数
		 */
		private String housePopuNumber;

		/**
		 * 常住人口数
		 */
		private String residentPopuNumber;

		/**
		 * 居住类型
		 */
		private String liveType;

		/**
		 * 总面积（平方米）
		 */
		private String totalArea;

		/**
		 * 人均面积（平方米）
		 */
		private String perArea;

		/**
		 * 家庭联系电话
		 */
		@XStreamAlias("familyTEL")
		private String familyTel;

		/**
		 * 纸质档案编号
		 */
		private String paperFileNo;

		/**
		 * 住房性质
		 */
		private String housingPropertyCode;

		/**
		 * 住房间数
		 */
		private String housingNumber;

		/**
		 * 住房采光
		 */
		private String housingLightingCode;

		/**
		 * 管理机构
		 */
		private String familyOrgCode;

		/**
		 * 责任医生
		 */
		private String doctorCode;

		/**
		 * 家庭地址编码
		 */
		private String familyAddrCode;

		/**
		 * 家庭地址-详细地址
		 */
		private String familyAddr;

		/**
		 * 房屋类型
		 */
		private String housingCode;

		/**
		 * 厨房
		 */
		private String kitchenCode;

		/**
		 * 厨房排风设施
		 */
		private String kitchenVentCode;

		/**
		 * 家庭属性代码
		 */
		private String familyProCode;

		/**
		 * 饮水
		 */
		private String waterCode;

		/**
		 * 燃料
		 */
		private String fuelCode;

		/**
		 * 家庭卫生厕所
		 */
		@XStreamAlias("toiletsCode")
		private String toiletsType;

		/**
		 * 禽畜栏位置代码
		 */
		private String livestockCode;

		/**
		 * 家用电器代码
		 */
		private String elecDeviceCode;

		/**
		 * 交通工具
		 */
		private String vehicleCode;

		/**
		 * 经济状况
		 */
		private String econStatusCode;

		/**
		 * 人均月收入
		 */
		private String perMonthIncomeCode;

		/**
		 * 家庭总支出（元/人/月）
		 */
		private String famiTotalPay;

		/**
		 * 饮食支出（元/人/月）
		 */
		private String famiFoodPay;

		/**
		 * 垃圾处理
		 */
		private String garDisposalCode;

		/**
		 * 污水处理
		 */
		private String sewageDiposalCode;

		/**
		 * 文体设备
		 */
		@XStreamAlias("cultureSportCode")
		private String cultSportCode;

		/**
		 * 建档日期
		 */
		private String fileDate;

		/**
		 * 建档医生
		 */
		private String fileDoctorCode;

		/**
		 * 登记日期
		 */
		private String inputDate;

		/**
		 * 登记人
		 */
		private String inputUserCode;

		/**
		 * 家庭类型代码
		 */
		private String familyTypeCode;

		/**
		 * 家庭主要问题
		 */
		private String familyMainProblem;

		/**
		 * 备注
		 */
		private String remark;

		/**
		 * 上传时间
		 */
		private String createTime;

		/**
		 * 上传用户
		 */
		private String userId;
		
		/**
		 * 上传机构
		 */
		private String orgCode;
		
		@XStreamAlias("members")
		private Members members;


		public Members getMembers() {
			return members;
		}

		public void setMembers(Members members) {
			this.members = members;
		}

		public String getFamiId() {
			return famiId;
		}

		public void setFamiId(String famiId) {
			this.famiId = famiId;
		}

		public String getFamiCode() {
			return famiCode;
		}

		public void setFamiCode(String famiCode) {
			this.famiCode = famiCode;
		}

		public String getLandlordName() {
			return landlordName;
		}

		public void setLandlordName(String landlordName) {
			this.landlordName = landlordName;
		}

		public String getLandlordTel() {
			return landlordTel;
		}

		public void setLandlordTel(String landlordTel) {
			this.landlordTel = landlordTel;
		}

		public String getHouseholdName() {
			return householdName;
		}

		public void setHouseholdName(String householdName) {
			this.householdName = householdName;
		}

		public String getLiveType() {
			return liveType;
		}

		public void setLiveType(String liveType) {
			this.liveType = liveType;
		}

		public String getTotalArea() {
			return totalArea;
		}

		public void setTotalArea(String totalArea) {
			this.totalArea = totalArea;
		}

		public String getPerArea() {
			return perArea;
		}

		public void setPerArea(String perArea) {
			this.perArea = perArea;
		}

		public String getFamilyTel() {
			return familyTel;
		}

		public void setFamilyTel(String familyTel) {
			this.familyTel = familyTel;
		}

		public String getPaperFileNo() {
			return paperFileNo;
		}

		public void setPaperFileNo(String paperFileNo) {
			this.paperFileNo = paperFileNo;
		}

		public String getHousingPropertyCode() {
			return housingPropertyCode;
		}

		public void setHousingPropertyCode(String housingPropertyCode) {
			this.housingPropertyCode = housingPropertyCode;
		}

		public String getHousePopuNumber() {
			return housePopuNumber;
		}

		public void setHousePopuNumber(String housePopuNumber) {
			this.housePopuNumber = housePopuNumber;
		}

		public String getResidentPopuNumber() {
			return residentPopuNumber;
		}

		public void setResidentPopuNumber(String residentPopuNumber) {
			this.residentPopuNumber = residentPopuNumber;
		}

		public String getHousingNumber() {
			return housingNumber;
		}

		public void setHousingNumber(String housingNumber) {
			this.housingNumber = housingNumber;
		}

		public String getHousingLightingCode() {
			return housingLightingCode;
		}

		public void setHousingLightingCode(String housingLightingCode) {
			this.housingLightingCode = housingLightingCode;
		}

		public String getFamilyOrgCode() {
			return familyOrgCode;
		}

		public void setFamilyOrgCode(String familyOrgCode) {
			this.familyOrgCode = familyOrgCode;
		}

		public String getDoctorCode() {
			return doctorCode;
		}

		public void setDoctorCode(String doctorCode) {
			this.doctorCode = doctorCode;
		}

		public String getFamilyAddrCode() {
			return familyAddrCode;
		}

		public void setFamilyAddrCode(String familyAddrCode) {
			this.familyAddrCode = familyAddrCode;
		}

		public String getFamilyAddr() {
			return familyAddr;
		}

		public void setFamilyAddr(String familyAddr) {
			this.familyAddr = familyAddr;
		}

		public String getHousingCode() {
			return housingCode;
		}

		public void setHousingCode(String housingCode) {
			this.housingCode = housingCode;
		}

		public String getKitchenCode() {
			return kitchenCode;
		}

		public void setKitchenCode(String kitchenCode) {
			this.kitchenCode = kitchenCode;
		}

		public String getKitchenVentCode() {
			return kitchenVentCode;
		}

		public void setKitchenVentCode(String kitchenVentCode) {
			this.kitchenVentCode = kitchenVentCode;
		}

		public String getFamilyProCode() {
			return familyProCode;
		}

		public void setFamilyProCode(String familyProCode) {
			this.familyProCode = familyProCode;
		}

		public String getWaterCode() {
			return waterCode;
		}

		public void setWaterCode(String waterCode) {
			this.waterCode = waterCode;
		}

		public String getFuelCode() {
			return fuelCode;
		}

		public void setFuelCode(String fuelCode) {
			this.fuelCode = fuelCode;
		}

		public String getToiletsType() {
			return toiletsType;
		}

		public void setToiletsType(String toiletsType) {
			this.toiletsType = toiletsType;
		}

		public String getLivestockCode() {
			return livestockCode;
		}

		public void setLivestockCode(String livestockCode) {
			this.livestockCode = livestockCode;
		}

		public String getElecDeviceCode() {
			return elecDeviceCode;
		}

		public void setElecDeviceCode(String elecDeviceCode) {
			this.elecDeviceCode = elecDeviceCode;
		}

		public String getVehicleCode() {
			return vehicleCode;
		}

		public void setVehicleCode(String vehicleCode) {
			this.vehicleCode = vehicleCode;
		}

		public String getEconStatusCode() {
			return econStatusCode;
		}

		public void setEconStatusCode(String econStatusCode) {
			this.econStatusCode = econStatusCode;
		}

		public String getPerMonthIncomeCode() {
			return perMonthIncomeCode;
		}

		public void setPerMonthIncomeCode(String perMonthIncomeCode) {
			this.perMonthIncomeCode = perMonthIncomeCode;
		}

		public String getFamiTotalPay() {
			return famiTotalPay;
		}

		public void setFamiTotalPay(String famiTotalPay) {
			this.famiTotalPay = famiTotalPay;
		}

		public String getFamiFoodPay() {
			return famiFoodPay;
		}

		public void setFamiFoodPay(String famiFoodPay) {
			this.famiFoodPay = famiFoodPay;
		}

		public String getGarDisposalCode() {
			return garDisposalCode;
		}

		public void setGarDisposalCode(String garDisposalCode) {
			this.garDisposalCode = garDisposalCode;
		}

		public String getSewageDiposalCode() {
			return sewageDiposalCode;
		}

		public void setSewageDiposalCode(String sewageDiposalCode) {
			this.sewageDiposalCode = sewageDiposalCode;
		}

		public String getCultSportCode() {
			return cultSportCode;
		}

		public void setCultSportCode(String cultSportCode) {
			this.cultSportCode = cultSportCode;
		}

		public String getFileDate() {
			return fileDate;
		}

		public void setFileDate(String fileDate) {
			this.fileDate = fileDate;
		}

		public String getFileDoctorCode() {
			return fileDoctorCode;
		}

		public void setFileDoctorCode(String fileDoctorCode) {
			this.fileDoctorCode = fileDoctorCode;
		}

		public String getInputDate() {
			return inputDate;
		}

		public void setInputDate(String inputDate) {
			this.inputDate = inputDate;
		}

		public String getInputUserCode() {
			return inputUserCode;
		}

		public void setInputUserCode(String inputUserCode) {
			this.inputUserCode = inputUserCode;
		}

		public String getFamilyTypeCode() {
			return familyTypeCode;
		}

		public void setFamilyTypeCode(String familyTypeCode) {
			this.familyTypeCode = familyTypeCode;
		}

		public String getFamilyMainProblem() {
			return familyMainProblem;
		}

		public void setFamilyMainProblem(String familyMainProblem) {
			this.familyMainProblem = familyMainProblem;
		}

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getCreateTime() {
			return createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getOrgCode() {
			return orgCode;
		}

		public void setOrgCode(String orgCode) {
			this.orgCode = orgCode;
		}

	}
	
	public static class Members{
		@XStreamImplicit(itemFieldName="member")
		private List<FamilyMember> familyMemberList;

		public List<FamilyMember> getFamilyMemberList() {
			return familyMemberList;
		}

		public void setFamilyMemberList(List<FamilyMember> familyMemberList) {
			this.familyMemberList = familyMemberList;
		}
		
	}

	public static class FamilyMember{
		/**
		 * 主键id
		 */
		private String familyMemberId;
		/**
		 * 家庭id
		 */
		private String famiId;
		/**
		 * 序号
		 */
		private int orderNumber;
		/**
		 * 与户主关系
		 */
		private String householdCode;
		/**
		 * 姓名
		 */
		private String name;
		/**
		 * 身份证件类别
		 */
		private String idcardType;
		/**
		 * 证件号
		 */
		private String cardNo;
		/**
		 * 性别
		 */
		private String sex;
		/**
		 * 出生日期
		 */
		private String birthDate;
		/**
		 * 文化程度
		 */
		private String educationDegree;
		/**
		 * 职业
		 */
		private String careerCode;
		/**
		 * 婚姻
		 */
		private String marriageCode;
		/**
		 * 备注
		 */
		private String remark;
		/**
		 * 个人状态
		 */
		private String state;
		/**
		 * 家庭编号
		 */
		private String famiNo;
		
		
		public String getFamilyMemberId() {
			return familyMemberId;
		}
		public void setFamilyMemberId(String familyMemberId) {
			this.familyMemberId = familyMemberId;
		}
		public String getFamiId() {
			return famiId;
		}
		public void setFamiId(String famiId) {
			this.famiId = famiId;
		}
		public int getOrderNumber() {
			return orderNumber;
		}
		public void setOrderNumber(int orderNumber) {
			this.orderNumber = orderNumber;
		}
		public String getHouseholdCode() {
			return householdCode;
		}
		public void setHouseholdCode(String householdCode) {
			this.householdCode = householdCode;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getIdcardType() {
			return idcardType;
		}
		public void setIdcardType(String idcardType) {
			this.idcardType = idcardType;
		}
		public String getCardNo() {
			return cardNo;
		}
		public void setCardNo(String cardNo) {
			this.cardNo = cardNo;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}
		public String getEducationDegree() {
			return educationDegree;
		}
		public void setEducationDegree(String educationDegree) {
			this.educationDegree = educationDegree;
		}
		public String getCareerCode() {
			return careerCode;
		}
		public void setCareerCode(String careerCode) {
			this.careerCode = careerCode;
		}
		public String getMarriageCode() {
			return marriageCode;
		}
		public void setMarriageCode(String marriageCode) {
			this.marriageCode = marriageCode;
		}
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getFamiNo() {
			return famiNo;
		}
		public void setFamiNo(String famiNo) {
			this.famiNo = famiNo;
		}
		

	}
}
