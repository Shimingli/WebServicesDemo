/**
 * SysFTPDataForSumResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypakege;

public class SysFTPDataForSumResponse  implements java.io.Serializable {
    private mypakege.SysFTPDataForSumResponseSysFTPDataForSumResult sysFTPDataForSumResult;

    public SysFTPDataForSumResponse() {
    }

    public SysFTPDataForSumResponse(
           mypakege.SysFTPDataForSumResponseSysFTPDataForSumResult sysFTPDataForSumResult) {
           this.sysFTPDataForSumResult = sysFTPDataForSumResult;
    }


    /**
     * Gets the sysFTPDataForSumResult value for this SysFTPDataForSumResponse.
     * 
     * @return sysFTPDataForSumResult
     */
    public mypakege.SysFTPDataForSumResponseSysFTPDataForSumResult getSysFTPDataForSumResult() {
        return sysFTPDataForSumResult;
    }


    /**
     * Sets the sysFTPDataForSumResult value for this SysFTPDataForSumResponse.
     * 
     * @param sysFTPDataForSumResult
     */
    public void setSysFTPDataForSumResult(mypakege.SysFTPDataForSumResponseSysFTPDataForSumResult sysFTPDataForSumResult) {
        this.sysFTPDataForSumResult = sysFTPDataForSumResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SysFTPDataForSumResponse)) return false;
        SysFTPDataForSumResponse other = (SysFTPDataForSumResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sysFTPDataForSumResult==null && other.getSysFTPDataForSumResult()==null) || 
             (this.sysFTPDataForSumResult!=null &&
              this.sysFTPDataForSumResult.equals(other.getSysFTPDataForSumResult())));
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
        if (getSysFTPDataForSumResult() != null) {
            _hashCode += getSysFTPDataForSumResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SysFTPDataForSumResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SysFTPDataForSumResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysFTPDataForSumResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SysFTPDataForSumResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SysFTPDataForSumResponse>SysFTPDataForSumResult"));
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
