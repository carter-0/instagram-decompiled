package com.instagram.appreciation.funding;

import X.02z;
import X.05G;
import X.0qQ;
import X.0u9;
import X.106;
import X.10b;
import X.1HR;
import X.1Hj;
import X.2YL;
import X.AnonymousClass0Ud;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;
import X.C249513ju;
import X.C266444Yx;
import X.C318116oQ;
import X.C51973G9u;
import X.C51974G9v;
import X.C59721JVf;
import X.C60340gF;
import X.C61052Jvq;
import X.C62706Kl6;
import X.C63041KqW;
import X.C64165LRg;
import X.C64827Lin;
import X.DbS;
import X.G9w;
import X.K23;
import X.K27;
import X.K28;
import X.LHD;
import X.MHA;
import X.N49;
import android.app.Application;

public final class AppreciationBuyAndSendViewModel extends 2YL {
    public final int A00;
    public final int A01;
    public final Application A02;
    public final C64165LRg A03;
    public final C64827Lin A04;
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final LHD A09;
    public final C63041KqW A0A;
    public final String A0B;
    public final String A0C;

    public AppreciationBuyAndSendViewModel(Application application, C64165LRg lRg, LHD lhd, C63041KqW kqW, C64827Lin lin, String str, String str2, int i, int i2) {
        0qQ.A0B(str, 2);
        AnonymousClass7TG.A1S(str2, lin);
        this.A02 = application;
        this.A0B = str;
        this.A00 = i;
        this.A01 = i2;
        this.A0C = str2;
        this.A04 = lin;
        this.A0A = kqW;
        this.A03 = lRg;
        this.A09 = lhd;
        02z A012 = 106.A01(K28.A00);
        this.A07 = A012;
        this.A08 = 10b.A03(A012);
        1HR A0w = G9w.A0w();
        this.A05 = A0w;
        this.A06 = 0u9.A04(A0w);
        MHA.A03(this, C318116oQ.A00(this), 35);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel r14, X.C62709Kl9 r15, X.AnonymousClass4D7 r16) {
        /*
            r2 = r14
            r9 = r15
            r5 = 18
            r6 = r16
            boolean r0 = X.C66146MDy.A02(r5, r6)
            if (r0 == 0) goto L_0x0031
            r1 = r6
            X.MDy r1 = (X.C66146MDy) r1
            int r4 = r1.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x0031
            int r4 = r4 - r3
            r1.A00 = r4
        L_0x001a:
            java.lang.Object r7 = r1.A03
            X.1Hj r0 = X.1Hj.A02
            int r5 = r1.A00
            r6 = 3
            r10 = 2
            r4 = 1
            r3 = 0
            if (r5 == 0) goto L_0x0037
            if (r5 == r4) goto L_0x00cd
            if (r5 == r10) goto L_0x008f
            if (r5 == r6) goto L_0x00cd
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0031:
            X.MDy r1 = new X.MDy
            r1.<init>(r14, r6, r5)
            goto L_0x001a
        L_0x0037:
            X.0eS.A00(r7)
            boolean r5 = r15 instanceof X.K2G
            if (r5 == 0) goto L_0x0081
            X.LRg r8 = r14.A03
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            int r6 = r14.A00
            X.K2G r9 = (X.K2G) r9
            X.Jvb r5 = r9.A00
            java.lang.String r12 = r5.A02
            java.lang.String r13 = r5.A00
            java.lang.String r14 = r5.A01
            X.0qQ.A0B(r12, r10)
            r5 = 0
            X.Jr7 r10 = X.C64165LRg.A00(r8, r7, r5)
            X.JTR.A1K(r10, r6)
            X.LRb r9 = r8.A02
            com.instagram.appreciation.analytics.LoggingFanData r5 = r8.A01
            java.lang.String r11 = r5.A03
            X.0sm r15 = X.0Yt.A0E()
            r9.A02(r10, r11, r12, r13, r14, r15)
            X.3ju r6 = r2.A05
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r3 = 2131953022(0x7f13057e, float:1.9542503E38)
            X.GKO r5 = X.DbS.A0Q(r5, r3)
            X.K23 r3 = new X.K23
            r3.<init>(r5)
            r1.A01 = r2
            r1.A00 = r4
            java.lang.Object r1 = r6.ELH(r3, r1)
        L_0x007e:
            if (r1 != r0) goto L_0x00d4
            return r0
        L_0x0081:
            boolean r5 = r15 instanceof X.K2H
            if (r5 == 0) goto L_0x00d4
            X.C66146MDy.A00(r14, r15, r1, r10)
            java.lang.Object r5 = r14.A02(r1, r3)
            if (r5 != r0) goto L_0x009a
            return r0
        L_0x008f:
            java.lang.Object r9 = r1.A02
            X.Kl9 r9 = (X.C62709Kl9) r9
            java.lang.Object r2 = r1.A01
            com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel r2 = (com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel) r2
            X.0eS.A00(r7)
        L_0x009a:
            X.LRg r10 = r2.A03
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            int r7 = r2.A00
            X.K2H r9 = (X.K2H) r9
            java.lang.String r12 = r9.A01
            X.Jvb r5 = r9.A00
            java.lang.String r13 = r5.A02
            java.lang.String r14 = r5.A00
            java.lang.String r15 = r5.A01
            r16 = r7
            r10.A05(r11, r12, r13, r14, r15, r16)
            X.3ju r7 = r2.A05
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r3 = 2131953018(0x7f13057a, float:1.9542495E38)
            X.GKO r3 = X.DbS.A0Q(r5, r3)
            X.K23 r5 = new X.K23
            r5.<init>(r3)
            r1.A01 = r2
            r3 = 0
            r1.A02 = r3
            r1.A00 = r6
            java.lang.Object r1 = r7.ELH(r5, r1)
            goto L_0x007e
        L_0x00cd:
            java.lang.Object r2 = r1.A01
            com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel r2 = (com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel) r2
            X.0eS.A00(r7)
        L_0x00d4:
            X.Lin r0 = r2.A04
            X.05G r1 = r0.A02
            X.K2L r0 = X.K2L.A00
            X.C41847B3o.A1T(r0, r1, r4)
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel.A00(com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel, X.Kl9, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel r24, X.C62709Kl9 r25, X.AnonymousClass4D7 r26) {
        /*
            r11 = r25
            r8 = r24
            r3 = 33
            r4 = r26
            boolean r0 = X.C66144MDw.A02(r3, r4)
            if (r0 == 0) goto L_0x0032
            r6 = r4
            X.MDw r6 = (X.C66144MDw) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0032
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001c:
            java.lang.Object r2 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 3
            r1 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r9) goto L_0x0038
            if (r0 == r1) goto L_0x0038
            if (r0 == r4) goto L_0x0038
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0032:
            X.MDw r6 = new X.MDw
            r6.<init>(r8, r4, r3)
            goto L_0x001c
        L_0x0038:
            java.lang.Object r8 = r6.A01
            com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel r8 = (com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel) r8
            X.0eS.A00(r2)
            goto L_0x00f5
        L_0x0041:
            X.0eS.A00(r2)
            boolean r0 = r11 instanceof X.K2I
            r7 = 0
            if (r0 == 0) goto L_0x0134
            X.LRg r4 = r8.A03
            X.K2I r11 = (X.K2I) r11
            X.JuK r1 = r11.A01
            java.lang.String r12 = r1.A06
            java.util.List r0 = X.AnonymousClass7TE.A1I(r12)
            r4.A00 = r0
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            int r3 = r8.A00
            boolean r0 = r11.A03
            r4.A04(r2, r3, r0)
            r4.A03(r3, r2)
            int r6 = r1.A03
            int r0 = r3 + r6
            int r2 = r1.A01
            int r5 = r1.A02
            java.lang.String r15 = X.LHD.A00(r3)
            int r14 = r8.A01
            java.lang.String r3 = X.LHD.A00(r14)
            java.lang.String r4 = X.LHD.A00(r2)
            java.lang.String r10 = X.LHD.A00(r6)
            if (r14 != r0) goto L_0x0117
            r13 = 2131820552(0x7f110008, float:1.9273822E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
        L_0x0086:
            X.H6w r3 = new X.H6w
            r3.<init>(r0, r13, r14)
            X.05G r2 = r8.A07
            java.lang.String r13 = r8.A0C
            if (r5 <= 0) goto L_0x010f
            java.lang.Object[] r14 = new java.lang.Object[]{r4, r10}
            r0 = 2131952994(0x7f130562, float:1.9542446E38)
        L_0x0098:
            X.GKO r18 = X.DbS.A0Q(r14, r0)
            java.lang.Object[] r14 = new java.lang.Object[]{r15}
            r0 = 2131952996(0x7f130564, float:1.954245E38)
            X.GKO r19 = X.DbS.A0Q(r14, r0)
            java.lang.String r0 = r1.A05
            if (r6 <= 0) goto L_0x00af
            java.lang.String r10 = X.LHD.A00(r6)
        L_0x00af:
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r0}
            r0 = 2131952995(0x7f130563, float:1.9542448E38)
            X.GKO r21 = X.DbS.A0Q(r10, r0)
            java.lang.String r10 = r1.A07
            r0 = 13
            X.N49 r1 = new X.N49
            r1.<init>(r10, r12, r0)
            X.JwJ r0 = r11.A00
            X.JVf r16 = X.C63042KqX.A00(r0)
            java.lang.Integer r0 = r11.A02
            int r0 = X.C51967G9n.A03(r0, r9)
            r10 = 0
            if (r0 == r9) goto L_0x0101
            if (r0 != r7) goto L_0x016e
            java.lang.String r0 = ""
            X.GKw r0 = X.JUH.A00(r0)
        L_0x00da:
            X.Jvq r15 = new X.Jvq
            r15.<init>((X.C266444Yx) r0, (int) r7, (boolean) r10)
            X.K27 r14 = new X.K27
            r24 = r5
            r25 = r6
            r26 = r7
            r20 = r3
            r22 = r13
            r23 = r4
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.Epw(r14)
        L_0x00f5:
            X.Lin r0 = r8.A04
            X.05G r1 = r0.A02
            X.K2L r0 = X.K2L.A00
            X.C41847B3o.A1T(r0, r1, r9)
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0101:
            java.lang.Object[] r11 = X.AnonymousClass7TF.A1b(r5)
            r10 = 2131820557(0x7f11000d, float:1.9273832E38)
            X.H6w r0 = new X.H6w
            r0.<init>(r11, r10, r5)
            r10 = 1
            goto L_0x00da
        L_0x010f:
            java.lang.Object[] r14 = new java.lang.Object[]{r4}
            r0 = 2131952997(0x7f130565, float:1.9542453E38)
            goto L_0x0098
        L_0x0117:
            if (r5 <= 0) goto L_0x0124
            r13 = 2131820554(0x7f11000a, float:1.9273826E38)
            java.lang.String r0 = r8.A0B
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            goto L_0x0086
        L_0x0124:
            r13 = 2131820553(0x7f110009, float:1.9273824E38)
            java.lang.String r2 = r8.A0B
            int r0 = r0 - r14
            java.lang.String r0 = X.LHD.A00(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r2, r0}
            goto L_0x0086
        L_0x0134:
            boolean r0 = r11 instanceof X.K2K
            if (r0 == 0) goto L_0x0143
            r6.A01 = r8
            r6.A00 = r9
            java.lang.Object r0 = r8.A02(r6, r9)
        L_0x0140:
            if (r0 != r5) goto L_0x00f5
            return r5
        L_0x0143:
            boolean r0 = r11 instanceof X.K2J
            if (r0 == 0) goto L_0x0150
            r6.A01 = r8
            r6.A00 = r1
            java.lang.Object r0 = r8.A02(r6, r7)
            goto L_0x0140
        L_0x0150:
            boolean r0 = r11 instanceof X.K2F
            if (r0 == 0) goto L_0x00f5
            X.LRg r3 = r8.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            int r1 = r8.A00
            X.K2F r11 = (X.K2F) r11
            java.lang.String r0 = r11.A00
            r3.A06(r0, r1, r2)
            X.3ju r1 = r8.A05
            X.K26 r0 = X.K26.A00
            r6.A01 = r8
            r6.A00 = r4
            java.lang.Object r0 = r1.ELH(r0, r6)
            goto L_0x0140
        L_0x016e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel.A01(com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel, X.Kl9, X.4D7):java.lang.Object");
    }

    private final Object A02(AnonymousClass4D7 r16, boolean z) {
        05G r1 = this.A07;
        C62706Kl6 kl6 = (C62706Kl6) r1.getValue();
        if (kl6 instanceof K27) {
            K27 k27 = (K27) kl6;
            String str = k27.A0A;
            C266444Yx r6 = k27.A08;
            C266444Yx r7 = k27.A06;
            C266444Yx r8 = k27.A07;
            C266444Yx r9 = k27.A05;
            N49 n49 = k27.A04;
            int i = k27.A00;
            int i2 = k27.A01;
            String str2 = k27.A09;
            C59721JVf jVf = k27.A03;
            C61052Jvq jvq = k27.A02;
            0qQ.A0B(str, 0);
            C51974G9v.A1P(r6, r7, r8, r9);
            C51973G9u.A0u(5, n49, str2, jVf);
            0qQ.A0B(jvq, 11);
            r1.Epw(new K27(jvq, jVf, n49, r6, r7, r8, r9, str, str2, i, i2, z));
        } else {
            Object ELH = this.A05.ELH(new K23(DbS.A0Q(new Object[0], 2131953022)), r16);
            if (ELH == 1Hj.A02) {
                return ELH;
            }
        }
        return C60340gF.A00;
    }
}
