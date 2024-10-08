package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CXt  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44154CXt {
    public static Map A00(DUL dul) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dul.Avz() != null) {
            A1H.put("default_selected_donation_value", dul.Avz());
        }
        if (dul.AyT() != null) {
            A1H.put("donation_amount_selector_values", dul.AyT());
        }
        if (dul.BPX() != null) {
            A1H.put("maximum_donation_amount", dul.BPX());
        }
        if (dul.BTO() != null) {
            A1H.put("minimum_donation_amount", dul.BTO());
        }
        if (dul.Bem() != null) {
            A1H.put("prefill_amount", dul.Bem());
        }
        if (dul.CCj() != null) {
            A1H.put("user_currency", dul.CCj());
        }
        return 0Yt.A0B(A1H);
    }
}
