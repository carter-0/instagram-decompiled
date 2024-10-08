package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.ClientSuppressionPolicy;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

public abstract class SQ1 {
    public static final C53203GkD A00(LoggingContext loggingContext) {
        LoggingPolicy loggingPolicy = loggingContext.A01;
        if (loggingPolicy == null) {
            return null;
        }
        0bb r3 = new 0bb();
        ArrayList arrayList = loggingPolicy.A01;
        ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) it.next();
            0bb r6 = new 0bb();
            String name = clientSuppressionPolicy.A00.name();
            Locale locale = Locale.US;
            0qQ.A08(locale);
            r6.A01(RIO.valueOf(Pxf.A0n(locale, name)), "suppression_mode");
            String str = clientSuppressionPolicy.A02;
            if (str != null) {
                r6.A06(TraceFieldType.AdhocEventName, str);
            }
            C21263XRi xRi = clientSuppressionPolicy.A01;
            if (xRi != null) {
                r6.A01(XSP.valueOf(Pxf.A0n(locale, xRi.name())), "payload_field");
            }
            A0r.add(r6);
        }
        r3.A07("client_suppression_policy", A0r);
        r3.A06("logging_policy_product", loggingPolicy.A00);
        return r3;
    }

    public static void A03(0bb r2, LoggingContext loggingContext) {
        r2.A05("product_id", Long.valueOf(loggingContext.A00));
        r2.A02(A00(loggingContext), "logging_policy");
    }

    public static final LinkedHashSet A01(LoggingPolicy loggingPolicy) {
        String str;
        LinkedHashSet A0y = DbS.A0y();
        Iterator it = loggingPolicy.A01.iterator();
        while (it.hasNext()) {
            ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) it.next();
            if (clientSuppressionPolicy.A00 == C8933RGb.EVENT && (str = clientSuppressionPolicy.A02) != null) {
                A0y.add(str);
            }
        }
        return A0y;
    }

    public static final LinkedHashSet A02(LoggingPolicy loggingPolicy) {
        C21263XRi xRi;
        String str;
        LinkedHashSet A0y = DbS.A0y();
        Iterator it = loggingPolicy.A01.iterator();
        while (it.hasNext()) {
            ClientSuppressionPolicy clientSuppressionPolicy = (ClientSuppressionPolicy) it.next();
            if (clientSuppressionPolicy.A00 == C8933RGb.PAYLOAD_FIELD && (xRi = clientSuppressionPolicy.A01) != null) {
                int ordinal = xRi.ordinal();
                if (ordinal == 314 || ordinal == 1424 || ordinal == 283) {
                    str = "component_data_id";
                } else {
                    str = xRi.name();
                }
                A0y.add(str);
            }
        }
        return A0y;
    }
}
