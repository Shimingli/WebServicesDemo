/**
 * FTPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypakege;

public interface FTPService extends javax.xml.rpc.Service {
    public java.lang.String getFTPServiceSoapAddress();

    public mypakege.FTPServiceSoap_PortType getFTPServiceSoap() throws javax.xml.rpc.ServiceException;

    public mypakege.FTPServiceSoap_PortType getFTPServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getFTPServiceSoap12Address();

    public mypakege.FTPServiceSoap_PortType getFTPServiceSoap12() throws javax.xml.rpc.ServiceException;

    public mypakege.FTPServiceSoap_PortType getFTPServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
