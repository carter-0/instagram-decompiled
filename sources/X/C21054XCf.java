package X;

import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.instagram.settings2.core.model.AndValue;
import com.instagram.settings2.core.model.DerivedStringValue;
import com.instagram.settings2.core.model.EqualsValue;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.XCf  reason: case insensitive filesystem */
public abstract class C21054XCf {
    public static Double A03(0xF r2, String str) {
        String A05 = r2.A05(str);
        if (A05 != null) {
            return Double.valueOf(Double.parseDouble(A05));
        }
        return null;
    }

    public static Integer A04(ReactShadowNodeImpl reactShadowNodeImpl, Object obj) {
        if (obj == null) {
            return null;
        }
        QZL qzl = reactShadowNodeImpl.A0A;
        0Sd.A00(qzl);
        return SPt.A01(qzl, obj, 0);
    }

    public static Long A07(Number number) {
        if (number != null) {
            return Long.valueOf((long) number.intValue());
        }
        return null;
    }

    public static void A1X(0Aj r3, 0jB r4, Integer num) {
        r4.A01(new 0j9(num, "profile_shop_link"));
        r3.AAK((0bb) null, "profile_shop_link");
    }

    public static void A1b(AbstractCollection abstractCollection, Iterator it) {
        String str = (String) it.next();
        0qQ.A0B(str, 0);
        abstractCollection.add(00y.A0n(10, str));
    }

    public static EqualsValue A01(C21248XQt xQt, Object obj) {
        return new EqualsValue(new DerivedStringValue(xQt), new KY2(obj));
    }

    public static KYA A02(XTW xtw, MR1 mr1, Class cls, String str) {
        return new KYA(new C61079JwH(xtw, mr1, str), new 0Yh(cls));
    }

    public static Long A05(0xF r3, String str) {
        String A05 = r3.A05(str);
        if (A05 != null) {
            return 00y.A0n(10, A05);
        }
        return null;
    }

    public static Long A06(0j9 r3, 0jB r4) {
        String str = (String) r4.A01(r3);
        if (str != null) {
            return 00y.A0n(10, str);
        }
        return null;
    }

    public static void A09(0Aj r2, 0jB r3) {
        Long l = (Long) r3.A01(C271774jZ.A3Y);
        if (l != null) {
            r2.A9F("host_profile_id", l);
        }
    }

    public static void A0A(0Aj r2, 0jB r3) {
        r2.A7p("is_influencer", (Boolean) r3.A01(C271774jZ.A4O));
    }

    public static void A0B(0Aj r2, 0jB r3) {
        r2.AAJ("viewer_session_id", (String) r3.A01(C271774jZ.A9i));
    }

    public static void A0C(0Aj r2, 0jB r3) {
        r2.A9F("next_max_id", (Long) r3.A01(C271774jZ.A65));
    }

    public static void A0D(0Aj r2, 0jB r3) {
        r2.A7p("is_acp_delivered", (Boolean) r3.A01(C271774jZ.A3t));
    }

    public static void A0E(0Aj r2, 0jB r3) {
        r2.A9F("hashtag_id", (Long) r3.A01(C271774jZ.A3O));
    }

    public static void A0F(0Aj r2, 0jB r3) {
        r2.AAJ("connection_id", (String) r3.A01(C271774jZ.A1X));
    }

    public static void A0G(0Aj r2, 0jB r3) {
        r2.AAJ("prior_module", (String) r3.A01(C271774jZ.A6h));
    }

    public static void A0H(0Aj r2, 0jB r3) {
        r2.AAJ("m_pk", (String) r3.A01(C271774jZ.A5I));
    }

    public static void A0I(0Aj r2, 0jB r3) {
        r2.AAJ("merchant_id", (String) r3.A01(C271774jZ.A5e));
    }

    public static void A0J(0Aj r2, 0jB r3) {
        r2.A9F("carousel_index", (Long) r3.A01(C271774jZ.A0z));
    }

    public static void A0K(0Aj r2, 0jB r3) {
        r2.A7p("is_eof", (Boolean) r3.A01(C271774jZ.A4G));
    }

    public static void A0L(0Aj r2, 0jB r3) {
        r2.A7p("production_build", (Boolean) r3.A01(C271774jZ.A2h));
    }

