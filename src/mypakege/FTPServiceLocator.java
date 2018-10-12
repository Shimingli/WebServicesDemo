/**
 * FTPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypakege;

public class FTPServiceLocator extends org.apache.axis.client.Service implements mypakege.FTPService {

    public FTPServiceLocator() {
    }


    public FTPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FTPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FTPServiceSoap
    private java.lang.String FTPServiceSoap_address = "http://asiatic.ticp.net:1837/FTPService.asmx";

    public java.lang.String getFTPServiceSoapAddress() {
        return FTPServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FTPServiceSoapWSDDServiceName = "FTPServiceSoap";

    public java.lang.String getFTPServiceSoapWSDDServiceName() {
        return FTPServiceSoapWSDDServiceName;
    }

    public void setFTPServiceSoapWSDDServiceName(java.lang.String name) {
        FTPServiceSoapWSDDServiceName = name;
    }

    public mypakege.FTPServiceSoap_PortType getFTPServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FTPServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFTPServiceSoap(endpoint);
    }

    public mypakege.FTPServiceSoap_PortType getFTPServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypakege.FTPServiceSoap_BindingStub _stub = new mypakege.FTPServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getFTPServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFTPServiceSoapEndpointAddress(java.lang.String address) {
        FTPServiceSoap_address = address;
    }


    // Use to get a proxy class for FTPServiceSoap12
    private java.lang.String FTPServiceSoap12_address = "http://asiatic.ticp.net:1837/FTPService.asmx";

    public java.lang.String getFTPServiceSoap12Address() {
        return FTPServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FTPServiceSoap12WSDDServiceName = "FTPServiceSoap12";

    public java.lang.String getFTPServiceSoap12WSDDServiceName() {
        return FTPServiceSoap12WSDDServiceName;
    }

    public void setFTPServiceSoap12WSDDServiceName(java.lang.String name) {
        FTPServiceSoap12WSDDServiceName = name;
    }

    public mypakege.FTPServiceSoap_PortType getFTPServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FTPServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFTPServiceSoap12(endpoint);
    }

    public mypakege.FTPServiceSoap_PortType getFTPServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypakege.FTPServiceSoap12Stub _stub = new mypakege.FTPServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getFTPServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFTPServiceSoap12EndpointAddress(java.lang.String address) {
        FTPServiceSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypakege.FTPServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypakege.FTPServiceSoap_BindingStub _stub = new mypakege.FTPServiceSoap_BindingStub(new java.net.URL(FTPServiceSoap_address), this);
                _stub.setPortName(getFTPServiceSoapWSDDServiceName());
                return _stub;
            }
            if (mypakege.FTPServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypakege.FTPServiceSoap12Stub _stub = new mypakege.FTPServiceSoap12Stub(new java.net.URL(FTPServiceSoap12_address), this);
                _stub.setPortName(getFTPServiceSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FTPServiceSoap".equals(inputPortName)) {
            return getFTPServiceSoap();
        }
        else if ("FTPServiceSoap12".equals(inputPortName)) {
            return getFTPServiceSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "FTPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "FTPServiceSoap"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "FTPServiceSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FTPServiceSoap".equals(portName)) {
            setFTPServiceSoapEndpointAddress(address);
        }
        else 
if ("FTPServiceSoap12".equals(portName)) {
            setFTPServiceSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
