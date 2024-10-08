package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponseImpl;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.FanClubInfoDictImpl;
import com.instagram.api.schemas.ImmutablePandoFanClubInfoDict;

/* renamed from: X.CwY  reason: case insensitive filesystem */
public class C45445CwY {
    public FanClubFanConsiderationPageFeatureEligibilityResponse A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;
    public final FanClubInfoDict A0A;

    public final FanClubInfoDict A00() {
        FanClubFanConsiderationPageFeatureEligibilityResponseImpl fanClubFanConsiderationPageFeatureEligibilityResponseImpl;
        TreeJNI fanClubInfoDictImpl;
        TreeUpdaterJNI treeUpdaterJNI;
        FanClubInfoDict fanClubInfoDict = this.A0A;
        if (fanClubInfoDict instanceof ImmutablePandoFanClubInfoDict) {
            TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
            0eP A1L = AnonymousClass7TE.A1L("autosave_to_exclusive_highlight", this.A01);
            0eP A1L2 = AnonymousClass7TE.A1L("connected_member_count", this.A05);
            0eP A1L3 = AnonymousClass7TE.A1L("fan_club_id", this.A07);
            0eP A1L4 = AnonymousClass7TE.A1L("fan_club_name", this.A08);
            FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse = this.A00;
            if (fanClubFanConsiderationPageFeatureEligibilityResponse != null) {
                treeUpdaterJNI = fanClubFanConsiderationPageFeatureEligibilityResponse.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            fanClubInfoDictImpl = C41847B3o.A0o(fanClubInfoDict, new 0eP[]{A1L, A1L2, A1L3, A1L4, AnonymousClass7TE.A1L("fan_consideration_page_revamp_eligiblity", treeUpdaterJNI), AnonymousClass7TE.A1L("has_enough_subscribers_for_ssc", this.A02), AnonymousClass7TE.A1L("is_fan_club_gifting_eligible", this.A03), AnonymousClass7TE.A1L("is_fan_club_referral_eligible", this.A04), AnonymousClass7TE.A1L("largest_public_bc_id", this.A09), AnonymousClass7TE.A1L("subscriber_count", this.A06)});
        } else {
            Boolean bool = this.A01;
            Integer num = this.A05;
            String str = this.A07;
            String str2 = this.A08;
            FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse2 = this.A00;
            if (fanClubFanConsiderationPageFeatureEligibilityResponse2 != null) {
                fanClubFanConsiderationPageFeatureEligibilityResponseImpl = fanClubFanConsiderationPageFeatureEligibilityResponse2.F2x();
            } else {
                fanClubFanConsiderationPageFeatureEligibilityResponseImpl = null;
            }
            fanClubInfoDictImpl = new FanClubInfoDictImpl(fanClubFanConsiderationPageFeatureEligibilityResponseImpl, bool, this.A02, this.A03, this.A04, num, this.A06, str, str2, this.A09);
        }
        return (FanClubInfoDict) fanClubInfoDictImpl;
    }

    public C45445CwY(FanClubInfoDict fanClubInfoDict) {
        this.A0A = fanClubInfoDict;
        this.A01 = fanClubInfoDict.Ae7();
        this.A05 = fanClubInfoDict.Aq0();
        this.A07 = fanClubInfoDict.getFanClubId();
        this.A08 = fanClubInfoDict.getFanClubName();
        this.A00 = fanClubInfoDict.B3z();
        this.A02 = fanClubInfoDict.BB1();
        this.A03 = fanClubInfoDict.CT7();
        this.A04 = fanClubInfoDict.CT9();
        this.A09 = fanClubInfoDict.BKZ();
        this.A06 = fanClubInfoDict.C2R();
    }
}
