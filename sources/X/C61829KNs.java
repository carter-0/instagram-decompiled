package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.update.trial.TrialUseCase;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.KNs  reason: case insensitive filesystem */
public final class C61829KNs extends C60102Jfi {
    public K1L A00;
    public C61075JwD A01;
    public AnonymousClass3Q2 A02;
    public final AnonymousClass07Z A03;
    public final C60132JgD A04;
    public final C60112Jft A05;
    public final C60119Jg0 A06;
    public final UserSession A07;
    public final KOD A08;
    public final C60259JiG A09;
    public final C60264JiL A0A;
    public final C61824KNn A0B;
    public final KO9 A0C;
    public final KOQ A0D;
    public final C61846KOl A0E;
    public final KOG A0F;
    public final C61838KOc A0G;
    public final KOU A0H;
    public final C61836KOa A0I;
    public final KOA A0J;
    public final KOH A0K;
    public final C61849KOo A0L;
    public final KOI A0M;
    public final KO2 A0N;
    public final KOZ A0O;
    public final KOJ A0P;
    public final KOM A0Q;
    public final KOE A0R;
    public final C61850KOp A0S;
    public final C61842KOg A0T;
    public final KOS A0U;
    public final C61844KOi A0V;
    public final KOR A0W;
    public final KOK A0X;
    public final C61847KOm A0Y;
    public final KOL A0Z;
    public final KOY A0a;
    public final C61843KOh A0b;
    public final KOT A0c;
    public final KOB A0d;
    public final KOV A0e;
    public final TrialUseCase A0f;
    public final C61839KOd A0g;
    public final KOW A0h;
    public final C61848KOn A0i;
    public final PendingRecipient A0j;
    public final String A0k;
    public final boolean A0l;
    public final Application A0m;

    public static C293505kq A01(C61829KNs kNs) {
        return kNs.A0N.A03.A07.A09();
    }

    public final void onCleared() {
        C357128Wq r0 = this.A0I.A01;
        if (r0 != null) {
            r0.A05();
        }
    }

