package X;

import android.os.Bundle;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public final class EQ2 extends C47698EDh {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ 02m A03;
    public final /* synthetic */ AnonymousClass0aP A04;
    public final /* synthetic */ G67 A05;
    public final /* synthetic */ RegFlowExtras A06;
    public final /* synthetic */ EXD A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ AtomicInteger A09;

    public final void A02(DwQ dwQ) {
        String errorMessage;
        int i;
        int A032 = AnonymousClass0fD.A03(1757102981);
        G67 g67 = this.A05;
        if (g67 != null && !dwQ.A04 && dwQ.A05) {
            02m r3 = this.A03;
            r3.markerAnnotate(4197923, "reg_existing_login", true);
            r3.markerEnd(4197923, 3);
            C48260Ebf ebf = this.A04;
            if (ebf != null && ebf.A02) {
                ebf.A00();
            }
            String A0r = DbS.A0r(Dbj.A03(), dwQ.A03);
            Pattern pattern = 0mp.A01;
            if (A0r == null) {
                A0r = "";
            }
            String A0r2 = DbS.A0r("profile_pic_url", dwQ.A03);
            if (A0r2 == null) {
                A0r2 = "";
            }
            g67.Et4(A0r, A0r2);
        } else if (!dwQ.A04 || dwQ.A01 == null) {
            AnonymousClass4DH r1 = this.A01;
            if (r1.getContext() == null) {
                0wb.A03("Show error message when user is not returned from server during account creation", "Context is null");
                i = -800542966;
                AnonymousClass0fD.A0A(i, A032);
            }
            this.A03.markerEnd(4197923, 3);
            if (dwQ.getErrorMessage() == null) {
                errorMessage = r1.getContext().getString(2131968258);
            } else {
                errorMessage = dwQ.getErrorMessage();
            }
            A04(errorMessage, AnonymousClass05K.A00);
        } else {
            this.A03.markerPoint(4197923, "account_creation_success");
            super.A02(dwQ);
        }
        i = 467338185;
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void A03(User user) {
        super.A03(user);
        RegFlowExtras regFlowExtras = this.A06;
        regFlowExtras.A0Y = user.getId();
        Bundle A0C = DbX.A0C(user.getId());
        A0C.putBoolean("IS_SIGN_UP_FLOW", true);
        UserSession A0U = DbS.A0U(A0C);
        if (regFlowExtras.A0w) {
            C319606qt A012 = C319606qt.A01(A0U);
            String id = user.getId();
            A012.A09(this.A01.getContext(), this.A02, A0U, AnonymousClass05K.A1I, id, true);
        }
        this.A00.post(new C51383FtF(this, user));
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1953212707);
        AtomicInteger atomicInteger = this.A09;
        if (atomicInteger.get() == 1) {
            super.onStart();
        }
        C49224ErT.A00(this.A04, this.A07, this.A08, Integer.valueOf(atomicInteger.get()), C49108EpX.A00(C50144FRb.A00()));
        AnonymousClass0fD.A0A(766946075, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1963038150);
        A02((DwQ) obj);
        AnonymousClass0fD.A0A(404387296, A032);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EQ2(android.os.Handler r13, androidx.fragment.app.Fragment r14, X.AnonymousClass4DH r15, X.AnonymousClass0iw r16, X.02m r17, X.AnonymousClass0aP r18, X.AnonymousClass0aP r19, X.G67 r20, X.G69 r21, com.instagram.registration.model.RegFlowExtras r22, com.instagram.registration.model.RegFlowExtras r23, X.EXD r24, X.EXD r25, java.lang.Integer r26, java.lang.Integer r27, java.lang.String r28, java.util.concurrent.atomic.AtomicInteger r29, boolean r30, boolean r31) {
        /*
            r12 = this;
            r11 = 0
            r1 = r12
            r0 = r20
            r12.A05 = r0
            r0 = r17
            r12.A03 = r0
            r12.A01 = r15
            r0 = r23
            r12.A06 = r0
            r0 = r16
            r12.A02 = r0
            r12.A00 = r13
            r0 = r25
            r12.A07 = r0
            r0 = r29
            r12.A09 = r0
            r0 = r19
            r12.A04 = r0
            r0 = r27
            r12.A08 = r0
            r7 = r26
            r6 = r24
            r5 = r22
            r10 = r31
            r3 = r18
            r9 = r30
            r8 = r28
            r2 = r14
            r4 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EQ2.<init>(android.os.Handler, androidx.fragment.app.Fragment, X.4DH, X.0iw, X.02m, X.0aP, X.0aP, X.G67, X.G69, com.instagram.registration.model.RegFlowExtras, com.instagram.registration.model.RegFlowExtras, X.EXD, X.EXD, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.concurrent.atomic.AtomicInteger, boolean, boolean):void");
    }
}
