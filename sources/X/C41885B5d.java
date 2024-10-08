package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B5d  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41885B5d {
    public static Map A00(C263134Hw r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Avz() != null) {
            A1H.put("default_selected_donation_value", r3.Avz());
        }
        if (r3.AyT() != null) {
            A1H.put("donation_amount_selector_values", r3.AyT());
        }
        if (r3.BPX() != null) {
            A1H.put("maximum_donation_amount", r3.BPX());
        }
        if (r3.BTO() != null) {
            A1H.put("minimum_donation_amount", r3.BTO());
        }
        if (r3.Bem() != null) {
            A1H.put("prefill_amount", r3.Bem());
        }
        if (r3.CCj() != null) {
            A1H.put("user_currency", r3.CCj());
        }
        return 0Yt.A0B(A1H);
    }
}
