package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4z  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41881B4z {
    public static Map A00(C250243l8 r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Amm() != null) {
            A1H.put(C66579MXk.A00(272), r3.Amm());
        }
        if (r3.BEx() != null) {
            A1H.put(AnonymousClass000.A00(4860), r3.BEx());
        }
        if (r3.BIn() != null) {
            A1H.put("invite_link", r3.BIn());
        }
        if (r3.BXU() != null) {
            A1H.put("number_of_members", r3.BXU());
        }
        if (r3.Bus() != null) {
            A1H.put("should_skip_channel_suffix_bool", r3.Bus());
        }
        return 0Yt.A0B(A1H);
    }
}
