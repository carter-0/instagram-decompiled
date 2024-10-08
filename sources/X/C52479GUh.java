package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GUh  reason: case insensitive filesystem */
public abstract /* synthetic */ class C52479GUh {
    public static Map A00(C250183l2 r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.Aa8() != null) {
            A1H.put("adtaxon_i18n_top1_l7_prediction", r4.Aa8());
        }
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (r4.B5D() != null) {
            C269884fq B5D = r4.B5D();
            if (B5D != null) {
                treeUpdaterJNI4 = B5D.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put("feed_dwell_afi_info", treeUpdaterJNI4);
        }
        if (r4.B5N() != null) {
            C269884fq B5N = r4.B5N();
            if (B5N != null) {
                treeUpdaterJNI3 = B5N.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("feed_post_click_afi_info", treeUpdaterJNI3);
        }
        if (r4.B5T() != null) {
            C269894fr B5T = r4.B5T();
            if (B5T != null) {
                treeUpdaterJNI2 = B5T.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put(AnonymousClass000.A00(4778), treeUpdaterJNI2);
        }
        if (r4.BIQ() != null) {
            C269904fs BIQ = r4.BIQ();
            if (BIQ != null) {
                treeUpdaterJNI = BIQ.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("interests_reco_info", treeUpdaterJNI);
        }
        if (r4.CTV() != null) {
            A1H.put("is_feed_dwell_afi_eligible", r4.CTV());
        }
        if (r4.CTY() != null) {
            A1H.put("is_feed_post_click_afi_eligible", r4.CTY());
        }
        if (r4.CaW() != null) {
            A1H.put("is_reels_dwell_afi_eligible", r4.CaW());
        }
        if (r4.C0O() != null) {
            C269914ft C0O = r4.C0O();
            if (C0O != null) {
                treeUpdaterJNI5 = C0O.FHC();
            }
            A1H.put("story_dwell_ini_info", treeUpdaterJNI5);
        }
        return 0Yt.A0B(A1H);
    }
}
