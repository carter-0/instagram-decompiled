package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* renamed from: X.GyH  reason: case insensitive filesystem */
public final class C54032GyH extends C52465GTr {
    public final AnonymousClass0iw A00;
    public final 0wc A01;
    public final UserSession A02;
    public final C249763kK A03;

    public final void Ck7(String str) {
        String str2;
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "instagram_ads_feedback_interface_response");
        if (A0e.isSampled() && this.A01 != null) {
            C51970G9q.A17(A0e, Long.parseLong(A01().A0S));
            GCG.A03(A0e, this, Long.parseLong(this.A02.A06));
            GCG.A02(A0e, this, AFI_TYPE.UFI_REELS_SEE_MORE_LESS.A00);
            C250183l2 r0 = A01().A03;
            if (r0 != null) {
                str2 = r0.Aa8();
            } else {
                str2 = null;
            }
            A0e.A9H("extra_data", DbY.A0p("is_mid_scene_shown", String.valueOf(GCG.A06(this)), AnonymousClass7TE.A1L("ads_category", str2)));
            A0e.AAJ("trigger_source", "ad_ufi");
            C51971G9r.A19(A0e, "main_question", str);
            C51970G9q.A1B(A0e, GCG.A01(this));
            C51969G9p.A1B(A0e, this.A03);
            A0e.Cgf();
        }
    }

    public final void Ckv(long j) {
    }

    public final void Cl2(String str) {
        String str2;
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "instagram_ads_feedback_interface_undo");
        if (A0e.isSampled() && this.A01 != null) {
            C51970G9q.A17(A0e, Long.parseLong(A01().A0S));
            GCG.A03(A0e, this, Long.parseLong(this.A02.A06));
            GCG.A02(A0e, this, AFI_TYPE.UFI_REELS_SEE_MORE_LESS.A00);
            C250183l2 r0 = A01().A03;
            if (r0 != null) {
                str2 = r0.Aa8();
            } else {
                str2 = null;
            }
            A0e.A9H("extra_data", DbY.A0p("is_mid_scene_shown", String.valueOf(GCG.A06(this)), AnonymousClass7TE.A1L("ads_category", str2)));
            A0e.AAJ("trigger_source", "ad_ufi");
            C51971G9r.A19(A0e, "main_question", str);
            C51970G9q.A1B(A0e, GCG.A01(this));
            C51969G9p.A1B(A0e, this.A03);
            A0e.Cgf();
        }
    }

    public final void Cis() {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "instagram_ads_feedback_interface_impression");
        if (A0e.isSampled() && this.A01 != null) {
            C51970G9q.A17(A0e, Long.parseLong(A01().A0S));
            GCG.A03(A0e, this, Long.parseLong(this.A02.A06));
            GCG.A02(A0e, this, AFI_TYPE.UFI_REELS_SEE_MORE_LESS.A00);
            C250183l2 r0 = A01().A03;
            if (r0 != null) {
                str = r0.Aa8();
            } else {
                str = null;
            }
            A0e.A9H("extra_data", DbY.A0p("is_mid_scene_shown", String.valueOf(GCG.A06(this)), AnonymousClass7TE.A1L("ads_category", str)));
            A0e.AAJ("trigger_source", "ad_ufi");
            A0e.AAJ("question_id", "main_question");
            C51970G9q.A1B(A0e, GCG.A01(this));
            C51969G9p.A1B(A0e, this.A03);
            A0e.Cgf();
        }
    }

    public C54032GyH(AnonymousClass0iw r2, UserSession userSession, C249763kK r4) {
        AnonymousClass7TG.A1U(userSession, r4, r2);
        this.A02 = userSession;
        this.A03 = r4;
        this.A00 = r2;
        this.A01 = C51972G9s.A0a(r2, userSession);
    }
}
