/**
 * TranslationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Translation.nlp.nict.servicetype;

public interface TranslationService extends java.rmi.Remote {
    public String translate(String sourceLang, String targetLang, String source) throws java.rmi.RemoteException, jp.go.nict.langrid.ws_1_2.ServiceNotActiveException, jp.go.nict.langrid.ws_1_2.LanguagePairNotUniquelyDecidedException, jp.go.nict.langrid.ws_1_2.InvalidParameterException, jp.go.nict.langrid.ws_1_2.ServiceNotFoundException, jp.go.nict.langrid.ws_1_2.AccessLimitExceededException, jp.go.nict.langrid.ws_1_2.NoValidEndpointsException, jp.go.nict.langrid.ws_1_2.UnsupportedLanguagePairException, jp.go.nict.langrid.ws_1_2.ProcessFailedException, jp.go.nict.langrid.ws_1_2.ServerBusyException, jp.go.nict.langrid.ws_1_2.NoAccessPermissionException;
}
