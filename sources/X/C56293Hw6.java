package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hw6  reason: case insensitive filesystem */
public abstract class C56293Hw6 {
    public static void A00(AnonymousClass0iw r10, UserSession userSession, 1Xj r12, AnonymousClass3W1 r13, C309426Yf r14, SearchContext searchContext, Double d, Integer num, Integer num2, String str, String str2, int i) {
        0jB r8;
        Long l;
        Long l2;
        String str3;
        String str4;
        Long l3;
        String str5;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        String str6;
        String str7;
        0bb r3;
        double d2;
        C267284bJ BZ6;
        User CCd;
        C267284bJ BZ62;
        String pk;
        String id;
        String str8 = null;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r10, userSession), C273654mx.A00(43));
        if (A0e.isSampled()) {
            Hashtag B6n = r12.A0C.B6n();
            String str9 = null;
            if (r10 instanceof C232682uF) {
                r8 = ((C232682uF) r10).E4l(r12);
            } else {
                r8 = null;
            }
            if (C51966G9m.A0x(r12) == null || C51966G9m.A0x(r12).BnU() == null || !182.A06(0Tu.A05, userSession, 36328370988072229L)) {
                l = null;
            } else {
                l = C51969G9p.A0r(C51966G9m.A0x(r12).BnU());
            }
            if (r12.A2A(userSession) == null) {
                0f9 AEf = 0wj.A01.AEf("reportMediaPrivateShareButtonClick: Media Author is null so Apk cannot be set.", 817891009);
                AEf.ABQ("Media Id", r12.getId());
                AEf.report();
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            String A05 = 1Xv.A05(C294185m0.A0B(r12, valueOf));
            A0e.AAJ(AnonymousClass000.A00(267), (String) null);
            DbS.A1N(A0e, str2);
            A0e.A7p("is_checkout_enabled", (Boolean) null);
            C51972G9s.A16(A0e, r12, "inventory_source", C51965G9l.A0t(r12));
            A0e.A9F("merchant_id", (Long) null);
            A0e.AAJ("prior_module", (String) null);
            A0e.A9F("product_id", (Long) null);
            A0e.AAe("product_ids", (List) null);
            C51965G9l.A1L(A0e, r12.C9L());
            UpcomingEvent A27 = r12.A27(userSession);
            if (A27 == null || (id = A27.getId()) == null) {
                l2 = null;
            } else {
                l2 = AnonymousClass7TE.A10(id);
            }
            A0e.A9F(C273654mx.A00(419), l2);
            A0e.A9F("a_pk", Long.valueOf(C294185m0.A00(userSession, r12)));
            if (r8 != null) {
                str3 = C51966G9m.A1C(C271774jZ.A6S, r8);
            } else {
                str3 = null;
            }
            C51974G9v.A0p(A0e, r12, "parent_m_pk", str3);
            A0e.AAJ(C66643MaC.A00(), str);
            A0e.AAJ("hashtag_follow_status", C281965Ag.A02(B6n));
            if (B6n != null) {
                str4 = B6n.getName();
            } else {
                str4 = null;
            }
            A0e.AAJ("hashtag_name", str4);
            if (B6n == null || B6n.getId() == null) {
                l3 = null;
            } else {
                l3 = DbV.A0q(B6n.getId());
            }
            A0e.A9F("hashtag_id", l3);
            if (r8 != null) {
                str5 = C51966G9m.A1C(C298085sr.A00, r8);
            } else {
                str5 = null;
            }
            A0e.AAJ("hashtag_feed_type", str5);
            C67161s9 A1N = r12.A1N();
            if (A1N == null || (BZ62 = A1N.BZ6()) == null || (pk = BZ62.getPk()) == null) {
                l4 = null;
            } else {
                l4 = AnonymousClass7TE.A10(pk);
            }
            A0e.A9F("chaining_seed_media_id", l4);
            C67161s9 A1N2 = r12.A1N();
            if (A1N2 == null || (BZ6 = A1N2.BZ6()) == null || (CCd = BZ6.CCd()) == null) {
                l5 = null;
            } else {
                l5 = C51972G9s.A0h(CCd);
            }
            A0e.A9F("chaining_seed_author_id", l5);
            C51972G9s.A14(A0e, r12);
            C51972G9s.A15(A0e, r12);
            if (num2 != null) {
                l6 = C51968G9o.A0v(num2);
            } else {
                l6 = null;
            }
            A0e.A9F("recs_ix", l6);
            if (num != null) {
                l7 = C51968G9o.A0v(num);
            } else {
                l7 = null;
            }
            A0e.A9F("m_ix", l7);
            A0e.AAJ("tray_session_id", (String) null);
            A0e.AAJ(C273654mx.A00(3320), (String) null);
            A0e.AAJ("comment_id", (String) null);
            if (searchContext != null) {
                str8 = searchContext.A03;
            }
            A0e.AAJ("rank_token", str8);
            if (searchContext != null) {
                str6 = searchContext.A02;
            } else {
                str6 = null;
            }
            A0e.AAJ("query_text", str6);
            if (searchContext != null) {
                str7 = searchContext.A05;
            } else {
                str7 = null;
            }
            A0e.AAJ("search_session_id", str7);
            if (searchContext != null) {
                str9 = searchContext.A06;
            }
            A0e.AAJ("serp_session_id", str9);
            C51965G9l.A1G(A0e, C294185m0.A03(r12, valueOf));
            A0e.AAJ("carousel_media_id", A05);
            A0e.A9F("carousel_media_id_int", C254543se.A00(A05));
            A0e.AAJ("carousel_cover_media_id", C294185m0.A0A(r12, valueOf));
            A0e.A8D(C273654mx.A00(339), d);
            A0e.A9F(AnonymousClass000.A00(1768), l);
            if (AnonymousClass3WS.A07(userSession) && C51965G9l.A0w(r12) != null && !C51965G9l.A0w(r12).isEmpty()) {
                List A0w = C51965G9l.A0w(r12);
                A0w.getClass();
                A0e.AAJ("translated_language", ((C276074sR) A0w.get(0)).BKV());
                A0e.AAe("translation_delivery_method", Collections.singletonList(Dd8.CLOSED_CAPTION));
            }
            if (182.A06(0Tu.A06, userSession, 36324840526066072L)) {
                boolean z = true;
                if (r13 != null && r10.getModuleName().equals("feed_timeline")) {
                    r3 = new 0bb();
                    r3.A03("is_delayed_skip_ad", Boolean.valueOf(r13.A2r));
                    if (r13.A0b <= 0) {
                        z = false;
                    }
                    r3.A03("is_action_on_unskippable", Boolean.valueOf(z));
                    d2 = (double) r13.A0b;
                } else if (r14 != null && r10.getModuleName().equals("reel_feed_timeline")) {
                    r3 = new 0bb();
                    r3.A03("is_delayed_skip_ad", Boolean.valueOf(r14.A0r));
                    if (r14.A0K <= 0) {
                        z = false;
                    }
                    r3.A03("is_action_on_unskippable", Boolean.valueOf(z));
                    d2 = (double) r14.A0K;
                }
                r3.A04("remaining_time", Double.valueOf(d2));
                A0e.AAK(r3, AnonymousClass000.A00(279));
            }
            DbX.A1L(A0e);
        }
    }

    @Deprecated
    public static void A01(AnonymousClass0iw r5, UserSession userSession, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            0xI A00 = 0xI.A00(r5, AnonymousClass000.A00(4712));
            A00.A0C("pk", str);
            A00.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directShareTarget.A08());
            if (Collections.unmodifiableList(directShareTarget.A0Q).size() == 1) {
                A00.A0C("a_pk", ((PendingRecipient) AnonymousClass7TE.A13(Collections.unmodifiableList(directShareTarget.A0Q))).getId());
            }
            DbU.A1R(A00, userSession);
        }
    }
}
