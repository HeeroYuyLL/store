package com.isell.ws.ningbo.ws.order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.6
 * 2015-11-03T18:02:12.969+08:00
 * Generated source version: 3.0.6
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "KJB2CWebServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface KJB2CWebServiceSoap {

    @WebResult(name = "TestHelloWorldResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "TestHelloWorld", targetNamespace = "http://tempuri.org/", className = "com.isell.ws.ningbo.ws.order.TestHelloWorld")
    @WebMethod(operationName = "TestHelloWorld", action = "http://tempuri.org/TestHelloWorld")
    @ResponseWrapper(localName = "TestHelloWorldResponse", targetNamespace = "http://tempuri.org/", className = "com.isell.ws.ningbo.ws.order.TestHelloWorldResponse")
    public java.lang.String testHelloWorld(
        @WebParam(name = "inputString", targetNamespace = "http://tempuri.org/")
        java.lang.String inputString
    );

    @WebResult(name = "AddOrder_KJB2CResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddOrder_KJB2C", targetNamespace = "http://tempuri.org/", className = "com.isell.ws.ningbo.ws.order.AddOrderKJB2C")
    @WebMethod(operationName = "AddOrder_KJB2C", action = "http://tempuri.org/AddOrder_KJB2C")
    @ResponseWrapper(localName = "AddOrder_KJB2CResponse", targetNamespace = "http://tempuri.org/", className = "com.isell.ws.ningbo.ws.order.AddOrderKJB2CResponse")
    public java.lang.String addOrderKJB2C(
        @WebParam(name = "erpKey", targetNamespace = "http://tempuri.org/")
        java.lang.String erpKey,
        @WebParam(name = "erpSecret", targetNamespace = "http://tempuri.org/")
        java.lang.String erpSecret,
        @WebParam(name = "orderMsgXml", targetNamespace = "http://tempuri.org/")
        java.lang.String orderMsgXml
    );
}
