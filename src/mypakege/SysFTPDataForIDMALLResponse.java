/**
 * SysFTPDataForIDMALLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypakege;

public class SysFTPDataForIDMALLResponse  implements java.io.Serializable {
    private mypakege.SysFTPDataForIDMALLResponseSysFTPDataForIDMALLResult sysFTPDataForIDMALLResult;

    public SysFTPDataForIDMALLResponse() {
    }

    public SysFTPDataForIDMALLResponse(
           mypakege.SysFTPDataForIDMALLResponseSysFTPDataForIDMALLResult sysFTPDataForIDMALLResult) {
           this.sysFTPDataForIDMALLResult = sysFTPDataForIDMALLResult;
    }


    /**
     * Gets the sysFTPDataForIDMALLResult value for this SysFTPDataForIDMALLResponse.
     * 
     * @return sysFTPDataForIDMALLResult
     */
    public mypakege.SysFTPDataForIDMALLResponseSysFTPDataForIDMALLResult getSysFTPDataForIDMALLResult() {
        return sysFTPDataForIDMALLResult;
    }


    /**
     * Sets the sysFTPDataForIDMALLResult value for this SysFTPDataForIDMALLResponse.
     * 
     * @param sysFTPDataForIDMALLResult
     */
    public void setSysFTPDataForIDMALLResult(mypakege.SysFTPDataForIDMALLResponseSysFTPDataForIDMALLResult sysFTPDataForIDMALLResult) {
        this.sysFTPDataForIDMALLResult = sysFTPDataForIDMALLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SysFTPDataForIDMALLResponse)) return false;
        SysFTPDataForIDMALLResponse other = (SysFTPDataForIDMALLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sysFTPDataForIDMALLResult==null && other.getSysFTPDataForIDMALLResult()==null) || 
             (this.sysFTPDataForIDMALLResult!=null &&
              this.sysFTPDataForIDMALLResult.equals(other.getSysFTPDataForIDMALLResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSysFTPDataForIDMALLResult() != null) {
            _hashCode += getSysFTPDataForIDMALLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SysFTPDataForIDMALLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SysFTPDataForIDMALLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysFTPDataForIDMALLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SysFTPDataForIDMALLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SysFTPDataForIDMALLResponse>SysFTPDataForIDMALLResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