    public static void A0M(0Aj r2, 0jB r3) {
        r2.AAJ("inventory_source", (String) r3.A01(C271774jZ.A3q));
    }

    public static void A0N(0Aj r2, 0jB r3) {
        r2.AAJ("multi_ads_type_name", (String) r3.A01(C271774jZ.A5x));
    }

    public static void A0O(0Aj r2, 0jB r3) {
        r2.A9F("seq_session", (Long) r3.A01(C271774jZ.A7u));
    }

    public static void A0P(0Aj r2, 0jB r3) {
        r2.A9F("carousel_type", (Long) r3.A01(C271774jZ.A19));
    }

    public static void A0Q(0Aj r2, 0jB r3) {
        r2.A9F("seq_num", (Long) r3.A01(C271774jZ.A7t));
    }

    public static void A0R(0Aj r2, 0jB r3) {
        r2.AAJ("reel_id", (String) r3.A01(C271774jZ.A7T));
    }

    public static void A0S(0Aj r2, 0jB r3) {
        r2.A9F("top_likers_count", (Long) r3.A01(C271774jZ.A9I));
    }

    public static void A0T(0Aj r2, 0jB r3) {
        r2.A7p("is_checkout_enabled", (Boolean) r3.A01(C271774jZ.A41));
    }

    public static void A0U(0Aj r2, 0jB r3) {
        r2.A9F("m_ts", (Long) r3.A01(C271774jZ.A8x));
    }

    public static void A0V(0Aj r2, 0jB r3) {
        r2.A9F("carousel_opt_in_position", (Long) r3.A01(C271774jZ.A14));
    }

    public static void A0W(0Aj r2, 0jB r3) {
        r2.A9F("carousel_size", (Long) r3.A01(C271774jZ.A15));
    }

    public static void A0X(0Aj r2, 0jB r3) {
        r2.A9F("media_id", (Long) r3.A01(C271774jZ.A5K));
    }

    public static void A0Y(0Aj r2, 0jB r3) {
        r2.A9F("session_reel_counter", (Long) r3.A01(C271774jZ.A7y));
    }

    public static void A0Z(0Aj r2, 0jB r3) {
        r2.A9F("imp_logger_ver", (Long) r3.A01(C271774jZ.A3k));
    }

    public static void A0a(0Aj r2, 0jB r3) {
        r2.A9F("ad_inserted_position", (Long) r3.A01(C271774jZ.A0D));
    }

    public static void A0b(0Aj r2, 0jB r3) {
        r2.A9F("reel_start_position", (Long) r3.A01(C271774jZ.A7W));
    }

    public static void A0c(0Aj r2, 0jB r3) {
        r2.AAJ("follow_status", (String) r3.A01(C271774jZ.A2v));
    }

    public static void A0d(0Aj r2, 0jB r3) {
        r2.A9F("has_top_likers", (Long) r3.A01(C271774jZ.A3T));
    }

    public static void A0e(0Aj r2, 0jB r3) {
        r2.AAJ("action", (String) r3.A01(C271774jZ.A00));
    }

    public static void A0f(0Aj r2, 0jB r3) {
        r2.A9F("carousel_starting_media_id", (Long) r3.A01(C271774jZ.A16));
    }

    public static void A0g(0Aj r2, 0jB r3) {
        r2.A7p("is_multi_ads", (Boolean) r3.A01(C271774jZ.A4V));
    }

    public static void A0h(0Aj r2, 0jB r3) {
        r2.AAJ("release_channel", (String) r3.A01(C271774jZ.A7c));
    }

    public static void A0i(0Aj r2, 0jB r3) {
        r2.AAJ("feed_request_id", (String) r3.A01(C271774jZ.A88));
    }

    public static void A0j(0Aj r2, 0jB r3) {
        r2.A7p("is_previewable_video_ad", (Boolean) r3.A01(C271774jZ.A4b));
    }

    public static void A0k(0Aj r2, 0jB r3) {
        r2.A9F("tray_position", (Long) r3.A01(C271774jZ.A9P));
    }

    public static void A0l(0Aj r2, 0jB r3) {
        r2.AAJ("explore_topic_session_id", (String) r3.A01(C271774jZ.A2g));
    }

