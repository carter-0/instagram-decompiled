package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5rR  reason: invalid class name and case insensitive filesystem */
public abstract class C297245rR {
    public static void A00(C58840Ae r37, AnonymousClass2oW r38, C254353sL r39, Integer num, String str, List list, C62320sa r43, C62320sa r44, 0sP r45) {
        long j;
        Long valueOf;
        0bb r6;
        0bb r7;
        String str2;
        0bb r72;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Boolean bool;
        Boolean bool2;
        Long l5;
        Long l6;
        ArrayList arrayList;
        Long l7;
        ArrayList arrayList2;
        Long l8;
        Long l9;
        Long l10;
        Long l11;
        ArrayList arrayList3;
        Double d;
        Long l12;
        Long l13;
        ArrayList arrayList4;
        Long l14;
        Long l15;
        Long l16;
        ArrayList arrayList5;
        Boolean bool3;
        Boolean bool4;
        Long l17;
        Long l18;
        Long l19;
        Long l20;
        Long l21;
        Double d2;
        Long l22;
        Long l23;
        Long l24;
        Long l25;
        ArrayList arrayList6;
        Boolean bool5;
        Long l26;
        Long l27;
        Boolean bool6;
        Long l28;
        Long l29;
        Boolean bool7;
        Long l30;
        Long l31;
        Long l32;
        Long l33;
        Long l34;
        Long l35;
        Boolean bool8;
        Long l36;
        Boolean bool9;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        Double d7;
        Double d8;
        Double d9;
        Double d10;
        Boolean bool10;
        Long l37;
        Long l38;
        Long l39;
        Long l40;
        0bb r73;
        Long l41;
        Long l42;
        Long l43;
        Long l44;
        Boolean bool11;
        Boolean bool12;
        Long l45;
        Long l46;
        ArrayList arrayList7;
        Long l47;
        ArrayList arrayList8;
        Long l48;
        Long l49;
        Long l50;
        Long l51;
        ArrayList arrayList9;
        Double d11;
        Long l52;
        Long l53;
        ArrayList arrayList10;
        Long l54;
        Long l55;
        Long l56;
        ArrayList arrayList11;
        Boolean bool13;
        Boolean bool14;
        Long l57;
        Long l58;
        Long l59;
        Long l60;
        Long l61;
        Double d12;
        Long l62;
        Long l63;
        Long l64;
        Long l65;
        ArrayList arrayList12;
        Boolean bool15;
        Long l66;
        Long l67;
        Boolean bool16;
        Long l68;
        Long l69;
        Boolean bool17;
        Long l70;
        Long l71;
        Long l72;
        Long l73;
        Long l74;
        Long l75;
        Boolean bool18;
        Long l76;
        Boolean bool19;
        Double d13;
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        Double d18;
        Double d19;
        Double d20;
        Boolean bool20;
        Long l77;
        Long l78;
        Long l79;
        Long l80;
        0bb r74;
        AnonymousClass4OQ r4;
        Long l81;
        ArrayList arrayList13;
        Long A0n;
        long j2;
        long j3;
        Set<Map.Entry> entrySet;
        Long l82;
        Long l83;
        String str3;
        Long l84;
        Long l85;
        Long l86;
        Long l87;
        Long l88;
        Long l89;
        Long l90;
        Long l91;
        Long l92;
        Long l93;
        String str4;
        0qQ.A0B(r38, 4);
        String str5 = str;
        if (str == null) {
            0KC.A0C("MerlinLoggerV2", "No origin provided to merlin logger");
            return;
        }
        0Ak r12 = (0Ak) r45.invoke(r37);
        if (r12.A00.isSampled()) {
            r12.A0R("origin", str5);
            C254353sL r372 = r39;
            C254343sK r1 = r372.A01;
            0qQ.A0B(r1, 1);
            List A0a = 00k.A0a(r1.A00.values());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
                Iterator it2 = A0a.iterator();
                if (it2.hasNext()) {
                    it2.next();
                    throw new NullPointerException("attachToEvent");
                }
            }
            0bb r18 = (0bb) r44.invoke();
            List list2 = r372.A06;
            List<C254303sG> list3 = list2;
            ArrayList<C254323sI> arrayList14 = new ArrayList<>(0Yv.A1E(list2, 10));
            for (C254303sG r0 : list3) {
                arrayList14.add(r0.A01);
            }
            ArrayList arrayList15 = new ArrayList();
            for (C254323sI r02 : arrayList14) {
                018.A16(r02.A07, arrayList15);
            }
            r18.A07("t_0", C297275rU.A00(arrayList15, C297265rT.A00));
            ArrayList<C254323sI> arrayList16 = new ArrayList<>(0Yv.A1E(list3, 10));
            for (C254303sG r03 : list3) {
                arrayList16.add(r03.A01);
            }
            ArrayList arrayList17 = new ArrayList();
            for (C254323sI r04 : arrayList16) {
                018.A16(r04.A02, arrayList17);
            }
            r18.A07("t_50", C297275rU.A00(arrayList17, C297295rW.A00));
            ArrayList arrayList18 = 0sn.A00;
            ArrayList<C254323sI> arrayList19 = new ArrayList<>(0Yv.A1E(list3, 10));
            for (C254303sG r05 : list3) {
                arrayList19.add(r05.A01);
            }
            ArrayList arrayList20 = new ArrayList();
            for (C254323sI r06 : arrayList19) {
                018.A16(r06.A04, arrayList20);
            }
            r18.A07("t_100", C297275rU.A00(arrayList20, C297305rX.A00));
            0bb r17 = (0bb) r43.invoke();
            ArrayList<C254323sI> arrayList21 = new ArrayList<>(0Yv.A1E(list3, 10));
            for (C254303sG r07 : list3) {
                arrayList21.add(r07.A01);
            }
            ArrayList arrayList22 = new ArrayList();
            for (C254323sI r08 : arrayList21) {
                018.A16(r08.A03, arrayList22);
            }
            r17.A07("t_50", C297275rU.A00(arrayList22, C297325rZ.A00));
            ArrayList<C254323sI> arrayList23 = new ArrayList<>(0Yv.A1E(list3, 10));
            for (C254303sG r09 : list3) {
                arrayList23.add(r09.A01);
            }
            ArrayList arrayList24 = new ArrayList();
            for (C254323sI r010 : arrayList23) {
                018.A16(r010.A05, arrayList24);
            }
            r17.A07("t_100", C297275rU.A00(arrayList24, C297335ra.A00));
            C254253sB r13 = r372.A02;
            0bb r16 = null;
            C254523sc BGZ = (r13 == null || !(r13 instanceof C254243sA)) ? null : ((C254243sA) r13).BGZ();
            try {
                C254233s9 r14 = r372.A00;
                if (r14 != null && (r14 instanceof C254243sA)) {
                    BGZ = ((C254243sA) r14).BGZ();
                }
            } catch (ClassCastException e) {
                0wb.A03("MerlinLogger", 002.A0R("onViewabilityAggregated:type cast issue: ", e.getMessage()));
            }
            if (BGZ != null) {
                0jB A01 = BGZ.A01();
                0j9 r24 = C271774jZ.A7Y;
                if (!0qQ.A0K(A01.A01(r24), AnonymousClass000.A00(3514))) {
                    r16 = new 0bb();
                    try {
                        0xF r8 = BGZ.A00().A06;
                        0jB A012 = BGZ.A01();
                        r6 = new 0bb();
                        String str6 = (String) A012.A01(C271774jZ.A0Y);
                        Long l94 = null;
                        if (str6 == null || (l82 = 00y.A0n(10, str6)) == null) {
                            l82 = null;
                        }
                        r6.A05("a_pk", l82);
                        r6.A05("c_pk", C297365rd.A00((String) A012.A01(C271774jZ.A1V)));
                        String str7 = (String) A012.A01(C271774jZ.A1S);
                        if (str7 != null) {
                            l83 = Long.valueOf(Long.parseLong(str7));
                        } else {
                            l83 = null;
                        }
                        r6.A05("ca_pk", l83);
                        r6.A05("parent_c_pk", C297365rd.A00((String) A012.A01(C271774jZ.A6Q)));
                        r6.A03("is_covered", (Boolean) A012.A01(C271774jZ.A43));
                        r6.A05("like_count", (Long) A012.A01(C271774jZ.A57));
                        r6.A03("is_truncated", (Boolean) A012.A01(C271774jZ.A4v));
                        r6.A05("character_count", (Long) A012.A01(C271774jZ.A1T));
                        r6.A03("is_media_organic", (Boolean) A012.A01(C271774jZ.A4X));
                        r6.A06("c_index", (String) A012.A01(C271774jZ.A1W));
                        String str8 = (String) A012.A01(C271774jZ.A3q);
                        if (str8 == null) {
                            str8 = BGZ.A5m;
                        }
                        r6.A06("inventory_source", str8);
                        r6.A06("tracking_token", (String) A012.A01(C271774jZ.A9L));
                        r6.A06("m_pk", (String) A012.A01(C271774jZ.A5I));
                        Long l95 = (Long) A012.A01(C271774jZ.A5a);
                        if (l95 == null || (str3 = l95.toString()) == null) {
                            str3 = "";
                        }
                        r6.A06("m_t", str3);
                        r6.A06("media_type", r8.A05("media_type_for_merlin"));
                        0j9 r22 = C271774jZ.A6q;
                        r6.A06("ranking_session_id", (String) A012.A01(r22));
                        r6.A05("num_visible_media_notes", (Long) A012.A01(C271774jZ.A6G));
                        r6.A06("chaining_session_id", (String) A012.A01(C271774jZ.A1C));
                        r6.A05("chaining_position", (Long) A012.A01(C271774jZ.A1A));
                        r6.A05("chaining_seed_author_id", (Long) A012.A01(C271774jZ.A1B));
                        String str9 = (String) A012.A01(C271774jZ.A3e);
                        if (str9 != null) {
                            l84 = Long.valueOf(Long.parseLong(str9));
                        } else {
                            l84 = null;
                        }
                        r6.A05("chaining_seed_media_id", l84);
                        r6.A06("follow_status", (String) A012.A01(C271774jZ.A2v));
                        r6.A05("m_ix", (Long) A012.A01(C271774jZ.A3m));
                        r6.A06("reel_id", (String) A012.A01(C271774jZ.A7T));
                        r6.A06("tray_session_id", (String) A012.A01(C271774jZ.A7X));
                        r6.A06("viewer_session_id", (String) A012.A01(C271774jZ.A9i));
                        r6.A05("reel_position", (Long) A012.A01(C271774jZ.A7U));
                        r6.A05("reel_viewer_position", (Long) A012.A01(C271774jZ.A7b));
                        r6.A06("reel_type", (String) A012.A01(r24));
                        r6.A05("reel_size", (Long) A012.A01(C271774jZ.A7V));
                        r6.A05("tray_position", (Long) A012.A01(C271774jZ.A9P));
                        r6.A04("time_elapsed", (Double) A012.A01(C271774jZ.A8z));
                        r6.A04("time_remaining", (Double) A012.A01(C271774jZ.A94));
                        r6.A04("time_paused", (Double) A012.A01(C271774jZ.A93));
                        r6.A04("client_receive_time", (Double) A012.A01(C271774jZ.A8y));
                        r6.A03("is_highlights_sourced", (Boolean) A012.A01(C271774jZ.A4K));
                        r6.A03("is_zoomed_out", (Boolean) A012.A01(C271774jZ.A50));
                        r6.A06("story_ranking_token", (String) A012.A01(C271774jZ.A8O));
                        r6.A06("delivery_flags", (String) A012.A01(C271774jZ.A26));
                        r6.A05("dynamic_story_duration", (Long) A012.A01(C271774jZ.A2N));
                        0j9 r20 = C271774jZ.A5P;
                        r6.A05("media_loading_progress", (Long) A012.A01(r20));
                        r6.A03("is_media_loaded", (Boolean) A012.A01(C271774jZ.A4T));
                        String str10 = (String) A012.A01(C271774jZ.A6r);
                        if (str10 == null) {
                            str10 = (String) A012.A01(C297695sB.A01);
                        }
                        r6.A06("rank_token", str10);
                        r6.A06("topic_cluster_id", (String) A012.A01(C271774jZ.A9D));
                        r6.A06("topic_cluster_title", (String) A012.A01(C271774jZ.A9F));
                        r6.A06("topic_cluster_type", (String) A012.A01(C271774jZ.A9G));
                        r6.A06("topic_cluster_debug_info", (String) A012.A01(C271774jZ.A9C));
                        r6.A06("mezql_token", (String) A012.A01(C271774jZ.A5g));
                        String str11 = (String) A012.A01(C271774jZ.A5A);
                        if (str11 != null) {
                            l85 = Long.valueOf(Long.parseLong(str11));
                        } else {
                            l85 = null;
                        }
                        r6.A05("main_feed_carousel_starting_media_id", l85);
                        r6.A06("carousel_cover_media_id", (String) A012.A01(C271774jZ.A0x));
                        r6.A05("carousel_container_media_id", (Long) A012.A01(C271774jZ.A0w));
                        r6.A05("carousel_cover_media_id_int", (Long) A012.A01(C271774jZ.A0y));
                        r6.A05("carousel_index", (Long) A012.A01(C271774jZ.A0z));
                        r6.A05("carousel_media_id_int", (Long) A012.A01(C271774jZ.A11));
                        r6.A05("carousel_starting_media_id", (Long) A012.A01(C271774jZ.A16));
                        String str12 = (String) A012.A01(C271774jZ.A3P);
                        if (str12 == null && (str12 = (String) A012.A01(C298085sr.A01)) == null) {
                            str12 = BGZ.A5Q;
                        }
                        r6.A06("hashtag_follow_status", str12);
                        String A05 = r8.A05("hashtag_id");
                        if (A05 != null) {
                            l86 = Long.valueOf(Long.parseLong(A05));
                        } else {
                            l86 = null;
                        }
                        r6.A05("hashtag_id", l86);
                        String str13 = (String) A012.A01(C271774jZ.A3Q);
                        if (str13 == null && (str13 = (String) A012.A01(C298085sr.A03)) == null) {
                            str13 = BGZ.A5R;
                        }
                        r6.A06("hashtag_name", str13);
                        String str14 = (String) A012.A01(C271774jZ.A3N);
                        if (str14 == null) {
                            str14 = (String) A012.A01(C298085sr.A00);
                        }
                        r6.A06("hashtag_feed_type", str14);
                        0j9 r3 = C271774jZ.A60;
                        r6.A06("nav_chain", (String) A012.A01(r3));
                        r6.A06("canonical_nav_chain", (String) A012.A01(r3));
                        r6.A06("feed_request_id", (String) A012.A01(C271774jZ.A88));
                        r6.A05("is_dark_mode", (Long) A012.A01(C271774jZ.A4B));
                        r6.A06("parent_m_pk", (String) A012.A01(C271774jZ.A6S));
                        r6.A06("source_of_action", (String) A012.A01(C271774jZ.A8A));
                        r6.A06("ranking_info_token", (String) A012.A01(C271774jZ.A6p));
                        r6.A05("imp_logger_ver", (Long) A012.A01(C271774jZ.A3k));
                        r6.A06("carousel_media_id", (String) A012.A01(C271774jZ.A10));
                        r6.A06("container_module", r8.A05("container_module"));
                        r6.A05("client_position", (Long) A012.A01(C271774jZ.A3r));
                        r6.A05("engagement_tray_unit_id", (Long) A012.A01(C271774jZ.A2U));
                        r6.A07("engagement_unit_ids", (List) A012.A01(C271774jZ.A2W));
                        r6.A05("engagement_tray_unit_item_id", (Long) A012.A01(C271774jZ.A2V));
                        r6.A01((C297375re) A012.A01(C271774jZ.A2X), "engagement_unit_type");
                        r6.A03("is_eof", (Boolean) A012.A01(C271774jZ.A4G));
                        String str15 = (String) A012.A01(C271774jZ.A2d);
                        if (str15 == null) {
                            str15 = (String) A012.A01(C297705sC.A06);
                        }
                        r6.A06("entity_type", str15);
                        Long l96 = (Long) A012.A01(C271774jZ.A2Z);
                        if (l96 == null) {
                            String str16 = (String) A012.A01(C297705sC.A01);
                            if (str16 != null) {
                                l96 = Long.valueOf(Long.parseLong(str16));
                            } else {
                                l96 = null;
                            }
                        }
                        r6.A05("entity_id", l96);
                        String str17 = (String) A012.A01(C271774jZ.A2a);
                        if (str17 == null) {
                            str17 = (String) A012.A01(C297705sC.A02);
                        }
                        r6.A06("entity_name", str17);
                        String str18 = (String) A012.A01(C271774jZ.A2c);
                        if (str18 == null) {
                            str18 = (String) A012.A01(C297705sC.A04);
                        }
                        r6.A06("entity_page_name", str18);
                        String str19 = (String) A012.A01(C271774jZ.A2b);
                        if (str19 == null && (str19 = (String) A012.A01(C297705sC.A03)) == null) {
                            l87 = null;
                        } else {
                            l87 = Long.valueOf(Long.parseLong(str19));
                        }
                        r6.A05("entity_page_id", l87);
                        String A052 = r8.A05("recs_ix");
                        if (A052 != null) {
                            l88 = Long.valueOf(Long.parseLong(A052));
                        } else {
                            l88 = null;
                        }
                        r6.A05("recs_ix", l88);
                        r6.A03("is_stories_pog_impression", (Boolean) A012.A01(C271774jZ.A4a));
                        String str20 = (String) A012.A01(C271774jZ.A6R);
                        if (str20 != null) {
                            l89 = Long.valueOf(Long.parseLong(str20));
                        } else {
                            l89 = null;
                        }
                        r6.A05(AnonymousClass000.A00(1667), l89);
                        String str21 = (String) A012.A01(C271774jZ.A1F);
                        if (str21 != null) {
                            l90 = Long.valueOf(Long.parseLong(str21));
                        } else {
                            l90 = null;
                        }
                        r6.A05(AnonymousClass000.A00(1167), l90);
                        r6.A03(AnonymousClass000.A00(4964), (Boolean) A012.A01(C271774jZ.A4i));
                        r6.A03("is_preview", (Boolean) A012.A01(C271774jZ.A4c));
                        r6.A03("is_reply_highlight", (Boolean) A012.A01(C271774jZ.A4k));
                        r6.A03("merlin_double_logging_enabled", (Boolean) A012.A01(C271774jZ.A4U));
                        r6.A03("client_sub_impression", (Boolean) A012.A01(C271774jZ.A1I));
                        r6.A04("sum_duration_ms", (Double) A012.A01(C271774jZ.A9r));
                        ArrayList A06 = r8.A06("attribution_type");
                        if (!(A06 instanceof List)) {
                            A06 = null;
                        }
                        r6.A07("attribution_type", A06);
                        0j9 r32 = C271774jZ.A3V;
                        String str22 = (String) A012.A01(r32);
                        if (str22 == null || (str4 = (String) 00k.A0O(00l.A0R(str22, new String[]{":"}, 0), 1)) == null) {
                            l91 = null;
                        } else {
                            l91 = Long.valueOf(Long.parseLong(str4));
                        }
                        r6.A05("highlight_id", l91);
                        r6.A06("highlight_reel_id", (String) A012.A01(r32));
                        r6.A06("social_context_type", (String) A012.A01(C271774jZ.A86));
                        r6.A07("social_context_user_ids", (List) A012.A01(C271774jZ.A87));
                        r6.A07("facepile_user_ids", (List) A012.A01(C271774jZ.A2l));
                        r6.A07("friendly_bubble_user_ids", (List) A012.A01(C271774jZ.A2y));
                        r6.A07("comment_bubble_user_ids", (List) A012.A01(C271774jZ.A2x));
                        r6.A03("production_build", (Boolean) A012.A01(C271774jZ.A2h));
                        0j9 r31 = C271774jZ.A5K;
                        r6.A05("media_id", (Long) A012.A01(r31));
                        0j9 r29 = C271774jZ.A5E;
                        r6.A05("media_author_id", (Long) A012.A01(r29));
                        r6.A03("has_translation", r8.A01("has_translation"));
                        r6.A03("is_checkout_enabled", (Boolean) A012.A01(C271774jZ.A41));
                        r6.A05("repost_id", BGZ.A49);
                        r6.A01(BGZ.A0e, "is_audio_muted_type");
                        r6.A06("serp_session_id", BGZ.A6s);
                        AnonymousClass9I9 r42 = BGZ.A0g;
                        if (r42 != null) {
                            0bb r33 = new 0bb();
                            r33.A05("view_height", Long.valueOf((long) r42.A00));
                            r33.A05("view_width", Long.valueOf((long) r42.A01));
                            r33.A03("is_paged", Boolean.valueOf(r42.A04));
                            r33.A03("is_tall", Boolean.valueOf(r42.A02));
                            r6.A02(r33, "view_metadata");
                        }
                        C292915jj r15 = BGZ.A0w;
                        if (r15 != null) {
                            r6.A06("netego_id", r15.A07);
                            r6.A06("netego_type", r15.A03);
                            r6.A07("netego_item_ids", r15.A08);
                            r6.A05("netego_subtype", r15.A00);
                            r6.A06("ranking_session_id", (String) null);
                            r6.A06("ranking_info_token", r15.A05);
                            r6.A06("module_name", r15.A06);
                            r6.A06("source_of_action", r15.A01);
                            r6.A06("tracking_token", r15.A02);
                            r6.A06("ranking_algorithm", r15.A04);
                            r6.A06("order_item_id", (String) null);
                            r6.A06("release_channel", (String) null);
                            r6.A06("format", (String) null);
                        }
                        if (A012.A01(r22) == null) {
                            r6.A06("ranking_session_id", BGZ.A6a);
                        }
                        if (A012.A01(C271774jZ.A2s) == null) {
                            r6.A06("feed_session_id", BGZ.A5G);
                        }
                        if (A012.A01(C271774jZ.A8R) == null) {
                            Integer num2 = BGZ.A3B;
                            if (num2 != null) {
                                l93 = Long.valueOf((long) num2.intValue());
                            } else {
                                l93 = null;
                            }
                            r6.A05("sub_vpvd_reason_server", l93);
                        }
                        if (A012.A01(C271774jZ.A8Q) == null) {
                            Integer num3 = BGZ.A2p;
                            if (num3 != null) {
                                l92 = Long.valueOf((long) num3.intValue());
                            } else {
                                l92 = null;
                            }
                            r6.A05("sub_vpvd_reason_client", l92);
                        }
                        r6.A06("context_string", BGZ.A4t);
                        if (A012.A01(r20) == null) {
                            r6.A05("media_loading_progress", BGZ.A3f);
                        }
                        if (A012.A01(r31) == null) {
                            r6.A05("media_id", BGZ.A3e);
                        }
                        if (A012.A01(r29) == null) {
                            r6.A05("media_author_id", BGZ.A3d);
                        }
                        if (A012.A01(C271774jZ.A0W) == null) {
                            r6.A06("audience", BGZ.A4U);
                        }
                        if (r8.A05("recs_ix") == null) {
                            int i = BGZ.A07;
                            if (!(i == -1 || Integer.valueOf(i) == null)) {
                                l94 = Long.valueOf((long) i);
                            }
                            r6.A05("recs_ix", l94);
                        }
                        r6.A03("media_caption_has_see_more", BGZ.A27);
                        r6.A05("num_likers_displayed", BGZ.A3t);
                        r6.A05("num_named_likers_displayed", BGZ.A3u);
                        r6.A05("num_visible_story_comments", BGZ.A3w);
                        List list4 = BGZ.A7k;
                        if (list4 != null) {
                            r6.A07("attribution_type", list4);
                        }
                    } catch (ClassCastException unused) {
                        r6 = new 0bb();
                    }
                    r16.A02(r6, "ig_vpv");
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        try {
                            0xF r62 = BGZ.A00().A06;
                            0jB A013 = BGZ.A01();
                            0bb r75 = new 0bb();
                            String str23 = (String) A013.A01(C271774jZ.A0Y);
                            Long l97 = null;
                            if (str23 != null) {
                                l = C263944Ny.A00(str23).A00;
                            } else {
                                l = null;
                            }
                            r75.A05("a_pk", l);
                            r75.A05("c_pk", C297365rd.A00((String) A013.A01(C271774jZ.A1V)));
                            String str24 = (String) A013.A01(C271774jZ.A1S);
                            if (str24 != null) {
                                l2 = C263944Ny.A00(str24).A00;
                            } else {
                                l2 = null;
                            }
                            r75.A05("ca_pk", l2);
                            r75.A05("parent_c_pk", C297365rd.A00((String) A013.A01(C271774jZ.A6Q)));
                            r75.A03("is_covered", (Boolean) A013.A01(C271774jZ.A43));
                            r75.A05("like_count", (Long) A013.A01(C271774jZ.A57));
                            r75.A03("is_media_organic", (Boolean) A013.A01(C271774jZ.A4X));
                            r75.A06("c_index", (String) A013.A01(C271774jZ.A1W));
                            String A053 = r62.A05("sponsor_tag_count");
                            if (A053 != null) {
                                l3 = Long.valueOf(Long.parseLong(A053));
                            } else {
                                l3 = null;
                            }
                            r75.A05("sponsor_tag_count", l3);
                            r75.A06("m_pk", (String) A013.A01(C271774jZ.A5I));
                            r75.A06("tracking_token", (String) A013.A01(C271774jZ.A9L));
                            0j9 r82 = C271774jZ.A5a;
                            r75.A05("m_t", (Long) A013.A01(r82));
                            String A054 = r62.A05("hashtag_id");
                            if (A054 != null) {
                                l4 = Long.valueOf(Long.parseLong(A054));
                            } else {
                                l4 = null;
                            }
                            r75.A05("hashtag_id", l4);
                            r75.A07("feed_sticker_media_id", (List) A013.A01(C271774jZ.A2q));
                            r75.A06("inventory_source", (String) A013.A01(C271774jZ.A3q));
                            r75.A05("carousel_index", (Long) A013.A01(C271774jZ.A0z));
                            String str25 = (String) A013.A01(C271774jZ.A3x);
                            if (str25 != null) {
                                bool = Boolean.valueOf(Boolean.parseBoolean(str25));
                            } else {
                                bool = null;
                            }
                            r75.A03("is_app_backgrounded", bool);
                            r75.A06("last_navigation_module", (String) A013.A01(C271774jZ.A56));
                            r75.A06("application_state", (String) A013.A01(C271774jZ.A0Q));
                            r75.A06("hashtag_name", (String) A013.A01(C271774jZ.A3Q));
                            r75.A06("hashtag_feed_type", (String) A013.A01(C271774jZ.A3N));
                            r75.A06("carousel_media_id", (String) A013.A01(C271774jZ.A10));
                            r75.A05("carousel_starting_media_id", (Long) A013.A01(C271774jZ.A16));
                            r75.A06("carousel_cover_media_id", (String) A013.A01(C271774jZ.A0x));
                            r75.A06("reel_id", (String) A013.A01(C271774jZ.A7T));
                            r75.A06("tray_session_id", (String) A013.A01(C271774jZ.A7X));
                            r75.A06("viewer_session_id", (String) A013.A01(C271774jZ.A9i));
                            r75.A06("ranking_session_id", (String) A013.A01(C271774jZ.A6q));
                            r75.A06("chaining_session_id", (String) A013.A01(C271774jZ.A1C));
                            r75.A05("chaining_position", (Long) A013.A01(C271774jZ.A1A));
                            r75.A06("action", (String) A013.A01(C271774jZ.A00));
                            r75.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) A013.A01(C271774jZ.A2e));
                            String A00 = AnonymousClass000.A00(267);
                            r75.A06(A00, r62.A05(A00));
                            r75.A03("is_checkout_enabled", (Boolean) A013.A01(C271774jZ.A41));
                            String A055 = r62.A05("can_add_to_bag");
                            if (A055 != null) {
                                bool2 = Boolean.valueOf(Boolean.parseBoolean(A055));
                            } else {
                                bool2 = null;
                            }
                            r75.A03("can_add_to_bag", bool2);
                            String str26 = (String) A013.A01(C271774jZ.A5e);
                            if (str26 != null) {
                                l5 = C263944Ny.A00(str26).A00;
                            } else {
                                l5 = null;
                            }
                            r75.A05("merchant_id", l5);
                            r75.A06("prior_module", (String) A013.A01(C271774jZ.A6h));
                            String str27 = (String) A013.A01(C271774jZ.A6i);
                            if (str27 != null) {
                                l6 = Long.valueOf(Long.parseLong(str27));
                            } else {
                                l6 = null;
                            }
                            r75.A05("product_id", l6);
                            ArrayList arrayList25 = (ArrayList) A013.A01(C271774jZ.A6j);
                            if (arrayList25 != null) {
                                ArrayList arrayList26 = new ArrayList(0Yv.A1E(arrayList25, 10));
                                Iterator it3 = arrayList25.iterator();
                                while (it3.hasNext()) {
                                    String str28 = (String) it3.next();
                                    0qQ.A0B(str28, 0);
                                    arrayList26.add(00y.A0n(10, str28));
                                }
                                arrayList = new ArrayList(00k.A0X(arrayList26));
                            } else {
                                arrayList = null;
                            }
                            r75.A07("product_ids", arrayList);
                            r75.A05("m_ix", (Long) A013.A01(C271774jZ.A3m));
                            String str29 = (String) A013.A01(C271774jZ.A3e);
                            if (str29 != null) {
                                l7 = Long.valueOf(Long.parseLong(str29));
                            } else {
                                l7 = null;
                            }
                            r75.A05("chaining_seed_media_id", l7);
                            r75.A05("chaining_seed_author_id", (Long) A013.A01(C271774jZ.A1B));
                            r75.A05("reel_gap", (Long) A013.A01(C271774jZ.A7P));
                            r75.A06("event_trace_id", (String) A013.A01(C271774jZ.A2f));
                            r75.A06("host_video_pk", (String) A013.A01(C271774jZ.A3a));
                            r75.A06("media_layout_encoded_string", (String) A013.A01(C271774jZ.A5O));
                            r75.A03("mop_should_double_logging", (Boolean) A013.A01(C271774jZ.A5n));
                            r75.A03("mop_should_rollout", (Boolean) A013.A01(C271774jZ.A5o));
                            r75.A03("is_zoomed_out", (Boolean) A013.A01(C271774jZ.A50));
                            ArrayList arrayList27 = (ArrayList) A013.A01(C271774jZ.A1e);
                            if (arrayList27 != null) {
                                ArrayList arrayList28 = new ArrayList(0Yv.A1E(arrayList27, 10));
                                Iterator it4 = arrayList27.iterator();
                                while (it4.hasNext()) {
                                    arrayList28.add(0Yt.A03((HashMap) it4.next()));
                                }
                                arrayList2 = 00k.A0U(arrayList28);
                            } else {
                                arrayList2 = null;
                            }
                            r75.A07("client_ad_creative_optimization_output", arrayList2);
                            r75.A03("is_previewable_video_ad", (Boolean) A013.A01(C271774jZ.A4b));
                            r75.A06("ad_skip_type", (String) A013.A01(C271774jZ.A0M));
                            r75.A03("is_cta_sticker_available", (Boolean) A013.A01(C271774jZ.A44));
                            r75.A03("is_cta_sticker_shown", (Boolean) A013.A01(C271774jZ.A47));
                            r75.A03("is_sensitive_vertical_ad", (Boolean) A013.A01(C271774jZ.A4o));
                            r75.A03("post_impression_column_override", (Boolean) A013.A01(C271774jZ.A6O));
                            r75.A06("radio_type", (String) A013.A01(C271774jZ.A6o));
                            String str30 = (String) A013.A01(C271774jZ.A7q);
                            if (str30 != null) {
                                l8 = Long.valueOf(Long.parseLong(str30));
                            } else {
                                l8 = null;
                            }
                            r75.A05("seed_ad_id", l8);
                            String str31 = (String) A013.A01(C271774jZ.A3b);
                            if (str31 != null) {
                                l9 = Long.valueOf(Long.parseLong(str31));
                            } else {
                                l9 = null;
                            }
                            r75.A05("hscroll_seed_ad_id", l9);
                            String str32 = (String) A013.A01(C271774jZ.A2u);
                            if (str32 != null) {
                                l10 = Long.valueOf(Long.parseLong(str32));
                            } else {
                                l10 = null;
                            }
                            r75.A05("first_hscroll_item_ad_id", l10);
                            r75.A05("horizontal_position_on_hscroll", (Long) A013.A01(C271774jZ.A3W));
                            r75.A05("vertical_position_on_feed_of_ads", (Long) A013.A01(C271774jZ.A9d));
                            r75.A03("is_multi_ads", (Boolean) A013.A01(C271774jZ.A4V));
                            r75.A05("multi_ads_type", (Long) A013.A01(C271774jZ.A5w));
                            r75.A06("multi_ads_id", (String) A013.A01(C271774jZ.A5u));
                            r75.A05("position_in_multi_ads_unit", (Long) A013.A01(C271774jZ.A6Y));
                            String str33 = (String) A013.A01(C271774jZ.A5t);
                            if (str33 != null) {
                                l11 = Long.valueOf(Long.parseLong(str33));
                            } else {
                                l11 = null;
                            }
                            r75.A05("multi_ads_first_ad_id", l11);
                            r75.A05("ad_consumed_media_gap", (Long) A013.A01(C271774jZ.A06));
                            r75.A05("netego_consumed_media_gap", (Long) A013.A01(C271774jZ.A61));
                            r75.A05("priority_index", (Long) A013.A01(C271774jZ.A6g));
                            r75.A05("highest_position_rule", (Long) A013.A01(C271774jZ.A3U));
                            r75.A05("max_reel_gap_to_previous_item", (Long) A013.A01(C271774jZ.A5B));
                            r75.A05("min_media_gap_to_previous_item", (Long) A013.A01(C271774jZ.A5l));
                            r75.A04("time_gap_to_previous_item_in_sec", (Double) A013.A01(C271774jZ.A91));
                            r75.A05("consumed_media_gap", (Long) A013.A01(C271774jZ.A1Z));
                            r75.A05("consumed_media_gap_highest_position", (Long) A013.A01(C271774jZ.A1a));
                            r75.A05("reel_gap_highest_position", (Long) A013.A01(C271774jZ.A7Q));
                            r75.A06("previous_media_pk", (String) A013.A01(C271774jZ.A6a));
                            r75.A06("next_media_pk", (String) A013.A01(C271774jZ.A66));
                            r75.A05("segment_index", (Long) A013.A01(C271774jZ.A7s));
                            r75.A05("segment_count", (Long) A013.A01(C271774jZ.A7r));
                            r75.A06("ad_pod_id", (String) A013.A01(C271774jZ.A0G));
                            r75.A05("index_in_ad_pod", (Long) A013.A01(C271774jZ.A3n));
                            ArrayList arrayList29 = (ArrayList) A013.A01(C271774jZ.A9g);
                            if (arrayList29 != null) {
                                ArrayList arrayList30 = new ArrayList(0Yv.A1E(arrayList29, 10));
                                Iterator it5 = arrayList29.iterator();
                                while (it5.hasNext()) {
                                    arrayList30.add(012.A0p((String) it5.next()));
                                }
                                arrayList3 = new ArrayList(00k.A0X(arrayList30));
                            } else {
                                arrayList3 = null;
                            }
                            r75.A07("video_to_carousel_cut_secs", arrayList3);
                            r75.A05("seq_num", (Long) A013.A01(C271774jZ.A7t));
                            r75.A06("disclaimer_text", (String) A013.A01(C271774jZ.A2C));
                            r75.A06("disclaimer_title", (String) A013.A01(C271774jZ.A2D));
                            r75.A05("carousel_type", (Long) A013.A01(C271774jZ.A19));
                            r75.A05("has_top_likers", (Long) A013.A01(C271774jZ.A3T));
                            r75.A05("ad_delivery_position", (Long) A013.A01(C271774jZ.A0A));
                            r75.A03("is_first_ad_in_the_session", (Boolean) A013.A01(C271774jZ.A4H));
                            r75.A05("seq_session", (Long) A013.A01(C271774jZ.A7u));
                            r75.A06("cache_key", (String) A013.A01(C271774jZ.A0m));
                            r75.A06("call_stack", (String) A013.A01(C271774jZ.A0n));
                            r75.A04("time_interval_since_reference_date", (Double) A013.A01(C271774jZ.A92));
                            0j9 r9 = C271774jZ.A8x;
                            Long l98 = (Long) A013.A01(r9);
                            if (l98 != null) {
                                d = Double.valueOf((double) l98.longValue());
                            } else {
                                d = null;
                            }
                            r75.A04("time_stamp", d);
                            r75.A06("disclaimer_url", (String) A013.A01(C271774jZ.A2E));
                            r75.A06("next_inventory_source", (String) A013.A01(C271774jZ.A67));
                            r75.A06("prev_inventory_source", (String) A013.A01(C271774jZ.A6b));
                            r75.A05("num_visible_story_comments", (Long) A013.A01(C271774jZ.A6H));
                            0jB A014 = A013.A01(C271774jZ.A5N);
                            if (A014 != null) {
                                0xF A002 = A014.A00();
                                0bb r2 = new 0bb();
                                r2.A03("is_showreel_native", (Boolean) A014.A01(C271774jZ.A4p));
                                String A056 = A002.A05("media_height");
                                Long l99 = null;
                                if (A056 != null) {
                                    d3 = Double.valueOf(Double.parseDouble(A056));
                                } else {
                                    d3 = null;
                                }
                                r2.A04("media_height", d3);
                                String A057 = A002.A05("media_width");
                                if (A057 != null) {
                                    d4 = Double.valueOf(Double.parseDouble(A057));
                                } else {
                                    d4 = null;
                                }
                                r2.A04("media_width", d4);
                                String A058 = A002.A05("caption_font_size");
                                if (A058 != null) {
                                    d5 = Double.valueOf(Double.parseDouble(A058));
                                } else {
                                    d5 = null;
                                }
                                r2.A04("caption_font_size", d5);
                                String A059 = A002.A05("caption_position_start_x");
                                if (A059 != null) {
                                    d6 = Double.valueOf(Double.parseDouble(A059));
                                } else {
                                    d6 = null;
                                }
                                r2.A04("caption_position_start_x", d6);
                                String A0510 = A002.A05("caption_position_start_y");
                                if (A0510 != null) {
                                    d7 = Double.valueOf(Double.parseDouble(A0510));
                                } else {
                                    d7 = null;
                                }
                                r2.A04("caption_position_start_y", d7);
                                String A0511 = A002.A05("caption_line_height");
                                if (A0511 != null) {
                                    d8 = Double.valueOf(Double.parseDouble(A0511));
                                } else {
                                    d8 = null;
                                }
                                r2.A04("caption_line_height", d8);
                                String A0512 = A002.A05("caption_line_height");
                                if (A0512 != null) {
                                    d9 = Double.valueOf(Double.parseDouble(A0512));
                                } else {
                                    d9 = null;
                                }
                                r2.A04("caption_height", d9);
                                String A0513 = A002.A05("caption_width");
                                if (A0513 != null) {
                                    d10 = Double.valueOf(Double.parseDouble(A0513));
                                } else {
                                    d10 = null;
                                }
                                r2.A04("caption_width", d10);
                                String A0514 = A002.A05("is_caption_fully_displayed");
                                if (A0514 != null) {
                                    bool10 = Boolean.valueOf(Boolean.parseBoolean(A0514));
                                } else {
                                    bool10 = null;
                                }
                                r2.A03("is_caption_fully_displayed", bool10);
                                r2.A06("background_color_bottom", A002.A05("background_color_bottom"));
                                r2.A06("background_color_caption", A002.A05("background_color_caption"));
                                r2.A06("background_color_top", A002.A05("background_color_top"));
                                r2.A06("caption_background_color_alpha", A002.A05("caption_background_color_alpha"));
                                String A0515 = A002.A05("caption_num_char_showed");
                                if (A0515 != null) {
                                    l37 = Long.valueOf(Long.parseLong(A0515));
                                } else {
                                    l37 = null;
                                }
                                r2.A05("caption_num_char_showed", l37);
                                String A0516 = A002.A05("caption_num_hashtags_showed");
                                if (A0516 != null) {
                                    l38 = Long.valueOf(Long.parseLong(A0516));
                                } else {
                                    l38 = null;
                                }
                                r2.A05("caption_num_hashtags_showed", l38);
                                String A0517 = A002.A05("caption_num_lines_showed");
                                if (A0517 != null) {
                                    l39 = Long.valueOf(Long.parseLong(A0517));
                                } else {
                                    l39 = null;
                                }
                                r2.A05("caption_num_lines_showed", l39);
                                String A0518 = A002.A05("caption_num_lines_total");
                                if (A0518 != null) {
                                    l40 = Long.valueOf(Long.parseLong(A0518));
                                } else {
                                    l40 = null;
                                }
                                r2.A05("caption_num_lines_total", l40);
                                String A0519 = A002.A05("caption_num_mentions_showed");
                                if (A0519 != null) {
                                    l99 = Long.valueOf(Long.parseLong(A0519));
                                }
                                r2.A05("caption_num_mentions_showed", l99);
                                r2.A06("caption_text_color", A002.A05("caption_text_color"));
                                r2.A06("cta_color", (String) A014.A01(C271774jZ.A1i));
                                r2.A06("headline_text_showed", A002.A05("headline_text_showed"));
                                r2.A04("screen_density", (Double) A014.A01(C271774jZ.A7l));
                                r2.A04("screen_height", (Double) A014.A01(C271774jZ.A7m));
                                r2.A04("screen_width", (Double) A014.A01(C271774jZ.A7n));
                                r75.A02(r2, "media_layout");
                            }
                            String A0520 = r62.A05("pk");
                            if (A0520 != null) {
                                r75.A05("pk", C263944Ny.A00(A0520).A00);
                            }
                            r75.A06("release_channel", (String) A013.A01(C271774jZ.A7c));
                            r75.A06("sessions_chain", (String) A013.A01(C271774jZ.A7w));
                            r75.A03("production_build", (Boolean) A013.A01(C271774jZ.A2h));
                            r75.A06("topic_cluster_id", (String) A013.A01(C271774jZ.A9D));
                            r75.A06("topic_cluster_title", (String) A013.A01(C271774jZ.A9F));
                            r75.A06("topic_cluster_type", (String) A013.A01(C271774jZ.A9G));
                            r75.A06("topic_cluster_debug_info", (String) A013.A01(C271774jZ.A9C));
                            r75.A06("ranking_info_token", (String) A013.A01(C271774jZ.A6p));
                            r75.A06("shopping_session_id", (String) A013.A01(C271774jZ.A80));
                            r75.A06("follow_status", (String) A013.A01(C271774jZ.A2v));
                            r75.A06("source_of_action", (String) A013.A01(C271774jZ.A8A));
                            r75.A04("elapsed_time_since_last_item", (Double) A013.A01(C271774jZ.A2P));
                            r75.A05("m_ts", (Long) A013.A01(r9));
                            r75.A03("is_acp_delivered", (Boolean) A013.A01(C271774jZ.A3t));
                            r75.A03("is_ad", (Boolean) A013.A01(C271774jZ.A3s));
                            String str34 = (String) A013.A01(C271774jZ.A5z);
                            if (str34 != null) {
                                l12 = Long.valueOf(Long.parseLong(str34));
                            } else {
                                l12 = null;
                            }
                            r75.A05("nav_in_transit", l12);
                            r75.A05("imp_logger_ver", (Long) A013.A01(C271774jZ.A3k));
                            r75.A05("reel_size", (Long) A013.A01(C271774jZ.A7V));
                            r75.A05("reel_position", (Long) A013.A01(C271774jZ.A7U));
                            r75.A05("tray_position", (Long) A013.A01(C271774jZ.A9P));
                            r75.A05("session_reel_counter", (Long) A013.A01(C271774jZ.A7y));
                            r75.A06("reel_type", (String) A013.A01(r24));
                            r75.A05("reel_viewer_position", (Long) A013.A01(C271774jZ.A7b));
                            r75.A04("time_elapsed", (Double) A013.A01(C271774jZ.A8z));
                            r75.A05("reel_start_position", (Long) A013.A01(C271774jZ.A7W));
                            r75.A03("is_video_to_carousel", (Boolean) A013.A01(C271774jZ.A4z));
                            r75.A06(XDX.A00(9, 10, 68), (String) A013.A01(C271774jZ.A7x));
                            r75.A06("story_ranking_token", (String) A013.A01(C271774jZ.A8O));
                            r75.A06("delivery_flags", (String) A013.A01(C271774jZ.A26));
                            r75.A03("is_eof", (Boolean) A013.A01(C271774jZ.A4G));
                            r75.A06("feed_request_id", (String) A013.A01(C271774jZ.A88));
                            r75.A06("entity_type", (String) A013.A01(C271774jZ.A2d));
                            r75.A05("entity_id", (Long) A013.A01(C271774jZ.A2Z));
                            r75.A06("entity_name", (String) A013.A01(C271774jZ.A2a));
                            r75.A06("entity_follow_status", (String) A013.A01(C271774jZ.A2Y));
                            r75.A06("mezql_token", (String) A013.A01(C271774jZ.A5g));
                            r75.A06("media_thumbnail_section", (String) A013.A01(C271774jZ.A5X));
                            r75.A06("entity_page_name", (String) A013.A01(C271774jZ.A2c));
                            String str35 = (String) A013.A01(C271774jZ.A2b);
                            if (str35 != null) {
                                l13 = Long.valueOf(Long.parseLong(str35));
                            } else {
                                l13 = null;
                            }
                            r75.A05("entity_page_id", l13);
                            ArrayList arrayList31 = (ArrayList) A013.A01(C271774jZ.A8j);
                            if (arrayList31 != null) {
                                ArrayList arrayList32 = new ArrayList(0Yv.A1E(arrayList31, 10));
                                Iterator it6 = arrayList31.iterator();
                                while (it6.hasNext()) {
                                    String str36 = (String) it6.next();
                                    0qQ.A0B(str36, 0);
                                    arrayList32.add(00y.A0n(10, str36));
                                }
                                arrayList4 = new ArrayList(00k.A0X(arrayList32));
                            } else {
                                arrayList4 = null;
                            }
                            r75.A07("tagged_user_ids", arrayList4);
                            r75.A06(AnonymousClass000.A00(1214), (String) A013.A01(C271774jZ.A1X));
                            r75.A05("carousel_size", (Long) A013.A01(C271774jZ.A15));
                            r75.A06("parent_m_pk", (String) A013.A01(C271774jZ.A6S));
                            r75.A05("carousel_media_type", (Long) A013.A01(C271774jZ.A12));
                            r75.A06("endpoint_type", (String) A013.A01(C271774jZ.A2R));
                            r75.A06("hashtag_follow_status", (String) A013.A01(C271774jZ.A3P));
                            r75.A03("is_igtv", (Boolean) A013.A01(C271774jZ.A4M));
                            String str37 = (String) A013.A01(C271774jZ.A5A);
                            if (str37 != null) {
                                l14 = Long.valueOf(Long.parseLong(str37));
                            } else {
                                l14 = null;
                            }
                            r75.A05("main_feed_carousel_starting_media_id", l14);
                            r75.A05("is_dark_mode", (Long) A013.A01(C271774jZ.A4B));
                            0j9 r34 = C271774jZ.A5P;
                            r75.A05("media_loading_progress", (Long) A013.A01(r34));
                            r75.A06("current_module", r62.A05("current_module"));
                            r75.A06("is_coming_from", (String) A013.A01(C271774jZ.A42));
                            r75.A04("time_remaining", (Double) A013.A01(C271774jZ.A94));
                            ArrayList A062 = r62.A06("shared_product_ids");
                            if (A062 == null) {
                                A062 = null;
                            }
                            r75.A07("shared_product_ids", A062);
                            r75.A03("is_highlights_sourced", (Boolean) A013.A01(C271774jZ.A4K));
                            r75.A05("media_loading_progress", (Long) A013.A01(r34));
                            String str38 = (String) A013.A01(C271774jZ.A6Z);
                            if (str38 != null) {
                                l15 = Long.valueOf(Long.parseLong(str38));
                            } else {
                                l15 = null;
                            }
                            r75.A05("post_id", l15);
                            String str39 = (String) A013.A01(C271774jZ.A9Q);
                            if (str39 != null) {
                                l16 = Long.valueOf(Long.parseLong(str39));
                            } else {
                                l16 = null;
                            }
                            r75.A05("tray_pos_excl_own_story", l16);
                            r75.A05("tab_index", (Long) A013.A01(C271774jZ.A8i));
                            r75.A06("igtv_viewer_session_id", (String) A013.A01(C271774jZ.A3h));
                            r75.A06("channel_pk", (String) A013.A01(C271774jZ.A1E));
                            r75.A06("collection_id", (String) A013.A01(C271774jZ.A1L));
                            r75.A06("collection_name", (String) A013.A01(C271774jZ.A1N));
                            r75.A06("audience", (String) A013.A01(C271774jZ.A0W));
                            r75.A03("impression_logger_validate", (Boolean) A013.A01(C271774jZ.A3i));
                            r75.A06("nav_chain", (String) A013.A01(C271774jZ.A60));
                            ArrayList arrayList33 = (ArrayList) A013.A01(C271774jZ.A8G);
                            if (arrayList33 != null) {
                                ArrayList arrayList34 = new ArrayList(0Yv.A1E(arrayList33, 10));
                                Iterator it7 = arrayList33.iterator();
                                while (it7.hasNext()) {
                                    String str40 = (String) it7.next();
                                    0qQ.A0B(str40, 0);
                                    arrayList34.add(00y.A0n(10, str40));
                                }
                                arrayList5 = new ArrayList(00k.A0X(arrayList34));
                            } else {
                                arrayList5 = null;
                            }
                            r75.A07("sponsor_tag_ids", arrayList5);
                            String A0521 = r62.A05("is_replay");
                            if (A0521 != null) {
                                bool3 = Boolean.valueOf(Boolean.parseBoolean(A0521));
                            } else {
                                bool3 = null;
                            }
                            r75.A03("is_replay", bool3);
                            r75.A06(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r62.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                            r75.A03("is_influencer", (Boolean) A013.A01(C271774jZ.A4O));
                            Long l100 = (Long) A013.A01(C271774jZ.A2O);
                            if (l100 == null) {
                                l100 = null;
                            }
                            r75.A05("effect_id", l100);
                            Long l101 = (Long) A013.A01(C271774jZ.A5G);
                            if (l101 == null) {
                                l101 = null;
                            }
                            r75.A05("media_face_effect_id", l101);
                            r75.A05("carousel_media_type", (Long) A013.A01(C271774jZ.A13));
                            r75.A06("reply_type", r62.A05("reply_type"));
                            r75.A05("media_id", (Long) A013.A01(C271774jZ.A5K));
                            r75.A05("media_author_id", (Long) A013.A01(C271774jZ.A5E));
                            r75.A06("surface", r62.A05("surface"));
                            String A0522 = r62.A05("has_ad_inserted");
                            if (A0522 != null) {
                                bool4 = Boolean.valueOf(Boolean.parseBoolean(A0522));
                            } else {
                                bool4 = null;
                            }
                            r75.A03("has_ad_inserted", bool4);
                            r75.A06("source_channel_type", r62.A05("source_channel_type"));
                            r75.A06("component_type", r62.A05("component_type"));
                            String A0523 = r62.A05("video_y_position");
                            if (A0523 != null) {
                                l17 = Long.valueOf(Long.parseLong(A0523));
                            } else {
                                l17 = null;
                            }
                            r75.A05("video_y_position", l17);
                            r75.A05("ad_id", (Long) A013.A01(C271774jZ.A0C));
                            r75.A05("top_liker_count", (Long) A013.A01(C271774jZ.A9J));
                            String str41 = (String) A013.A01(C271774jZ.A2i);
                            if (str41 != null) {
                                l18 = Long.valueOf(Long.parseLong(str41));
                            } else {
                                l18 = null;
                            }
                            r75.A05("e_counter_channel", l18);
                            String str42 = (String) A013.A01(C271774jZ.A2j);
                            if (str42 != null) {
                                l19 = Long.valueOf(Long.parseLong(str42));
                            } else {
                                l19 = null;
                            }
                            r75.A05("e_counter_id", l19);
                            String str43 = (String) A013.A01(C271774jZ.A2k);
                            if (str43 != null) {
                                l20 = Long.valueOf(Long.parseLong(str43));
                            } else {
                                l20 = null;
                            }
                            r75.A05("e_counter_sid", l20);
                            r75.A03("is_besties_reel", (Boolean) A013.A01(C271774jZ.A40));
                            r75.A06("igtv_destination_session_id", r62.A05("igtv_destination_session_id"));
                            r75.A06("is_programmatic_scroll", (String) A013.A01(C271774jZ.A4g));
                            String A0524 = r62.A05("is_live_streaming");
                            if (A0524 != null) {
                                l21 = Long.valueOf(Long.parseLong(A0524));
                            } else {
                                l21 = null;
                            }
                            r75.A05("is_live_streaming", l21);
                            Long l102 = (Long) A013.A01(C271774jZ.A68);
                            if (l102 != null) {
                                d2 = Double.valueOf((double) l102.longValue());
                            } else {
                                d2 = null;
                            }
                            r75.A04("normalized_feed_position", d2);
                            String str44 = (String) A013.A01(C271774jZ.A01);
                            if (str44 != null) {
                                l22 = Long.valueOf(Long.parseLong(str44));
                            } else {
                                l22 = null;
                            }
                            r75.A05("actor_id", l22);
                            String A0525 = r62.A05("is_live_questions");
                            if (A0525 != null) {
                                l23 = Long.valueOf(Long.parseLong(A0525));
                            } else {
                                l23 = null;
                            }
                            r75.A05("is_live_questions", l23);
                            r75.A06("feed_type", r62.A05("feed_type"));
                            r75.A06("impression_token", r62.A05("impression_token"));
                            r75.A03("is_besties_media", (Boolean) A013.A01(C271774jZ.A3z));
                            r75.A03("is_image_loaded", (Boolean) A013.A01(C271774jZ.A4N));
                            r75.A06("media_tags_hashtag_name", (String) A013.A01(C271774jZ.A5V));
                            r75.A05("media_tags_total_hashtags", (Long) A013.A01(C271774jZ.A5W));
                            r75.A06("igtv_browse_session_id", r62.A05("igtv_browse_session_id"));
                            r75.A06("is_on_screen", r62.A05("is_on_screen"));
                            String str45 = (String) A013.A01(C271774jZ.A9Y);
                            if (str45 != null) {
                                l24 = Long.valueOf(Long.parseLong(str45));
                            } else {
                                l24 = null;
                            }
                            r75.A05("upcoming_event_id", l24);
                            r75.A06("product", r62.A05("product"));
                            String A0526 = r62.A05("guest_id");
                            if (A0526 != null) {
                                l25 = Long.valueOf(Long.parseLong(A0526));
                            } else {
                                l25 = null;
                            }
                            r75.A05("guest_id", l25);
                            r75.A04("media_dwell_time", (Double) A013.A01(C271774jZ.A5F));
                            r75.A04("media_time_elapsed", (Double) A013.A01(C271774jZ.A5Y));
                            r75.A04("media_time_paused", (Double) A013.A01(C271774jZ.A5T));
                            r75.A04("media_time_remaining", (Double) A013.A01(C271774jZ.A5Z));
                            r75.A04("media_time_to_load", (Double) A013.A01(C271774jZ.A5Q));
                            r75.A06("search_session_id", (String) A013.A01(C271774jZ.A7p));
                            r75.A05("reel_gap_to_last_ad", (Long) A013.A01(C271774jZ.A7R));
                            r75.A05("reel_gap_to_last_netego", (Long) A013.A01(C271774jZ.A7S));
                            r75.A06("entity_page_type", r62.A05("entity_page_type"));
                            r75.A06("rank_token", (String) A013.A01(C271774jZ.A6r));
                            r75.A05("min_consumed_media_gap_to_previous_ad", (Long) A013.A01(C271774jZ.A5h));
                            r75.A05("min_consumed_media_gap_to_previous_netego", (Long) A013.A01(C271774jZ.A5i));
                            r75.A05("min_consumed_reel_gap_to_previous_ad", (Long) A013.A01(C271774jZ.A5j));
                            r75.A05("min_consumed_reel_gap_to_previous_netego", (Long) A013.A01(C271774jZ.A5k));
                            r75.A05("media_type", (Long) A013.A01(r82));
                            ArrayList arrayList35 = (ArrayList) A013.A01(C271774jZ.A2H);
                            if (arrayList35 != null) {
                                ArrayList arrayList36 = new ArrayList(0Yv.A1E(arrayList35, 10));
                                Iterator it8 = arrayList35.iterator();
                                while (it8.hasNext()) {
                                    String str46 = (String) it8.next();
                                    0qQ.A0B(str46, 0);
                                    arrayList36.add(00y.A0n(10, str46));
                                }
                                arrayList6 = new ArrayList(00k.A0X(arrayList36));
                            } else {
                                arrayList6 = null;
                            }
                            r75.A07("drops_product_ids", arrayList6);
                            r75.A06("sponsored_label_text", (String) A013.A01(C271774jZ.A8D));
                            r75.A06("containermodule", r62.A05("container_module"));
                            r75.A06("delivery_class", r62.A05("delivery_class"));
                            r75.A06(TraceFieldType.AdhocEventName, r62.A05(TraceFieldType.AdhocEventName));
                            r75.A06("frontend_env", r62.A05("frontend_env"));
                            String A0527 = r62.A05("is_id");
                            if (A0527 != null) {
                                bool5 = Boolean.valueOf(Boolean.parseBoolean(A0527));
                            } else {
                                bool5 = null;
                            }
                            r75.A03("is_id", bool5);
                            r75.A06("media_type_name", r62.A05("media_type_name"));
                            r75.A06("original_referrer", r62.A05("original_referrer"));
                            r75.A06("original_referrer_domain", r62.A05("original_referrer_domain"));
                            r75.A06("primary_locale", r62.A05("primary_locale"));
                            r75.A06("referrer", r62.A05("referrer"));
                            r75.A06("referrer_domain", r62.A05("referrer_domain"));
                            r75.A06("rollout_hash", r62.A05("rollout_hash"));
                            r75.A06("url", (String) A013.A01(C271774jZ.A9a));
                            r75.A06("explore_topic_session_id", (String) A013.A01(C271774jZ.A2g));
                            String A0528 = r62.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A0528 != null) {
                                l26 = Long.valueOf(Long.parseLong(A0528));
                            } else {
                                l26 = null;
                            }
                            r75.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, l26);
                            r75.A06("a_i", (String) A013.A01(C271774jZ.A9M));
                            String A0529 = r62.A05(TraceFieldType.BroadcastId);
                            if (A0529 != null) {
                                l27 = Long.valueOf(Long.parseLong(A0529));
                            } else {
                                l27 = null;
                            }
                            r75.A05(TraceFieldType.BroadcastId, l27);
                            String A0530 = r62.A05("is_top_post");
                            if (A0530 != null) {
                                bool6 = Boolean.valueOf(Boolean.parseBoolean(A0530));
                            } else {
                                bool6 = null;
                            }
                            r75.A03("is_top_post", bool6);
                            String A0531 = r62.A05("live_donation");
                            if (A0531 != null) {
                                l28 = Long.valueOf(Long.parseLong(A0531));
                            } else {
                                l28 = null;
                            }
                            r75.A05("live_donation", l28);
                            r75.A06("video_type", (String) A013.A01(C271774jZ.A9h));
                            r75.A03("is_pride_media", (Boolean) A013.A01(C271774jZ.A4d));
                            r75.A05("next_max_id", (Long) A013.A01(C271774jZ.A65));
                            Integer num4 = (Integer) A013.A01(C271774jZ.A1z);
                            if (num4 != null) {
                                l29 = Long.valueOf((long) num4.intValue());
                            } else {
                                l29 = null;
                            }
                            r75.A05("dark_mode_state", l29);
                            String A0532 = r62.A05("within_stories_self_view");
                            if (A0532 != null) {
                                bool7 = Boolean.valueOf(Boolean.parseBoolean(A0532));
                            } else {
                                bool7 = null;
                            }
                            r75.A03("within_stories_self_view", bool7);
                            r75.A06("discovery_session_id", (String) A013.A01(C271774jZ.A2F));
                            String A0533 = r62.A05("nt");
                            if (A0533 != null) {
                                l30 = Long.valueOf(Long.parseLong(A0533));
                            } else {
                                l30 = null;
                            }
                            r75.A05("nt", l30);
                            r75.A06("algorithm", r62.A05("algorithm"));
                            r75.A06("position", r62.A05("position"));
                            String A0534 = r62.A05("is_dash_eligible");
                            if (A0534 != null) {
                                l31 = Long.valueOf(Long.parseLong(A0534));
                            } else {
                                l31 = null;
                            }
                            r75.A05("is_dash_eligible", l31);
                            r75.A06("playback_format", r62.A05("playback_format"));
                            r75.A03("is_internal_build", (Boolean) A013.A01(C271774jZ.A4P));
                            String str47 = (String) A013.A01(C271774jZ.A5R);
                            if (str47 != null) {
                                l32 = Long.valueOf(Long.parseLong(str47));
                            } else {
                                l32 = null;
                            }
                            r75.A05("media_owner_id", l32);
                            r75.A06("counter_channel", (String) A013.A01(C271774jZ.A1f));
                            String str48 = (String) A013.A01(C271774jZ.A1g);
                            if (str48 != null) {
                                l33 = Long.valueOf(Long.parseLong(str48));
                            } else {
                                l33 = null;
                            }
                            r75.A05("counter_id", l33);
                            String str49 = (String) A013.A01(C271774jZ.A1h);
                            if (str49 != null) {
                                l34 = Long.valueOf(Long.parseLong(str49));
                            } else {
                                l34 = null;
                            }
                            r75.A05("counter_sid", l34);
                            r75.A06("tray_rank_token", r62.A05("tray_rank_token"));
                            String A0535 = r62.A05("video_x_position");
                            if (A0535 != null) {
                                l35 = Long.valueOf(Long.parseLong(A0535));
                            } else {
                                l35 = null;
                            }
                            r75.A05("video_x_position", l35);
                            r75.A05("gap_to_last_ad", (Long) A013.A01(C271774jZ.A33));
                            Long l103 = (Long) A013.A01(C271774jZ.A34);
                            if (l103 == null) {
                                l103 = null;
                            }
                            r75.A05("gap_to_last_netego", l103);
                            r75.A03("is_holdout", (Boolean) A013.A01(C271774jZ.A4L));
                            r75.A05("top_followers_count", (Long) A013.A01(C271774jZ.A9H));
                            r75.A05("top_likers_count", (Long) A013.A01(C271774jZ.A9I));
                            r75.A05("dr_ad_type", (Long) A013.A01(C271774jZ.A2J));
                            r75.A06("impression_type", (String) A013.A01(C271774jZ.A3j));
                            r75.A06("async_ad_source", (String) A013.A01(C271774jZ.A0V));
                            r75.A03("is_pride_reel", (Boolean) A013.A01(C271774jZ.A4e));
                            r75.A05("carousel_opt_in_position", (Long) A013.A01(C271774jZ.A14));
                            r75.A06("camera_session_id", r62.A05("camera_session_id"));
                            r75.A06("chaining_feed_session_id", r62.A05("chaining_feed_session_id"));
                            String A0536 = r62.A05("is_main_feed_client_bump_item");
                            if (A0536 != null) {
                                bool8 = Boolean.valueOf(Boolean.parseBoolean(A0536));
                            } else {
                                bool8 = null;
                            }
                            r75.A03("is_main_feed_client_bump_item", bool8);
                            String str50 = (String) A013.A01(C271774jZ.A8I);
                            if (str50 != null) {
                                l36 = Long.valueOf(Long.parseLong(str50));
                            } else {
                                l36 = null;
                            }
                            r75.A05("sponsor_tag_id", l36);
                            r75.A06("byline_text", (String) A013.A01(C271774jZ.A0l));
                            String A0537 = r62.A05("pwa");
                            if (A0537 != null) {
                                bool9 = Boolean.valueOf(Boolean.parseBoolean(A0537));
                            } else {
                                bool9 = null;
                            }
                            r75.A03("pwa", bool9);
                            r75.A05("ad_inserted_position", (Long) A013.A01(C271774jZ.A0D));
                            r75.A05("ad_position_from_server", (Long) A013.A01(C271774jZ.A0I));
                            r75.A05("ad_received_position", (Long) A013.A01(C271774jZ.A0J));
                            r75.A05("ad_request_position", (Long) A013.A01(C271774jZ.A0L));
                            String str51 = (String) A013.A01(C271774jZ.A0j);
                            if (str51 != null) {
                                l97 = Long.valueOf(Long.parseLong(str51));
                            }
                            r75.A05("business_app_id", l97);
                            r75.A05("reel_viewer_entry_position", (Long) A013.A01(C271774jZ.A7Z));
                            r72 = r75;
                        } catch (ClassCastException unused2) {
                            r72 = new 0bb();
                        }
                        str2 = "ig_impression";
                        r7 = r72;
                    } else if (intValue == 1) {
                        try {
                            0xF r63 = BGZ.A00().A06;
                            0jB A015 = BGZ.A01();
                            0bb r76 = new 0bb();
                            String str52 = (String) A015.A01(C271774jZ.A0Y);
                            Long l104 = null;
                            if (str52 != null) {
                                l41 = C263944Ny.A00(str52).A00;
                            } else {
                                l41 = null;
                            }
                            r76.A05("a_pk", l41);
                            r76.A05("c_pk", C297365rd.A00((String) A015.A01(C271774jZ.A1V)));
                            String str53 = (String) A015.A01(C271774jZ.A1S);
                            if (str53 != null) {
                                l42 = C263944Ny.A00(str53).A00;
                            } else {
                                l42 = null;
                            }
                            r76.A05("ca_pk", l42);
                            r76.A05("parent_c_pk", C297365rd.A00((String) A015.A01(C271774jZ.A6Q)));
                            r76.A03("is_covered", (Boolean) A015.A01(C271774jZ.A43));
                            r76.A05("like_count", (Long) A015.A01(C271774jZ.A57));
                            r76.A03("is_media_organic", (Boolean) A015.A01(C271774jZ.A4X));
                            r76.A06("c_index", (String) A015.A01(C271774jZ.A1W));
                            String A0538 = r63.A05("sponsor_tag_count");
                            if (A0538 != null) {
                                l43 = Long.valueOf(Long.parseLong(A0538));
                            } else {
                                l43 = null;
                            }
                            r76.A05("sponsor_tag_count", l43);
                            r76.A06("m_pk", (String) A015.A01(C271774jZ.A5I));
                            r76.A06("tracking_token", (String) A015.A01(C271774jZ.A9L));
                            0j9 r83 = C271774jZ.A5a;
                            r76.A05("m_t", (Long) A015.A01(r83));
                            String A0539 = r63.A05("hashtag_id");
                            if (A0539 != null) {
                                l44 = Long.valueOf(Long.parseLong(A0539));
                            } else {
                                l44 = null;
                            }
                            r76.A05("hashtag_id", l44);
                            r76.A07("feed_sticker_media_id", (List) A015.A01(C271774jZ.A2q));
                            r76.A06("inventory_source", (String) A015.A01(C271774jZ.A3q));
                            r76.A05("carousel_index", (Long) A015.A01(C271774jZ.A0z));
                            String str54 = (String) A015.A01(C271774jZ.A3x);
                            if (str54 != null) {
                                bool11 = Boolean.valueOf(Boolean.parseBoolean(str54));
                            } else {
                                bool11 = null;
                            }
                            r76.A03("is_app_backgrounded", bool11);
                            r76.A06("last_navigation_module", (String) A015.A01(C271774jZ.A56));
                            r76.A06("application_state", (String) A015.A01(C271774jZ.A0Q));
                            r76.A06("hashtag_name", (String) A015.A01(C271774jZ.A3Q));
                            r76.A06("hashtag_feed_type", (String) A015.A01(C271774jZ.A3N));
                            r76.A06("carousel_media_id", (String) A015.A01(C271774jZ.A10));
                            r76.A05("carousel_starting_media_id", (Long) A015.A01(C271774jZ.A16));
                            r76.A06("carousel_cover_media_id", (String) A015.A01(C271774jZ.A0x));
                            r76.A06("reel_id", (String) A015.A01(C271774jZ.A7T));
                            r76.A06("tray_session_id", (String) A015.A01(C271774jZ.A7X));
                            r76.A06("viewer_session_id", (String) A015.A01(C271774jZ.A9i));
                            r76.A06("ranking_session_id", (String) A015.A01(C271774jZ.A6q));
                            r76.A06("chaining_session_id", (String) A015.A01(C271774jZ.A1C));
                            r76.A05("chaining_position", (Long) A015.A01(C271774jZ.A1A));
                            r76.A06("action", (String) A015.A01(C271774jZ.A00));
                            r76.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) A015.A01(C271774jZ.A2e));
                            String A003 = AnonymousClass000.A00(267);
                            r76.A06(A003, r63.A05(A003));
                            r76.A03("is_checkout_enabled", (Boolean) A015.A01(C271774jZ.A41));
                            String A0540 = r63.A05("can_add_to_bag");
                            if (A0540 != null) {
                                bool12 = Boolean.valueOf(Boolean.parseBoolean(A0540));
                            } else {
                                bool12 = null;
                            }
                            r76.A03("can_add_to_bag", bool12);
                            String str55 = (String) A015.A01(C271774jZ.A5e);
                            if (str55 != null) {
                                l45 = C263944Ny.A00(str55).A00;
                            } else {
                                l45 = null;
                            }
                            r76.A05("merchant_id", l45);
                            r76.A06("prior_module", (String) A015.A01(C271774jZ.A6h));
                            String str56 = (String) A015.A01(C271774jZ.A6i);
                            if (str56 != null) {
                                l46 = Long.valueOf(Long.parseLong(str56));
                            } else {
                                l46 = null;
                            }
                            r76.A05("product_id", l46);
                            ArrayList arrayList37 = (ArrayList) A015.A01(C271774jZ.A6j);
                            if (arrayList37 != null) {
                                ArrayList arrayList38 = new ArrayList(0Yv.A1E(arrayList37, 10));
                                Iterator it9 = arrayList37.iterator();
                                while (it9.hasNext()) {
                                    String str57 = (String) it9.next();
                                    0qQ.A0B(str57, 0);
                                    arrayList38.add(00y.A0n(10, str57));
                                }
                                arrayList7 = new ArrayList(00k.A0X(arrayList38));
                            } else {
                                arrayList7 = null;
                            }
                            r76.A07("product_ids", arrayList7);
                            r76.A05("m_ix", (Long) A015.A01(C271774jZ.A3m));
                            String str58 = (String) A015.A01(C271774jZ.A3e);
                            if (str58 != null) {
                                l47 = Long.valueOf(Long.parseLong(str58));
                            } else {
                                l47 = null;
                            }
                            r76.A05("chaining_seed_media_id", l47);
                            r76.A05("chaining_seed_author_id", (Long) A015.A01(C271774jZ.A1B));
                            r76.A05("reel_gap", (Long) A015.A01(C271774jZ.A7P));
                            r76.A06("event_trace_id", (String) A015.A01(C271774jZ.A2f));
                            r76.A06("host_video_pk", (String) A015.A01(C271774jZ.A3a));
                            r76.A06("media_layout_encoded_string", (String) A015.A01(C271774jZ.A5O));
                            r76.A03("mop_should_double_logging", (Boolean) A015.A01(C271774jZ.A5n));
                            r76.A03("mop_should_rollout", (Boolean) A015.A01(C271774jZ.A5o));
                            r76.A03("is_zoomed_out", (Boolean) A015.A01(C271774jZ.A50));
                            ArrayList arrayList39 = (ArrayList) A015.A01(C271774jZ.A1e);
                            if (arrayList39 != null) {
                                ArrayList arrayList40 = new ArrayList(0Yv.A1E(arrayList39, 10));
                                Iterator it10 = arrayList39.iterator();
                                while (it10.hasNext()) {
                                    arrayList40.add(0Yt.A03((HashMap) it10.next()));
                                }
                                arrayList8 = 00k.A0U(arrayList40);
                            } else {
                                arrayList8 = null;
                            }
                            r76.A07("client_ad_creative_optimization_output", arrayList8);
                            r76.A03("is_previewable_video_ad", (Boolean) A015.A01(C271774jZ.A4b));
                            r76.A06("ad_skip_type", (String) A015.A01(C271774jZ.A0M));
                            r76.A03("is_cta_sticker_available", (Boolean) A015.A01(C271774jZ.A44));
                            r76.A03("is_cta_sticker_shown", (Boolean) A015.A01(C271774jZ.A47));
                            r76.A03("is_sensitive_vertical_ad", (Boolean) A015.A01(C271774jZ.A4o));
                            r76.A03("post_impression_column_override", (Boolean) A015.A01(C271774jZ.A6O));
                            r76.A06("radio_type", (String) A015.A01(C271774jZ.A6o));
                            String str59 = (String) A015.A01(C271774jZ.A7q);
                            if (str59 != null) {
                                l48 = Long.valueOf(Long.parseLong(str59));
                            } else {
                                l48 = null;
                            }
                            r76.A05("seed_ad_id", l48);
                            String str60 = (String) A015.A01(C271774jZ.A3b);
                            if (str60 != null) {
                                l49 = Long.valueOf(Long.parseLong(str60));
                            } else {
                                l49 = null;
                            }
                            r76.A05("hscroll_seed_ad_id", l49);
                            String str61 = (String) A015.A01(C271774jZ.A2u);
                            if (str61 != null) {
                                l50 = Long.valueOf(Long.parseLong(str61));
                            } else {
                                l50 = null;
                            }
                            r76.A05("first_hscroll_item_ad_id", l50);
                            r76.A05("horizontal_position_on_hscroll", (Long) A015.A01(C271774jZ.A3W));
                            r76.A05("vertical_position_on_feed_of_ads", (Long) A015.A01(C271774jZ.A9d));
                            r76.A03("is_multi_ads", (Boolean) A015.A01(C271774jZ.A4V));
                            r76.A05("multi_ads_type", (Long) A015.A01(C271774jZ.A5w));
                            r76.A06("multi_ads_id", (String) A015.A01(C271774jZ.A5u));
                            r76.A05("position_in_multi_ads_unit", (Long) A015.A01(C271774jZ.A6Y));
                            String str62 = (String) A015.A01(C271774jZ.A5t);
                            if (str62 != null) {
                                l51 = Long.valueOf(Long.parseLong(str62));
                            } else {
                                l51 = null;
                            }
                            r76.A05("multi_ads_first_ad_id", l51);
                            r76.A05("ad_consumed_media_gap", (Long) A015.A01(C271774jZ.A06));
                            r76.A05("netego_consumed_media_gap", (Long) A015.A01(C271774jZ.A61));
                            r76.A05("priority_index", (Long) A015.A01(C271774jZ.A6g));
                            r76.A05("highest_position_rule", (Long) A015.A01(C271774jZ.A3U));
                            r76.A05("max_reel_gap_to_previous_item", (Long) A015.A01(C271774jZ.A5B));
                            r76.A05("min_media_gap_to_previous_item", (Long) A015.A01(C271774jZ.A5l));
                            r76.A04("time_gap_to_previous_item_in_sec", (Double) A015.A01(C271774jZ.A91));
                            r76.A05("consumed_media_gap", (Long) A015.A01(C271774jZ.A1Z));
                            r76.A05("consumed_media_gap_highest_position", (Long) A015.A01(C271774jZ.A1a));
                            r76.A05("reel_gap_highest_position", (Long) A015.A01(C271774jZ.A7Q));
                            r76.A06("previous_media_pk", (String) A015.A01(C271774jZ.A6a));
                            r76.A06("next_media_pk", (String) A015.A01(C271774jZ.A66));
                            r76.A05("segment_index", (Long) A015.A01(C271774jZ.A7s));
                            r76.A05("segment_count", (Long) A015.A01(C271774jZ.A7r));
                            r76.A06("ad_pod_id", (String) A015.A01(C271774jZ.A0G));
                            r76.A05("index_in_ad_pod", (Long) A015.A01(C271774jZ.A3n));
                            ArrayList arrayList41 = (ArrayList) A015.A01(C271774jZ.A9g);
                            if (arrayList41 != null) {
                                ArrayList arrayList42 = new ArrayList(0Yv.A1E(arrayList41, 10));
                                Iterator it11 = arrayList41.iterator();
                                while (it11.hasNext()) {
                                    arrayList42.add(012.A0p((String) it11.next()));
                                }
                                arrayList9 = new ArrayList(00k.A0X(arrayList42));
                            } else {
                                arrayList9 = null;
                            }
                            r76.A07("video_to_carousel_cut_secs", arrayList9);
                            r76.A05("seq_num", (Long) A015.A01(C271774jZ.A7t));
                            r76.A06("disclaimer_text", (String) A015.A01(C271774jZ.A2C));
                            r76.A06("disclaimer_title", (String) A015.A01(C271774jZ.A2D));
                            r76.A05("carousel_type", (Long) A015.A01(C271774jZ.A19));
                            r76.A05("has_top_likers", (Long) A015.A01(C271774jZ.A3T));
                            r76.A05("ad_delivery_position", (Long) A015.A01(C271774jZ.A0A));
                            r76.A03("is_first_ad_in_the_session", (Boolean) A015.A01(C271774jZ.A4H));
                            r76.A05("seq_session", (Long) A015.A01(C271774jZ.A7u));
                            r76.A06("cache_key", (String) A015.A01(C271774jZ.A0m));
                            r76.A06("call_stack", (String) A015.A01(C271774jZ.A0n));
                            r76.A04("time_interval_since_reference_date", (Double) A015.A01(C271774jZ.A92));
                            0j9 r92 = C271774jZ.A8x;
                            Long l105 = (Long) A015.A01(r92);
                            if (l105 != null) {
                                d11 = Double.valueOf((double) l105.longValue());
                            } else {
                                d11 = null;
                            }
                            r76.A04("time_stamp", d11);
                            r76.A06("disclaimer_url", (String) A015.A01(C271774jZ.A2E));
                            r76.A06("next_inventory_source", (String) A015.A01(C271774jZ.A67));
                            r76.A06("prev_inventory_source", (String) A015.A01(C271774jZ.A6b));
                            0jB A016 = A015.A01(C271774jZ.A5N);
                            if (A016 != null) {
                                0xF A004 = A016.A00();
                                0bb r23 = new 0bb();
                                r23.A03("is_showreel_native", (Boolean) A016.A01(C271774jZ.A4p));
                                String A0541 = A004.A05("media_height");
                                Long l106 = null;
                                if (A0541 != null) {
                                    d13 = Double.valueOf(Double.parseDouble(A0541));
                                } else {
                                    d13 = null;
                                }
                                r23.A04("media_height", d13);
                                String A0542 = A004.A05("media_width");
                                if (A0542 != null) {
                                    d14 = Double.valueOf(Double.parseDouble(A0542));
                                } else {
                                    d14 = null;
                                }
                                r23.A04("media_width", d14);
                                String A0543 = A004.A05("caption_font_size");
                                if (A0543 != null) {
                                    d15 = Double.valueOf(Double.parseDouble(A0543));
                                } else {
                                    d15 = null;
                                }
                                r23.A04("caption_font_size", d15);
                                String A0544 = A004.A05("caption_position_start_x");
                                if (A0544 != null) {
                                    d16 = Double.valueOf(Double.parseDouble(A0544));
                                } else {
                                    d16 = null;
                                }
                                r23.A04("caption_position_start_x", d16);
                                String A0545 = A004.A05("caption_position_start_y");
                                if (A0545 != null) {
                                    d17 = Double.valueOf(Double.parseDouble(A0545));
                                } else {
                                    d17 = null;
                                }
                                r23.A04("caption_position_start_y", d17);
                                String A0546 = A004.A05("caption_line_height");
                                if (A0546 != null) {
                                    d18 = Double.valueOf(Double.parseDouble(A0546));
                                } else {
                                    d18 = null;
                                }
                                r23.A04("caption_line_height", d18);
                                String A0547 = A004.A05("caption_line_height");
                                if (A0547 != null) {
                                    d19 = Double.valueOf(Double.parseDouble(A0547));
                                } else {
                                    d19 = null;
                                }
                                r23.A04("caption_height", d19);
                                String A0548 = A004.A05("caption_width");
                                if (A0548 != null) {
                                    d20 = Double.valueOf(Double.parseDouble(A0548));
                                } else {
                                    d20 = null;
                                }
                                r23.A04("caption_width", d20);
                                String A0549 = A004.A05("is_caption_fully_displayed");
                                if (A0549 != null) {
                                    bool20 = Boolean.valueOf(Boolean.parseBoolean(A0549));
                                } else {
                                    bool20 = null;
                                }
                                r23.A03("is_caption_fully_displayed", bool20);
                                r23.A06("background_color_bottom", A004.A05("background_color_bottom"));
                                r23.A06("background_color_caption", A004.A05("background_color_caption"));
                                r23.A06("background_color_top", A004.A05("background_color_top"));
                                r23.A06("caption_background_color_alpha", A004.A05("caption_background_color_alpha"));
                                String A0550 = A004.A05("caption_num_char_showed");
                                if (A0550 != null) {
                                    l77 = Long.valueOf(Long.parseLong(A0550));
                                } else {
                                    l77 = null;
                                }
                                r23.A05("caption_num_char_showed", l77);
                                String A0551 = A004.A05("caption_num_hashtags_showed");
                                if (A0551 != null) {
                                    l78 = Long.valueOf(Long.parseLong(A0551));
                                } else {
                                    l78 = null;
                                }
                                r23.A05("caption_num_hashtags_showed", l78);
                                String A0552 = A004.A05("caption_num_lines_showed");
                                if (A0552 != null) {
                                    l79 = Long.valueOf(Long.parseLong(A0552));
                                } else {
                                    l79 = null;
                                }
                                r23.A05("caption_num_lines_showed", l79);
                                String A0553 = A004.A05("caption_num_lines_total");
                                if (A0553 != null) {
                                    l80 = Long.valueOf(Long.parseLong(A0553));
                                } else {
                                    l80 = null;
                                }
                                r23.A05("caption_num_lines_total", l80);
                                String A0554 = A004.A05("caption_num_mentions_showed");
                                if (A0554 != null) {
                                    l106 = Long.valueOf(Long.parseLong(A0554));
                                }
                                r23.A05("caption_num_mentions_showed", l106);
                                r23.A06("caption_text_color", A004.A05("caption_text_color"));
                                r23.A06("cta_color", (String) A016.A01(C271774jZ.A1i));
                                r23.A06("headline_text_showed", A004.A05("headline_text_showed"));
                                r23.A04("screen_density", (Double) A016.A01(C271774jZ.A7l));
                                r23.A04("screen_height", (Double) A016.A01(C271774jZ.A7m));
                                r23.A04("screen_width", (Double) A016.A01(C271774jZ.A7n));
                                r76.A02(r23, "media_layout");
                            }
                            String A0555 = r63.A05("pk");
                            if (A0555 != null) {
                                r76.A05("pk", C263944Ny.A00(A0555).A00);
                            }
                            r76.A06("release_channel", (String) A015.A01(C271774jZ.A7c));
                            r76.A06("sessions_chain", (String) A015.A01(C271774jZ.A7w));
                            r76.A03("production_build", (Boolean) A015.A01(C271774jZ.A2h));
                            r76.A06("topic_cluster_id", (String) A015.A01(C271774jZ.A9D));
                            r76.A06("topic_cluster_title", (String) A015.A01(C271774jZ.A9F));
                            r76.A06("topic_cluster_type", (String) A015.A01(C271774jZ.A9G));
                            r76.A06("topic_cluster_debug_info", (String) A015.A01(C271774jZ.A9C));
                            r76.A06("ranking_info_token", (String) A015.A01(C271774jZ.A6p));
                            r76.A06("shopping_session_id", (String) A015.A01(C271774jZ.A80));
                            r76.A06("follow_status", (String) A015.A01(C271774jZ.A2v));
                            r76.A06("source_of_action", (String) A015.A01(C271774jZ.A8A));
                            r76.A04("elapsed_time_since_last_item", (Double) A015.A01(C271774jZ.A2P));
                            r76.A05("m_ts", (Long) A015.A01(r92));
                            r76.A03("is_acp_delivered", (Boolean) A015.A01(C271774jZ.A3t));
                            r76.A03("is_ad", (Boolean) A015.A01(C271774jZ.A3s));
                            String str63 = (String) A015.A01(C271774jZ.A5z);
                            if (str63 != null) {
                                l52 = Long.valueOf(Long.parseLong(str63));
                            } else {
                                l52 = null;
                            }
                            r76.A05("nav_in_transit", l52);
                            r76.A05("imp_logger_ver", (Long) A015.A01(C271774jZ.A3k));
                            r76.A05("reel_size", (Long) A015.A01(C271774jZ.A7V));
                            r76.A05("reel_position", (Long) A015.A01(C271774jZ.A7U));
                            r76.A05("tray_position", (Long) A015.A01(C271774jZ.A9P));
                            r76.A05("session_reel_counter", (Long) A015.A01(C271774jZ.A7y));
                            r76.A06("reel_type", (String) A015.A01(r24));
                            r76.A05("reel_viewer_position", (Long) A015.A01(C271774jZ.A7b));
                            r76.A04("time_elapsed", (Double) A015.A01(C271774jZ.A8z));
                            r76.A05("reel_start_position", (Long) A015.A01(C271774jZ.A7W));
                            r76.A03("is_video_to_carousel", (Boolean) A015.A01(C271774jZ.A4z));
                            r76.A06(XDX.A00(9, 10, 68), (String) A015.A01(C271774jZ.A7x));
                            r76.A06("story_ranking_token", (String) A015.A01(C271774jZ.A8O));
                            r76.A06("delivery_flags", (String) A015.A01(C271774jZ.A26));
                            r76.A03("is_eof", (Boolean) A015.A01(C271774jZ.A4G));
                            r76.A06("feed_request_id", (String) A015.A01(C271774jZ.A88));
                            r76.A06("entity_type", (String) A015.A01(C271774jZ.A2d));
                            r76.A05("entity_id", (Long) A015.A01(C271774jZ.A2Z));
                            r76.A06("entity_name", (String) A015.A01(C271774jZ.A2a));
                            r76.A06("entity_follow_status", (String) A015.A01(C271774jZ.A2Y));
                            r76.A06("mezql_token", (String) A015.A01(C271774jZ.A5g));
                            r76.A06("media_thumbnail_section", (String) A015.A01(C271774jZ.A5X));
                            r76.A06("entity_page_name", (String) A015.A01(C271774jZ.A2c));
                            String str64 = (String) A015.A01(C271774jZ.A2b);
                            if (str64 != null) {
                                l53 = Long.valueOf(Long.parseLong(str64));
                            } else {
                                l53 = null;
                            }
                            r76.A05("entity_page_id", l53);
                            ArrayList arrayList43 = (ArrayList) A015.A01(C271774jZ.A8j);
                            if (arrayList43 != null) {
                                ArrayList arrayList44 = new ArrayList(0Yv.A1E(arrayList43, 10));
                                Iterator it12 = arrayList43.iterator();
                                while (it12.hasNext()) {
                                    String str65 = (String) it12.next();
                                    0qQ.A0B(str65, 0);
                                    arrayList44.add(00y.A0n(10, str65));
                                }
                                arrayList10 = new ArrayList(00k.A0X(arrayList44));
                            } else {
                                arrayList10 = null;
                            }
                            r76.A07("tagged_user_ids", arrayList10);
                            r76.A06(AnonymousClass000.A00(1214), (String) A015.A01(C271774jZ.A1X));
                            r76.A05("carousel_size", (Long) A015.A01(C271774jZ.A15));
                            r76.A06("parent_m_pk", (String) A015.A01(C271774jZ.A6S));
                            r76.A05("carousel_media_type", (Long) A015.A01(C271774jZ.A12));
                            r76.A06("endpoint_type", (String) A015.A01(C271774jZ.A2R));
                            r76.A06("hashtag_follow_status", (String) A015.A01(C271774jZ.A3P));
                            r76.A03("is_igtv", (Boolean) A015.A01(C271774jZ.A4M));
                            String str66 = (String) A015.A01(C271774jZ.A5A);
                            if (str66 != null) {
                                l54 = Long.valueOf(Long.parseLong(str66));
                            } else {
                                l54 = null;
                            }
                            r76.A05("main_feed_carousel_starting_media_id", l54);
                            r76.A05("is_dark_mode", (Long) A015.A01(C271774jZ.A4B));
                            0j9 r35 = C271774jZ.A5P;
                            r76.A05("media_loading_progress", (Long) A015.A01(r35));
                            r76.A06("current_module", r63.A05("current_module"));
                            r76.A06("is_coming_from", (String) A015.A01(C271774jZ.A42));
                            r76.A04("time_remaining", (Double) A015.A01(C271774jZ.A94));
                            ArrayList A063 = r63.A06("shared_product_ids");
                            if (A063 == null) {
                                A063 = null;
                            }
                            r76.A07("shared_product_ids", A063);
                            r76.A03("is_highlights_sourced", (Boolean) A015.A01(C271774jZ.A4K));
                            r76.A05("media_loading_progress", (Long) A015.A01(r35));
                            String str67 = (String) A015.A01(C271774jZ.A6Z);
                            if (str67 != null) {
                                l55 = Long.valueOf(Long.parseLong(str67));
                            } else {
                                l55 = null;
                            }
                            r76.A05("post_id", l55);
                            String str68 = (String) A015.A01(C271774jZ.A9Q);
                            if (str68 != null) {
                                l56 = Long.valueOf(Long.parseLong(str68));
                            } else {
                                l56 = null;
                            }
                            r76.A05("tray_pos_excl_own_story", l56);
                            r76.A05("tab_index", (Long) A015.A01(C271774jZ.A8i));
                            r76.A06("igtv_viewer_session_id", (String) A015.A01(C271774jZ.A3h));
                            r76.A06("channel_pk", (String) A015.A01(C271774jZ.A1E));
                            r76.A06("collection_id", (String) A015.A01(C271774jZ.A1L));
                            r76.A06("collection_name", (String) A015.A01(C271774jZ.A1N));
                            r76.A06("audience", (String) A015.A01(C271774jZ.A0W));
                            r76.A03("impression_logger_validate", (Boolean) A015.A01(C271774jZ.A3i));
                            r76.A06("nav_chain", (String) A015.A01(C271774jZ.A60));
                            ArrayList arrayList45 = (ArrayList) A015.A01(C271774jZ.A8G);
                            if (arrayList45 != null) {
                                ArrayList arrayList46 = new ArrayList(0Yv.A1E(arrayList45, 10));
                                Iterator it13 = arrayList45.iterator();
                                while (it13.hasNext()) {
                                    String str69 = (String) it13.next();
                                    0qQ.A0B(str69, 0);
                                    arrayList46.add(00y.A0n(10, str69));
                                }
                                arrayList11 = new ArrayList(00k.A0X(arrayList46));
                            } else {
                                arrayList11 = null;
                            }
                            r76.A07("sponsor_tag_ids", arrayList11);
                            String A0556 = r63.A05("is_replay");
                            if (A0556 != null) {
                                bool13 = Boolean.valueOf(Boolean.parseBoolean(A0556));
                            } else {
                                bool13 = null;
                            }
                            r76.A03("is_replay", bool13);
                            r76.A06(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r63.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                            r76.A03("is_influencer", (Boolean) A015.A01(C271774jZ.A4O));
                            Long l107 = (Long) A015.A01(C271774jZ.A2O);
                            if (l107 == null) {
                                l107 = null;
                            }
                            r76.A05("effect_id", l107);
                            Long l108 = (Long) A015.A01(C271774jZ.A5G);
                            if (l108 == null) {
                                l108 = null;
                            }
                            r76.A05("media_face_effect_id", l108);
                            r76.A05("carousel_media_type", (Long) A015.A01(C271774jZ.A13));
                            r76.A06("reply_type", r63.A05("reply_type"));
                            r76.A05("media_id", (Long) A015.A01(C271774jZ.A5K));
                            r76.A05("media_author_id", (Long) A015.A01(C271774jZ.A5E));
                            r76.A06("surface", r63.A05("surface"));
                            String A0557 = r63.A05("has_ad_inserted");
                            if (A0557 != null) {
                                bool14 = Boolean.valueOf(Boolean.parseBoolean(A0557));
                            } else {
                                bool14 = null;
                            }
                            r76.A03("has_ad_inserted", bool14);
                            r76.A06("source_channel_type", r63.A05("source_channel_type"));
                            r76.A06("component_type", r63.A05("component_type"));
                            String A0558 = r63.A05("video_y_position");
                            if (A0558 != null) {
                                l57 = Long.valueOf(Long.parseLong(A0558));
                            } else {
                                l57 = null;
                            }
                            r76.A05("video_y_position", l57);
                            r76.A05("ad_id", (Long) A015.A01(C271774jZ.A0C));
                            r76.A05("top_liker_count", (Long) A015.A01(C271774jZ.A9J));
                            String str70 = (String) A015.A01(C271774jZ.A2i);
                            if (str70 != null) {
                                l58 = Long.valueOf(Long.parseLong(str70));
                            } else {
                                l58 = null;
                            }
                            r76.A05("e_counter_channel", l58);
                            String str71 = (String) A015.A01(C271774jZ.A2j);
                            if (str71 != null) {
                                l59 = Long.valueOf(Long.parseLong(str71));
                            } else {
                                l59 = null;
                            }
                            r76.A05("e_counter_id", l59);
                            String str72 = (String) A015.A01(C271774jZ.A2k);
                            if (str72 != null) {
                                l60 = Long.valueOf(Long.parseLong(str72));
                            } else {
                                l60 = null;
                            }
                            r76.A05("e_counter_sid", l60);
                            r76.A03("is_besties_reel", (Boolean) A015.A01(C271774jZ.A40));
                            r76.A06("igtv_destination_session_id", r63.A05("igtv_destination_session_id"));
                            r76.A06("is_programmatic_scroll", (String) A015.A01(C271774jZ.A4g));
                            String A0559 = r63.A05("is_live_streaming");
                            if (A0559 != null) {
                                l61 = Long.valueOf(Long.parseLong(A0559));
                            } else {
                                l61 = null;
                            }
                            r76.A05("is_live_streaming", l61);
                            Long l109 = (Long) A015.A01(C271774jZ.A68);
                            if (l109 != null) {
                                d12 = Double.valueOf((double) l109.longValue());
                            } else {
                                d12 = null;
                            }
                            r76.A04("normalized_feed_position", d12);
                            String str73 = (String) A015.A01(C271774jZ.A01);
                            if (str73 != null) {
                                l62 = Long.valueOf(Long.parseLong(str73));
                            } else {
                                l62 = null;
                            }
                            r76.A05("actor_id", l62);
                            String A0560 = r63.A05("is_live_questions");
                            if (A0560 != null) {
                                l63 = Long.valueOf(Long.parseLong(A0560));
                            } else {
                                l63 = null;
                            }
                            r76.A05("is_live_questions", l63);
                            r76.A06("feed_type", r63.A05("feed_type"));
                            r76.A06("impression_token", r63.A05("impression_token"));
                            r76.A03("is_besties_media", (Boolean) A015.A01(C271774jZ.A3z));
                            r76.A03("is_image_loaded", (Boolean) A015.A01(C271774jZ.A4N));
                            r76.A06("media_tags_hashtag_name", (String) A015.A01(C271774jZ.A5V));
                            r76.A05("media_tags_total_hashtags", (Long) A015.A01(C271774jZ.A5W));
                            r76.A06("igtv_browse_session_id", r63.A05("igtv_browse_session_id"));
                            r76.A06("is_on_screen", r63.A05("is_on_screen"));
                            String str74 = (String) A015.A01(C271774jZ.A9Y);
                            if (str74 != null) {
                                l64 = Long.valueOf(Long.parseLong(str74));
                            } else {
                                l64 = null;
                            }
                            r76.A05("upcoming_event_id", l64);
                            r76.A06("product", r63.A05("product"));
                            String A0561 = r63.A05("guest_id");
                            if (A0561 != null) {
                                l65 = Long.valueOf(Long.parseLong(A0561));
                            } else {
                                l65 = null;
                            }
                            r76.A05("guest_id", l65);
                            r76.A04("media_dwell_time", (Double) A015.A01(C271774jZ.A5F));
                            r76.A04("media_time_elapsed", (Double) A015.A01(C271774jZ.A5Y));
                            r76.A04("media_time_paused", (Double) A015.A01(C271774jZ.A5T));
                            r76.A04("media_time_remaining", (Double) A015.A01(C271774jZ.A5Z));
                            r76.A04("media_time_to_load", (Double) A015.A01(C271774jZ.A5Q));
                            r76.A06("search_session_id", (String) A015.A01(C271774jZ.A7p));
                            r76.A05("reel_gap_to_last_ad", (Long) A015.A01(C271774jZ.A7R));
                            r76.A05("reel_gap_to_last_netego", (Long) A015.A01(C271774jZ.A7S));
                            r76.A06("entity_page_type", r63.A05("entity_page_type"));
                            r76.A06("rank_token", (String) A015.A01(C271774jZ.A6r));
                            r76.A05("min_consumed_media_gap_to_previous_ad", (Long) A015.A01(C271774jZ.A5h));
                            r76.A05("min_consumed_media_gap_to_previous_netego", (Long) A015.A01(C271774jZ.A5i));
                            r76.A05("min_consumed_reel_gap_to_previous_ad", (Long) A015.A01(C271774jZ.A5j));
                            r76.A05("min_consumed_reel_gap_to_previous_netego", (Long) A015.A01(C271774jZ.A5k));
                            r76.A05("media_type", (Long) A015.A01(r83));
                            ArrayList arrayList47 = (ArrayList) A015.A01(C271774jZ.A2H);
                            if (arrayList47 != null) {
                                ArrayList arrayList48 = new ArrayList(0Yv.A1E(arrayList47, 10));
                                Iterator it14 = arrayList47.iterator();
                                while (it14.hasNext()) {
                                    String str75 = (String) it14.next();
                                    0qQ.A0B(str75, 0);
                                    arrayList48.add(00y.A0n(10, str75));
                                }
                                arrayList12 = new ArrayList(00k.A0X(arrayList48));
                            } else {
                                arrayList12 = null;
                            }
                            r76.A07("drops_product_ids", arrayList12);
                            r76.A06("sponsored_label_text", (String) A015.A01(C271774jZ.A8D));
                            r76.A06("containermodule", r63.A05("container_module"));
                            r76.A06("delivery_class", r63.A05("delivery_class"));
                            r76.A06(TraceFieldType.AdhocEventName, r63.A05(TraceFieldType.AdhocEventName));
                            r76.A06("frontend_env", r63.A05("frontend_env"));
                            String A0562 = r63.A05("is_id");
                            if (A0562 != null) {
                                bool15 = Boolean.valueOf(Boolean.parseBoolean(A0562));
                            } else {
                                bool15 = null;
                            }
                            r76.A03("is_id", bool15);
                            r76.A06("media_type_name", r63.A05("media_type_name"));
                            r76.A06("original_referrer", r63.A05("original_referrer"));
                            r76.A06("original_referrer_domain", r63.A05("original_referrer_domain"));
                            r76.A06("primary_locale", r63.A05("primary_locale"));
                            r76.A06("referrer", r63.A05("referrer"));
                            r76.A06("referrer_domain", r63.A05("referrer_domain"));
                            r76.A06("rollout_hash", r63.A05("rollout_hash"));
                            r76.A06("url", (String) A015.A01(C271774jZ.A9a));
                            r76.A06("explore_topic_session_id", (String) A015.A01(C271774jZ.A2g));
                            String A0563 = r63.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A0563 != null) {
                                l66 = Long.valueOf(Long.parseLong(A0563));
                            } else {
                                l66 = null;
                            }
                            r76.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, l66);
                            r76.A06("a_i", (String) A015.A01(C271774jZ.A9M));
                            String A0564 = r63.A05(TraceFieldType.BroadcastId);
                            if (A0564 != null) {
                                l67 = Long.valueOf(Long.parseLong(A0564));
                            } else {
                                l67 = null;
                            }
                            r76.A05(TraceFieldType.BroadcastId, l67);
                            String A0565 = r63.A05("is_top_post");
                            if (A0565 != null) {
                                bool16 = Boolean.valueOf(Boolean.parseBoolean(A0565));
                            } else {
                                bool16 = null;
                            }
                            r76.A03("is_top_post", bool16);
                            String A0566 = r63.A05("live_donation");
                            if (A0566 != null) {
                                l68 = Long.valueOf(Long.parseLong(A0566));
                            } else {
                                l68 = null;
                            }
                            r76.A05("live_donation", l68);
                            r76.A06("video_type", (String) A015.A01(C271774jZ.A9h));
                            r76.A03("is_pride_media", (Boolean) A015.A01(C271774jZ.A4d));
                            r76.A05("next_max_id", (Long) A015.A01(C271774jZ.A65));
                            Integer num5 = (Integer) A015.A01(C271774jZ.A1z);
                            if (num5 != null) {
                                l69 = Long.valueOf((long) num5.intValue());
                            } else {
                                l69 = null;
                            }
                            r76.A05("dark_mode_state", l69);
                            String A0567 = r63.A05("within_stories_self_view");
                            if (A0567 != null) {
                                bool17 = Boolean.valueOf(Boolean.parseBoolean(A0567));
                            } else {
                                bool17 = null;
                            }
                            r76.A03("within_stories_self_view", bool17);
                            r76.A06("discovery_session_id", (String) A015.A01(C271774jZ.A2F));
                            String A0568 = r63.A05("nt");
                            if (A0568 != null) {
                                l70 = Long.valueOf(Long.parseLong(A0568));
                            } else {
                                l70 = null;
                            }
                            r76.A05("nt", l70);
                            r76.A06("algorithm", r63.A05("algorithm"));
                            r76.A06("position", r63.A05("position"));
                            String A0569 = r63.A05("is_dash_eligible");
                            if (A0569 != null) {
                                l71 = Long.valueOf(Long.parseLong(A0569));
                            } else {
                                l71 = null;
                            }
                            r76.A05("is_dash_eligible", l71);
                            r76.A06("playback_format", r63.A05("playback_format"));
                            r76.A03("is_internal_build", (Boolean) A015.A01(C271774jZ.A4P));
                            String str76 = (String) A015.A01(C271774jZ.A5R);
                            if (str76 != null) {
                                l72 = Long.valueOf(Long.parseLong(str76));
                            } else {
                                l72 = null;
                            }
                            r76.A05("media_owner_id", l72);
                            r76.A06("counter_channel", (String) A015.A01(C271774jZ.A1f));
                            String str77 = (String) A015.A01(C271774jZ.A1g);
                            if (str77 != null) {
                                l73 = Long.valueOf(Long.parseLong(str77));
                            } else {
                                l73 = null;
                            }
                            r76.A05("counter_id", l73);
                            String str78 = (String) A015.A01(C271774jZ.A1h);
                            if (str78 != null) {
                                l74 = Long.valueOf(Long.parseLong(str78));
                            } else {
                                l74 = null;
                            }
                            r76.A05("counter_sid", l74);
                            r76.A06("tray_rank_token", r63.A05("tray_rank_token"));
                            String A0570 = r63.A05("video_x_position");
                            if (A0570 != null) {
                                l75 = Long.valueOf(Long.parseLong(A0570));
                            } else {
                                l75 = null;
                            }
                            r76.A05("video_x_position", l75);
                            r76.A05("gap_to_last_ad", (Long) A015.A01(C271774jZ.A33));
                            Long l110 = (Long) A015.A01(C271774jZ.A34);
                            if (l110 == null) {
                                l110 = null;
                            }
                            r76.A05("gap_to_last_netego", l110);
                            r76.A03("is_holdout", (Boolean) A015.A01(C271774jZ.A4L));
                            r76.A05("top_followers_count", (Long) A015.A01(C271774jZ.A9H));
                            r76.A05("top_likers_count", (Long) A015.A01(C271774jZ.A9I));
                            r76.A05("dr_ad_type", (Long) A015.A01(C271774jZ.A2J));
                            r76.A06("impression_type", (String) A015.A01(C271774jZ.A3j));
                            r76.A06("async_ad_source", (String) A015.A01(C271774jZ.A0V));
                            r76.A03("is_pride_reel", (Boolean) A015.A01(C271774jZ.A4e));
                            r76.A05("carousel_opt_in_position", (Long) A015.A01(C271774jZ.A14));
                            r76.A06("camera_session_id", r63.A05("camera_session_id"));
                            r76.A06("chaining_feed_session_id", r63.A05("chaining_feed_session_id"));
                            String A0571 = r63.A05("is_main_feed_client_bump_item");
                            if (A0571 != null) {
                                bool18 = Boolean.valueOf(Boolean.parseBoolean(A0571));
                            } else {
                                bool18 = null;
                            }
                            r76.A03("is_main_feed_client_bump_item", bool18);
                            String str79 = (String) A015.A01(C271774jZ.A8I);
                            if (str79 != null) {
                                l76 = Long.valueOf(Long.parseLong(str79));
                            } else {
                                l76 = null;
                            }
                            r76.A05("sponsor_tag_id", l76);
                            r76.A06("byline_text", (String) A015.A01(C271774jZ.A0l));
                            String A0572 = r63.A05("pwa");
                            if (A0572 != null) {
                                bool19 = Boolean.valueOf(Boolean.parseBoolean(A0572));
                            } else {
                                bool19 = null;
                            }
                            r76.A03("pwa", bool19);
                            r76.A05("ad_inserted_position", (Long) A015.A01(C271774jZ.A0D));
                            r76.A05("ad_position_from_server", (Long) A015.A01(C271774jZ.A0I));
                            r76.A05("ad_received_position", (Long) A015.A01(C271774jZ.A0J));
                            r76.A05("ad_request_position", (Long) A015.A01(C271774jZ.A0L));
                            String str80 = (String) A015.A01(C271774jZ.A0j);
                            if (str80 != null) {
                                l104 = Long.valueOf(Long.parseLong(str80));
                            }
                            r76.A05("business_app_id", l104);
                            r76.A05("reel_viewer_entry_position", (Long) A015.A01(C271774jZ.A7Z));
                            r76.A05("num_visible_story_comments", (Long) A015.A01(C271774jZ.A6H));
                            r73 = r76;
                        } catch (ClassCastException unused3) {
                            r73 = new 0bb();
                        }
                        str2 = "ig_sub_impression";
                        r7 = r73;
                    } else if (intValue == 2) {
                        try {
                            0jB A017 = BGZ.A01();
                            0bb r77 = new 0bb();
                            if (0qQ.A0K(A017.A01(C271774jZ.A9M), "ad")) {
                                r4 = AnonymousClass4OQ.PAID;
                            } else {
                                r4 = AnonymousClass4OQ.ORGANIC;
                            }
                            ArrayList arrayList49 = (ArrayList) A017.A01(C271774jZ.A9f);
                            if (arrayList49 == null) {
                                arrayList49 = arrayList18;
                            }
                            r77.A07("video_start", arrayList49);
                            ArrayList arrayList50 = (ArrayList) A017.A01(C271774jZ.A9e);
                            if (arrayList50 == null) {
                                arrayList50 = arrayList18;
                            }
                            r77.A07("video_paused", arrayList50);
                            HashMap hashMap = (HashMap) A017.A01(C271774jZ.A6V);
                            if (!(hashMap == null || (entrySet = hashMap.entrySet()) == null)) {
                                arrayList18 = new ArrayList(0Yv.A1E(entrySet, 10));
                                for (Map.Entry entry : entrySet) {
                                    0bb r36 = new 0bb();
                                    r36.A05("clock_time", (Long) entry.getKey());
                                    r36.A05("player_time", (Long) entry.getValue());
                                    arrayList18.add(r36);
                                }
                            }
                            r77.A07("player_time", arrayList18);
                            r77.A06("encoded_frames", (String) A017.A01(C271774jZ.A2Q));
                            r77.A01((V1T) A017.A01(C271774jZ.A7d), "release_phase");
                            Double d21 = (Double) A017.A01(C271774jZ.A2K);
                            Long l111 = null;
                            if (d21 != null) {
                                l81 = Long.valueOf((long) d21.doubleValue());
                            } else {
                                l81 = null;
                            }
                            r77.A05(TraceFieldType.Duration, l81);
                            0bb r19 = new 0bb();
                            String str81 = (String) A017.A01(C271774jZ.A0Y);
                            if (str81 == null) {
                                str81 = "";
                            }
                            r19.A06("author_id", str81);
                            r19.A06("subtype", (String) A017.A01(C271774jZ.A8P));
                            r77.A02(r19, "product_metadata");
                            r77.A03("was_media_tracked", (Boolean) A017.A01(C271774jZ.A9s));
                            r77.A05("first_frame_timestamp", (Long) A017.A01(C271774jZ.A2t));
                            r77.A03("did_flush_frames", (Boolean) A017.A01(C271774jZ.A2B));
                            r77.A03("is_framebased_null", (Boolean) A017.A01(C271774jZ.A4J));
                            Integer num6 = (Integer) A017.A01(C271774jZ.A6C);
                            if (num6 != null) {
                                l111 = Long.valueOf((long) num6.intValue());
                            }
                            r77.A05("num_frames_captured", l111);
                            List<0jB> list5 = (List) A017.A01(C271774jZ.A9l);
                            if (list5 != null) {
                                arrayList13 = new ArrayList(0Yv.A1E(list5, 10));
                                for (0jB r84 : list5) {
                                    0bb r64 = new 0bb();
                                    String str82 = (String) r84.A01(C271774jZ.A9p);
                                    if (str82 == null) {
                                        str82 = "";
                                    }
                                    r64.A06(TraceFieldType.AdhocEventName, str82);
                                    Long l112 = (Long) r84.A01(C271774jZ.A9m);
                                    long j4 = 0;
                                    if (l112 != null) {
                                        j2 = l112.longValue();
                                    } else {
                                        j2 = 0;
                                    }
                                    r64.A05("client_time_ms", Long.valueOf(j2));
                                    Long l113 = (Long) r84.A01(C271774jZ.A9o);
                                    if (l113 != null) {
                                        j3 = l113.longValue();
                                    } else {
                                        j3 = 0;
                                    }
                                    r64.A05("media_time_ms", Long.valueOf(j3));
                                    Integer num7 = (Integer) r84.A01(C271774jZ.A9n);
                                    if (num7 != null) {
                                        j4 = (long) num7.intValue();
                                    }
                                    r64.A05("current_viewability", Long.valueOf(j4));
                                    arrayList13.add(r64);
                                }
                            } else {
                                arrayList13 = null;
                            }
                            r77.A07("viper_video_events", arrayList13);
                            String str83 = (String) A017.A01(C271774jZ.A1y);
                            if (str83 == null) {
                                str83 = "";
                            }
                            r77.A06(C66579MXk.A00(288), str83);
                            r77.A06("tracking_token", (String) A017.A01(C271774jZ.A9L));
                            r77.A06("nav_chain", (String) A017.A01(C271774jZ.A60));
                            Boolean bool21 = (Boolean) A017.A01(C271774jZ.A4y);
                            if (bool21 != null) {
                                r77.A03("is_texture_view", bool21);
                            }
                            String str84 = (String) A017.A01(C271774jZ.A5I);
                            if (!(str84 == null || (A0n = 00y.A0n(10, str84)) == null)) {
                                r77.A05("media_id", A0n);
                            }
                            r77.A01(r4, C66579MXk.A00(405));
                            r74 = r77;
                        } catch (ClassCastException unused4) {
                            r74 = new 0bb();
                        }
                        str2 = "media_playback_compound_second_channel";
                        r7 = r74;
                    } else if (intValue != 3) {
                        throw new RuntimeException();
                    }
                    r16.A02(r7, str2);
                }
            }
            ArrayList<C254323sI> arrayList51 = new ArrayList<>(0Yv.A1E(list3, 10));
            for (C254303sG r011 : list3) {
                arrayList51.add(r011.A00);
            }
            ArrayList<C254333sJ> arrayList52 = new ArrayList<>();
            for (C254323sI r012 : arrayList51) {
                018.A16(r012.A07, arrayList52);
            }
            ArrayList<C254333sJ> arrayList53 = new ArrayList<>();
            for (C254323sI r013 : arrayList51) {
                018.A16(r013.A02, arrayList53);
            }
            ArrayList<C254333sJ> arrayList54 = new ArrayList<>();
            for (C254323sI r014 : arrayList51) {
                018.A16(r014.A06, arrayList54);
            }
            ArrayList<C254333sJ> arrayList55 = new ArrayList<>();
            for (C254323sI r015 : arrayList51) {
                018.A16(r015.A04, arrayList55);
            }
            if (!arrayList52.isEmpty() || !arrayList54.isEmpty() || !arrayList53.isEmpty() || !arrayList55.isEmpty()) {
                0bb r25 = new 0bb();
                ArrayList arrayList56 = new ArrayList(0Yv.A1E(arrayList52, 10));
                for (C254333sJ r85 : arrayList52) {
                    0bb r5 = new 0bb();
                    r5.A05("enter_ts", Long.valueOf(r85.A01));
                    r5.A05("exit_ts", Long.valueOf(r85.A00));
                    arrayList56.add(r5);
                }
                r25.A07("t_0", arrayList56);
                ArrayList arrayList57 = new ArrayList(0Yv.A1E(arrayList55, 10));
                for (C254333sJ r78 : arrayList55) {
                    0bb r65 = new 0bb();
                    r65.A05("enter_ts", Long.valueOf(r78.A01));
                    r65.A05("exit_ts", Long.valueOf(r78.A00));
                    arrayList57.add(r65);
                }
                r25.A07("t_100", arrayList57);
                ArrayList arrayList58 = new ArrayList(0Yv.A1E(arrayList53, 10));
                for (C254333sJ r66 : arrayList53) {
                    0bb r46 = new 0bb();
                    r46.A05("enter_ts", Long.valueOf(r66.A01));
                    r46.A05("exit_ts", Long.valueOf(r66.A00));
                    arrayList58.add(r46);
                }
                r25.A07("t_50", arrayList58);
                if (!arrayList54.isEmpty()) {
                    ArrayList arrayList59 = new ArrayList(0Yv.A1E(arrayList54, 10));
                    for (C254333sJ r52 : arrayList54) {
                        0bb r310 = new 0bb();
                        r310.A05("enter_ts", Long.valueOf(r52.A01));
                        r310.A05("exit_ts", Long.valueOf(r52.A00));
                        arrayList59.add(r310);
                    }
                    r25.A07("t_75", arrayList59);
                }
                r12.A0N(r25, "nested_item_visibility_percent_ts");
            }
            if (!list3.isEmpty() && (valueOf = Long.valueOf((j = ((C254303sG) list3.get(0)).A01.A00))) != null && j > 0) {
                r12.A0Q("full_impression_ts", valueOf);
            }
            r12.A0R("entity_id", r372.A03);
            r12.A0N(r18, "element_visibility_percent_ts");
            r12.A0N(r17, "screen_coverage_percent_ts");
            r12.A0N(r16, "payload");
            r12.A0M(r38, "purpose");
            r12.Cgf();
        }
    }
}
