package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CdT  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44347CdT {
    public static Map A00(C46284DTn dTn) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTn.AYU() != null) {
            A1H.put("action_text", dTn.AYU());
        }
        if (dTn.C2W() != null) {
            A1H.put("subtext", dTn.C2W());
        }
        if (dTn.C2n() != null) {
            A1H.put(AnonymousClass000.A00(1862), dTn.C2n());
        }
        if (dTn.getText() != null) {
            C41845B3m.A10(dTn.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
