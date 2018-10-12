/**
 * FTPServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypakege;

public interface FTPServiceSoap_PortType extends java.rmi.Remote {
    public mypakege.SysFTPDataResponseSysFTPDataResult sysFTPData(mypakege.SysFTPDataDs ds) throws java.rmi.RemoteException;
    public mypakege.SysFTPDataForOrUpdateResponseSysFTPDataForOrUpdateResult sysFTPDataForOrUpdate(mypakege.SysFTPDataForOrUpdateDs ds) throws java.rmi.RemoteException;
    public mypakege.SysFTPDataForSumResponseSysFTPDataForSumResult sysFTPDataForSum(mypakege.SysFTPDataForSumDs ds) throws java.rmi.RemoteException;
    public mypakege.SysFTPDataForIDMALLResponseSysFTPDataForIDMALLResult sysFTPDataForIDMALL(mypakege.SysFTPDataForIDMALLDs ds) throws java.rmi.RemoteException;
    public mypakege.SysFTPMediaDataResponseSysFTPMediaDataResult sysFTPMediaData(mypakege.SysFTPMediaDataDs ds) throws java.rmi.RemoteException;
    public boolean trasAdd(java.lang.String transStr) throws java.rmi.RemoteException;
    public boolean transAddForSC(java.lang.String transStr) throws java.rmi.RemoteException;
    public java.lang.String trasAddForSingle(java.lang.String transJson) throws java.rmi.RemoteException;
    public java.lang.String trasAddForMultiple(java.lang.String transJson) throws java.rmi.RemoteException;
    public java.lang.String trasAddForPay(java.lang.String transJson) throws java.rmi.RemoteException;
}
