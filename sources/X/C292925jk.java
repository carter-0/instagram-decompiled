package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.util.List;

/* renamed from: X.5jk  reason: invalid class name and case insensitive filesystem */
public abstract class C292925jk {
    public static final String A00(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) 00k.A0O(00l.A0R(str, new String[]{"_"}, 0), 0);
        if (str2 == null || !00l.A0d(str2, ".", false)) {
            return str2;
        }
        return (String) 00k.A0O(00l.A0R(str2, new String[]{"."}, 0), 1);
    }

    public static final void A01(0wc r7, C254523sc r8, AnonymousClass4DU r9) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        0jB A01 = r8.A01();
        String str = (String) A01.A01(C271774jZ.A64);
        if (str != null && !str.equals(1UQ.A10.toString()) && !str.equals(1UQ.A0G.toString())) {
            0Aj A00 = r7.A00(r7.A00, "instagram_netego_impression");
            0j9 r72 = C271774jZ.A5I;
            String A002 = A00((String) A01.A01(r72));
            0xF r5 = r8.A00().A06;
            if (A00.isSampled()) {
                A00.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
                A00.AAJ("action", (String) A01.A01(C271774jZ.A00));
                A00.AAJ("delivery_flags", (String) A01.A01(C271774jZ.A26));
                A00.AAJ("inventory_source", (String) A01.A01(C271774jZ.A3q));
                A00.AAJ("module_name", r9.getModuleName());
                A00.AAJ("ranking_session_id", (String) A01.A01(C271774jZ.A6q));
                A00.AAJ("ranking_info_token", (String) A01.A01(C271774jZ.A6p));
                A00.AAJ("container_module", r5.A05("container_module"));
                A00.AAJ("radio_type", (String) A01.A01(C271774jZ.A6o));
                A00.A7p("post_impression_column_override", (Boolean) A01.A01(C271774jZ.A6O));
                A00.A9F("a_pk", (Long) A01.A01(C271774jZ.A0Z));
                A00.A9F("ad_consumed_media_gap", (Long) A01.A01(C271774jZ.A06));
                A00.AAJ("async_ad_source", (String) A01.A01(C271774jZ.A0V));
                A00.A7p("canary", (Boolean) null);
                Number number = (Number) A01.A01(C271774jZ.A1z);
                if (number != null) {
                    l = Long.valueOf((long) number.intValue());
                } else {
                    l = null;
                }
                A00.A9F("dark_mode_state", l);
                A00.AAJ("device_model", (String) null);
                A00.AAJ("device_os", (String) null);
                A00.AAJ("deviceid", (String) null);
                A00.A8D("elapsed_time_since_last_item", (Double) A01.A01(C271774jZ.A2P));
                A00.AAJ("follow_status", (String) A01.A01(C271774jZ.A2v));
                A00.AAJ("format", (String) null);
                A00.AAJ("frontend_env", (String) null);
                A00.A9F("gap_to_last_ad", (Long) A01.A01(C271774jZ.A33));
                Long l6 = (Long) A01.A01(C271774jZ.A34);
                if (l6 == null) {
                    l6 = null;
                }
                A00.A9F("gap_to_last_netego", l6);
                A00.A9F("highest_position_rule", (Long) A01.A01(C271774jZ.A3U));
                A00.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                A00.A9F("ig_userid", (Long) null);
                A00.A9F("imp_logger_ver", (Long) A01.A01(C271774jZ.A3k));
                A00.A7p("impression_logger_validate", (Boolean) A01.A01(C271774jZ.A3i));
                A00.AAJ("insertion_context", (String) null);
                A00.A7p("is_acp_delivered", (Boolean) A01.A01(C271774jZ.A3t));
                A00.A7p("is_ad", (Boolean) A01.A01(C271774jZ.A3s));
                A00.AAJ("is_coming_from", (String) A01.A01(C271774jZ.A42));
                A00.A7p("is_dark_mode", Boolean.valueOf(AnonymousClass1GD.A03()));
                A00.A7p("is_from_needy_user", (Boolean) null);
                A00.A7p("is_highlights_sourced", (Boolean) A01.A01(C271774jZ.A4K));
                A00.A7p("is_using_new_gap_logging", (Boolean) null);
                A00.A7p("is_video_to_carousel", (Boolean) A01.A01(C271774jZ.A4z));
                A00.A9F("m_ix", (Long) A01.A01(C271774jZ.A3m));
                A00.AAJ("m_pk", (String) A01.A01(r72));
                A00.A9F("m_t", (Long) A01.A01(C271774jZ.A5a));
                A00.A9F("max_reel_gap_to_previous_item", (Long) A01.A01(C271774jZ.A5B));
                if (A002 != null) {
                    l2 = 00y.A0n(10, A002);
                } else {
                    l2 = null;
                }
                A00.A9F("media_id", l2);
                A00.A9F("min_consumed_media_gap_to_previous_ad", (Long) A01.A01(C271774jZ.A5h));
                A00.A9F("min_consumed_media_gap_to_previous_netego", (Long) A01.A01(C271774jZ.A5i));
                A00.A9F("min_consumed_reel_gap_to_previous_ad", (Long) A01.A01(C271774jZ.A5j));
                A00.A9F("min_consumed_reel_gap_to_previous_netego", (Long) A01.A01(C271774jZ.A5k));
                A00.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A00.A9F("netego_consumed_media_gap", (Long) A01.A01(C271774jZ.A61));
                A00.AAJ("netego_id", (String) A01.A01(C271774jZ.A62));
                Number number2 = (Number) A01.A01(C271774jZ.A63);
                if (number2 != null) {
                    l3 = Long.valueOf((long) number2.intValue());
                } else {
                    l3 = null;
                }
                A00.A9F("netego_subtype", l3);
                A00.AAJ("original_referrer_domain", (String) null);
                A00.AAJ("original_referrer", (String) null);
                A00.A9F("position", (Long) A01.A01(C271774jZ.A6W));
                String str2 = (String) A01.A01(C271774jZ.A6Z);
                if (str2 != null) {
                    l4 = 00y.A0n(10, str2);
                } else {
                    l4 = null;
                }
                A00.A9F("post_id", l4);
                A00.AAJ("primary_locale", (String) null);
                A00.A9F("priority_index", (Long) A01.A01(C271774jZ.A6g));
                A00.A7p("production_build", (Boolean) A01.A01(C271774jZ.A2h));
                A00.A7p("pwa", (Boolean) null);
                A00.AAK((0bb) null, QuickExperimentDumperPlugin.NAME);
                A00.AAJ("ranking_algorithm", (String) null);
                A00.A9F("rating_value", (Long) null);
                A00.A9F("reel_gap_to_last_ad", (Long) A01.A01(C271774jZ.A7R));
                A00.A9F("reel_gap_to_last_netego", (Long) A01.A01(C271774jZ.A7S));
                A00.AAJ("reel_id", (String) A01.A01(C271774jZ.A7T));
                A00.A9F("reel_position", (Long) A01.A01(C271774jZ.A7U));
                A00.A9F("reel_size", (Long) A01.A01(C271774jZ.A7V));
                A00.A9F("reel_start_position", (Long) A01.A01(C271774jZ.A7W));
                A00.AAJ("reel_type", (String) A01.A01(C271774jZ.A7Y));
                A00.A9F("reel_viewer_entry_position", (Long) A01.A01(C271774jZ.A7Z));
                A00.A9F("reel_viewer_position", (Long) A01.A01(C271774jZ.A7b));
                A00.AAJ("referrer_domain", (String) null);
                A00.AAJ("referrer", (String) null);
                A00.AAJ("release_channel", (String) A01.A01(C271774jZ.A7c));
                A00.AAJ("rollout_hash", (String) null);
                A00.A9F("session_reel_counter", (Long) A01.A01(C271774jZ.A7y));
                A00.AAJ("sessions_chain", (String) A01.A01(C271774jZ.A7w));
                String str3 = (String) A01.A01(C271774jZ.A8A);
                if (str3 == null) {
                    str3 = r9.getModuleName();
                }
                A00.AAJ("source_of_action", str3);
                A00.AAe("sticker_types", (List) null);
                A00.AAJ("story_ranking_token", (String) A01.A01(C271774jZ.A8O));
                A00.A8D("time_elapsed", (Double) A01.A01(C271774jZ.A8z));
                A00.A8D("time_remaining", (Double) A01.A01(C271774jZ.A94));
                A00.AAJ("tracking_token", r5.A05("tracking_token"));
                String str4 = (String) A01.A01(C271774jZ.A9Q);
                if (str4 != null) {
                    l5 = 00y.A0n(10, str4);
                } else {
                    l5 = null;
                }
                A00.A9F("tray_pos_excl_own_story", l5);
                A00.A9F("tray_position", (Long) A01.A01(C271774jZ.A9P));
                A00.AAJ("tray_session_id", (String) A01.A01(C271774jZ.A7X));
                A00.A9F("unseen_reel_size", (Long) null);
                A00.AAJ("url", (String) A01.A01(C271774jZ.A9a));
                A00.AAJ("view_state_item_type", (String) null);
                A00.AAJ("view", (String) null);
                A00.AAJ("viewer_session_id", (String) A01.A01(C271774jZ.A9i));
                A00.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                A00.AAJ("device_aspect_ratio_category", C254473sX.A00);
                A00.AAJ("device_fold_orientation", C254483sY.A00);
                A00.AAJ("device_fold_state", C254493sZ.A00);
                A00.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                A00.Cgf();
            }
        }
    }
}
