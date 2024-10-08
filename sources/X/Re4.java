package X;

import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;
import java.util.LinkedHashMap;

public abstract class Re4 {
    public static final LinkedHashMap A00(C13448Tab tab) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ListCell listCell = (ListCell) tab;
        LoggingContext loggingContext = listCell.A0N;
        if (loggingContext != null) {
            A1H.put("logging_context", loggingContext);
            ComponentLoggingData componentLoggingData = listCell.A0M;
            if (componentLoggingData != null) {
                A1H.put("component_logging_data", componentLoggingData);
                return A1H;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
