package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ce2  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44382Ce2 {
    public static Map A00(C46309DUm dUm) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUm.AXn() != null) {
            A1H.put("accessibility_hint", dUm.AXn());
        }
        if (dUm.AYV() != null) {
            A1H.put("action_tooltip_text", dUm.AYV());
        }
        if (dUm.AgA() != null) {
            A1H.put("bloks_app", dUm.AgA());
        }
        Map AgL = dUm.AgL();
        if (AgL != null) {
            A1H.put("bloks_parameters", AgL);
        }
        if (dUm.getId() != null) {
            C41845B3m.A0x(dUm.getId(), A1H);
        }
        if (dUm.BXf() != null) {
            A1H.put("nux_tooltip_text", dUm.BXf());
        }
        if (dUm.BuN() != null) {
            A1H.put("should_preload", dUm.BuN());
        }
        if (dUm.Bw4() != null) {
            A1H.put("show_tooltip_count", dUm.Bw4());
        }
        return 0Yt.A0B(A1H);
    }
}
