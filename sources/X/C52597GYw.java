package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GYw  reason: case insensitive filesystem */
public final class C52597GYw extends C251343mx {
    public final GZ2 A00;
    public final UserSession A01;
    public final C52071GDr A02;
    public final I4A A03;
    public final C51979GAc A04;
    public final JT5 A05;
    public final HashMap A06;
    public final HashMap A07;
    public final boolean A08;

    public C52597GYw(GZ2 gz2, UserSession userSession, C52071GDr gDr, I4A i4a, C51979GAc gAc, JT5 jt5, HashMap hashMap, HashMap hashMap2, boolean z) {
        0qQ.A0B(gAc, 1);
        C51974G9v.A1S(userSession, gDr, gz2, hashMap, hashMap2);
        0qQ.A0B(i4a, 7);
        this.A04 = gAc;
        this.A01 = userSession;
        this.A02 = gDr;
        this.A00 = gz2;
        this.A06 = hashMap;
        this.A07 = hashMap2;
        this.A03 = i4a;
        this.A08 = z;
        this.A05 = jt5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.Iec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.Gr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.Gam} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: X.Ieb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.Gr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: X.Iec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.Gr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: X.Iec} */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.JQ1] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.JQ2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r22) {
        /*
            r21 = this;
            r2 = r21
            X.GZ2 r4 = r2.A00
            r3 = 1
            boolean r0 = X.GZ2.A00(r3, r4)
            if (r0 == 0) goto L_0x00f6
            X.GDr r1 = r2.A02
            X.GAc r13 = r2.A04
            com.instagram.common.session.UserSession r6 = r2.A01
            java.lang.Object r11 = r4.A01
            X.GaI r11 = (X.C52644GaI) r11
            r0 = 0
            X.0qQ.A0B(r13, r0)
            X.AnonymousClass7TF.A1B(r6, r3, r11)
            X.GDI r12 = r1.A03
            X.GaQ r10 = new X.GaQ
            r10.<init>(r6, r13)
            X.GaR r7 = new X.GaR
            r7.<init>(r6, r12, r13)
            X.GaT r8 = new X.GaT
            r8.<init>()
            X.GaU r9 = new X.GaU
            r9.<init>()
            X.GaS r5 = new X.GaS
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.I4A r3 = r2.A03
            r1 = 5
            X.GL2 r0 = new X.GL2
            r0.<init>(r3, r1)
            r5.Eb4(r0)
            r1 = 17
            X.InT r0 = new X.InT
            r0.<init>(r3, r1)
            r5.EbC(r0)
            r1 = 41
            X.InR r0 = new X.InR
            r0.<init>(r3, r1)
            r5.A03 = r0
            r1 = 42
            X.InR r0 = new X.InR
            r0.<init>(r3, r1)
            r5.EbD(r0)
            r1 = 54
            X.In7 r0 = new X.In7
            r0.<init>(r3, r1)
            r5.EbA(r0)
            r1 = 55
            X.In7 r0 = new X.In7
            r0.<init>(r3, r1)
            r5.EbE(r0)
            r0 = 56
            X.In7 r1 = new X.In7
            r1.<init>(r3, r0)
            X.Hjo r0 = r5.A09
            r0.A00 = r1
            r1 = 59
            X.Imz r0 = new X.Imz
            r0.<init>(r3, r1)
            r5.A00 = r0
            r1 = 14
            X.InW r0 = new X.InW
            r0.<init>(r3, r1)
            r5.A05 = r0
            r1 = 12
            X.InW r0 = new X.InW
            r0.<init>(r3, r1)
            X.IeY r4 = r5.A0A
            r4.A01 = r0
            r1 = 52
            X.In7 r0 = new X.In7
            r0.<init>(r3, r1)
            r5.A02 = r0
            r1 = 53
            X.In7 r0 = new X.In7
            r0.<init>(r3, r1)
            r5.A01 = r0
            r1 = 38
            X.InR r0 = new X.InR
            r0.<init>(r3, r1)
            r5.A04 = r0
            r1 = 39
            X.InR r0 = new X.InR
            r0.<init>(r3, r1)
            r4.A00 = r0
            r1 = 13
            X.InW r0 = new X.InW
            r0.<init>(r3, r1)
            r5.Ebd(r0)
            r1 = 40
            X.InR r0 = new X.InR
            r0.<init>(r3, r1)
            r5.Ebk(r0)
            r1 = 4
            X.GL2 r0 = new X.GL2
            r0.<init>(r3, r1)
            r5.Eb5(r0)
            java.util.HashMap r4 = r2.A06
            java.util.HashMap r3 = r2.A07
            boolean r1 = r2.A08
            X.JT5 r0 = r2.A05
            X.GaY r12 = new X.GaY
            r14 = r6
            r15 = r11
            r16 = r5
            r17 = r0
            r18 = r4
            r19 = r3
            r20 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return r12
        L_0x00f6:
            r0 = 0
            boolean r0 = X.GZ2.A00(r0, r4)
            if (r0 == 0) goto L_0x0165
            X.GDr r0 = r2.A02
            X.GAc r13 = r2.A04
            java.lang.Object r4 = r4.A01
            X.Gam r4 = (X.C52674Gam) r4
            X.AnonymousClass7TF.A1H(r13, r4)
            X.GDs r6 = r0.A01
            X.GDt r5 = r6.A02
            r0 = 31
            X.Iw1 r3 = X.C58692Iw1.A00(r4, r6, r0)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.GZ3 r1 = new X.GZ3
            r1.<init>(r0, r5, r13, r3)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.Ieb r15 = new X.Ieb
            r15.<init>(r0, r4, r1, r13)
            X.I4A r3 = r2.A03
            r1 = 10
            X.InW r0 = new X.InW
            r0.<init>(r3, r1)
            r15.Ebd(r0)
            r1 = 36
            X.InR r0 = new X.InR
            r0.<init>(r3, r1)
            r15.Ebk(r0)
            r1 = 2
            X.GL2 r0 = new X.GL2
            r0.<init>(r3, r1)
            r15.Eb5(r0)
            r1 = 57
            X.Imz r0 = new X.Imz
            r0.<init>(r3, r1)
            r15.A01 = r0
            r1 = 58
            X.Imz r0 = new X.Imz
            r0.<init>(r3, r1)
            r15.A00 = r0
        L_0x0151:
            com.instagram.common.session.UserSession r14 = r2.A01
            java.util.HashMap r0 = r2.A06
            java.util.HashMap r19 = X.AnonymousClass7TE.A1E()
            X.GZ9 r12 = new X.GZ9
            r17 = r15
            r18 = r0
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            return r12
        L_0x0165:
            r0 = 2
            boolean r0 = X.GZ2.A00(r0, r4)
            if (r0 == 0) goto L_0x01b8
            X.GDr r0 = r2.A02
            X.GAc r13 = r2.A04
            java.lang.Object r4 = r4.A01
            X.Gr0 r4 = (X.C53585Gr0) r4
            X.AnonymousClass7TF.A1H(r13, r4)
            X.GDu r0 = r0.A04
            com.instagram.common.session.UserSession r6 = r0.A00
            java.util.List r1 = r4.A02
            X.GDt r5 = r0.A02
            r0 = 5
            X.IwK r3 = X.C58711IwK.A00(r1, r0)
            com.instagram.common.session.UserSession r1 = r5.A00
            X.GZ3 r0 = new X.GZ3
            r0.<init>(r1, r5, r13, r3)
            X.Iec r15 = new X.Iec
            r15.<init>(r6, r0, r4, r13)
            X.I4A r3 = r2.A03
            r1 = 16
            X.InT r0 = new X.InT
            r0.<init>(r3, r1)
            r15.A01 = r0
            r1 = 37
            X.InR r0 = new X.InR
            r0.<init>(r3, r1)
            r15.A00 = r0
            r1 = 11
            X.InW r0 = new X.InW
            r0.<init>(r3, r1)
            r15.Ebd(r0)
            r1 = 3
            X.GL2 r0 = new X.GL2
            r0.<init>(r3, r1)
            r15.Eb5(r0)
            goto L_0x0151
        L_0x01b8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52597GYw.A0X(X.3Y5):X.3mp");
    }
}
