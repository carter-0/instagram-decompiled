package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.EBp  reason: case insensitive filesystem */
public final class C47655EBp extends 1P0 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C47655EBp(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void onFail(C268654dm r14) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1890013686);
                C47430E2a e2a = (C47430E2a) this.A01;
                C59689JTv.A01(e2a.getContext(), (String) null, 2131961757, 0);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e2a.A00;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Ckh(new C22030Xtl("profile_native_calling", e2a.A02, (String) null, e2a.getString(2131961757), (String) null, (Map) null, 0Yt.A07(DbW.A1b("is_profile_audio_call_enabled", String.valueOf(this.A02))), (Map) null));
                }
                i2 = -1018695263;
                break;
            case 1:
                i = AnonymousClass7TG.A0D(r14, -815997508);
                C47655EBp.super.onFail(r14);
                i2 = 434572542;
                break;
            case 3:
                i = AnonymousClass7TG.A0D(r14, -1454643549);
                C47655EBp.super.onFail(r14);
                ESG esg = (ESG) this.A01;
                PR9 pr9 = esg.A02;
                if (pr9 != null) {
                    pr9.A0D = !this.A02;
                }
                ESG.A07(esg);
                i2 = 238744023;
                break;
            default:
                C47655EBp.super.onFail(r14);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(883469285);
                int A032 = AnonymousClass0fD.A03(324691575);
                C47430E2a e2a = (C47430E2a) this.A01;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e2a.A00;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Ckg(new C22030Xtl("profile_native_calling", e2a.A02, "profile_native_calling", (String) null, (String) null, (Map) null, 0Yt.A07(DbW.A1b("is_profile_audio_call_enabled", String.valueOf(this.A02))), (Map) null));
                }
                AnonymousClass0fD.A0A(-655728960, A032);
                i = -1999114162;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-524356785);
                int A0D = AnonymousClass7TG.A0D(obj, -27573190);
                C47655EBp.super.onSuccess(obj);
                AnonymousClass0eM r6 = ((E45) this.A01).A01;
                User A0Q = AnonymousClass7TF.A0Q(AnonymousClass7TE.A0l(r6));
                UserSession A0l = AnonymousClass7TE.A0l(r6);
                boolean z = this.A02;
                C308436Ug.A00(A0l, A0Q, z);
                0Aj A0e = AnonymousClass7TE.A0e(DbW.A0J(DbT.A0X(r6), "collab_status_fragment"), "ig_creator_connections_events");
                if (z) {
                    str = "toggle_on";
                } else {
                    str = "toggle_off";
                }
                DbS.A1I(A0e, str);
                A0e.A8M(C271174i4.A00(AnonymousClass7TE.A0l(r6)), "project");
                A0e.AAJ("target", "edit_settings");
                A0e.A8M(EZb.EDIT_OPEN_TO_COLLAB_SETTINGS, "screen");
                A0e.Cgf();
                AnonymousClass0fD.A0A(-1930335210, A0D);
                i = 661392851;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(1345468831);
                int A033 = AnonymousClass0fD.A03(1119198760);
                if (this.A02) {
                    ((AnonymousClass4AD) this.A01).EBA(AnonymousClass05K.A0C);
                }
                AnonymousClass0fD.A0A(-987459573, A033);
                i = -1473840088;
                break;
            default:
                A03 = AnonymousClass0fD.A03(944868799);
                AnonymousClass371 r15 = (AnonymousClass371) obj;
                int A0D2 = AnonymousClass7TG.A0D(r15, 923723626);
                C47655EBp.super.onSuccess(r15);
                ESG esg = (ESG) this.A01;
                esg.A05 = Boolean.valueOf(((C47131Dr8) r15.FH3()).A00);
                Dc2 dc2 = esg.A01;
                if (dc2 != null) {
                    DbX.A1R(dc2);
                    esg.A01 = null;
                }
                AnonymousClass0fD.A0A(933845336, A0D2);
                i = -202530366;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