    public static AnonymousClass3Q2 A02(K66 k66) {
        return K66.A06(k66).A02;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61829KNs(android.app.Application r7, X.AnonymousClass07Z r8, X.C60132JgD r9, X.C60112Jft r10, X.C60119Jg0 r11, com.instagram.common.session.UserSession r12, X.KOD r13, X.C60259JiG r14, X.C60264JiL r15, X.C61824KNn r16, X.KO9 r17, X.KOQ r18, X.C61846KOl r19, X.KOG r20, X.C61838KOc r21, X.KOU r22, X.C61836KOa r23, X.KOA r24, X.KOH r25, X.C61849KOo r26, X.KOI r27, X.KO2 r28, X.KOZ r29, X.KOJ r30, X.KOM r31, X.KOE r32, X.C61850KOp r33, X.C61842KOg r34, X.KOS r35, X.C61844KOi r36, X.KOR r37, X.KOK r38, X.C61847KOm r39, X.KOL r40, X.KOY r41, X.C61843KOh r42, X.KOT r43, X.KOB r44, X.KOV r45, com.instagram.creation.sharesheet.update.trial.TrialUseCase r46, X.C61839KOd r47, X.KOW r48, X.C61848KOn r49, com.instagram.pendingmedia.model.recipients.PendingRecipient r50, java.lang.String r51, boolean r52) {
        /*
            r6 = this;
            r0 = 3
            X.C51974G9v.A0d(r0, r12, r8, r10, r14)
            r0 = r51
            X.C51974G9v.A1Q(r15, r11, r9, r0)
            r2 = r16
            r6.<init>(r7, r2)
            r6.A0m = r7
            r1 = r28
            r6.A0N = r1
            r6.A07 = r12
            r6.A03 = r8
            r6.A05 = r10
            r6.A09 = r14
            r6.A0A = r15
            r6.A06 = r11
            r6.A04 = r9
            r6.A0k = r0
            r0 = r52
            r6.A0l = r0
            r0 = r50
            r6.A0j = r0
            r6.A0B = r2
            r6.A08 = r13
            r0 = r26
            r6.A0L = r0
            r0 = r23
            r6.A0I = r0
            r0 = r24
            r6.A0J = r0
            r0 = r35
            r6.A0U = r0
            r0 = r33
            r6.A0S = r0
            r0 = r19
            r6.A0E = r0
            r0 = r36
            r6.A0V = r0
            r0 = r22
            r6.A0H = r0
            r0 = r29
            r6.A0O = r0
            r0 = r43
            r6.A0c = r0
            r0 = r38
            r6.A0X = r0
            r0 = r41
            r6.A0a = r0
            r0 = r49
            r6.A0i = r0
            r0 = r48
            r6.A0h = r0
            r0 = r30
            r6.A0P = r0
            r0 = r17
            r6.A0C = r0
            r0 = r47
            r6.A0g = r0
            r0 = r18
            r6.A0D = r0
            r0 = r44
            r6.A0d = r0
            r0 = r45
            r6.A0e = r0
            r0 = r34
            r6.A0T = r0
            r0 = r39
            r6.A0Y = r0
            r0 = r27
            r6.A0M = r0
            r0 = r20
            r6.A0F = r0
            r0 = r21
            r6.A0G = r0
            r0 = r46
            r6.A0f = r0
            r0 = r42
            r6.A0b = r0
            r0 = r37
            r6.A0W = r0
            r0 = r31
            r6.A0Q = r0
            r0 = r32
            r6.A0R = r0
            r0 = r40
            r6.A0Z = r0
            r0 = r25
            r6.A0K = r0
            X.6oS r1 = X.C318116oQ.A00(r6)
            r0 = 29
            X.19B r3 = X.MH9.A01(r6, r1, r0)
            X.Jft r0 = r6.A05
            X.2Fj r2 = r0.A00
            X.07Z r5 = r6.A03
            r1 = 15
            X.MP9 r0 = new X.MP9
            r0.<init>(r6, r1)
            r4 = 17
            X.Dba.A15(r5, r2, r0, r4)
            X.JiG r0 = r6.A09
            X.2Fk r2 = r0.A00
            r1 = 16
            X.MP9 r0 = new X.MP9
            r0.<init>(r6, r1)
            X.Dba.A15(r5, r2, r0, r4)
            X.JiL r2 = r6.A0A
            X.2Fj r1 = r2.A0A
            X.MP9 r0 = new X.MP9
            r0.<init>(r6, r4)
            X.Dba.A15(r5, r1, r0, r4)
            X.2Fj r2 = r2.A09
            r1 = 18
            X.MP9 r0 = new X.MP9
            r0.<init>(r6, r1)
            X.Dba.A15(r5, r2, r0, r4)
            X.Jg0 r0 = r6.A06
            X.2Fk r2 = r0.A00
            r1 = 19
            X.MP9 r0 = new X.MP9
            r0.<init>(r6, r1)
            X.Dba.A15(r5, r2, r0, r4)
            X.6oS r1 = X.C318116oQ.A00(r6)
            r0 = 28
            X.MH9.A03(r6, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61829KNs.<init>(android.app.Application, X.07Z, X.JgD, X.Jft, X.Jg0, com.instagram.common.session.UserSession, X.KOD, X.JiG, X.JiL, X.KNn, X.KO9, X.KOQ, X.KOl, X.KOG, X.KOc, X.KOU, X.KOa, X.KOA, X.KOH, X.KOo, X.KOI, X.KO2, X.KOZ, X.KOJ, X.KOM, X.KOE, X.KOp, X.KOg, X.KOS, X.KOi, X.KOR, X.KOK, X.KOm, X.KOL, X.KOY, X.KOh, X.KOT, X.KOB, X.KOV, com.instagram.creation.sharesheet.update.trial.TrialUseCase, X.KOd, X.KOW, X.KOn, com.instagram.pendingmedia.model.recipients.PendingRecipient, java.lang.String, boolean):void");
    }
}
