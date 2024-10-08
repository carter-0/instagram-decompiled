package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.FanClubInfoDict;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B49 {
    public static Map A00(FanClubInfoDict fanClubInfoDict) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (fanClubInfoDict.Ae7() != null) {
            linkedHashMap.put("autosave_to_exclusive_highlight", fanClubInfoDict.Ae7());
        }
        if (fanClubInfoDict.Aq0() != null) {
            linkedHashMap.put("connected_member_count", fanClubInfoDict.Aq0());
        }
        if (fanClubInfoDict.getFanClubId() != null) {
            linkedHashMap.put("fan_club_id", fanClubInfoDict.getFanClubId());
        }
        if (fanClubInfoDict.getFanClubName() != null) {
            linkedHashMap.put("fan_club_name", fanClubInfoDict.getFanClubName());
        }
        if (fanClubInfoDict.B3z() != null) {
            FanClubFanConsiderationPageFeatureEligibilityResponse B3z = fanClubInfoDict.B3z();
            if (B3z != null) {
                treeUpdaterJNI = B3z.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("fan_consideration_page_revamp_eligiblity", treeUpdaterJNI);
        }
        if (fanClubInfoDict.BB1() != null) {
            linkedHashMap.put("has_enough_subscribers_for_ssc", fanClubInfoDict.BB1());
        }
        if (fanClubInfoDict.CT7() != null) {
            linkedHashMap.put("is_fan_club_gifting_eligible", fanClubInfoDict.CT7());
        }
        if (fanClubInfoDict.CT9() != null) {
            linkedHashMap.put("is_fan_club_referral_eligible", fanClubInfoDict.CT9());
        }
        if (fanClubInfoDict.BKZ() != null) {
            linkedHashMap.put("largest_public_bc_id", fanClubInfoDict.BKZ());
        }
        if (fanClubInfoDict.C2R() != null) {
            linkedHashMap.put("subscriber_count", fanClubInfoDict.C2R());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
