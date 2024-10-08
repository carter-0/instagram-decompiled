package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Caj  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44222Caj {
    public static Map A00(C46298DUb dUb) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUb.Ar4() != null) {
            DSY Ar4 = dUb.Ar4();
            if (Ar4 != null) {
                treeUpdaterJNI = Ar4.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("contextual_ads_info", treeUpdaterJNI);
        }
        if (dUb.BUR() != null) {
            A1H.put(AnonymousClass000.A00(3610), dUb.BUR());
        }
        if (dUb.BUW() != null) {
            A1H.put("multi_ads_seed_ad_id", dUb.BUW());
        }
        dUb.BUX();
        A1H.put("multi_ads_type", Integer.valueOf(dUb.BUX()));
        if (dUb.BUZ() != null) {
            A1H.put("multi_ads_unit_category_hash_id", dUb.BUZ());
        }
        if (dUb.BUa() != null) {
            A1H.put("multi_ads_unit_id", dUb.BUa());
        }
        if (dUb.getTitle() != null) {
            C41845B3m.A12(dUb.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
