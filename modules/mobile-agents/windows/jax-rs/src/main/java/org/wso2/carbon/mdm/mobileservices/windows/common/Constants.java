/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied. See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.mdm.mobileservices.windows.common;

/**
 * Constants class for Windows plugin.
 */
public class Constants {

	/*Service endpoints*/
	public static final String DISCOVERY_SERVICE_ENDPOINT = "org.wso2.carbon.mdm.mobileservices.windows.discoveryservice.DiscoveryService";
	public static final String CERTIFICATE_ENROLLMENT_SERVICE_ENDPOINT = "org.wso2.carbon.mdm.mobileservices.windows.wstep.CertificateEnrollmentService";
	public static final String CERTIFICATE_ENROLLMENT_POLICY_SERVICE_ENDPOINT = "org.wso2.carbon.mdm.mobileservices.windows.xcep.CertificateEnrollmentPolicyService";

	/*Services' target namespaces*/
	public static final String DISCOVERY_SERVICE_TARGET_NAMESPACE = "http://schemas.microsoft.com/windows/management/2012/01/enrollment";
	public static final String DEVICE_ENROLLMENT_SERVICE_TARGET_NAMESPACE = "http://schemas.microsoft.com/windows/pki/2009/01/enrollment/RSTRC";
	public static final String CERTIFICATE_ENROLLMENT_POLICY_SERVICE_TARGET_NAMESPACE = "http://schemas.microsoft.com/windows/pki/2009/01/enrollmentpolicy";

	/*Certificate enrollment service urls and namespaces*/
	public static final String WS_TRUST_TARGET_NAMESPACE = "http://docs.oasis-open.org/ws-sx/ws-trust/200512";
	public static final String WS_SECURITY_TARGET_NAMESPACE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	public static final String SOAP_AUTHORIZATION_TARGET_NAMESPACE = "http://schemas.xmlsoap.org/ws/2006/12/authorization";

	/*Certificate enrollment policy service urls and namespaces*/
	public static final String ENROLLMENT_POLICY_TARGET_NAMESPACE = "http://schemas.microsoft.com/windows/pki/2009/01/enrollmentpolicy";
	public static final String REQUEST_WRAPPER_CLASS_NAME = "com.microsoft.schemas.windows.pki._2009._01.enrollmentpolicy.GetPolicies";
	public static final String RESPONSE_WRAPPER_CLASS_NAME = "com.microsoft.schemas.windows.pki._2009._01.enrollmentpolicy.GetPoliciesResponse";

	/*Discovery service related other constants*/
	public static final String AUTH_POLICY = "OnPremise";
	public static final String CERTIFICATE_ENROLLMENT_POLICY_SERVICE_URL = "https://EnterpriseEnrollment.wso2.com/ENROLLMENTSERVER/PolicyEnrollmentWebservice.svc";
	public static final String CERTIFICATE_ENROLLMENT_SERVICE_URL = "https://EnterpriseEnrollment.wso2.com/ENROLLMENTSERVER/DeviceEnrollmentWebservice.svc";

	/*Certificate enrollment Service related constants*/
	public static final String TOKEN_TYPE = "http://schemas.microsoft.com/5.0.0.0/ConfigurationManager/Enrollment/DeviceEnrollmentToken";
	public static final String PARM = "parm";
	public static final String TYPE = "type";
	public static final String VALUE = "value";
	public static final String VALUE_TYPE = "http://schemas.microsoft.com/5.0.0.0/ConfigurationManager/Enrollment/DeviceEnrollmentProvisionDoc";
	public static final String ENCODING_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd#base64binary";
	public static final String WSO2EMM_JKS_FILE = "wso2emm.jks";
	public static final String EMMJKS = "emmjks";
	public static final String EMMPRIVATEKEY = "emmprivatekey";
	public static final String CACERT = "cacert";
	public static final String X_509 = "X.509";
	public static final String PROPERTIES_XML = "properties.xml";
	public static final String EMMJKS_ENTRY = "emmjks";
	public static final String EMMPRIVATEKEY_ENTRY = "emmprivatekey";
	public static final String EMMPASSWORD = "emmpassword";
	public static final String EMMPRIVATEKEYPASSWORD = "emmprivatekeypassword";
	public static final String WAP_PROVISIONING_XML = "wap-provisioning.xml";
	public static final String CN = "CN=mdmcn";
	public static final String PROVIDER = "BC";
	public static final String ALGORITHM = "SHA1withRSA";
	public static final String JKS = "JKS";
	public static final String SECURITY = "Security";
	public static final String WSS_SECURITY_UTILITY = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
	public static final String TIMESTAMP_ID = "Id";
	public static final String TIMESTAMP_U = "u";
	public static final String TIMESTAMP = "Timestamp";
	public static final String TIMESTAMP_0 = "_0";
	public static final String CREATED = "Created";
	public static final String EXPIRES = "Expires";
	public static final String UTF_8 = "utf-8";
	public static final String CONTENT_LENGTH = "Content-Length";

	/*Certificate enrolment policy service related constants*/
	public static final int MINIMAL_KEY_LENGTH = 2048;
	public static final int POLICY_SCHEMA = 3;
	public static final int HASH_ALGORITHM_OID_REFERENCE = 0;
	public static final int OID_REFERENCE = 0;
	public static final String OID = "1.3.14.3.2.29";
	public static final String OID_DEFAULT_NAME = "szOID_OIWSEC_sha1RSASign";
	public static final int OID_GROUP = 1;
	public static final int OID_REFERENCE_ID = 0;

	/*SynclML service related constants*/
	public static final String SYNCML_RESPONSE = "reply.xml";
	public static final String SYNC_ML = "SyncML";
	public static final String SYNCML_MSG_ID = "MsgID";
	public static final String SYNCML_TARGET = "Target";
	public static final String SYNCML_SOURCE = "Source";
	public static final String SYNCML_CRED = "Cred";
	public static final String SYNCML_RESULTS = "Results";
	public static final String SYNCML_SOURCE_URI = "SOURCE_URI";
	public static final String SYNCML_TARGET_URI = "TARGET_URI";
	public static final String SYNCML_MESSAGE_ONE = "1";
	public static final String SYNCML_MESSAGE_TWO = "2";
	public static final int NOT_BEFORE_DATE = 3;
	public static final int NOT_AFTER_DATE = 300;
}
