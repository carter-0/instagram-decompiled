package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteSaveAudienceEditResponse;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.W0j  reason: case insensitive filesystem */
public abstract class C18765W0j {
    public static 1OC A01(XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, String str, String str2, List list) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("ads/promote/audience_create_screen/");
        A0N.A0G("media_id", str2);
        A0N.A9m("regulated_category", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A0N.A9m("destination", xIGIGBoostDestination.toString());
        A0N.A9m("fb_auth_token", str);
        A0N.A0R(PromoteAudienceInfo.class, C18168Vmi.class);
        if (list != null) {
            A0N.A9m("regulated_categories", C51970G9q.A0k(list));
        }
        return A0N.A0M();
    }

    public static 1OC A02(UserSession userSession, String str, double d, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        1NY r2 = new 1NY(userSession);
        r2.A0G("caption", str);
        r2.A0H("has_branded_content_tag", z);
        r2.A0H("has_product_tags", z2);
        r2.A0H("has_tagged_collection", z3);
        r2.A0H("has_upcoming_event", z4);
        r2.A0H("is_feed", z5);
        r2.A0H(AnonymousClass000.A00(3472), z6);
        r2.A0C(AnonymousClass000.A00(1576), i);
        r2.A0C(AnonymousClass000.A00(703), i2);
        r2.A0W.A05("video_duration_s", String.valueOf(d));
        r2.A0H("is_carousel_media", z7);
        r2.A0C("num_carousel_cards", i3);
        r2.A04();
        r2.A0A("ads/promote/promote_eligibility/");
        return DbT.A0S(r2, C54065Gyo.class, C56245HvC.class);
    }

    public static 1OC A00(AdvantageAudienceData advantageAudienceData, TargetingRelaxationConstants targetingRelaxationConstants, UserSession userSession, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, double d, double d2, int i, int i2, int i3) {
        String obj;
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("ads/promote/edit_audience/");
        A0N.A0G("audience_id", str);
        A0N.A9m("fb_auth_token", "");
        A0N.A0C("fb_actor_id", 0);
        if (targetingRelaxationConstants == null) {
            obj = TargetingRelaxationConstants.A05.toString();
        } else {
            obj = targetingRelaxationConstants.toString();
        }
        A0N.A9m("target_relax_option", obj);
        A0N.A0G("address", str3);
        A0N.A0G("audience_name", str2);
        A0N.A0R(PromoteSaveAudienceEditResponse.class, C18172Vmm.class);
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

    public static 1OC A03(UserSession userSession, String str, boolean z) {
        String str2;
        1NY A0N = DbU.A0N(userSession);
        if (z) {
            str2 = "ads/promote/ads_mode_story_afterparty_promote_eligibility/";
        } else {
            str2 = "ads/promote/story_afterparty_promote_eligibility/";
        }
        A0N.A0E = str2;
        JTO.A1W(A0N, str);
        return DbY.A0N(A0N, UX3.class, C18143VmJ.class);
    }
}
