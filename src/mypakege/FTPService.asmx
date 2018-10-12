<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="SysFTPData">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ds">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SysFTPDataResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SysFTPDataResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SysFTPDataForOrUpdate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ds">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SysFTPDataForOrUpdateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SysFTPDataForOrUpdateResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SysFTPDataForSum">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ds">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SysFTPDataForSumResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SysFTPDataForSumResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SysFTPDataForIDMALL">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ds">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SysFTPDataForIDMALLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SysFTPDataForIDMALLResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SysFTPMediaData">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ds">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SysFTPMediaDataResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SysFTPMediaDataResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TrasAdd">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="transStr" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TrasAddResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="TrasAddResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TransAddForSC">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="transStr" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TransAddForSCResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="TransAddForSCResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TrasAddForSingle">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="transJson" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TrasAddForSingleResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TrasAddForSingleResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TrasAddForMultiple">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="transJson" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TrasAddForMultipleResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TrasAddForMultipleResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TrasAddForPay">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="transJson" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TrasAddForPayResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TrasAddForPayResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="SysFTPDataSoapIn">
    <wsdl:part name="parameters" element="tns:SysFTPData" />
  </wsdl:message>
  <wsdl:message name="SysFTPDataSoapOut">
    <wsdl:part name="parameters" element="tns:SysFTPDataResponse" />
  </wsdl:message>
  <wsdl:message name="SysFTPDataForOrUpdateSoapIn">
    <wsdl:part name="parameters" element="tns:SysFTPDataForOrUpdate" />
  </wsdl:message>
  <wsdl:message name="SysFTPDataForOrUpdateSoapOut">
    <wsdl:part name="parameters" element="tns:SysFTPDataForOrUpdateResponse" />
  </wsdl:message>
  <wsdl:message name="SysFTPDataForSumSoapIn">
    <wsdl:part name="parameters" element="tns:SysFTPDataForSum" />
  </wsdl:message>
  <wsdl:message name="SysFTPDataForSumSoapOut">
    <wsdl:part name="parameters" element="tns:SysFTPDataForSumResponse" />
  </wsdl:message>
  <wsdl:message name="SysFTPDataForIDMALLSoapIn">
    <wsdl:part name="parameters" element="tns:SysFTPDataForIDMALL" />
  </wsdl:message>
  <wsdl:message name="SysFTPDataForIDMALLSoapOut">
    <wsdl:part name="parameters" element="tns:SysFTPDataForIDMALLResponse" />
  </wsdl:message>
  <wsdl:message name="SysFTPMediaDataSoapIn">
    <wsdl:part name="parameters" element="tns:SysFTPMediaData" />
  </wsdl:message>
  <wsdl:message name="SysFTPMediaDataSoapOut">
    <wsdl:part name="parameters" element="tns:SysFTPMediaDataResponse" />
  </wsdl:message>
  <wsdl:message name="TrasAddSoapIn">
    <wsdl:part name="parameters" element="tns:TrasAdd" />
  </wsdl:message>
  <wsdl:message name="TrasAddSoapOut">
    <wsdl:part name="parameters" element="tns:TrasAddResponse" />
  </wsdl:message>
  <wsdl:message name="TransAddForSCSoapIn">
    <wsdl:part name="parameters" element="tns:TransAddForSC" />
  </wsdl:message>
  <wsdl:message name="TransAddForSCSoapOut">
    <wsdl:part name="parameters" element="tns:TransAddForSCResponse" />
  </wsdl:message>
  <wsdl:message name="TrasAddForSingleSoapIn">
    <wsdl:part name="parameters" element="tns:TrasAddForSingle" />
  </wsdl:message>
  <wsdl:message name="TrasAddForSingleSoapOut">
    <wsdl:part name="parameters" element="tns:TrasAddForSingleResponse" />
  </wsdl:message>
  <wsdl:message name="TrasAddForMultipleSoapIn">
    <wsdl:part name="parameters" element="tns:TrasAddForMultiple" />
  </wsdl:message>
  <wsdl:message name="TrasAddForMultipleSoapOut">
    <wsdl:part name="parameters" element="tns:TrasAddForMultipleResponse" />
  </wsdl:message>
  <wsdl:message name="TrasAddForPaySoapIn">
    <wsdl:part name="parameters" element="tns:TrasAddForPay" />
  </wsdl:message>
  <wsdl:message name="TrasAddForPaySoapOut">
    <wsdl:part name="parameters" element="tns:TrasAddForPayResponse" />
  </wsdl:message>
  <wsdl:portType name="FTPServiceSoap">
    <wsdl:operation name="SysFTPData">
      <wsdl:input message="tns:SysFTPDataSoapIn" />
      <wsdl:output message="tns:SysFTPDataSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SysFTPDataForOrUpdate">
      <wsdl:input message="tns:SysFTPDataForOrUpdateSoapIn" />
      <wsdl:output message="tns:SysFTPDataForOrUpdateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SysFTPDataForSum">
      <wsdl:input message="tns:SysFTPDataForSumSoapIn" />
      <wsdl:output message="tns:SysFTPDataForSumSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SysFTPDataForIDMALL">
      <wsdl:input message="tns:SysFTPDataForIDMALLSoapIn" />
      <wsdl:output message="tns:SysFTPDataForIDMALLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SysFTPMediaData">
      <wsdl:input message="tns:SysFTPMediaDataSoapIn" />
      <wsdl:output message="tns:SysFTPMediaDataSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TrasAdd">
      <wsdl:input message="tns:TrasAddSoapIn" />
      <wsdl:output message="tns:TrasAddSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TransAddForSC">
      <wsdl:input message="tns:TransAddForSCSoapIn" />
      <wsdl:output message="tns:TransAddForSCSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TrasAddForSingle">
      <wsdl:input message="tns:TrasAddForSingleSoapIn" />
      <wsdl:output message="tns:TrasAddForSingleSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TrasAddForMultiple">
      <wsdl:input message="tns:TrasAddForMultipleSoapIn" />
      <wsdl:output message="tns:TrasAddForMultipleSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TrasAddForPay">
      <wsdl:input message="tns:TrasAddForPaySoapIn" />
      <wsdl:output message="tns:TrasAddForPaySoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="FTPServiceSoap" type="tns:FTPServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="SysFTPData">
      <soap:operation soapAction="http://tempuri.org/SysFTPData" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SysFTPDataForOrUpdate">
      <soap:operation soapAction="http://tempuri.org/SysFTPDataForOrUpdate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SysFTPDataForSum">
      <soap:operation soapAction="http://tempuri.org/SysFTPDataForSum" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SysFTPDataForIDMALL">
      <soap:operation soapAction="http://tempuri.org/SysFTPDataForIDMALL" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SysFTPMediaData">
      <soap:operation soapAction="http://tempuri.org/SysFTPMediaData" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TrasAdd">
      <soap:operation soapAction="http://tempuri.org/TrasAdd" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TransAddForSC">
      <soap:operation soapAction="http://tempuri.org/TransAddForSC" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TrasAddForSingle">
      <soap:operation soapAction="http://tempuri.org/TrasAddForSingle" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TrasAddForMultiple">
      <soap:operation soapAction="http://tempuri.org/TrasAddForMultiple" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TrasAddForPay">
      <soap:operation soapAction="http://tempuri.org/TrasAddForPay" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="FTPServiceSoap12" type="tns:FTPServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="SysFTPData">
      <soap12:operation soapAction="http://tempuri.org/SysFTPData" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SysFTPDataForOrUpdate">
      <soap12:operation soapAction="http://tempuri.org/SysFTPDataForOrUpdate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SysFTPDataForSum">
      <soap12:operation soapAction="http://tempuri.org/SysFTPDataForSum" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SysFTPDataForIDMALL">
      <soap12:operation soapAction="http://tempuri.org/SysFTPDataForIDMALL" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SysFTPMediaData">
      <soap12:operation soapAction="http://tempuri.org/SysFTPMediaData" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TrasAdd">
      <soap12:operation soapAction="http://tempuri.org/TrasAdd" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TransAddForSC">
      <soap12:operation soapAction="http://tempuri.org/TransAddForSC" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TrasAddForSingle">
      <soap12:operation soapAction="http://tempuri.org/TrasAddForSingle" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TrasAddForMultiple">
      <soap12:operation soapAction="http://tempuri.org/TrasAddForMultiple" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TrasAddForPay">
      <soap12:operation soapAction="http://tempuri.org/TrasAddForPay" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="FTPService">
    <wsdl:port name="FTPServiceSoap" binding="tns:FTPServiceSoap">
      <soap:address location="http://asiatic.ticp.net:1837/FTPService.asmx" />
    </wsdl:port>
    <wsdl:port name="FTPServiceSoap12" binding="tns:FTPServiceSoap12">
      <soap12:address location="http://asiatic.ticp.net:1837/FTPService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>