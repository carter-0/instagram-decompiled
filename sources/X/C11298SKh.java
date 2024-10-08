package X;

import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.SKh  reason: case insensitive filesystem */
public abstract class C11298SKh {
    public static final List A00() {
        return 0sr.A1P(new C298525tb[]{C298525tb.ANON_CHECKOUT_BACK_BUTTON, C298525tb.ORDER_SUMMARY, C298525tb.APM, C298525tb.CONTACT_INFORMATION, C298525tb.SHIPPING_ADDRESS, C298525tb.SHIPPING_OPTIONS, C298525tb.PAYMENT_METHOD, C298525tb.ONE_TIME_CHECKOUT_OPTION, C298525tb.PAY_BUTTON, C298525tb.TERMS});
    }

    public static final void A01(QDM qdm, C21267XRm xRm, String str) {
        Map map;
        C12411Sto A00 = C11353SOm.A00();
        LoggingContext loggingContext = qdm.A0R;
        SEB A03 = qdm.A0S.A03();
        LinkedHashMap A0n = Pxi.A0n(loggingContext);
        A0n.put("TARGET_NAME", str);
        A0n.put("CREDENTIAL_TYPE", xRm);
        Object obj = A0n.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C62650uo) && !(obj instanceof AnonymousClass0s2)) || (map = (Map) obj) == null)) {
            map = AnonymousClass7TE.A1H();
        }
        SUU.A0A(A03, map);
        A0n.put("extra_data", map);
        ImmutableMap copyOf = ImmutableMap.copyOf(A0n);
        0qQ.A07(copyOf);
        A00.Cgl("user_add_credential_submit", copyOf);
    }

    public static final void A02(QDM qdm, String str) {
        C12411Sto A0g = C51965G9l.A0g();
        LoggingContext loggingContext = qdm.A0R;
        QDH qdh = qdm.A0S;
        C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "user_click_ecpotc_atomic"), 398), loggingContext, new C58771IxI(loggingContext, SUU.A08(qdh), str, 2, !qdh.A09()));
    }
}