    public static void A0m(0Aj r2, 0jB r3) {
        r2.AAJ("is_coming_from", (String) r3.A01(C271774jZ.A42));
    }

    public static void A0n(0Aj r2, 0jB r3) {
        r2.A9F("top_followers_count", (Long) r3.A01(C271774jZ.A9H));
    }

    public static void A0o(0Aj r2, 0jB r3) {
        r2.A9F("chaining_position", (Long) r3.A01(C271774jZ.A1A));
    }

    public static void A0p(0Aj r2, 0jB r3) {
        r2.AAJ("counter_channel", (String) r3.A01(C271774jZ.A1f));
    }

    public static void A0q(0Aj r2, 0jB r3) {
        r2.A9F("top_liker_count", (Long) r3.A01(C271774jZ.A9J));
    }

    public static void A0r(0Aj r2, 0jB r3) {
        r2.AAJ("story_ranking_token", (String) r3.A01(C271774jZ.A8O));
    }

    public static void A0s(0Aj r2, 0jB r3) {
        r2.AAJ("endpoint_type", (String) r3.A01(C271774jZ.A2R));
    }

    public static void A0t(0Aj r2, 0jB r3) {
        r2.A9F("media_loading_progress", (Long) r3.A01(C271774jZ.A5P));
    }

    public static void A0u(0Aj r2, 0jB r3) {
        r2.A7p("is_internal_build", (Boolean) r3.A01(C271774jZ.A4P));
    }

    public static void A0v(0Aj r2, 0jB r3) {
        r2.A7p("impression_logger_validate", (Boolean) r3.A01(C271774jZ.A3i));
    }

    public static void A0w(0Aj r2, 0jB r3) {
        r2.A8D("elapsed_time_since_last_item", (Double) r3.A01(C271774jZ.A2P));
    }

    public static void A0x(0Aj r2, 0jB r3) {
        r2.AAJ("sessions_chain", (String) r3.A01(C271774jZ.A7w));
    }

    public static void A0y(0Aj r2, 0jB r3) {
        r2.A9F("scans", (Long) r3.A01(C271774jZ.A1x));
    }

    public static void A0z(0Aj r2, 0jB r3) {
        r2.AAJ("reel_type", (String) r3.A01(C271774jZ.A7Y));
    }

    public static void A10(0Aj r2, 0jB r3) {
        r2.AAJ("multi_ads_unit_id", (String) r3.A01(C271774jZ.A5y));
    }

    public static void A11(0Aj r2, 0jB r3) {
        r2.AAJ("ad_skip_type", (String) r3.A01(C271774jZ.A0M));
    }

    public static void A12(0Aj r2, 0jB r3) {
        r2.AAJ("entity_follow_status", (String) r3.A01(C271774jZ.A2Y));
    }

    public static void A13(0Aj r2, 0jB r3) {
        r2.AAJ("post_id", (String) r3.A01(C271774jZ.A6Z));
    }

    public static void A14(0Aj r2, 0jB r3) {
        r2.AAJ("mezql_token", (String) r3.A01(C271774jZ.A5g));
    }

    public static void A15(0Aj r2, 0jB r3) {
        r2.AAJ("event_trace_id", (String) r3.A01(C271774jZ.A2f));
    }

    public static void A16(0Aj r2, 0jB r3) {
        r2.AAJ("gating_type", (String) r3.A01(C271774jZ.A36));
    }

    public static void A17(0Aj r2, 0jB r3) {
        r2.AAJ("ranking_session_id", (String) r3.A01(C271774jZ.A6q));
    }

    public static void A18(0Aj r2, 0jB r3) {
        r2.AAJ("topic_cluster_debug_info", (String) r3.A01(C271774jZ.A9C));
    }

    public static void A19(0Aj r2, 0jB r3) {
        r2.AAJ("multi_ads_id", (String) r3.A01(C271774jZ.A5u));
    }

    public static void A1A(0Aj r2, 0jB r3) {
        r2.AAJ("radio_type", (String) r3.A01(C271774jZ.A6o));
    }

    public static void A1B(0Aj r2, 0jB r3) {
        r2.AAJ("media_thumbnail_section", (String) r3.A01(C271774jZ.A5X));
    }

