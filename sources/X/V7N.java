package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.api.schemas.PrivacyDisclosureInfo;
import com.instagram.api.schemas.SocialProofInfo;
import com.instagram.api.schemas.WhatsAppAttributionInfo;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V7N {
    public static Map A00(IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iGCTMessagingAdsInfoDictIntf.BEr() != null) {
            linkedHashMap.put("igAdvertiserId", iGCTMessagingAdsInfoDictIntf.BEr());
        }
        if (iGCTMessagingAdsInfoDictIntf.COE() != null) {
            linkedHashMap.put("isActive", iGCTMessagingAdsInfoDictIntf.COE());
        }
        if (iGCTMessagingAdsInfoDictIntf.CSD() != null) {
            linkedHashMap.put("isEligibleForOnFeedMessages", iGCTMessagingAdsInfoDictIntf.CSD());
        }
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (iGCTMessagingAdsInfoDictIntf.BTY() != null) {
            OnFeedMessagesIntf BTY = iGCTMessagingAdsInfoDictIntf.BTY();
            if (BTY != null) {
                treeUpdaterJNI3 = BTY.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put("model", treeUpdaterJNI3);
        }
        if (iGCTMessagingAdsInfoDictIntf.BaD() != null) {
            linkedHashMap.put("pageID", iGCTMessagingAdsInfoDictIntf.BaD());
        }
        if (iGCTMessagingAdsInfoDictIntf.Bfm() != null) {
            PrivacyDisclosureInfo Bfm = iGCTMessagingAdsInfoDictIntf.Bfm();
            if (Bfm != null) {
                treeUpdaterJNI2 = Bfm.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("privacyDisclosureInfo", treeUpdaterJNI2);
        }
        if (iGCTMessagingAdsInfoDictIntf.Bnt() != null) {
            linkedHashMap.put("responsivenessText", iGCTMessagingAdsInfoDictIntf.Bnt());
        }
        if (iGCTMessagingAdsInfoDictIntf.BqY() != null) {
            linkedHashMap.put("secondaryCTASubtitle", iGCTMessagingAdsInfoDictIntf.BqY());
        }
        if (iGCTMessagingAdsInfoDictIntf.BuH() != null) {
            linkedHashMap.put("shouldNavigateToThread", iGCTMessagingAdsInfoDictIntf.BuH());
        }
        if (iGCTMessagingAdsInfoDictIntf.Buu() != null) {
            linkedHashMap.put("shouldTreatLinkStickerAsCTA", iGCTMessagingAdsInfoDictIntf.Buu());
        }
        if (iGCTMessagingAdsInfoDictIntf.BxZ() != null) {
            SocialProofInfo BxZ = iGCTMessagingAdsInfoDictIntf.BxZ();
            if (BxZ != null) {
                treeUpdaterJNI = BxZ.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("socialProofInfo", treeUpdaterJNI);
        }
        if (iGCTMessagingAdsInfoDictIntf.CGQ() != null) {
            WhatsAppAttributionInfo CGQ = iGCTMessagingAdsInfoDictIntf.CGQ();
            if (CGQ != null) {
                treeUpdaterJNI4 = CGQ.FHC();
            }
            linkedHashMap.put("whatsaAppAttributionInfo", treeUpdaterJNI4);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
