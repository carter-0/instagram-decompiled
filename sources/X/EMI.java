package X;

import android.app.Activity;
import android.content.Context;
import android.widget.EditText;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

public final class EMI extends C47695EDe {
    public Activity A00;
    public Context A01;
    public AnonymousClass0aP A02;
    public G8H A03;
    public C46634DiE A04;
    public final /* synthetic */ C47478E4d A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EMI(android.app.Activity r15, android.net.Uri r16, X.AnonymousClass0iw r17, X.AnonymousClass0aP r18, X.G8H r19, X.C47478E4d r20, X.C46634DiE r21, java.lang.Integer r22) {
        /*
            r14 = this;
            r7 = 0
            r1 = r14
            r0 = r20
            r14.A05 = r0
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r8 = r21
            r9 = r22
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A00 = r15
            android.content.Context r0 = r15.getApplicationContext()
            r14.A01 = r0
            r14.A03 = r6
            r14.A04 = r8
            r14.A02 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMI.<init>(android.app.Activity, android.net.Uri, X.0iw, X.0aP, X.G8H, X.E4d, X.DiE, java.lang.Integer):void");
    }

    public final void A03(UserSession userSession, User user) {
        String A0f;
        C47478E4d e4d = this.A05;
        String username = user.getUsername();
        EditText editText = e4d.A02;
        if (editText == null) {
            A0f = null;
        } else {
            A0f = AnonymousClass7TF.A0f(editText);
        }
        C46632DiC.A02(e4d, userSession, user.Bh3(), new C50535Fdv(1, userSession, user, this), C46634DiE.A1C, username, A0f, false);
    }

    public final void A04(EM4 em4) {
        int i;
        int A032 = AnonymousClass0fD.A03(396259598);
        int A033 = AnonymousClass0fD.A03(-1062797401);
        1Q0 r0 = 1Q0.A13;
        AnonymousClass0aP r6 = this.A02;
        DbU.A1R(r0.A02(r6).A05((EXD) null, this.A04), r6);
        Activity activity = this.A00;
        if (activity != null) {
            DbT.A0K(activity).setIsLoading(false);
        }
        if (em4.A02) {
            this.A03.Dmd(r6, em4);
            i = 551409831;
        } else {
            super.A04(em4);
            Context context = this.A01;
            if (context != null) {
                C59689JTv.A08(context, 2131969196, 0);
            }
            i = -1858998121;
        }
        AnonymousClass0fD.A0A(i, A033);
        C47478E4d e4d = this.A05;
        if (C47478E4d.A03(e4d)) {
            AnonymousClass0aP r2 = e4d.A05;
            String str = e4d.A08;
            0qQ.A0B(r2, 0);
            C48921EmL.A00(r2, "passwordless_flow_password_create_success", str, (HashMap) null);
        }
        AnonymousClass0fD.A0A(1633892559, A032);
    }

    public final void onFail(C268654dm r8) {
        AnonymousClass0aP r4;
        String str;
        Object A002;
        int A032 = AnonymousClass0fD.A03(244530207);
        int A033 = AnonymousClass0fD.A03(1127326693);
        1Q0 r0 = 1Q0.A12;
        AnonymousClass0aP r3 = this.A02;
        DbU.A1R(r0.A02(r3).A05((EXD) null, this.A04), r3);
        Activity activity = this.A00;
        if (activity != null) {
            DbT.A0K(activity).setIsLoading(false);
        }
        if (!(r8 instanceof C268674do)) {
            C59689JTv.A07(this.A01, 2131972232);
        }
        super.onFail(r8);
        AnonymousClass0fD.A0A(1691682230, A033);
        C47478E4d e4d = this.A05;
        if (C47478E4d.A03(e4d)) {
            if (r8 == null || (A002 = r8.A00()) == null) {
                r4 = e4d.A05;
                str = null;
            } else {
                r4 = e4d.A05;
                str = ((1XP) A002).getErrorMessage();
            }
            String str2 = e4d.A08;
            0qQ.A0B(r4, 0);
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("exception", str);
            C48921EmL.A00(r4, "passwordless_flow_password_create_fail", str2, A1E);
        }
        AnonymousClass0fD.A0A(-434743349, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1040291915);
        EMI.super.onStart();
        Activity activity = this.A00;
        if (activity != null) {
            DbT.A0K(activity).setIsLoading(true);
        }
        AnonymousClass0fD.A0A(795864463, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0fD.A0A(-123856867, C47695EDe.A00(this, obj, -554310235));
    }

    public static void A01(UserSession userSession, EMI emi, User user) {
        super.A03(userSession, user);
    }
}
