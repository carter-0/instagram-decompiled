package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5ms  reason: invalid class name and case insensitive filesystem */
public abstract class C294695ms {
    public static final C294705mt A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C294705mt) userSession.A01(C294705mt.class, new AnonymousClass9LL(userSession, 18));
    }

    public static final boolean A02(EWA ewa) {
        0qQ.A0B(ewa, 0);
        if (ewa == EWA.UserActionFollow || ewa == EWA.UserActionCancelRequest || ewa == EWA.UserActionUnfollow) {
            return true;
        }
        return false;
    }

    public static final void A01(0xF r14, UserSession userSession, 1Xj r16, UserDetailEntryInfo userDetailEntryInfo, SearchContext searchContext, C243943aO r19, EWA ewa, User user, Double d, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        0bb r3;
        String id;
        String str7 = str4;
        Integer num2 = num;
        0qQ.A0B(num2, 3);
        1Rm A00 = 1Rm.A00();
        0qQ.A07(A00);
        String A002 = GTN.A00(num2);
        long parseLong = Long.parseLong(user.getId());
        if (str4 == null) {
            str7 = A00.A00;
            0qQ.A07(str7);
        }
        0wc A01 = AnonymousClass0kN.A01(new 0xG(str7), userSession);
        0Aj A003 = A01.A00(A01.A00, "follow_button_tapped");
        A003.AAJ(AnonymousClass000.A00(90), ewa.A00);
        Long valueOf = Long.valueOf(parseLong);
        A003.A9F("a_pk", valueOf);
        A003.A9F("entity_id", valueOf);
        A003.AAJ("entity_type", PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        A003.AAJ("entity_follow_status", A002);
        String str8 = str;
        if (str != null) {
            A003.AAJ("click_point", str8);
        }
        A003.A8D("media_pct_watched", d);
        1Xj r32 = r16;
        if (r16 != null) {
            A003.A9F("entry_media_type", Long.valueOf((long) r32.BR7().A00));
            String mezqlToken = r32.A0C.getMezqlToken();
            if (mezqlToken != null) {
                A003.AAJ("mezql_token", mezqlToken);
            }
            String loggingInfoToken = r32.A0C.getLoggingInfoToken();
            if (loggingInfoToken != null) {
                A003.AAJ("ranking_info_token", loggingInfoToken);
            }
            String BIl = r32.A0C.BIl();
            if (BIl != null) {
                A003.AAJ("inventory_source", BIl);
            }
            List C9Z = r32.A0C.C9Z();
            if (C9Z != null && (!C9Z.isEmpty()) && AnonymousClass3WS.A07(userSession)) {
                A003.AAJ("translated_language", ((C276074sR) C9Z.get(0)).BKV());
                List singletonList = Collections.singletonList(Dd8.CLOSED_CAPTION);
                0qQ.A07(singletonList);
                A003.AAe("translation_delivery_method", singletonList);
            }
        }
        String str9 = str5;
        if (str5 != null) {
            A003.AAJ("m_pk", str9);
        }
        String str10 = str2;
        if (str2 != null) {
            A003.AAJ("entry_trigger", str10);
        }
        String str11 = str3;
        if (str3 != null) {
            A003.AAJ("entry_module", str11);
        }
        UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
        if (userDetailEntryInfo != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("entity_id", userDetailEntryInfo2.A02);
            hashMap.put("entity_name", userDetailEntryInfo2.A03);
            hashMap.put("entity_follow_status", userDetailEntryInfo2.A01);
            hashMap.put("entity_type", userDetailEntryInfo2.A04);
            A003.A9H("entry_info", hashMap);
            String str12 = userDetailEntryInfo2.A00;
            if (str12 != null) {
                A003.AAJ("display_format", str12);
            }
            String str13 = userDetailEntryInfo2.A05;
            if (str13 != null) {
                A003.AAJ("insertion_context", str13);
            }
        }
        String str14 = AnonymousClass1QI.A00.A02.A00;
        if (str14 != null) {
            A003.AAJ("nav_chain", str14);
        }
        if (!(r16 == null || (id = r32.getId()) == null)) {
            String A06 = 1Xv.A06(id);
            0qQ.A0B(A06, 0);
            Long A0n = 00y.A0n(10, A06);
            if (A0n != null) {
                A003.A9F("current_media_id", A0n);
            }
            String A04 = 1Xv.A04(id);
            0qQ.A0B(A04, 0);
            Long A0n2 = 00y.A0n(10, A04);
            if (A0n2 != null) {
                A003.A9F("current_media_author_id", A0n2);
            }
        }
        SearchContext searchContext2 = C324636ze.A00(userSession).A00;
        if (searchContext2 != null) {
            r3 = new 0bb();
            r3.A06("search_session_id", searchContext2.A05);
            r3.A06("rank_token", searchContext2.A03);
            r3.A06("query_text", searchContext2.A02);
            r3.A06("serp_session_id", searchContext2.A06);
            r3.A06("click_id", searchContext2.A00);
        } else {
            r3 = null;
        }
        A003.AAK(r3, "search_context");
        SearchContext searchContext3 = searchContext;
        if (searchContext != null) {
            0bb r11 = new 0bb();
            String str15 = searchContext3.A05;
            r11.A06("search_session_id", str15);
            r11.A06("serp_session_id", searchContext3.A06);
            String str16 = searchContext3.A02;
            r11.A06("query_text", str16);
            String str17 = searchContext3.A03;
            r11.A06("rank_token", str17);
            r11.A06("click_id", searchContext3.A00);
            A003.AAK(r11, "search_context");
            if (str15 != null) {
                A003.AAJ("search_session_id", str15);
            }
            if (str17 != null) {
                A003.AAJ("rank_token", str17);
            }
            if (str16 != null) {
                A003.AAJ("query_text", str16);
            }
        }
        if (r14 != null) {
            String A05 = r14.A05("starting_clips_media_id");
            if (A05 != null) {
                A003.AAJ("m_pk", A05);
                if (A05.length() > 0 && !A05.equals("null")) {
                    1Xv r0 = 1Xj.A0h;
                    String A062 = 1Xv.A06(A05);
                    0qQ.A0B(A062, 0);
                    Long A0n3 = 00y.A0n(10, A062);
                    if (A0n3 != null) {
                        A003.A9F("starting_clips_media_id", A0n3);
                    }
                }
            }
            String A052 = r14.A05("starting_clips_ranking_info_token");
            if (A052 != null) {
                A003.AAJ("starting_clips_ranking_info_token", A052);
            }
            Integer A03 = r14.A03("chaining_seed_media_id");
            if (A03 != null) {
                A003.A9F("chaining_seed_media_id", Long.valueOf((long) A03.intValue()));
            }
            Integer A032 = r14.A03("chaining_seed_author_id");
            if (A032 != null) {
                A003.A9F("chaining_seed_author_id", Long.valueOf((long) A032.intValue()));
            }
            Integer A033 = r14.A03("chaining_position");
            if (A033 != null) {
                A003.A9F("chaining_position", Long.valueOf((long) A033.intValue()));
            }
            String A053 = r14.A05("chaining_session_id");
            if (A053 != null) {
                A003.AAJ("chaining_session_id", A053);
            }
            String A054 = r14.A05("hashtag_follow_status");
            if (A054 != null) {
                A003.AAJ("hashtag_follow_status", A054);
            }
            Integer A034 = r14.A03("hashtag_id");
            if (A034 != null) {
                A003.A9F("hashtag_id", Long.valueOf((long) A034.intValue()));
            }
            String A055 = r14.A05("hashtag_name");
            if (A055 != null) {
                A003.AAJ("hashtag_name", A055);
            }
            String A056 = r14.A05("hashtag_feed_type");
            if (A056 != null) {
                A003.AAJ("hashtag_feed_type", A056);
            }
            String A057 = r14.A05("topic_cluster_debug_info");
            if (A057 != null) {
                A003.AAJ("topic_cluster_debug_info", A057);
            }
            String A058 = r14.A05("topic_cluster_id");
            if (A058 != null) {
                A003.AAJ("topic_cluster_id", A058);
            }
            String A059 = r14.A05("topic_cluster_title");
            if (A059 != null) {
                A003.AAJ("topic_cluster_title", A059);
            }
            String A0510 = r14.A05("topic_cluster_type");
            if (A0510 != null) {
                A003.AAJ("topic_cluster_type", A0510);
            }
            Integer A035 = r14.A03("entity_page_id");
            if (A035 != null) {
                A003.A9F("entity_page_id", Long.valueOf((long) A035.intValue()));
            }
            String A0511 = r14.A05("entity_page_name");
            if (A0511 != null) {
                A003.AAJ("entity_page_name", A0511);
            }
            String A0512 = r14.A05("entity_page_follow_status");
            if (A0512 != null) {
                A003.AAJ("entity_page_follow_status", A0512);
            }
            Integer A036 = r14.A03("entry_entity_id");
            if (A036 != null) {
                A003.A9F("entry_entity_id", Long.valueOf((long) A036.intValue()));
            }
            String A0513 = r14.A05("entry_entity_name");
            if (A0513 != null) {
                A003.AAJ("entry_entity_name", A0513);
            }
            String A0514 = r14.A05("entry_entity_follow_status");
            if (A0514 != null) {
                A003.AAJ("entry_entity_follow_status", A0514);
            }
            String A0515 = r14.A05("entry_entity_type");
            if (A0515 != null) {
                A003.AAJ("entry_entity_type", A0515);
            }
            Integer A037 = r14.A03("entry_media_id");
            if (A037 != null) {
                A003.A9F("entry_media_id", Long.valueOf((long) A037.intValue()));
            }
            Integer A038 = r14.A03("entry_media_author_id");
            if (A038 != null) {
                A003.A9F("entry_media_author_id", Long.valueOf((long) A038.intValue()));
            }
            Integer A039 = r14.A03("view_state_item_type");
            if (A039 != null) {
                A003.A9F("view_state_item_type", Long.valueOf((long) A039.intValue()));
            }
            Integer A0310 = r14.A03("recs_ix");
            if (A0310 != null) {
                A003.A9F("recs_ix", Long.valueOf((long) A0310.intValue()));
            }
            Integer A0311 = r14.A03("m_ix");
            if (A0311 != null) {
                A003.A9F("m_ix", Long.valueOf((long) A0311.intValue()));
            }
            if (r14.A05("parent_m_pk") != null) {
                A003.AAJ("parent_m_pk", r14.A05("parent_m_pk"));
            }
            Integer A0312 = r14.A03("position");
            if (A0312 != null) {
                A003.A9F("position", Long.valueOf((long) A0312.intValue()));
            }
            Integer A0313 = r14.A03("unit_id");
            if (A0313 != null) {
                A003.A9F("unit_id", Long.valueOf((long) A0313.intValue()));
            }
            String A0516 = r14.A05("impression_uuid");
            if (A0516 != null) {
                A003.AAJ("impression_uuid", A0516);
            }
            String A0517 = r14.A05("rank_token");
            if (A0517 != null) {
                A003.AAJ("rank_token", A0517);
            }
            String A0518 = r14.A05("search_session_id");
            if (A0518 != null) {
                A003.AAJ("search_session_id", A0518);
            }
            String A004 = AnonymousClass000.A00(2695);
            Integer A0314 = r14.A03(A004);
            if (A0314 != null) {
                A003.A9F(A004, Long.valueOf((long) A0314.intValue()));
            }
            Integer A0315 = r14.A03("a_pk");
            if (A0315 != null) {
                A003.A9F("a_pk", Long.valueOf((long) A0315.intValue()));
            }
            String A0519 = r14.A05("social_context_text");
            if (A0519 != null) {
                A003.AAJ("social_context", A0519);
            }
            String A0520 = r14.A05("social_context_type");
            if (A0520 != null) {
                A003.AAJ("social_context_type", A0520);
            }
            Long A042 = r14.A04("collection_id");
            if (A042 != null) {
                A003.A9F("collection_id", A042);
            }
            String A0521 = r14.A05("collection_name");
            if (A0521 != null) {
                A003.AAJ("collection_name", A0521);
            }
        }
        C243943aO r02 = r19;
        if (r19 != null) {
            A003.AAJ("tap_info", r02.A00);
        }
        A003.A9F("carousel_index", l);
        A003.A9F("carousel_media_id_int", C254543se.A00(str6));
        A003.AAJ(AnonymousClass000.A00(265), C324716zm.A00());
        A003.Cgf();
    }
}
