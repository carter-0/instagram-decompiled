package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CYw  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44183CYw {
    public static Map A00(DTF dtf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dtf.BMP() != null) {
            A1H.put("length", dtf.BMP());
        }
        if (dtf.BXp() != null) {
            A1H.put("offset", dtf.BXp());
        }
        if (dtf.getUrl() != null) {
            C41845B3m.A0y(dtf.getUrl(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
