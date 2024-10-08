package com.instagram.nux.aymh.viewmodel;

import X.0qQ;
import X.0tS;
import X.1HR;
import X.2YL;
import X.AnonymousClass0aP;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C239803Ii;
import X.C249513ju;
import X.C318116oQ;
import X.C318136oS;
import X.C319606qt;
import X.C41562AwU;
import X.C49837F9c;
import X.C49838F9d;
import X.C49931FFk;
import X.C60937Jtv;
import X.C61079JwH;
import X.DbT;
import X.FB7;
import X.G29;
import X.G2A;
import X.JTw;
import X.VT2;

public final class AymhViewModel extends 2YL {
    public C60937Jtv A00;
    public final C49837F9c A01;
    public final C49838F9d A02;
    public final FB7 A03;
    public final C49931FFk A04;
    public final AggregateAccountLoginHandler A05;
    public final 0tS A06;
    public final C319606qt A07;
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(G29.A00);
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new C41562AwU(this, 12));
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(G2A.A00);
    public final C249513ju A0B = new 1HR(0);

    public final void A01(C61079JwH jwH, AnonymousClass0aP r12, C60937Jtv jtv, C239803Ii r14) {
        0qQ.A0B(r12, 1);
        DbT.A0H(this.A0A).A0B(new VT2(2131973893, true));
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass7TE.A1Z(new JTw((AnonymousClass4D7) null, (Object) this, (Object) jwH, (Object) r12, (Object) r14, (Object) jtv, 20), A002);
    }

    public AymhViewModel() {
        C49837F9c f9c = C49837F9c.A00;
        FB7 fb7 = FB7.A00;
        C49838F9d f9d = C49838F9d.A00;
        C49931FFk fFk = C49931FFk.A00;
        AggregateAccountLoginHandler aggregateAccountLoginHandler = new AggregateAccountLoginHandler(fb7, fFk);
        C319606qt A002 = C319606qt.A00();
        0tS A0h = DbT.A0h();
        AnonymousClass7TG.A1U(f9c, fb7, f9d);
        AnonymousClass7TF.A1E(fFk, 4, A0h);
        this.A01 = f9c;
        this.A03 = fb7;
        this.A02 = f9d;
        this.A04 = fFk;
        this.A05 = aggregateAccountLoginHandler;
        this.A07 = A002;
        this.A06 = A0h;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass0aP r7, com.instagram.nux.aymh.viewmodel.AymhViewModel r8, X.C239803Ii r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 15
            boolean r0 = X.ME6.A02(r3, r10)
            if (r0 == 0) goto L_0x0055
            r5 = r10
            X.ME6 r5 = (X.ME6) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 != r4) goto L_0x005d
            X.0eS.A00(r1)
        L_0x0024:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0027:
            X.0eS.A00(r1)
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0024
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0062
            X.5sO r9 = (X.C297815sO) r9
            java.lang.Object r3 = r9.A00
            X.Kkr r3 = (X.C62691Kkr) r3
            java.lang.Throwable r0 = r3.getCause()
            boolean r0 = r0 instanceof X.C8357QpF
            if (r0 == 0) goto L_0x0024
            X.3ju r2 = r8.A0B
            X.Ffd r1 = new X.Ffd
            r1.<init>(r7, r3, r8)
            X.Ffa r0 = new X.Ffa
            r0.<init>(r1)
            r5.A00 = r4
            java.lang.Object r0 = r2.ELH(r0, r5)
            if (r0 != r6) goto L_0x0024
            return r6
        L_0x0055:
            r0 = 42
            X.ME6 r5 = new X.ME6
            r5.<init>(r8, r10, r3, r0)
            goto L_0x0016
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0062:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.aymh.viewmodel.AymhViewModel.A00(X.0aP, com.instagram.nux.aymh.viewmodel.AymhViewModel, X.3Ii, X.4D7):java.lang.Object");
    }
}
