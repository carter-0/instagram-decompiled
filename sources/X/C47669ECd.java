package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;

/* renamed from: X.ECd  reason: case insensitive filesystem */
public final class C47669ECd extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ AnonymousClass4DH A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ AnonymousClass0aP A04;
    public final /* synthetic */ G69 A05;
    public final /* synthetic */ RegFlowExtras A06;
    public final /* synthetic */ EEK A07;

    public C47669ECd(Context context, Handler handler, AnonymousClass4DH r3, AnonymousClass0iw r4, AnonymousClass0aP r5, G69 g69, RegFlowExtras regFlowExtras, EEK eek) {
        this.A07 = eek;
        this.A04 = r5;
        this.A06 = regFlowExtras;
        this.A00 = context;
        this.A01 = handler;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = g69;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1533694054);
        EM5 em5 = (EM5) obj;
        int A033 = AnonymousClass0fD.A03(1250575250);
        C47669ECd.super.onSuccess(em5);
        User user = em5.A05;
        user.A03.Ecx(0);
        DbY.A1P(user);
        AnonymousClass0aP r8 = this.A04;
        String id = user.getId();
        boolean A1U = AnonymousClass7TF.A1U(0, r8, "facebook");
        C49222ErR.A00(r8, (Integer) null, "facebook", "consumer", id, (String) null).Cgf();
        Context context = this.A00;
        UserSession A022 = C46413Dea.A02(context, (AnonymousClass0iw) null, r8, user, (String) null, false);
        2Lv.A00(A022).A02(EEM.A0B, (C363768kJ) null, "ig_fb_log_in");
        C16857V8m.A00(context, A022).A00(EVX.REGISTRATION);
        if (em5.A0H) {
            1ES.A03(new FZ8(A1U ? 1 : 0, this, A022, user));
        } else {
            EEK eek = this.A07;
            if (eek != null) {
                eek.A00();
            }
            this.A01.post(new C51384FtG(this, user));
        }
        AnonymousClass0fD.A0A(568849472, A033);
        AnonymousClass0fD.A0A(-250311543, A032);
    }

    public final void onFail(C268654dm r25) {
        String str;
        String str2;
        G69 g69;
        String str3;
        int A032 = AnonymousClass0fD.A03(1546610605);
        EEK eek = this.A07;
        if (eek != null) {
            eek.A00();
        }
        C268654dm r4 = r25;
        if (r4 instanceof C268674do) {
            EM5 em5 = (EM5) r4.A00();
            if (!em5.isFeedbackRequired() && (g69 = this.A05) != null) {
                FA8 fa8 = em5.A01;
                if (fa8 != null) {
                    str3 = fa8.A00;
                } else {
                    str3 = null;
                }
                g69.EuV(str3, AnonymousClass05K.A01);
            }
            AnonymousClass0aP r5 = this.A04;
            FA8 fa82 = em5.A01;
            if (fa82 != null) {
                str = fa82.A01;
            } else {
                str = null;
            }
            if (fa82 != null) {
                str2 = fa82.A00;
            } else {
                str2 = null;
            }
            Boolean A0v = AnonymousClass7TE.A0v();
            String status = em5.getStatus();
            Boolean valueOf = Boolean.valueOf(em5.isCheckpointRequired());
            Boolean valueOf2 = Boolean.valueOf(em5.isConsentRequired());
            Boolean valueOf3 = Boolean.valueOf(em5.isFeedbackRequired());
            Boolean valueOf4 = Boolean.valueOf(em5.isLoginRequired());
            Boolean valueOf5 = Boolean.valueOf(em5.isNoContent());
            Boolean valueOf6 = Boolean.valueOf(em5.isViolatingBrandedContentPolicy());
            Integer valueOf7 = Integer.valueOf(em5.mStatusCode);
            String str4 = em5.mErrorType;
            String errorMessage = em5.getErrorMessage();
            0qQ.A0B(r5, 0);
            C49223ErS.A00(r5, A0v, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, (Boolean) null, (Integer) null, valueOf7, "facebook", str, str2, status, (String) null, str4, errorMessage, (String) null);
        } else {
            G69 g692 = this.A05;
            if (g692 != null) {
                g692.EuV(this.A00.getString(2131968258), AnonymousClass05K.A00);
            }
            Throwable A012 = r4.A01();
            if (A012 != null) {
                String name = A012.getClass().getName();
                0wb.A03(EEM.__redex_internal_original_name, 002.A0u("Exception ", name, ": ", A012.getMessage()));
                AnonymousClass0aP r52 = this.A04;
                0qQ.A0B(r52, 0);
                C49223ErS.A00(r52, false, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, "facebook", (String) null, (String) null, name, (String) null, (String) null, (String) null, (String) null);
            }
        }
        AnonymousClass0fD.A0A(-943092203, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-113084027);
        C47669ECd.super.onStart();
        EEK eek = this.A07;
        if (eek != null) {
            eek.A01();
        }
        AnonymousClass0aP r3 = this.A04;
        EXD exd = EXD.A04;
        Integer A022 = this.A06.A02();
        0qQ.A0B(r3, 0);
        C49224ErT.A00(r3, exd, A022, (Integer) null, (String) null);
        AnonymousClass0fD.A0A(-758894151, A032);
    }
}