    public static void A1C(0Aj r2, 0jB r3) {
        r2.A9F("reel_viewer_position", (Long) r3.A01(C271774jZ.A7b));
    }

    public static void A1D(0Aj r2, 0jB r3) {
        r2.AAJ("is_programmatic_scroll", (String) r3.A01(C271774jZ.A4g));
    }

    public static void A1E(0Aj r2, 0jB r3) {
        r2.AAJ("chaining_session_id", (String) r3.A01(C271774jZ.A1C));
    }

    public static void A1F(0Aj r2, 0jB r3) {
        r2.AAJ("application_state", (String) r3.A01(C271774jZ.A0Q));
    }

    public static void A1G(0Aj r2, 0jB r3) {
        r2.AAJ("topic_cluster_status", (String) r3.A01(C271774jZ.A9E));
    }

    public static void A1H(0Aj r2, 0jB r3) {
        r2.AAJ("igtv_viewer_session_id", (String) r3.A01(C271774jZ.A3h));
    }

    public static void A1I(0Aj r2, 0jB r3) {
        r2.AAJ("parent_m_pk", (String) r3.A01(C271774jZ.A6S));
    }

    public static void A1J(0Aj r2, 0jB r3) {
        r2.AAJ(C21058XCk.A00(), (String) r3.A01(C271774jZ.A7x));
    }

    public static void A1K(0Aj r2, 0jB r3) {
        r2.AAJ("delivery_flags", (String) r3.A01(C271774jZ.A26));
    }

    public static void A1L(0Aj r2, 0jB r3) {
        r2.A9F("is_dark_mode", (Long) r3.A01(C271774jZ.A4B));
    }

    public static void A1M(0Aj r2, 0jB r3) {
        r2.AAJ("ranking_info_token", (String) r3.A01(C271774jZ.A6p));
    }

    public static void A1N(0Aj r2, 0jB r3) {
        r2.A9F("cta_state", (Long) r3.A01(C271774jZ.A08));
    }

    public static void A1O(0Aj r2, 0jB r3) {
        r2.A7p("is_igtv", (Boolean) r3.A01(C271774jZ.A4M));
    }

    public static void A1P(0Aj r2, 0jB r3) {
        r2.A8D("time_elapsed", (Double) r3.A01(C271774jZ.A8z));
    }

    public static void A1Q(0Aj r2, 0jB r3) {
        r2.AAJ("host_video_pk", (String) r3.A01(C271774jZ.A3a));
    }

    public static void A1R(0Aj r2, 0jB r3) {
        r2.A9F("client_position", (Long) r3.A01(C271774jZ.A3r));
    }

    public static void A1S(0Aj r2, 0jB r3) {
        r2.AAJ("source_of_action", (String) r3.A01(C271774jZ.A8A));
    }

    public static void A1T(0Aj r2, 0jB r3) {
        r2.AAJ("tracking_token", (String) r3.A01(C271774jZ.A9L));
    }

    public static void A1U(0Aj r2, 0jB r3) {
        r2.A7p("is_video_to_carousel", (Boolean) r3.A01(C271774jZ.A4z));
    }

    public static void A1V(0Aj r2, 0jB r3) {
        r2.AAJ("nav_chain", (String) r3.A01(C271774jZ.A60));
    }

    public static void A1W(0Aj r2, 0jB r3) {
        r2.A7p("is_ad", (Boolean) r3.A01(C271774jZ.A3s));
    }

    public static void A1Y(0Aj r1, 0jB r2, Integer num, String str) {
        r1.AAJ(str, (String) r2.A01(new 0j9(num, str)));
    }

    public static void A1Z(0Aj r2, String str) {
        r2.AAJ("waterfall_id", str);
        r2.A9F("fb_user_id", (Long) null);
    }

    public static void A1a(0bb r2, 0jB r3) {
        r2.A03("is_showreel_native", (Boolean) r3.A01(C271774jZ.A4p));
    }

    public static AndValue A00(C64185LSs lSs, C64185LSs lSs2) {
        return new AndValue(0sr.A1P(new C64185LSs[]{lSs, lSs2}));
    }

    public static LinkedHashMap A08(AbstractMap abstractMap) {
        return new LinkedHashMap(0se.A0L(abstractMap.size()));
    }
}
