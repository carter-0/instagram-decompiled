package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ChG  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44582ChG {
    public static Map A00(DUV duv) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (duv.AgA() != null) {
            A1H.put("bloks_app", duv.AgA());
        }
        Map AgL = duv.AgL();
        if (AgL != null) {
            A1H.put("bloks_parameters", AgL);
        }
        if (duv.getId() != null) {
            C41845B3m.A0x(duv.getId(), A1H);
        }
        if (duv.BXf() != null) {
            A1H.put("nux_tooltip_text", duv.BXf());
        }
        if (duv.BuN() != null) {
            A1H.put("should_preload", duv.BuN());
        }
        if (duv.Bw4() != null) {
            A1H.put("show_tooltip_count", duv.Bw4());
        }
        return 0Yt.A0B(A1H);
    }
}
