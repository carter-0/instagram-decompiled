package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HTf  reason: case insensitive filesystem */
public abstract /* synthetic */ class C54798HTf {
    public static Map A00(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (intentAwareAdsInfoIntf.B7S() != null) {
            IntentAwareAdsFormatInfo B7S = intentAwareAdsInfoIntf.B7S();
            if (B7S != null) {
                treeUpdaterJNI = B7S.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("format_info", treeUpdaterJNI);
        }
        if (intentAwareAdsInfoIntf.BHg() != null) {
            A1H.put("insertion_mechanism", intentAwareAdsInfoIntf.BHg());
        }
        if (intentAwareAdsInfoIntf.CbN() != null) {
            A1H.put("is_seed_ad_eligible", intentAwareAdsInfoIntf.CbN());
        }
        if (intentAwareAdsInfoIntf.BUR() != null) {
            A1H.put("multi_ads_first_ad_id", intentAwareAdsInfoIntf.BUR());
        }
        if (intentAwareAdsInfoIntf.BUY() != null) {
            A1H.put("multi_ads_type", intentAwareAdsInfoIntf.BUY());
        }
        if (intentAwareAdsInfoIntf.BUa() != null) {
            A1H.put("multi_ads_unit_id", intentAwareAdsInfoIntf.BUa());
        }
        if (intentAwareAdsInfoIntf.Br2() != null) {
            A1H.put("seed_ad_id", intentAwareAdsInfoIntf.Br2());
        }
        if (intentAwareAdsInfoIntf.Br3() != null) {
            A1H.put("seed_ad_position", intentAwareAdsInfoIntf.Br3());
        }
        if (intentAwareAdsInfoIntf.Br4() != null) {
            A1H.put("seed_ad_token", intentAwareAdsInfoIntf.Br4());
        }
        if (intentAwareAdsInfoIntf.C9y() != null) {
            A1H.put("trigger_type", intentAwareAdsInfoIntf.C9y());
        }
        return 0Yt.A0B(A1H);
    }
}
