package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.HvD  reason: case insensitive filesystem */
public abstract class C56246HvD {
    public static final void A00(28D r5, UserSession userSession, String str) {
        0qQ.A0B(str, 0);
        29Z r4 = 27p.A01(userSession).A0F;
        0Aj A0e = AnonymousClass7TE.A0e(r4.A01, AnonymousClass000.A00(159));
        if (A0e.isSampled()) {
            A0e.A8M(AnonymousClass80P.TAG_PERSON, "tool_type");
            A0e.AAJ("legacy_falco_event_name", AnonymousClass000.A00(2303));
            String str2 = r4.A04.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A0e.AAJ("camera_session_id", str2);
            A0e.A8M(C279294yP.CLIPS, "camera_destination");
            A0e.A8M(C360948fP.CLIPS, "capture_type");
            DbS.A1F(r5, A0e);
            AnonymousClass7TE.A1W(A0e, "event_type", 2);
            A0e.A8M(28t.A06, "media_type");
            A0e.AAJ("module", str);
            C51965G9l.A1A(C59725JVj.SHARE_SHEET, A0e);
            AnonymousClass7TH.A0V(A0e);
        }
    }

    public static final void A01(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, SearchContext searchContext, AnonymousClass93U r7, Long l, String str, long j) {
        0qQ.A0B(searchContext, 7);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_clips_tagged_people_tap");
        if (A0e.isSampled()) {
            C51965G9l.A19(C52236GKd.A1I, A0e);
            C51965G9l.A1C(AnonymousClass5OC.TAGGED_PEOPLE_BUTTON, A0e);
            DbW.A16(A0e, r3);
            C51974G9v.A0q(A0e, r7, j);
            C51965G9l.A1F(A0e, l);
            C51965G9l.A1P(A0e, r5.getId());
            C51974G9v.A0o(A0e, r5);
            A0e.AAJ("viewer_init_media_compound_key", str);
            A0e.AAJ("search_session_id", searchContext.A05);
            A0e.AAJ("rank_token", searchContext.A03);
            A0e.AAJ("query_text", searchContext.A02);
            A0e.Cgf();
        }
    }
}
