/**
 * FTPServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypakege;

public class FTPServiceTestCase extends junit.framework.TestCase {
    public FTPServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testFTPServiceSoapWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new mypakege.FTPServiceLocator().getFTPServiceSoapAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new mypakege.FTPServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1FTPServiceSoapSysFTPData() throws Exception {
        mypakege.FTPServiceSoap_BindingStub binding;
        try {
            binding = (mypakege.FTPServiceSoap_BindingStub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mypakege.SysFTPDataResponseSysFTPDataResult value = null;
        value = binding.sysFTPData(new mypakege.SysFTPDataDs());
        // TBD - validate results
    }

    public void test2FTPServiceSoapSysFTPDataForOrUpdate() throws Exception {
        mypakege.FTPServiceSoap_BindingStub binding;
        try {
            binding = (mypakege.FTPServiceSoap_BindingStub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mypakege.SysFTPDataForOrUpdateResponseSysFTPDataForOrUpdateResult value = null;
        value = binding.sysFTPDataForOrUpdate(new mypakege.SysFTPDataForOrUpdateDs());
        // TBD - validate results
    }

    public void test3FTPServiceSoapSysFTPDataForSum() throws Exception {
        mypakege.FTPServiceSoap_BindingStub binding;
        try {
            binding = (mypakege.FTPServiceSoap_BindingStub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mypakege.SysFTPDataForSumResponseSysFTPDataForSumResult value = null;
        value = binding.sysFTPDataForSum(new mypakege.SysFTPDataForSumDs());
        // TBD - validate results
    }

    public void test4FTPServiceSoapSysFTPDataForIDMALL() throws Exception {
        mypakege.FTPServiceSoap_BindingStub binding;
        try {
            binding = (mypakege.FTPServiceSoap_BindingStub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mypakege.SysFTPDataForIDMALLResponseSysFTPDataForIDMALLResult value = null;
        value = binding.sysFTPDataForIDMALL(new mypakege.SysFTPDataForIDMALLDs());
        // TBD - validate results
    }

    public void test5FTPServiceSoapSysFTPMediaData() throws Exception {
        mypakege.FTPServiceSoap_BindingStub binding;
        try {
            binding = (mypakege.FTPServiceSoap_BindingStub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mypakege.SysFTPMediaDataResponseSysFTPMediaDataResult value = null;
        value = binding.sysFTPMediaData(new mypakege.SysFTPMediaDataDs());
        // TBD - validate results
    }

    public void test6FTPServiceSoapTrasAdd() throws Exception {
        mypakege.FTPServiceSoap_BindingStub binding;
        try {
            binding = (mypakege.FTPServiceSoap_BindingStub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        boolean value = false;
        value = binding.trasAdd(new java.lang.String());
        // TBD - validate results
    }

    public void test7FTPServiceSoapTransAddForSC() throws Exception {
        mypakege.FTPServiceSoap_BindingStub binding;
        try {
            binding = (mypakege.FTPServiceSoap_BindingStub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        boolean value = false;
        value = binding.transAddForSC(new java.lang.String());
        // TBD - validate results
    }

    public void test8FTPServiceSoapTrasAddForSingle() throws Exception {
        mypakege.FTPServiceSoap_BindingStub binding;
        try {
            binding = (mypakege.FTPServiceSoap_BindingStub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.trasAddForSingle(new java.lang.String());
        // TBD - validate results
    }

    public void test9FTPServiceSoapTrasAddForMultiple() throws Exception {
        mypakege.FTPServiceSoap_BindingStub binding;
        try {
            binding = (mypakege.FTPServiceSoap_BindingStub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.trasAddForMultiple(new java.lang.String());
        // TBD - validate results
    }

    public void test10FTPServiceSoapTrasAddForPay() throws Exception {
        mypakege.FTPServiceSoap_BindingStub binding;
        try {
            binding = (mypakege.FTPServiceSoap_BindingStub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.trasAddForPay(new java.lang.String());
        // TBD - validate results
    }

    public void testFTPServiceSoap12WSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new mypakege.FTPServiceLocator().getFTPServiceSoap12Address() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new mypakege.FTPServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test11FTPServiceSoap12SysFTPData() throws Exception {
        mypakege.FTPServiceSoap12Stub binding;
        try {
            binding = (mypakege.FTPServiceSoap12Stub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mypakege.SysFTPDataResponseSysFTPDataResult value = null;
        value = binding.sysFTPData(new mypakege.SysFTPDataDs());
        // TBD - validate results
    }

    public void test12FTPServiceSoap12SysFTPDataForOrUpdate() throws Exception {
        mypakege.FTPServiceSoap12Stub binding;
        try {
            binding = (mypakege.FTPServiceSoap12Stub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mypakege.SysFTPDataForOrUpdateResponseSysFTPDataForOrUpdateResult value = null;
        value = binding.sysFTPDataForOrUpdate(new mypakege.SysFTPDataForOrUpdateDs());
        // TBD - validate results
    }

    public void test13FTPServiceSoap12SysFTPDataForSum() throws Exception {
        mypakege.FTPServiceSoap12Stub binding;
        try {
            binding = (mypakege.FTPServiceSoap12Stub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mypakege.SysFTPDataForSumResponseSysFTPDataForSumResult value = null;
        value = binding.sysFTPDataForSum(new mypakege.SysFTPDataForSumDs());
        // TBD - validate results
    }

    public void test14FTPServiceSoap12SysFTPDataForIDMALL() throws Exception {
        mypakege.FTPServiceSoap12Stub binding;
        try {
            binding = (mypakege.FTPServiceSoap12Stub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mypakege.SysFTPDataForIDMALLResponseSysFTPDataForIDMALLResult value = null;
        value = binding.sysFTPDataForIDMALL(new mypakege.SysFTPDataForIDMALLDs());
        // TBD - validate results
    }

    public void test15FTPServiceSoap12SysFTPMediaData() throws Exception {
        mypakege.FTPServiceSoap12Stub binding;
        try {
            binding = (mypakege.FTPServiceSoap12Stub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mypakege.SysFTPMediaDataResponseSysFTPMediaDataResult value = null;
        value = binding.sysFTPMediaData(new mypakege.SysFTPMediaDataDs());
        // TBD - validate results
    }

    public void test16FTPServiceSoap12TrasAdd() throws Exception {
        mypakege.FTPServiceSoap12Stub binding;
        try {
            binding = (mypakege.FTPServiceSoap12Stub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        boolean value = false;
        value = binding.trasAdd(new java.lang.String());
        // TBD - validate results
    }

    public void test17FTPServiceSoap12TransAddForSC() throws Exception {
        mypakege.FTPServiceSoap12Stub binding;
        try {
            binding = (mypakege.FTPServiceSoap12Stub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        boolean value = false;
        value = binding.transAddForSC(new java.lang.String());
        // TBD - validate results
    }

    public void test18FTPServiceSoap12TrasAddForSingle() throws Exception {
        mypakege.FTPServiceSoap12Stub binding;
        try {
            binding = (mypakege.FTPServiceSoap12Stub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.trasAddForSingle(new java.lang.String());
        // TBD - validate results
    }

    public void test19FTPServiceSoap12TrasAddForMultiple() throws Exception {
        mypakege.FTPServiceSoap12Stub binding;
        try {
            binding = (mypakege.FTPServiceSoap12Stub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.trasAddForMultiple(new java.lang.String());
        // TBD - validate results
    }

    public void test20FTPServiceSoap12TrasAddForPay() throws Exception {
        mypakege.FTPServiceSoap12Stub binding;
        try {
            binding = (mypakege.FTPServiceSoap12Stub)
                          new mypakege.FTPServiceLocator().getFTPServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.trasAddForPay(new java.lang.String());
        // TBD - validate results
    }

}
