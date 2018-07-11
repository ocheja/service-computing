/**
 * Kyoto1LangridKyotoUJServerLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Translation.nlp.nict.servicetype;

public class Kyoto1LangridKyotoUJServerLocator extends org.apache.axis.client.Service implements Kyoto1LangridKyotoUJServer {

    public Kyoto1LangridKyotoUJServerLocator() {
    }


    public Kyoto1LangridKyotoUJServerLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Kyoto1LangridKyotoUJServerLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Translation
    private String Translation_address = "http://langrid.org/service_manager/invoker/kyoto1.langrid:KyotoUJServer";

    public String getTranslationAddress() {
        return Translation_address;
    }

    // The WSDD service name defaults to the port name.
    private String TranslationWSDDServiceName = "Translation";

    public String getTranslationWSDDServiceName() {
        return TranslationWSDDServiceName;
    }

    public void setTranslationWSDDServiceName(String name) {
        TranslationWSDDServiceName = name;
    }

    public TranslationService getTranslation() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Translation_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTranslation(endpoint);
    }

    public TranslationService getTranslation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            TranslationSoapBindingStub _stub = new TranslationSoapBindingStub(portAddress, this);
            _stub.setPortName(getTranslationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTranslationEndpointAddress(String address) {
        Translation_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (TranslationService.class.isAssignableFrom(serviceEndpointInterface)) {
                TranslationSoapBindingStub _stub = new TranslationSoapBindingStub(new java.net.URL(Translation_address), this);
                _stub.setPortName(getTranslationWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("Translation".equals(inputPortName)) {
            return getTranslation();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("servicegrid:servicetype:nict.nlp:Translation", "kyoto1.langrid:KyotoUJServer");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("servicegrid:servicetype:nict.nlp:Translation", "Translation"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("Translation".equals(portName)) {
            setTranslationEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
