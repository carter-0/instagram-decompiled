package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

public final class GCF extends C52465GTr {
    public final C270694h9 A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final UserSession A03;
    public final C249763kK A04;

    public final void Ck7(String str) {
        Boolean bool;
        String str2 = str;
        0qQ.A0B(str2, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_ads_feedback_interface_response");
        if (A0e.isSampled() && this.A01 != null) {
            0eP A1L = AnonymousClass7TE.A1L("ads_category", A00());
            0eP A1L2 = AnonymousClass7TE.A1L("is_mid_scene_shown", String.valueOf(GCG.A06(this)));
            GEG geg = this.A00;
            if (geg != null) {
                bool = Boolean.valueOf(geg.A0H);
            } else {
                bool = null;
            }
            LinkedHashMap A06 = 0Yt.A06(AnonymousClass7TH.A0h("view_visible_percentage", "", A1L, A1L2, AnonymousClass7TE.A1L("is_social_context_shown", String.valueOf(bool))));
            String str3 = AFI_TYPE.DWELL_REELS_SEE_MORE_LESS.A00;
            long A012 = GCG.A01(this);
            C51970G9q.A17(A0e, Long.parseLong(A01().A0S));
            UserSession userSession = this.A03;
            GCG.A03(A0e, this, Long.parseLong(userSession.A06));
            GCG.A02(A0e, this, str3);
            A0e.A9H("extra_data", A06);
            A0e.AAJ("trigger_source", "ad_dwell");
            C51971G9r.A19(A0e, "main_question", str2);
            C51970G9q.A1B(A0e, A012);
            C51969G9p.A1B(A0e, this.A04);
            A0e.Cgf();
            C267324bN A032 = C295375o3.A03(A01());
            C52058GDe A013 = C52057GDd.A01(A032, userSession, 1sd.A00(userSession), (AnonymousClass3W1) null, (C52054GDa) null);
            C270694h9 r1 = this.A00;
            C233162v9 r0 = C233162v9.AFI;
            String str4 = this.A00;
            String str5 = "main_question";
            String str6 = "ad_dwell";
            String str7 = A01().A0j;
            String str8 = str3;
            String str9 = str4;
            r1.DUE(new C301165yf((C376459Ib) null, new C53251Gkz(AnonymousClass05K.A00, str9, str7, str8, str5, str6, str2, A06, A012), "", ""), r0, A032, A013);
        }
    }

    public final void Ckv(long j) {
    }

    public final void Cl2(String str) {
        Boolean bool;
        String str2 = str;
        0qQ.A0B(str2, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_ads_feedback_interface_undo");
        if (A0e.isSampled() && this.A01 != null) {
            0eP A1L = AnonymousClass7TE.A1L("ads_category", A00());
            0eP A1L2 = AnonymousClass7TE.A1L("is_mid_scene_shown", String.valueOf(GCG.A06(this)));
            GEG geg = this.A00;
            if (geg != null) {
                bool = Boolean.valueOf(geg.A0H);
            } else {
                bool = null;
            }
            LinkedHashMap A06 = 0Yt.A06(AnonymousClass7TH.A0h("view_visible_percentage", "", A1L, A1L2, AnonymousClass7TE.A1L("is_social_context_shown", String.valueOf(bool))));
            String str3 = AFI_TYPE.DWELL_REELS_SEE_MORE_LESS.A00;
            long A012 = GCG.A01(this);
            C51970G9q.A17(A0e, Long.parseLong(A01().A0S));
            UserSession userSession = this.A03;
            GCG.A03(A0e, this, Long.parseLong(userSession.A06));
            GCG.A02(A0e, this, str3);
            A0e.A9H("extra_data", A06);
            A0e.AAJ("trigger_source", "ad_dwell");
            C51971G9r.A19(A0e, "main_question", str2);
            C51970G9q.A1B(A0e, A012);
            C51969G9p.A1B(A0e, this.A04);
            A0e.Cgf();
            C267324bN A032 = C295375o3.A03(A01());
            C52058GDe A013 = C52057GDd.A01(A032, userSession, 1sd.A00(userSession), (AnonymousClass3W1) null, (C52054GDa) null);
            C270694h9 r1 = this.A00;
            C233162v9 r0 = C233162v9.AFI;
            String str4 = this.A00;
            String str5 = "main_question";
            String str6 = "ad_dwell";
            String str7 = A01().A0j;
            String str8 = str3;
            String str9 = str4;
            r1.DUE(new C301165yf((C376459Ib) null, new C53251Gkz(AnonymousClass05K.A01, str9, str7, str8, str5, str6, str2, A06, A012), "", ""), r0, A032, A013);
        }
    }

    private final String A00() {
        boolean A06 = 182.A06(0Tu.A05, this.A03, 36314670042647290L);
        AnonymousClass3OA A012 = A01();
        if (A06) {
            String A2T = A012.A0K.A2T();
            if (A2T == null) {
                return "";
            }
            return A2T;
        }
        C250183l2 r0 = A012.A03;
        if (r0 != null) {
            return r0.Aa8();
        }
        return null;
    }

    public final void Cis() {
        Boolean bool;
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_ads_feedback_interface_impression");
        if (A0e.isSampled() && this.A01 != null) {
            C51970G9q.A17(A0e, Long.parseLong(A01().A0S));
            GCG.A03(A0e, this, Long.parseLong(this.A03.A06));
            GCG.A02(A0e, this, AFI_TYPE.DWELL_REELS_SEE_MORE_LESS.A00);
            0eP A1L = AnonymousClass7TE.A1L("ads_category", A00());
            0eP A1L2 = AnonymousClass7TE.A1L("is_mid_scene_shown", String.valueOf(GCG.A06(this)));
            GEG geg = this.A00;
            if (geg != null) {
                bool = Boolean.valueOf(geg.A0H);
            } else {
                bool = null;
            }
            GCG.A05(A0e, 0Yt.A06(AnonymousClass7TH.A0h("view_visible_percentage", "", A1L, A1L2, AnonymousClass7TE.A1L("is_social_context_shown", String.valueOf(bool)))));
            C51970G9q.A1B(A0e, GCG.A01(this));
            C51969G9p.A1B(A0e, this.A04);
            A0e.Cgf();
        }
    }

    public GCF(C270694h9 r2, AnonymousClass0iw r3, UserSession userSession, C249763kK r5) {
        C51974G9v.A1P(userSession, r5, r3, r2);
        this.A03 = userSession;
        this.A04 = r5;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = C51972G9s.A0a(r3, userSession);
    }
}
