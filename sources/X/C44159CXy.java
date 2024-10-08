package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CXy  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44159CXy {
    public static Map A00(C46278DTh dTh) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTh.Aem() != null) {
            A1H.put("background_height", dTh.Aem());
        }
        if (dTh.Aev() != null) {
            A1H.put("background_url", dTh.Aev());
        }
        if (dTh.Aex() != null) {
            A1H.put("background_width", dTh.Aex());
        }
        if (dTh.getText() != null) {
            C41845B3m.A10(dTh.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
