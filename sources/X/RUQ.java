package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

public abstract class RUQ {
    public static final LinkedHashMap A00(C10860RzL rzL) {
        String str;
        List<C59721JVf> list = (List) rzL.A0E.A00;
        if (list.isEmpty()) {
            return null;
        }
        LinkedHashMap A0x = DbS.A0x(JTT.A08(list));
        for (C59721JVf jVf : list) {
            if (1 - AnonymousClass7TE.A0M(jVf.A00) != 0) {
                str = "PAYMENT_SAVE_AUTOFILL_BEHAVIOR";
            } else {
                str = "CONTACT_SAVE_AUTOFILL_BEHAVIOR";
            }
            Locale locale = Locale.ROOT;
            A0x.put(DbT.A12(locale, str), DbT.A12(locale, C392409ul.A00((Integer) jVf.A01)));
        }
        return A0x;
    }
}
