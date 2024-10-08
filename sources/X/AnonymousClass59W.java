package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.59W  reason: invalid class name */
public abstract class AnonymousClass59W {
    public static final void A00(0wc r17, UserSession userSession, C254523sc r19, AnonymousClass4DU r20) {
        String str;
        ArrayList arrayList;
        0bb r3;
        double d;
        0bb r32;
        double d2;
        ArrayList arrayList2;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        0bb r13;
        Long l8;
        ArrayList arrayList3;
        Double d3;
        Long l9;
        Double d4;
        Long l10;
        LinkedHashMap linkedHashMap;
        List list;
        0bb r2;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        Long l15;
        Long l16;
        Long l17;
        Long l18;
        Long l19;
        Long l20;
        Long l21;
        0bb r22;
        0bb r23;
        Long l22;
        Long l23;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Long l24;
        Long l25;
        String A05;
        Double d5;
        Double d6;
        Double d7;
        Double d8;
        Double d9;
        Double d10;
        Boolean bool;
        Long l26;
        Long l27;
        Long l28;
        Long l29;
        Long l30;
        Boolean bool2;
        Long l31;
        Long l32;
        ArrayList arrayList7;
        0wc r33 = r17;
        0Aj A00 = r33.A00(r33.A00, "instagram_ad_impression");
        0jB A01 = r19.A01();
        Long l33 = (Long) A01.A01(C271774jZ.A3Y);
        Long l34 = null;
        if (l33 == null) {
            l33 = null;
        }
        Long l35 = (Long) A01.A01(C271774jZ.A3Z);
        if (l35 != null) {
            long longValue = l35.longValue();
            if (l33 == null || longValue != l33.longValue()) {
                0wj r10 = 0wj.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("\n                HostProfile Id's mismatch while reporting:\n                hpid on mediaState: ");
                sb.append(longValue);
                sb.append("\n                and hpid reported: ");
                sb.append(l33);
                sb.append("\n              ");
                0f9 AEf = r10.AEf(0rw.A0t(sb.toString()), 817898950);
                AEf.ABQ("module_name", r20.getModuleName());
                AEf.report();
            }
        } else {
            l35 = null;
        }
        if (A00.isSampled()) {
            A00.AAJ("m_pk", (String) A01.A01(C271774jZ.A5I));
            A00.A9F("m_t", (Long) A01.A01(C271774jZ.A5a));
            A00.A9F("hashtag_id", (Long) A01.A01(C271774jZ.A3O));
            ArrayList arrayList8 = (ArrayList) A01.A01(C271774jZ.A2q);
            if (arrayList8 != null) {
                str = (String) 00k.A0O(arrayList8, 0);
            } else {
                str = null;
            }
            A00.AAJ("feed_sticker_media_id", str);
            A00.AAJ("format_liquidity_use_case", (String) A01.A01(C271774jZ.A2w));
            A00.AAJ("inventory_source", (String) A01.A01(C271774jZ.A3q));
            A00.A9F("carousel_index", (Long) A01.A01(C271774jZ.A0z));
            A00.A9F("ad_id", (Long) A01.A01(C271774jZ.A0C));
            A00.AAJ("tracking_token", (String) A01.A01(C271774jZ.A9L));
            A00.AAJ("action", (String) A01.A01(C271774jZ.A00));
            A00.A9F("m_ix", (Long) A01.A01(C271774jZ.A3m));
            A00.A9F("ad_inserted_position", (Long) A01.A01(C271774jZ.A0D));
            A00.A9F("reel_gap", (Long) A01.A01(C271774jZ.A7P));
            A00.A9F("gap_to_last_ad", (Long) A01.A01(C271774jZ.A33));
            A00.A9F("gap_to_previous_multi_ads", (Long) A01.A01(C271774jZ.A35));
            A00.A9F("previous_multi_ads_type", (Long) A01.A01(C271774jZ.A55));
            A00.A9F("top_followers_count", (Long) A01.A01(C271774jZ.A9H));
            A00.A9F("top_likers_count", (Long) A01.A01(C271774jZ.A9I));
            A00.A9F("carousel_opt_in_position", (Long) A01.A01(C271774jZ.A14));
            A00.AAJ("follow_status", (String) A01.A01(C271774jZ.A2v));
            A00.A9F("reel_size", (Long) A01.A01(C271774jZ.A7V));
            A00.A9F("reel_position", (Long) A01.A01(C271774jZ.A7U));
            A00.AAJ("event_trace_id", (String) A01.A01(C271774jZ.A2f));
            A00.AAJ("host_video_pk", (String) A01.A01(C271774jZ.A3a));
            A00.AAJ("host_media_pk", (String) A01.A01(C271774jZ.A3X));
            A00.AAJ("ranking_session_id", (String) A01.A01(C271774jZ.A6q));
            A00.AAJ("media_layout_encoded_string", (String) A01.A01(C271774jZ.A5O));
            A00.A7p("mop_should_double_logging", (Boolean) A01.A01(C271774jZ.A5n));
            A00.A7p("mop_should_rollout", (Boolean) A01.A01(C271774jZ.A5o));
            A00.A7p("is_zoomed_out", (Boolean) A01.A01(C271774jZ.A50));
            A00.A7p("is_acp_delivered", (Boolean) A01.A01(C271774jZ.A3t));
            AbstractCollection abstractCollection = (AbstractCollection) A01.A01(C271774jZ.A1e);
            if (abstractCollection != null) {
                ArrayList arrayList9 = new ArrayList(0Yv.A1E(abstractCollection, 10));
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    arrayList9.add(0Yt.A03((HashMap) it.next()));
                }
                arrayList = 00k.A0U(arrayList9);
            } else {
                arrayList = null;
            }
            A00.AAe("client_ad_creative_optimization_output", arrayList);
            A00.A7p("is_previewable_video_ad", (Boolean) A01.A01(C271774jZ.A4b));
            A00.A7p("is_ad_tag_enabled", (Boolean) A01.A01(C271774jZ.A3u));
            A00.AAJ("delivery_flags", (String) A01.A01(C271774jZ.A26));
            A00.A9F("media_id", (Long) A01.A01(C271774jZ.A5K));
            A00.A9F("media_author_id", (Long) A01.A01(C271774jZ.A5E));
            A00.AAJ("module_name", r20.getModuleName());
            A00.AAJ("container_module", r20.getModuleName());
            A00.AAJ("ad_skip_type", (String) A01.A01(C271774jZ.A0M));
            A00.AAJ("carousel_cover_media_id", (String) A01.A01(C271774jZ.A0x));
            A00.AAJ("carousel_media_id", (String) A01.A01(C271774jZ.A10));
            A00.A9F("carousel_starting_media_id", (Long) A01.A01(C271774jZ.A16));
            A00.A9F("carousel_media_id_int", (Long) A01.A01(C271774jZ.A11));
            A00.A9F("carousel_container_media_id", (Long) A01.A01(C271774jZ.A0w));
            A00.A9F("carousel_cover_media_id_int", (Long) A01.A01(C271774jZ.A0y));
            A00.A9F("reel_viewer_position", (Long) A01.A01(C271774jZ.A7b));
            A00.A9F("tray_position", (Long) A01.A01(C271774jZ.A9P));
            A00.A9F("position", (Long) A01.A01(C271774jZ.A6W));
            A00.A9F("client_position", (Long) A01.A01(C271774jZ.A3r));
            A00.AAJ("ranking_info_token", (String) A01.A01(C271774jZ.A6p));
            A00.A9F("is_dark_mode", (Long) A01.A01(C271774jZ.A4B));
            A00.A7p("is_eof", (Boolean) A01.A01(C271774jZ.A4G));
            A00.AAJ("entity_type", (String) A01.A01(C271774jZ.A2d));
            A00.A9F("entity_id", (Long) A01.A01(C271774jZ.A2Z));
            A00.AAJ("entity_name", (String) A01.A01(C271774jZ.A2a));
            A00.AAJ("mezql_token", (String) A01.A01(C271774jZ.A5g));
            A00.A8D("media_dwell_time", (Double) A01.A01(C271774jZ.A5F));
            A00.AAJ("chaining_session_id", (String) A01.A01(C271774jZ.A1C));
            A00.A9F("chaining_position", (Long) A01.A01(C271774jZ.A1A));
            A00.A9F("chaining_seed_media_id", (Long) A01.A01(C271774jZ.A3f));
            A00.A9F("chaining_seed_author_id", (Long) A01.A01(C271774jZ.A1B));
            A00.AAJ("topic_cluster_id", (String) A01.A01(C271774jZ.A9D));
            A00.AAJ("topic_cluster_title", (String) A01.A01(C271774jZ.A9F));
            A00.AAJ("topic_cluster_type", (String) A01.A01(C271774jZ.A9G));
            A00.AAJ("topic_cluster_debug_info", (String) A01.A01(C271774jZ.A9C));
            A00.A8D("media_time_elapsed", (Double) A01.A01(C271774jZ.A5Y));
            A00.A8D("media_time_paused", (Double) A01.A01(C271774jZ.A5T));
            A00.A8D("media_time_remaining", (Double) A01.A01(C271774jZ.A5Z));
            A00.A8D("media_time_to_load", (Double) A01.A01(C271774jZ.A5Q));
            A00.A9F("media_loading_progress", (Long) A01.A01(C271774jZ.A5P));
            A00.AAJ("reel_id", (String) A01.A01(C271774jZ.A7T));
            A00.AAJ("reel_type", (String) A01.A01(C271774jZ.A7Y));
            A00.AAJ("tray_session_id", (String) A01.A01(C271774jZ.A7X));
            A00.AAJ("viewer_session_id", (String) A01.A01(C271774jZ.A9i));
            A00.A7p("is_highlights_sourced", (Boolean) A01.A01(C271774jZ.A4K));
            A00.A8D("feed_cta_highlight_time", (Double) A01.A01(C271774jZ.A2m));
            A00.A7p("feed_cta_highlight_time_upper_capped", (Boolean) A01.A01(C271774jZ.A2o));
            A00.A7p("feed_cta_highlight_time_lower_capped", (Boolean) A01.A01(C271774jZ.A2n));
            A00.AAJ("story_ranking_token", (String) A01.A01(C271774jZ.A8O));
            A00.A7p("is_cta_sticker_available", (Boolean) A01.A01(C271774jZ.A44));
            A00.A7p("is_cta_sticker_shown", (Boolean) A01.A01(C271774jZ.A47));
            A00.A7p("is_cta_sticker_metadata_shown", (Boolean) A01.A01(C271774jZ.A46));
            A00.AAJ("cta_sticker_metadata_style", (String) A01.A01(C271774jZ.A1s));
            A00.AAJ("dynamic_cta_replacement_text", (String) A01.A01(C271774jZ.A1o));
            A00.A7p("dynamic_cta_has_emoji", (Boolean) A01.A01(C271774jZ.A1m));
            A00.AAJ("dynamic_cta_language", (String) A01.A01(C271774jZ.A1n));
            A00.AAJ("dynamic_cta_text_source", (String) A01.A01(C271774jZ.A1p));
            A00.A7p("is_sensitive_vertical_ad", (Boolean) A01.A01(C271774jZ.A4o));
            A00.A7p("is_cta_sticker_smart_position_available", (Boolean) A01.A01(C271774jZ.A4A));
            A00.A7p("is_cta_sticker_smart_position_10_percent_text_overlap", (Boolean) A01.A01(C271774jZ.A48));
            A00.A7p("is_cta_sticker_smart_position_20_percent_text_overlap", (Boolean) A01.A01(C271774jZ.A49));
            A00.A7p("is_cta_sticker_custom_position_info_available", (Boolean) A01.A01(C271774jZ.A45));
            A00.A7p("cta_sticker_smart_position_has_overlap", (Boolean) A01.A01(C271774jZ.A1u));
            0jB A012 = A01.A01(C271774jZ.A1j);
            if (A012 == null) {
                r3 = null;
            } else {
                r3 = new 0bb();
                Number number = (Number) A012.A01(C271774jZ.A1k);
                double d11 = 0.0d;
                if (number != null) {
                    d = number.doubleValue();
                } else {
                    d = 0.0d;
                }
                r3.A04("center_x", Double.valueOf(d));
                Number number2 = (Number) A012.A01(C271774jZ.A1l);
                if (number2 != null) {
                    d11 = number2.doubleValue();
                }
                r3.A04("center_y", Double.valueOf(d11));
            }
            A00.AAK(r3, "cta_sticker_smart_position_custom_position_info");
            0jB A013 = A01.A01(C271774jZ.A1t);
            if (A013 == null) {
                r32 = null;
            } else {
                r32 = new 0bb();
                Number number3 = (Number) A013.A01(C271774jZ.A1q);
                double d12 = -1.0d;
                if (number3 != null) {
                    d2 = number3.doubleValue();
                } else {
                    d2 = -1.0d;
                }
                r32.A04(IgReactMediaPickerNativeModule.HEIGHT, Double.valueOf(d2));
                Number number4 = (Number) A013.A01(C271774jZ.A1v);
                if (number4 != null) {
                    d12 = number4.doubleValue();
                }
                r32.A04(IgReactMediaPickerNativeModule.WIDTH, Double.valueOf(d12));
            }
            A00.AAK(r32, "cta_sticker_size_info_in_dp_pt");
            A00.AAe("cta_sticker_invalidation_reasons", (List) A01.A01(C271774jZ.A1r));
            A00.A7p("media_interactivity_enabled", (Boolean) A01.A01(C271774jZ.A5M));
            AbstractCollection abstractCollection2 = (AbstractCollection) A01.A01(C271774jZ.A6j);
            if (abstractCollection2 != null) {
                ArrayList arrayList10 = new ArrayList(0Yv.A1E(abstractCollection2, 10));
                Iterator it2 = abstractCollection2.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    0qQ.A0B(str2, 0);
                    arrayList10.add(00y.A0n(10, str2));
                }
                arrayList2 = new ArrayList(00k.A0X(arrayList10));
            } else {
                arrayList2 = null;
            }
            A00.AAe("product_ids", arrayList2);
            A00.A9F("product_id", (Long) A01.A01(C271774jZ.A6k));
            String str3 = (String) A01.A01(C271774jZ.A5e);
            if (str3 != null) {
                l = Long.valueOf(Long.parseLong(str3));
            } else {
                l = null;
            }
            A00.A9F("merchant_id", l);
            A00.A7p("is_checkout_enabled", (Boolean) A01.A01(C271774jZ.A41));
            A00.A7p("post_impression_column_override", (Boolean) A01.A01(C271774jZ.A6O));
            A00.A7p("is_igtv", (Boolean) A01.A01(C271774jZ.A4M));
            A00.A7p("is_second_channel_enabled", (Boolean) A01.A01(C271774jZ.A4l));
            A00.AAJ("radio_type", (String) A01.A01(C271774jZ.A6o));
            A00.A9H("two_measurement_debugging_fields", (Map) A01.A01(C271774jZ.A9S));
            String str4 = (String) A01.A01(C271774jZ.A7q);
            if (str4 != null) {
                l2 = Long.valueOf(Long.parseLong(str4));
            } else {
                l2 = null;
            }
            A00.A9F("seed_ad_id", l2);
            String str5 = (String) A01.A01(C271774jZ.A3b);
            if (str5 != null) {
                l3 = Long.valueOf(Long.parseLong(str5));
            } else {
                l3 = null;
            }
            A00.A9F("hscroll_seed_ad_id", l3);
            String str6 = (String) A01.A01(C271774jZ.A3d);
            if (str6 != null) {
                l4 = Long.valueOf(Long.parseLong(str6));
            } else {
                l4 = null;
            }
            A00.A9F("hscroll_seed_media_id", l4);
            String str7 = (String) A01.A01(C271774jZ.A3c);
            if (str7 != null) {
                l5 = Long.valueOf(Long.parseLong(str7));
            } else {
                l5 = null;
            }
            A00.A9F("hscroll_seed_media_author_igid", l5);
            String str8 = (String) A01.A01(C271774jZ.A2u);
            if (str8 != null) {
                l6 = Long.valueOf(Long.parseLong(str8));
            } else {
                l6 = null;
            }
            A00.A9F("first_hscroll_item_ad_id", l6);
            A00.A9F("horizontal_position_on_hscroll", (Long) A01.A01(C271774jZ.A3W));
            A00.A9F("vertical_position_on_feed_of_ads", (Long) A01.A01(C271774jZ.A9d));
            A00.A7p("is_multi_ads", (Boolean) A01.A01(C271774jZ.A4V));
            0j9 r24 = C271774jZ.A5y;
            A00.AAJ("multi_ads_unit_id", (String) A01.A01(r24));
            A00.A7p("is_multi_ads_eligible", (Boolean) A01.A01(C271774jZ.A4W));
            A00.A7p("is_seed_ad_multi_ads_eligible", (Boolean) A01.A01(C271774jZ.A4m));
            A00.A9F("multi_ads_type", (Long) A01.A01(C271774jZ.A5w));
            String str9 = (String) A01.A01(C271774jZ.A5u);
            if (str9 == null) {
                str9 = (String) A01.A01(r24);
            }
            A00.AAJ("multi_ads_id", str9);
            A00.A9F("position_in_multi_ads_unit", (Long) A01.A01(C271774jZ.A6Y));
            String str10 = (String) A01.A01(C271774jZ.A5t);
            if (str10 != null) {
                l7 = Long.valueOf(Long.parseLong(str10));
            } else {
                l7 = null;
            }
            A00.A9F("multi_ads_first_ad_id", l7);
            Long l36 = (Long) A01.A01(C271774jZ.A5s);
            if (l36 == null) {
                l36 = null;
            }
            A00.A9F("multi_ads_feed_of_ads_seed_ad_id", l36);
            A00.AAJ("multi_ads_insertion_mechanism", (String) A01.A01(C271774jZ.A5v));
            A00.AAe("multi_ads_ad_ids", (List) A01.A01(C271774jZ.A5r));
            A00.AAJ("ad_request_id", (String) A01.A01(C271774jZ.A0K));
            A00.AAJ("imp_signature", (String) A01.A01(C271774jZ.A3l));
            A00.AAJ("grid_ad_layout_type", (String) A01.A01(C271774jZ.A3L));
            A00.AAJ("intent_aware_ads_trigger_type", (String) A01.A01(C271774jZ.A3p));
            A00.AAJ("source_of_action", (String) A01.A01(C271774jZ.A8A));
            A00.A9F("a_pk", (Long) A01.A01(C271774jZ.A0Z));
            0j9 r9 = C271774jZ.A8x;
            A00.A9F("m_ts", (Long) A01.A01(r9));
            A00.A9F("top_liker_count", (Long) A01.A01(C271774jZ.A9J));
            A00.A8D("elapsed_time_since_last_item", (Double) A01.A01(C271774jZ.A2P));
            A00.A9F("session_reel_counter", (Long) A01.A01(C271774jZ.A7y));
            A00.A8D("time_elapsed", (Double) A01.A01(C271774jZ.A8z));
            A00.A9F("ad_request_position", (Long) A01.A01(C271774jZ.A0L));
            A00.A9F("reel_viewer_entry_position", (Long) A01.A01(C271774jZ.A7Z));
            A00.A9F("ad_received_position", (Long) A01.A01(C271774jZ.A0J));
            0jB A014 = A01.A01(C271774jZ.A5N);
            if (A014 != null) {
                0xF A002 = A014.A00();
                r13 = new 0bb();
                r13.A03("is_showreel_native", (Boolean) A014.A01(C271774jZ.A4p));
                r13.A04("media_height", (Double) A014.A01(C271774jZ.A5H));
                r13.A04("media_width", (Double) A014.A01(C271774jZ.A5c));
                String A052 = A002.A05("caption_font_size");
                Boolean bool3 = null;
                if (A052 != null) {
                    d5 = Double.valueOf(Double.parseDouble(A052));
                } else {
                    d5 = null;
                }
                r13.A04("caption_font_size", d5);
                String A053 = A002.A05("caption_position_start_x");
                if (A053 != null) {
                    d6 = Double.valueOf(Double.parseDouble(A053));
                } else {
                    d6 = null;
                }
                r13.A04("caption_position_start_x", d6);
                String A054 = A002.A05("caption_position_start_y");
                if (A054 != null) {
                    d7 = Double.valueOf(Double.parseDouble(A054));
                } else {
                    d7 = null;
                }
                r13.A04("caption_position_start_y", d7);
                String A055 = A002.A05("caption_line_height");
                if (A055 != null) {
                    d8 = Double.valueOf(Double.parseDouble(A055));
                } else {
                    d8 = null;
                }
                r13.A04("caption_line_height", d8);
                String A056 = A002.A05("caption_line_height");
                if (A056 != null) {
                    d9 = Double.valueOf(Double.parseDouble(A056));
                } else {
                    d9 = null;
                }
                r13.A04("caption_height", d9);
                String A057 = A002.A05("caption_width");
                if (A057 != null) {
                    d10 = Double.valueOf(Double.parseDouble(A057));
                } else {
                    d10 = null;
                }
                r13.A04("caption_width", d10);
                String A058 = A002.A05("is_caption_fully_displayed");
                if (A058 != null) {
                    bool = Boolean.valueOf(Boolean.parseBoolean(A058));
                } else {
                    bool = null;
                }
                r13.A03("is_caption_fully_displayed", bool);
                r13.A06("caption_short_text", A002.A05("short_caption_text"));
                r13.A06("background_color_bottom", A002.A05("background_color_bottom"));
                r13.A06("background_color_caption", A002.A05("caption_background_color"));
                r13.A06("background_color_top", A002.A05("background_color_top"));
                r13.A06("caption_background_color_alpha", A002.A05("caption_background_color_alpha"));
                String A059 = A002.A05("caption_num_char_showed");
                if (A059 != null) {
                    l26 = Long.valueOf(Long.parseLong(A059));
                } else {
                    l26 = null;
                }
                r13.A05("caption_num_char_showed", l26);
                String A0510 = A002.A05("caption_num_hashtags_showed");
                if (A0510 != null) {
                    l27 = Long.valueOf(Long.parseLong(A0510));
                } else {
                    l27 = null;
                }
                r13.A05("caption_num_hashtags_showed", l27);
                String A0511 = A002.A05("caption_num_lines_showed");
                if (A0511 != null) {
                    l28 = Long.valueOf(Long.parseLong(A0511));
                } else {
                    l28 = null;
                }
                r13.A05("caption_num_lines_showed", l28);
                String A0512 = A002.A05("caption_num_lines_total");
                if (A0512 != null) {
                    l29 = Long.valueOf(Long.parseLong(A0512));
                } else {
                    l29 = null;
                }
                r13.A05("caption_num_lines_total", l29);
                r13.A05("caption_num_char_total", (Long) A014.A01(C271774jZ.A0u));
                String A0513 = A002.A05("caption_num_mentions_showed");
                if (A0513 != null) {
                    l30 = Long.valueOf(Long.parseLong(A0513));
                } else {
                    l30 = null;
                }
                r13.A05("caption_num_mentions_showed", l30);
                r13.A06("caption_text_color", A002.A05("caption_text_color"));
                r13.A06("cta_color", (String) A014.A01(C271774jZ.A1i));
                String A0514 = A002.A05("is_highlighted_keyword_shown");
                if (A0514 != null) {
                    bool2 = Boolean.valueOf(Boolean.parseBoolean(A0514));
                } else {
                    bool2 = null;
                }
                r13.A03("is_highlighted_keyword_shown", bool2);
                r13.A06("caption_highlights_model_type", A002.A05("caption_highlights_model_type"));
                String A0515 = A002.A05("caption_num_highlights_showed");
                if (A0515 != null) {
                    l31 = Long.valueOf(Long.parseLong(A0515));
                } else {
                    l31 = null;
                }
                r13.A05("caption_num_highlights_showed", l31);
                String A0516 = A002.A05("caption_num_highlights_dropped");
                if (A0516 != null) {
                    l32 = Long.valueOf(Long.parseLong(A0516));
                } else {
                    l32 = null;
                }
                r13.A05("caption_num_highlights_dropped", l32);
                AbstractCollection abstractCollection3 = (AbstractCollection) A014.A01(C271774jZ.A0s);
                if (abstractCollection3 == null) {
                    arrayList7 = null;
                } else {
                    arrayList7 = new ArrayList(0Yv.A1E(abstractCollection3, 10));
                    Iterator it3 = abstractCollection3.iterator();
                    while (it3.hasNext()) {
                        0jB r102 = (0jB) it3.next();
                        0bb r34 = new 0bb();
                        String str11 = (String) r102.A01(C271774jZ.A0t);
                        String str12 = "";
                        if (str11 == null) {
                            str11 = str12;
                        }
                        r34.A06("token", str11);
                        String str13 = (String) r102.A01(C271774jZ.A0r);
                        if (str13 != null) {
                            str12 = str13;
                        }
                        r34.A06("category", str12);
                        arrayList7.add(r34);
                    }
                }
                r13.A07("caption_highlights_showed", arrayList7);
                r13.A06("headline_text_showed", A002.A05("headline_text_showed"));
                r13.A04("screen_density", (Double) A014.A01(C271774jZ.A7l));
                r13.A04("screen_height", (Double) A014.A01(C271774jZ.A7m));
                r13.A04("screen_width", (Double) A014.A01(C271774jZ.A7n));
                r13.A03("is_toolbar_below_media", (Boolean) A014.A01(C271774jZ.A4u));
                String A0517 = A002.A05("is_systematic_caption");
                if (A0517 != null) {
                    bool3 = Boolean.valueOf(Boolean.parseBoolean(A0517));
                }
                r13.A03("is_systematic_caption", bool3);
            } else {
                r13 = null;
            }
            A00.AAK(r13, "media_layout");
            A00.A7p("is_video_to_carousel", (Boolean) A01.A01(C271774jZ.A4z));
            A00.A7p("is_long_story_video", (Boolean) A01.A01(C271774jZ.A4R));
            A00.A9F("ad_position_from_server", (Long) A01.A01(C271774jZ.A0I));
            A00.A9F("reel_start_position", (Long) A01.A01(C271774jZ.A7W));
            A00.A9F("reel_gap_to_last_ad", (Long) A01.A01(C271774jZ.A7R));
            Long l37 = (Long) A01.A01(C271774jZ.A7S);
            if (l37 == null) {
                l37 = null;
            }
            A00.A9F("reel_gap_to_last_netego", l37);
            A00.A9F("ad_consumed_media_gap", (Long) A01.A01(C271774jZ.A06));
            A00.A9F("netego_consumed_media_gap", (Long) A01.A01(C271774jZ.A61));
            A00.A9F("min_consumed_media_gap_to_previous_ad", (Long) A01.A01(C271774jZ.A5j));
            A00.A9F("min_consumed_media_gap_to_previous_netego", (Long) A01.A01(C271774jZ.A5k));
            A00.A9F("min_consumed_reel_gap_to_previous_ad", (Long) A01.A01(C271774jZ.A5h));
            A00.A9F("min_consumed_reel_gap_to_previous_netego", (Long) A01.A01(C271774jZ.A5i));
            A00.A9F("priority_index", (Long) A01.A01(C271774jZ.A6g));
            A00.A9F("highest_position_rule", (Long) A01.A01(C271774jZ.A3U));
            A00.A9F("max_reel_gap_to_previous_item", (Long) A01.A01(C271774jZ.A5B));
            A00.A9F("min_media_gap_to_previous_item", (Long) A01.A01(C271774jZ.A5l));
            A00.A8D("time_gap_to_previous_item_in_sec", (Double) A01.A01(C271774jZ.A91));
            A00.AAJ("release_channel", (String) A01.A01(C271774jZ.A7c));
            A00.A9F("consumed_media_gap", (Long) A01.A01(C271774jZ.A1Z));
            A00.A7p("is_ad", (Boolean) A01.A01(C271774jZ.A3s));
            A00.A9F("consumed_media_gap_highest_position", (Long) A01.A01(C271774jZ.A1a));
            A00.A9F("reel_gap_highest_position", (Long) A01.A01(C271774jZ.A7Q));
            A00.A9F("imp_logger_ver", (Long) A01.A01(C271774jZ.A51));
            A00.AAJ("previous_media_pk", (String) A01.A01(C271774jZ.A6a));
            A00.AAJ("next_media_pk", (String) A01.A01(C271774jZ.A66));
            A00.AAJ("is_app_backgrounded", (String) A01.A01(C271774jZ.A3x));
            A00.AAJ("last_navigation_module", (String) A01.A01(C271774jZ.A56));
            String str14 = (String) A01.A01(C271774jZ.A5z);
            if (str14 != null) {
                l8 = Long.valueOf(Long.parseLong(str14));
            } else {
                l8 = null;
            }
            A00.A9F("nav_in_transit", l8);
            A00.AAJ("feed_request_id", (String) A01.A01(C271774jZ.A88));
            A00.AAJ("application_state", (String) A01.A01(C271774jZ.A0Q));
            A00.AAJ("current_module", r20.getModuleName());
            A00.A9F("gap_to_last_netego", (Long) A01.A01(C271774jZ.A34));
            A00.A8D("time_remaining", (Double) A01.A01(C271774jZ.A94));
            A00.AAJ("is_coming_from", (String) A01.A01(C271774jZ.A42));
            A00.AAJ("async_ad_source", (String) A01.A01(C271774jZ.A0V));
            A00.AAJ("post_id", (String) A01.A01(C271774jZ.A6Z));
            A00.A7p("impression_logger_validate", (Boolean) A01.A01(C271774jZ.A3i));
            A00.AAJ("parent_m_pk", (String) A01.A01(C271774jZ.A6S));
            A00.A9F("carousel_size", (Long) A01.A01(C271774jZ.A15));
            A00.AAJ("nav_chain", (String) A01.A01(C271774jZ.A60));
            A00.A9F("carousel_m_t", (Long) A01.A01(C271774jZ.A12));
            A00.A7p("is_holdout", (Boolean) A01.A01(C271774jZ.A4L));
            A00.AAJ("sessions_chain", (String) A01.A01(C271774jZ.A7w));
            A00.AAe("sticker_types", (List) null);
            A00.A9F("sponsor_tag_count", (Long) A01.A01(C271774jZ.A8F));
            A00.AAe("sponsor_tag_ids", (List) A01.A01(C271774jZ.A8H));
            A00.A9F("segment_index", (Long) A01.A01(C271774jZ.A7s));
            A00.A9F("segment_count", (Long) A01.A01(C271774jZ.A7r));
            A00.AAJ("ad_pod_id", (String) A01.A01(C271774jZ.A0G));
            A00.A9F("index_in_ad_pod", (Long) A01.A01(C271774jZ.A3n));
            AbstractCollection abstractCollection4 = (AbstractCollection) A01.A01(C271774jZ.A9g);
            if (abstractCollection4 != null) {
                ArrayList arrayList11 = new ArrayList(0Yv.A1E(abstractCollection4, 10));
                Iterator it4 = abstractCollection4.iterator();
                while (it4.hasNext()) {
                    arrayList11.add(012.A0p((String) it4.next()));
                }
                arrayList3 = new ArrayList(00k.A0X(arrayList11));
            } else {
                arrayList3 = null;
            }
            A00.AAe("video_to_carousel_cut_secs", arrayList3);
            A00.A9F("carousel_media_type", (Long) A01.A01(C271774jZ.A13));
            A00.AAe("carousel_transformation_cards", (List) A01.A01(C271774jZ.A17));
            A00.A9F("carousel_transformation_type", (Long) null);
            A00.AAJ("impression_type", (String) A01.A01(C271774jZ.A3j));
            A00.AAK((0bb) null, "toolbar_layout");
            A00.AAJ("entity_follow_status", (String) A01.A01(C271774jZ.A2Y));
            A00.AAJ("endpoint_type", (String) A01.A01(C271774jZ.A2R));
            A00.AAJ("byline_text", (String) A01.A01(C271774jZ.A0l));
            A00.A9F("dr_ad_type", (Long) A01.A01(C271774jZ.A2J));
            A00.A7p("is_pride_media", (Boolean) A01.A01(C271774jZ.A4d));
            A00.A7p("is_besties_media", (Boolean) A01.A01(C271774jZ.A3z));
            Number number5 = (Number) A01.A01(C271774jZ.A68);
            if (number5 != null) {
                d3 = Double.valueOf((double) number5.longValue());
            } else {
                d3 = null;
            }
            A00.A8D("normalized_feed_position", d3);
            A00.A7p("is_influencer", (Boolean) A01.A01(C271774jZ.A4O));
            A00.AAJ("is_programmatic_scroll", (String) A01.A01(C271774jZ.A4g));
            A00.AAe("tagged_user_ids", (List) A01.A01(C271774jZ.A8j));
            A00.A7p("is_image_loaded", (Boolean) A01.A01(C271774jZ.A4N));
            A00.AAJ("media_tags_hashtag_name", (String) A01.A01(C271774jZ.A5V));
            A00.A9F("media_tags_total_hashtags", (Long) A01.A01(C271774jZ.A5W));
            A00.A9F("seq_num", (Long) A01.A01(C271774jZ.A7t));
            A00.AAJ("igtv_viewer_session_id", (String) A01.A01(C271774jZ.A3h));
            A00.AAJ("disclaimer_text", (String) A01.A01(C271774jZ.A2C));
            A00.AAJ("disclaimer_title", (String) A01.A01(C271774jZ.A2D));
            A00.A9F("carousel_type", (Long) A01.A01(C271774jZ.A19));
            String str15 = (String) A01.A01(C271774jZ.A9T);
            if (str15 != null) {
                l9 = Long.valueOf(Long.parseLong(str15));
            } else {
                l9 = null;
            }
            A00.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, l9);
            A00.AAJ("channel_pk", (String) A01.A01(C271774jZ.A1E));
            A00.A9F("has_top_likers", (Long) A01.A01(C271774jZ.A3T));
            A00.A9F("ad_delivery_position", (Long) A01.A01(C271774jZ.A0A));
            A00.A7p("is_first_ad_in_the_session", (Boolean) A01.A01(C271774jZ.A4H));
            A00.A9F("seq_session", (Long) A01.A01(C271774jZ.A7u));
            A00.AAJ("cache_key", (String) A01.A01(C271774jZ.A0m));
            A00.AAJ("call_stack", (String) A01.A01(C271774jZ.A0n));
            A00.A8D("time_interval_since_reference_date", (Double) A01.A01(C271774jZ.A92));
            Number number6 = (Number) A01.A01(r9);
            if (number6 != null) {
                d4 = Double.valueOf((double) number6.longValue());
            } else {
                d4 = null;
            }
            A00.A8D("time_stamp", d4);
            String str16 = (String) A01.A01(C271774jZ.A5A);
            if (str16 != null) {
                l10 = Long.valueOf(Long.parseLong(str16));
            } else {
                l10 = null;
            }
            A00.A9F("main_feed_carousel_starting_media_id", l10);
            AbstractMap abstractMap = (AbstractMap) A01.A01(C271774jZ.A6l);
            if (abstractMap != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(0se.A0L(abstractMap.size()));
                for (Map.Entry entry : abstractMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), 00k.A0U((Collection) entry.getValue()));
                }
                linkedHashMap = 0Yt.A03(linkedHashMap2);
            } else {
                linkedHashMap = null;
            }
            A00.A9H("product_merchant_ids", linkedHashMap);
            0jB A015 = A01.A01(C271774jZ.A0k);
            if (A015 == null || (A05 = A015.A00().A05("incentive_id")) == null) {
                list = 0sn.A00;
            } else {
                0bb r25 = new 0bb();
                r25.A06("display_type", "visible");
                r25.A05(AnonymousClass000.A00(3019), Long.valueOf(Long.parseLong(A05)));
                list = Collections.singletonList(r25);
                0qQ.A07(list);
            }
            A00.AAe("promotions", list);
            A00.A9F("media_owner_id", (Long) A01.A01(C271774jZ.A5S));
            A00.AAJ("explore_topic_session_id", (String) A01.A01(C271774jZ.A2g));
            A00.A9F("next_max_id", (Long) A01.A01(C271774jZ.A65));
            A00.A7p("is_internal_build", (Boolean) A01.A01(C271774jZ.A4P));
            A00.AAJ("disclaimer_url", (String) A01.A01(C271774jZ.A2E));
            A00.AAJ("next_inventory_source", (String) A01.A01(C271774jZ.A67));
            A00.AAJ("prev_inventory_source", (String) A01.A01(C271774jZ.A6b));
            A00.AAJ(C21058XCk.A01(21, 10, 4), (String) A01.A01(C271774jZ.A7x));
            A00.AAJ("sponsored_label_text", (String) A01.A01(C271774jZ.A8D));
            A00.A7p("is_merlin_double_logging_enabled", (Boolean) A01.A01(C271774jZ.A4U));
            0jB A016 = A01.A01(C271774jZ.A75);
            if (A016 == null) {
                r2 = null;
            } else {
                r2 = new 0bb();
                r2.A06("body", (String) A016.A01(C271774jZ.A76));
                r2.A03("has_image", (Boolean) A016.A01(C271774jZ.A7A));
                r2.A06("style", (String) A016.A01(C271774jZ.A7G));
                r2.A06("title_option", (String) A016.A01(C271774jZ.A7I));
                r2.A06(DialogModule.KEY_TITLE, (String) A016.A01(C271774jZ.A7J));
                r2.A06("subtitle", (String) A016.A01(C271774jZ.A7H));
                r2.A06("format", (String) A016.A01(C271774jZ.A79));
                r2.A05("image_width", (Long) A016.A01(C271774jZ.A7E));
                r2.A05("image_height", (Long) A016.A01(C271774jZ.A7D));
                r2.A03("hide_caption", (Boolean) A016.A01(C271774jZ.A7B));
                r2.A03("hide_social_context", (Boolean) A016.A01(C271774jZ.A7C));
                r2.A03("dismissible", (Boolean) A016.A01(C271774jZ.A77));
            }
            A00.AAK(r2, "reels_mid_scene_info");
            A00.AAJ("django_push_phase", (String) A01.A01(C271774jZ.A2G));
            String str17 = (String) A01.A01(C271774jZ.A0X);
            if (str17 != null) {
                l11 = Long.valueOf(Long.parseLong(str17));
            } else {
                l11 = null;
            }
            A00.A9F("audio_asset_id", l11);
            A00.AAJ("rendering_metadata", (String) A01.A01(C271774jZ.A7e));
            Number number7 = (Number) A01.A01(C271774jZ.A6c);
            if (number7 != null) {
                l12 = Long.valueOf((long) number7.intValue());
            } else {
                l12 = null;
            }
            A00.A9F("previous_position", l12);
            Number number8 = (Number) A01.A01(C271774jZ.A90);
            if (number8 != null) {
                l13 = Long.valueOf((long) number8.doubleValue());
            } else {
                l13 = null;
            }
            A00.A9F("time_gap", l13);
            Number number9 = (Number) A01.A01(C271774jZ.A5m);
            if (number9 != null) {
                l14 = Long.valueOf((long) number9.intValue());
            } else {
                l14 = null;
            }
            A00.A9F("min_push_up_gap", l14);
            Number number10 = (Number) A01.A01(C271774jZ.A31);
            if (number10 != null) {
                l15 = Long.valueOf((long) number10.intValue());
            } else {
                l15 = null;
            }
            A00.A9F("gap_after_push_up", l15);
            Number number11 = (Number) A01.A01(C271774jZ.A0i);
            if (number11 != null) {
                l16 = Long.valueOf((long) number11.intValue());
            } else {
                l16 = null;
            }
            A00.A9F("brs_threshold", l16);
            A00.AAJ("organic_media_id_before", (String) A01.A01(C271774jZ.A6N));
            Number number12 = (Number) A01.A01(C271774jZ.A6J);
            if (number12 != null) {
                l17 = Long.valueOf((long) number12.intValue());
            } else {
                l17 = null;
            }
            A00.A9F("organic_brs_severity_before", l17);
            A00.AAJ("organic_media_id_after", (String) A01.A01(C271774jZ.A6M));
            Number number13 = (Number) A01.A01(C271774jZ.A6I);
            if (number13 != null) {
                l18 = Long.valueOf((long) number13.intValue());
            } else {
                l18 = null;
            }
            A00.A9F("organic_brs_severity_after", l18);
            A00.AAJ("position_change_reason", (String) A01.A01(C271774jZ.A6X));
            Number number14 = (Number) A01.A01(C271774jZ.A32);
            if (number14 != null) {
                l19 = Long.valueOf((long) number14.intValue());
            } else {
                l19 = null;
            }
            A00.A9F("gap_before_push_down", l19);
            Number number15 = (Number) A01.A01(C271774jZ.A6m);
            if (number15 != null) {
                l20 = Long.valueOf((long) number15.intValue());
            } else {
                l20 = null;
            }
            A00.A9F("push_down_distance", l20);
            Number number16 = (Number) A01.A01(C271774jZ.A6d);
            if (number16 != null) {
                l21 = Long.valueOf((long) number16.intValue());
            } else {
                l21 = null;
            }
            A00.A9F("previous_sponsored_item_position_before_push_up", l21);
            A00.AAJ("previous_sponsored_item_type_before_push_up", (String) A01.A01(C271774jZ.A6e));
            A00.A7p("is_demo", (Boolean) A01.A01(C271774jZ.A4C));
            A00.A9F("actual_insert_position", (Long) A01.A01(C271774jZ.A03));
            A00.AAJ("ad_client_delivery_session_id", (String) A01.A01(C271774jZ.A05));
            A00.AAJ("afs_enablement_status", C233832wY.A00(userSession));
            0jB A017 = A01.A01(C271774jZ.A84);
            if (A017 != null) {
                r22 = new 0bb();
                r22.A05("social_context_placement", (Long) A017.A01(C271774jZ.A85));
                r22.A06("social_context_type", (String) A017.A01(C271774jZ.A86));
            } else {
                r22 = null;
            }
            A00.AAK(r22, "social_context");
            0jB A018 = A01.A01(C271774jZ.A2p);
            if (A018 != null) {
                r23 = new 0bb();
                r23.A06("more_info_type", (String) A018.A01(C271774jZ.A5q));
                r23.A05("more_info_placement", (Long) A018.A01(C271774jZ.A5p));
            } else {
                r23 = null;
            }
            A00.AAK(r23, "feed_cta_metadata");
            A00.A7p("is_dwell_tap_to_iab_enabled", (Boolean) A01.A01(C271774jZ.A4E));
            A00.AAJ("destination_type", (String) A01.A01(C271774jZ.A28));
            A00.A7p("is_page_start", (Boolean) A01.A01(C271774jZ.A4Z));
            A00.A7p("is_page_end", (Boolean) A01.A01(C271774jZ.A4Y));
            Number number17 = (Number) A01.A01(C271774jZ.A9k);
            if (number17 != null) {
                l22 = Long.valueOf((long) number17.intValue());
            } else {
                l22 = null;
            }
            A00.A9F("view_state_item_type_before", l22);
            Number number18 = (Number) A01.A01(C271774jZ.A9j);
            if (number18 != null) {
                l23 = Long.valueOf((long) number18.intValue());
            } else {
                l23 = null;
            }
            A00.A9F("view_state_item_type_after", l23);
            A00.A7p("is_delayed_skip_ad", (Boolean) A01.A01(C271774jZ.A23));
            A00.A7p("is_rendered_as_delayed_skip_ad", (Boolean) A01.A01(C271774jZ.A4j));
            A00.A7p("is_reels_sync_flow_enabled", (Boolean) A01.A01(C271774jZ.A4r));
            A00.AAJ("delivery_context", (String) A01.A01(C271774jZ.A25));
            A00.A7p("is_self_pog_chaining", (Boolean) A01.A01(C271774jZ.A4n));
            AbstractCollection abstractCollection5 = (AbstractCollection) A01.A01(C271774jZ.A0f);
            if (abstractCollection5 != null) {
                arrayList4 = new ArrayList(0Yv.A1E(abstractCollection5, 10));
                Iterator it5 = abstractCollection5.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(Long.valueOf((long) ((Number) it5.next()).intValue()));
                }
            } else {
                arrayList4 = null;
            }
            A00.AAe("brs_content_blocklist_before", arrayList4);
            AbstractCollection abstractCollection6 = (AbstractCollection) A01.A01(C271774jZ.A0d);
            if (abstractCollection6 != null) {
                arrayList5 = new ArrayList(0Yv.A1E(abstractCollection6, 10));
                Iterator it6 = abstractCollection6.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(Long.valueOf((long) ((Number) it6.next()).intValue()));
                }
            } else {
                arrayList5 = null;
            }
            A00.AAe("brs_content_blocklist_after", arrayList5);
            AbstractCollection abstractCollection7 = (AbstractCollection) A01.A01(C271774jZ.A07);
            if (abstractCollection7 != null) {
                arrayList6 = new ArrayList(0Yv.A1E(abstractCollection7, 10));
                Iterator it7 = abstractCollection7.iterator();
                while (it7.hasNext()) {
                    arrayList6.add(Long.valueOf((long) ((Number) it7.next()).intValue()));
                }
            } else {
                arrayList6 = null;
            }
            A00.AAe("ad_content_blocklist", arrayList6);
            Number number19 = (Number) A01.A01(C271774jZ.A0g);
            if (number19 != null) {
                l24 = Long.valueOf((long) number19.intValue());
            } else {
                l24 = null;
            }
            A00.A9F("brs_content_blocklist_before_length", l24);
            Number number20 = (Number) A01.A01(C271774jZ.A0e);
            if (number20 != null) {
                l25 = Long.valueOf((long) number20.intValue());
            } else {
                l25 = null;
            }
            A00.A9F("brs_content_blocklist_after_length", l25);
            A00.A7p("is_afi_click_feed_ini_eligible", (Boolean) A01.A01(C271774jZ.A3v));
            A00.A7p("is_afi_dwell_feed_ini_eligible", (Boolean) A01.A01(C271774jZ.A3w));
            A00.A7p("is_eager_refresh", (Boolean) A01.A01(C271774jZ.A4F));
            A00.A8D("client_timestamp_delta_since_last_item_sec", (Double) A01.A01(C271774jZ.A1J));
            Number number21 = (Number) A01.A01(C271774jZ.A5f);
            if (number21 != null) {
                l34 = Long.valueOf((long) number21.intValue());
            }
            A00.A9F("messaged_by_count", l34);
            if (l33 != null) {
                A00.A9F("host_profile_id", l33);
            }
            if (l35 != null) {
                A00.A9F("host_profile_id_delivered_to", l35);
            }
            if (C228342lQ.A02(userSession)) {
                A00.AAJ("basic_ads_graphql_tier", C228342lQ.A01(1Au.A00(userSession)).toString());
                A00.AAJ("basic_ads_launcher_tier", C228342lQ.A00(userSession).toString());
            }
            0j9 r1 = C271774jZ.A1Y;
            if (A01.A01(r1) != null) {
                A00.AAe("consider_and_browse_options", (List) A01.A01(r1));
            }
            A00.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A00.Cgf();
        }
    }
}
