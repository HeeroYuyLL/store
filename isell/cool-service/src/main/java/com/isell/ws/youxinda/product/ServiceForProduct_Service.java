package com.isell.ws.youxinda.product;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

import com.isell.ws.youxinda.YxdConfig;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * ServiceForProduct service = new ServiceForProduct();
 * ServiceForProduct portType = service.getServiceForProductSOAP();
 * portType.createProduct(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "ServiceForProduct", targetNamespace = "http://www.example.org/ServiceForProduct/", wsdlLocation = YxdConfig.YYD_WSDLLOCATION_PRODUCT)
public class ServiceForProduct_Service extends Service {

	private final static URL SERVICEFORPRODUCT_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.isell.ws.youxinda.product.ServiceForProduct_Service.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.isell.ws.youxinda.product.ServiceForProduct_Service.class
					.getResource(".");
			url = new URL(baseUrl, YxdConfig.YYD_WSDLLOCATION_PRODUCT);
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: " + YxdConfig.YYD_WSDLLOCATION_PRODUCT + ", retrying as a local file");
			logger.warning(e.getMessage());
		}
		SERVICEFORPRODUCT_WSDL_LOCATION = url;
	}

	public ServiceForProduct_Service(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ServiceForProduct_Service() {
		super(SERVICEFORPRODUCT_WSDL_LOCATION, new QName(
				"http://www.example.org/ServiceForProduct/",
				"ServiceForProduct"));
	}

	/**
	 * 
	 * @return returns ServiceForProduct
	 */
	@WebEndpoint(name = "ServiceForProductSOAP")
	public ServiceForProduct getServiceForProductSOAP() {
		return super.getPort(new QName(
				"http://www.example.org/ServiceForProduct/",
				"ServiceForProductSOAP"), ServiceForProduct.class);
	}

}