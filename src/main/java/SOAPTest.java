import java.net.URL;
import java.util.logging.Logger;

import org.apache.axis.client.Stub;
import Translation.nlp.nict.servicetype.Kyoto1LangridKyotoUJServerLocator;
import Translation.nlp.nict.servicetype.TranslationService;

public class SOAPTest {
    private final static Logger LOGGER = Logger.getLogger(SOAPTest.class.getName());

    public static void main(String[] args) throws Exception {
        // Translation
        Kyoto1LangridKyotoUJServerLocator jserverLoc =
                new Kyoto1LangridKyotoUJServerLocator();
        TranslationService transService = jserverLoc.getTranslation(
                new URL("http://langrid.org/service_manager/invoker/kyoto1.langrid:KyotoUJServer"));
        Stub stub = (Stub)transService;
        stub.setUsername("design");
        stub.setPassword("design");
        String ret = transService.translate("en", "ja", "Thank you for your hard work");
        LOGGER.info(ret);
    }
}
