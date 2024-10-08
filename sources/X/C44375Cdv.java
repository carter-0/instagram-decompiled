package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cdv  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44375Cdv {
    public static Map A00(C46286DTp dTp) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTp.AgA() != null) {
            A1H.put("bloks_app", dTp.AgA());
        }
        if (dTp.getId() != null) {
            C41845B3m.A0x(dTp.getId(), A1H);
        }
        if (dTp.BuN() != null) {
            A1H.put("should_preload", dTp.BuN());
        }
        if (dTp.Bw4() != null) {
            A1H.put("show_tooltip_count", dTp.Bw4());
        }
        return 0Yt.A0B(A1H);
    }
}
