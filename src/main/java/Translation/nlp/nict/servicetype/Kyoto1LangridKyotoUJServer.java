/**
 * Kyoto1LangridKyotoUJServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Translation.nlp.nict.servicetype;

public interface Kyoto1LangridKyotoUJServer extends javax.xml.rpc.Service {
    public String getTranslationAddress();

    public TranslationService getTranslation() throws javax.xml.rpc.ServiceException;

    public TranslationService getTranslation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
