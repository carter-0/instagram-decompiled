package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cm8  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44857Cm8 {
    public static Map A00(C46303DUg dUg) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUg.Akv() != null) {
            A1H.put("can_viewer_donate", dUg.Akv());
        }
        if (dUg.AyR() != null) {
            DUL AyR = dUg.AyR();
            if (AyR != null) {
                treeUpdaterJNI = AyR.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("donation_amount_config", treeUpdaterJNI);
        }
        if (dUg.AyU() != null) {
            A1H.put("donation_disabled_message", dUg.AyU());
        }
        if (dUg.AyV() != null) {
            A1H.put("donation_url", dUg.AyV());
        }
        if (dUg.Bfj() != null) {
            A1H.put("privacy_disclaimer", dUg.Bfj());
        }
        if (dUg.Bgt() != null) {
            A1H.put("profile_fundraiser_id", dUg.Bgt());
        }
        if (dUg.CHX() != null) {
            A1H.put("you_donated_message", dUg.CHX());
        }
        return 0Yt.A0B(A1H);
    }
}
