package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B5b  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41883B5b {
    public static Map A00(AnonymousClass4Hy r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Akv() != null) {
            A1H.put("can_viewer_donate", r3.Akv());
        }
        if (r3.getCurrency() != null) {
            A1H.put("currency", r3.getCurrency());
        }
        if (r3.AyS() != null) {
            C263134Hw AyS = r3.AyS();
            if (AyS != null) {
                treeUpdaterJNI = AyS.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("donation_amount_config", treeUpdaterJNI);
        }
        if (r3.AyU() != null) {
            A1H.put("donation_disabled_message", r3.AyU());
        }
        if (r3.AyV() != null) {
            A1H.put("donation_url", r3.AyV());
        }
        if (r3.BCQ() != null) {
            A1H.put("has_viewer_donated", r3.BCQ());
        }
        if (r3.Bfj() != null) {
            A1H.put("privacy_disclaimer", r3.Bfj());
        }
        if (r3.Bgt() != null) {
            A1H.put("profile_fundraiser_id", r3.Bgt());
        }
        if (r3.CHX() != null) {
            A1H.put("you_donated_message", r3.CHX());
        }
        return 0Yt.A0B(A1H);
    }
}
