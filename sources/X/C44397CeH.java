package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CeH  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44397CeH {
    public static Map A00(DUR dur) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dur.AbN() != null) {
            A1H.put("amount_raised", dur.AbN());
        }
        User Amt = dur.Amt();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (Amt != null) {
            A1H.put("charity", Amt.A08());
        }
        if (dur.AyW() != null) {
            C46295DTy AyW = dur.AyW();
            if (AyW != null) {
                treeUpdaterJNI = AyW.FHC();
            }
            A1H.put("donations", treeUpdaterJNI);
        }
        if (dur.getFundraiserId() != null) {
            A1H.put("fundraiser_id", dur.getFundraiserId());
        }
        return 0Yt.A0B(A1H);
    }
}
