/**
 * SysFTPDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypakege;

public class SysFTPDataResponse  implements java.io.Serializable {
    private mypakege.SysFTPDataResponseSysFTPDataResult sysFTPDataResult;

    public SysFTPDataResponse() {
    }

    public SysFTPDataResponse(
           mypakege.SysFTPDataResponseSysFTPDataResult sysFTPDataResult) {
           this.sysFTPDataResult = sysFTPDataResult;
    }


    /**
     * Gets the sysFTPDataResult value for this SysFTPDataResponse.
     * 
     * @return sysFTPDataResult
     */
    public mypakege.SysFTPDataResponseSysFTPDataResult getSysFTPDataResult() {
        return sysFTPDataResult;
    }


    /**
     * Sets the sysFTPDataResult value for this SysFTPDataResponse.
     * 
     * @param sysFTPDataResult
     */
    public void setSysFTPDataResult(mypakege.SysFTPDataResponseSysFTPDataResult sysFTPDataResult) {
        this.sysFTPDataResult = sysFTPDataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SysFTPDataResponse)) return false;
        SysFTPDataResponse other = (SysFTPDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sysFTPDataResult==null && other.getSysFTPDataResult()==null) || 
             (this.sysFTPDataResult!=null &&
              this.sysFTPDataResult.equals(other.getSysFTPDataResult())));
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
        if (getSysFTPDataResult() != null) {
            _hashCode += getSysFTPDataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SysFTPDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SysFTPDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysFTPDataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SysFTPDataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SysFTPDataResponse>SysFTPDataResult"));
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
