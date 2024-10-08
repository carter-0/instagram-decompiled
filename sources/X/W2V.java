package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.business.promote.model.PromoteCreateAudienceResponse;
import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class W2V {
    public static 1OC A01(AdvantageAudienceData advantageAudienceData, TargetingRelaxationConstants targetingRelaxationConstants, UserSession userSession, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, double d, double d2, int i, int i2, int i3) {
        String obj;
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("ads/promote/create_audience_v2/");
        A0N.A9m("fb_auth_token", "");
        A0N.A9m("flow_id", str3);
        if (targetingRelaxationConstants == null) {
            obj = TargetingRelaxationConstants.A05.toString();
        } else {
            obj = targetingRelaxationConstants.toString();
        }
        A0N.A9m("target_relax_option", obj);
        A0N.A0G("address", str2);
        A0N.A0G(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        A0N.A0R(PromoteCreateAudienceResponse.class, C18170Vmk.class);
        if (list3 != null) {
            A0N.A9m("countries", C51970G9q.A0k(list3));
        }
        if (list4 != null) {
            A0N.A9m("region_keys", C51970G9q.A0k(list4));
        }
        if (list5 != null) {
            A0N.A9m("city_keys", C51970G9q.A0k(list5));
        }
        if (list6 != null) {
            A0N.A9m("zip_keys", C51970G9q.A0k(list6));
        }
        if (!AnonymousClass4KJ.A00(list2)) {
            A0N.A9m("interest_ids", C51970G9q.A0k(list2));
        }
        int i4 = i2;
        if (i2 != 0) {
            int i5 = i;
            if (i != 0) {
                C13992Tns.A0t(A0N, i5, i4);
            }
        }
        double d3 = d2;
        if (d2 != 0.0d) {
            double d4 = d;
            if (d != 0.0d) {
                C13991Tnr.A1B(A0N, d3, d4);
            }
        }
        if (i3 != 0) {
            A0N.A9m("radius", String.valueOf(i3));
        }
        if (!AnonymousClass4KJ.A00(list)) {
            A0N.A9m("genders", C51970G9q.A0k(list));
        }
        if (advantageAudienceData != null && C18803W2r.A06(userSession)) {
            A0N.A9m("advantage_audience", JTQ.A0c(V71.A00(advantageAudienceData)));
        }
        return A0N.A0M();
    }

    public static 1OC A02(UserSession userSession, String str, String str2, String str3) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("ads/promote/audience_edit_screen_v2/");
        A0N.A0G("audience_id", str2);
        A0N.A9m("fb_auth_token", str);
        A0N.A9m("flow_id", str3);
        return DbT.A0S(A0N, PromoteAudienceInfo.class, C18168Vmi.class);
    }

    public static 1OC A03(UserSession userSession, String str, String str2, String str3, String str4) {
        1NY A0N = DbU.A0N(userSession);
        C13990Tnq.A1C(A0N, "ads/promote/review_screen_details_v2/", str);
        A0N.A9m("flow_id", str2);
        JTO.A1W(A0N, str3);
        A0N.A9m("ad_amount", str4);
        return DbT.A0S(A0N, C43816CEi.class, C45619CzV.class);
    }

    public static 1OC A04(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        1NY A0N = DbU.A0N(userSession);
        C13990Tnq.A1C(A0N, AnonymousClass000.A00(2583), str);
        JTO.A1W(A0N, str2);
        A0N.A9m("platform_for_debug", "native_ig_android");
        A0N.A0G("selected_audio_spec", str3);
        A0N.A0G("flow_id", str4);
        A0N.A0G("coupon_offer_id", str5);
        A0N.A0G("promote_entry_point", str6);
        return DbT.A0S(A0N, C15254UXo.class, C18156VmW.class);
    }

    public static 1OC A05(UserSession userSession, String str, String str2, List list, boolean z) {
        1NY A0N = DbU.A0N(userSession);
        C51968G9o.A1K(A0N, "ads/promote/suggested_interests_v2/", str);
        A0N.A9m("detailed_targeting_items", list.toString());
        A0N.A0H("should_fetch_default_interests", z);
        A0N.A9m("flow_id", str2);
        return DbT.A0S(A0N, UXV.class, C18163Vmd.class);
    }

    public static 1OC A00(AdvantageAudienceData advantageAudienceData, TargetingRelaxationConstants targetingRelaxationConstants, XIGIGBoostDestination xIGIGBoostDestination, AnonymousClass1O9 r11, UserSession userSession, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, double d, double d2, int i, int i2, int i3) {
        String obj;
        1NY A0N = DbU.A0N(userSession);
        C51968G9o.A1K(A0N, "ads/promote/audience_potential_reach_v2/", str);
        A0N.A9m("destination", xIGIGBoostDestination.toString());
        A0N.A9m("additional_publisher_platforms", C51970G9q.A0k(list));
        A0N.A9m("fb_auth_token", "");
        C13992Tns.A0t(A0N, i, i2);
        A0N.A0G("address", str2);
        A0N.A0G("flow_id", str3);
        if (targetingRelaxationConstants == null) {
            obj = TargetingRelaxationConstants.A05.toString();
        } else {
            obj = targetingRelaxationConstants.toString();
        }
        A0N.A9m("target_relax_option", obj);
        A0N.A0R(PromoteAudiencePotentialReach.class, C18169Vmj.class);
        if (list2 != null) {
            A0N.A9m("genders", C51970G9q.A0k(list2));
        }
        if (list4 != null) {
            A0N.A9m("countries", C51970G9q.A0k(list4));
        }
        if (list5 != null) {
            A0N.A9m("region_keys", C51970G9q.A0k(list5));
        }
        if (list6 != null) {
            A0N.A9m("city_keys", C51970G9q.A0k(list6));
        }
        if (list7 != null) {
            A0N.A9m("zip_keys", C51970G9q.A0k(list7));
        }
        if (list3 != null) {
            A0N.A9m("interest_ids", C51970G9q.A0k(list3));
        }
        double d3 = d2;
        if (d2 != 0.0d) {
            double d4 = d;
            if (d != 0.0d) {
                C13991Tnr.A1B(A0N, d3, d4);
            }
        }
        if (i3 != 0) {
            A0N.A9m("radius", String.valueOf(i3));
        }
        if (advantageAudienceData != null) {
            A0N.A9m("advantage_audience", JTQ.A0c(V71.A00(advantageAudienceData)));
        }
        A0N.A00 = r11;
        return A0N.A0M();
    }
}
