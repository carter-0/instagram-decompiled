package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HTR {
    public static Map A00(JSL jsl) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (jsl.CCC() != null) {
            A1H.put("upsell_button_text", jsl.CCC());
        }
        jsl.CCE();
        A1H.put("upsell_position", Integer.valueOf(jsl.CCE()));
        if (jsl.CCF() != null) {
            A1H.put("upsell_subtitle", jsl.CCF());
        }
        if (jsl.CCG() != null) {
            A1H.put("upsell_title", jsl.CCG());
        }
        if (jsl.CCH() != null) {
            A1H.put("upsell_type", jsl.CCH());
        }
        return 0Yt.A0B(A1H);
    }
}
