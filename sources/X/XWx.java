package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class XWx {
    public static final void A00(0wc r5, C254523sc r6, AnonymousClass4DU r7) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        LinkedHashMap linkedHashMap;
        0bb r52;
        Set keySet;
        0Aj A0e = AnonymousClass7TE.A0e(r5, AnonymousClass000.A00(4884));
        0jB A01 = r6.A01();
        if (A0e.isSampled()) {
            C21053XCe.A0u(A0e, C271774jZ.A0Z, A01);
            C21055XCg.A1B(A0e, A01, C51966G9m.A13(C271774jZ.A0C, A01), "ad_id");
            C21054XCf.A0H(A0e, A01);
            C21055XCg.A0h(A0e, C271774jZ.A5a, A01);
            C21054XCf.A1S(A0e, A01);
            0bb r2 = null;
            A0e.A8D("start_x_position", C21053XCe.A0Z(C21053XCe.A0b(C271774jZ.A8L, A01)));
            A0e.A8D("start_y_position", C21055XCg.A0K(C271774jZ.A8M, A01));
            C21054XCf.A1T(A0e, A01);
            A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C51966G9m.A1C(C271774jZ.A9T, A01));
            A0e.A9F("screen_height", (Long) null);
            A0e.A9F("screen_width", (Long) null);
            C21055XCg.A0q(A0e, A01);
            C21055XCg.A0u(A0e, A01);
            C21054XCf.A0z(A0e, A01);
            C21054XCf.A0Y(A0e, A01);
            A0e.AAJ("tray_session_id", C51966G9m.A1C(C271774jZ.A7X, A01));
            0j9 r53 = C271774jZ.A9i;
            A0e.AAJ("viewer_session_id", C51966G9m.A1C(r53, A01));
            C21054XCf.A0r(A0e, A01);
            C21054XCf.A1U(A0e, A01);
            C21054XCf.A0h(A0e, A01);
            C21054XCf.A0q(A0e, A01);
            A0e.A8D("screen_density", (Double) null);
            A0e.A8D("device_height", (Double) null);
            A0e.A8D("device_width", (Double) null);
            C21054XCf.A1C(A0e, A01);
            C21053XCe.A10(A0e, A01);
            C21054XCf.A0b(A0e, A01);
            A0e.A9F("elapsed_time_since_last_item", C21055XCg.A0R(C271774jZ.A2P, A01));
            C21054XCf.A0e(A0e, A01);
            A0e.AAe("header_layout", (List) null);
            A0e.A8D("current_play_time", C21055XCg.A0K(C271774jZ.A1w, A01));
            C21054XCf.A0m(A0e, A01);
            C21054XCf.A0a(A0e, A01);
            C21054XCf.A1L(A0e, A01);
            A0e.A9H("media_layout", (Map) null);
            C21054XCf.A0V(A0e, A01);
            A0e.A8D("end_x_position", C21055XCg.A0K(C271774jZ.A2S, A01));
            A0e.A8D("end_y_position", C21055XCg.A0K(C271774jZ.A2T, A01));
            A0e.A8D("x_velocity", C21055XCg.A0K(C271774jZ.A9u, A01));
            A0e.A8D("y_velocity", C21055XCg.A0K(C271774jZ.A9v, A01));
            C21055XCg.A0s(A0e, A01);
            ArrayList arrayList5 = (ArrayList) A01.A01(C271774jZ.A9g);
            if (arrayList5 != null) {
                arrayList = AnonymousClass7TE.A1D(arrayList5);
            } else {
                arrayList = null;
            }
            if (!0u4.A08(arrayList)) {
                arrayList = null;
            }
            A0e.AAe("video_to_carousel_cut_secs", arrayList);
            C21054XCf.A0x(A0e, A01);
            C21054XCf.A1E(A0e, A01);
            A0e.AAe("sponsor_tag_ids", (List) C21055XCg.A0I(A0e, A01));
            C21055XCg.A1F(A0e, A01, "inventory_source", C51966G9m.A1C(C271774jZ.A3q, A01));
            A0e.A8D("bottom_black_bar_position_y", (Double) null);
            C21055XCg.A0w(A0e, A01);
            C21055XCg.A18(A0e, A01, C21053XCe.A0Y(C271774jZ.A5T, A01), "media_time_paused");
            A0e.AAJ("opt_in_state", (String) null);
            C21055XCg.A0m(A0e, A01);
            C21054XCf.A0T(A0e, A01);
            C21054XCf.A0A(A0e, A01);
            C21054XCf.A0I(A0e, A01);
            ArrayList arrayList6 = (ArrayList) A01.A01(C271774jZ.A6j);
            if (arrayList6 != null) {
                arrayList2 = AnonymousClass7TE.A1D(arrayList6);
            } else {
                arrayList2 = null;
            }
            if (!0u4.A08(arrayList2)) {
                arrayList2 = null;
            }
            A0e.AAe("product_ids", arrayList2);
            AbstractMap A0g = C21053XCe.A0g(A01);
            if (A0g == null || (keySet = A0g.keySet()) == null) {
                arrayList3 = null;
            } else {
                arrayList3 = AnonymousClass7TE.A1D(keySet);
            }
            if (!0u4.A08(arrayList3)) {
                arrayList3 = null;
            }
            A0e.AAe("product_merchant_ids", arrayList3);
            ArrayList arrayList7 = (ArrayList) A01.A01(C271774jZ.A8j);
            if (arrayList7 != null) {
                arrayList4 = AnonymousClass7TE.A1D(arrayList7);
            } else {
                arrayList4 = null;
            }
            if (!0u4.A08(arrayList4)) {
                arrayList4 = null;
            }
            A0e.AAe("tagged_user_ids", arrayList4);
            A0e.A9F("normalized_feed_position", C51966G9m.A13(C271774jZ.A68, A01));
            C21054XCf.A0L(A0e, A01);
            A0e.A8D("pan_end_x_position", (Double) null);
            A0e.A8D("pan_end_y_position", (Double) null);
            A0e.A8D("pan_timespent", (Double) null);
            A0e.A9F("pan_direction_change_count", (Long) null);
            A0e.A8D("pan_displacement_percentage", (Double) null);
            A0e.A8D("pan_speed", (Double) null);
            A0e.A7p("pan_successful_trigger", (Boolean) null);
            A0e.A7p("is_tap_and_hold_displayed", (Boolean) null);
            A0e.A7p("is_first_pan", (Boolean) null);
            A0e.A8D("pan_view_height", (Double) null);
            A0e.A8D("pan_end_angle", (Double) null);
            A0e.A8D("pan_overall_angle", (Double) null);
            A0e.AAJ("viewer_session_id", C51966G9m.A1C(r53, A01));
            C21054XCf.A0D(A0e, A01);
            C21054XCf.A1W(A0e, A01);
            A0e.A9H("sticker_types", (Map) null);
            C21054XCf.A13(A0e, A01);
            A0e.AAK((0bb) null, "toolbar_layout");
            C21054XCf.A1V(A0e, A01);
            AbstractCollection A0d = C21053XCe.A0d(C271774jZ.A17, A01);
            if (A0d != null) {
                linkedHashMap = DbS.A0x(C21055XCg.A00(A0d));
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    C21055XCg.A1Z(it, linkedHashMap);
                }
            } else {
                linkedHashMap = null;
            }
            A0e.A9H("carousel_transformation_cards", linkedHashMap);
            A0e.A9F("carousel_transformation_type", (Long) null);
            A0e.A8D("bottom_black_bar_height", (Double) null);
            C21055XCg.A17(A0e, A01);
            C21055XCg.A0n(A0e, A01);
            C21054XCf.A0u(A0e, A01);
            C21055XCg.A0d(A0e, r7, A01, C51966G9m.A13(C271774jZ.A5K, A01), "media_id");
            A0e.A9F("is_prod", 1L);
            A0e.A9F("m_ix", C51966G9m.A13(C271774jZ.A3m, A01));
            C21054XCf.A0k(A0e, A01);
            C21055XCg.A1A(A0e, A01, C51966G9m.A13(C271774jZ.A0z, A01), "carousel_index");
            0jB A012 = A01.A01(C271774jZ.A8n);
            Double d = null;
            if (A012 == null) {
                r52 = null;
            } else {
                r52 = new 0bb();
                r52.A06("tap_source", C51966G9m.A1C(C271774jZ.A6w, A012));
                r52.A04("tap_source_top_left_x_position", C21055XCg.A0K(C271774jZ.A8o, A012));
                r52.A04("tap_source_top_left_y_position", C21055XCg.A0K(C271774jZ.A8p, A012));
                r52.A04("tap_source_bottom_right_x_position", C21055XCg.A0K(C271774jZ.A8l, A012));
                Number A0b = C21053XCe.A0b(C271774jZ.A8m, A012);
                if (A0b != null) {
                    d = Double.valueOf((double) A0b.floatValue());
                }
                r52.A04("tap_source_bottom_right_y_position", d);
            }
            A0e.AAK(r52, "tap_source_info");
            0jB A013 = A01.A01(C271774jZ.A7K);
            Double d2 = null;
            if (A013 != null) {
                r2 = new 0bb();
                r2.A04("overlay_ads_top_left_x_position", C21055XCg.A0K(C271774jZ.A7N, A013));
                r2.A04("overlay_ads_top_left_y_position", C21055XCg.A0K(C271774jZ.A7O, A013));
                r2.A04("overlay_ads_bottom_right_x_position", C21055XCg.A0K(C271774jZ.A7L, A013));
                Number A0b2 = C21053XCe.A0b(C271774jZ.A7M, A013);
                if (A0b2 != null) {
                    d2 = Double.valueOf((double) A0b2.floatValue());
                }
                r2.A04("overlay_ads_bottom_right_y_position", d2);
            }
            A0e.AAK(r2, "reels_overlay_ads_info");
            DbX.A1L(A0e);
        }
    }
}
