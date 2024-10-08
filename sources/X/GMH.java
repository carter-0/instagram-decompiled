package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

public final class GMH extends C251343mx {
    public final int A00;
    public final C376459Ib A01;
    public final 2WX A02;
    public final UserSession A03;
    public final AnonymousClass4GS A04;
    public final C246653ex A05;
    public final AnonymousClass33B A06;
    public final C246853fL A07;
    public final AnonymousClass4DU A08;
    public final AnonymousClass3W1 A09;
    public final AnonymousClass4DV A0A;
    public final C62320sa A0B;
    public final C62320sa A0C;
    public final 0sP A0D;
    public final 0sP A0E;
    public final 0sP A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final int A0K;
    public final GK1 A0L;
    public final WeakReference A0M;

    public static final int[] A04(View view) {
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00f1, code lost:
        if (X.GMK.A04(r30) == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x00d2, code lost:
        if (r5 == X.AnonymousClass05K.A0N) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x030e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r45) {
        /*
            r44 = this;
            r8 = 0
            r9 = r45
            X.0qQ.A0B(r9, r8)
            X.GMS r0 = X.GMS.A00
            X.2Wa r3 = X.C243643Zq.A00(r9, r0)
            r10 = r44
            X.GK1 r5 = r10.A0L
            X.3ex r0 = r10.A05
            r30 = r0
            java.lang.String r14 = r0.A06
            r7 = 1
            X.AnonymousClass7TF.A1B(r5, r7, r14)
            X.19B r4 = X.19B.A00
            X.0qQ.A0B(r4, r7)
            X.19F r0 = X.C262204Co.A00
            X.2V1 r0 = r9.A05
            r27 = r0
            X.3XH r0 = r0.A03
            if (r0 == 0) goto L_0x0315
            X.4Cq r0 = X.C247553gX.A00(r0)
            X.4Cc r2 = r0.ArX()
            r1 = 47
            X.IwR r0 = new X.IwR
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r2)
            X.2Wa r4 = X.C243643Zq.A00(r9, r0)
            java.lang.Object[] r2 = X.C51966G9m.A1b()
            r1 = 17
            X.TTN r0 = new X.TTN
            r0.<init>(r4, r1)
            X.C243773a4.A00(r9, r0, r2)
            java.lang.Object r4 = r4.A03
            X.4Cq r4 = (X.C262224Cq) r4
            X.0Ud r0 = r5.A02
            X.9OO r2 = new X.9OO
            r2.<init>(r14, r0)
            X.109 r1 = X.AnonymousClass10A.A01
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r8)
            r0 = r26
            X.05F r0 = X.10b.A02(r0, r4, r2, r1)
            java.lang.Object r0 = X.GMJ.A00(r9, r0)
            boolean r25 = X.AnonymousClass7TE.A1a(r0)
            X.GMV r0 = X.GMV.A00
            X.2Wa r1 = X.C243643Zq.A00(r9, r0)
            java.lang.Object r2 = r1.A03
            java.lang.Object[] r5 = new java.lang.Object[]{r2}
            r4 = 26
            X.GNG r0 = new X.GNG
            r0.<init>(r4, r1, r10)
            X.C243773a4.A00(r9, r0, r5)
            r4 = 9
            X.MMv r0 = new X.MMv
            r0.<init>(r4, r3, r10)
            X.0sP r40 = X.AnonymousClass3j0.A01(r9, r0)
            r0 = 27
            X.JJU r11 = new X.JJU
            r11.<init>(r0, r3, r10)
            r4 = 15
            X.9Kv r0 = new X.9Kv
            r0.<init>(r11, r4)
            X.2Wa r6 = X.C243643Zq.A00(r9, r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r11}
            r4 = 12
            X.9M0 r0 = new X.9M0
            r0.<init>(r4, r11, r6)
            X.C243773a4.A00(r9, r0, r5)
            java.lang.Object r13 = r6.A03
            X.0sK r13 = (X.0sK) r13
            r4 = 31
            X.GNG r0 = new X.GNG
            r0.<init>(r4, r3, r10)
            X.0sa r24 = X.AnonymousClass3j0.A00(r9, r0)
            android.content.Context r4 = X.C243803a8.A00(r9)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r23 = r4.getColor(r0)
            r0 = r30
            java.lang.Integer r5 = r0.A03
            X.0qQ.A0B(r5, r8)
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            if (r5 == r6) goto L_0x00d4
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r4 = 0
            if (r5 != r0) goto L_0x00d5
        L_0x00d4:
            r4 = 1
        L_0x00d5:
            com.instagram.common.session.UserSession r0 = r10.A03
            r28 = r0
            X.4DU r0 = r10.A08
            r35 = r0
            r35.getModuleName()
            boolean r5 = r10.A0I
            r0 = r28
            X.0qQ.A0B(r0, r7)
            if (r4 == 0) goto L_0x00f3
            if (r5 != 0) goto L_0x00f3
            boolean r0 = X.GMK.A04(r30)
            r15 = 16
            if (r0 != 0) goto L_0x0311
        L_0x00f3:
            r15 = 0
            if (r5 == 0) goto L_0x0311
            java.lang.Integer r0 = X.GMK.A01(r30)
            if (r0 != r6) goto L_0x0105
            if (r2 != 0) goto L_0x0105
            java.lang.Long r0 = X.C51968G9o.A0u()
            r1.A01(r0)
        L_0x0105:
            X.GMn r2 = X.C52297GMn.A00
        L_0x0107:
            X.JLp r2 = (X.C59491JLp) r2
            X.GMW r0 = X.GMW.A00
            X.2Wa r22 = X.C243643Zq.A00(r9, r0)
            X.GMX r0 = X.GMX.A00
            X.2Wa r1 = X.C243643Zq.A00(r9, r0)
            java.lang.Object[] r11 = new java.lang.Object[]{r14}
            r4 = 7
            X.AwZ r0 = new X.AwZ
            r0.<init>(r4, r1, r10, r9)
            X.C243773a4.A00(r9, r0, r11)
            r21 = 4
            X.4DV r11 = r10.A0A
            java.lang.String r4 = r35.getModuleName()
            r0 = r28
            java.lang.Object[] r12 = new java.lang.Object[]{r14, r11, r4, r0}
            r11 = 28
            X.GNG r4 = new X.GNG
            r0 = r22
            r4.<init>(r11, r0, r10)
            X.C243773a4.A00(r9, r4, r12)
            java.lang.Object[] r11 = X.C51968G9o.A1a(r14, r5)
            r5 = 30
            X.GNG r4 = new X.GNG
            r0 = r24
            r4.<init>(r5, r0, r10)
            X.C243773a4.A00(r9, r4, r11)
            X.3XV r17 = X.2WX.A02
            X.3Zh r5 = X.C243573Zh.STRETCH
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            r19 = 3
            r4 = r20
            r0 = r19
            X.2WX r4 = X.G9t.A12(r4, r5, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            X.2WX r0 = X.C51971G9r.A0X(r4, r5, r0, r7)
            r4 = 0
            X.2WX r16 = X.C51971G9r.A0X(r0, r6, r4, r7)
            long r11 = X.C51965G9l.A07(r15)
            int r0 = r10.A0K
            float r0 = (float) r0
            java.lang.Object r1 = r1.A03
            float r1 = X.AnonymousClass7TE.A04(r1)
            float r0 = r0 + r1
            int r0 = (int) r0
            long r0 = X.C51969G9p.A0G(r0)
            java.lang.Integer r15 = X.AnonymousClass05K.A04
            r18 = 0
            X.9JR r12 = X.C51965G9l.A0c(r15, r8, r11)
            r11 = r16
            X.2WX r11 = X.C51974G9v.A0E(r11, r12, r8, r0)
            if (r25 == 0) goto L_0x030e
            r0 = r17
            X.2WX r4 = X.C52112GFg.A01(r0, r4)
            r1 = r26
            r0 = r21
            X.2WX r0 = X.C51971G9r.A0Y(r4, r5, r1, r0)
        L_0x019a:
            X.2WX r17 = r11.A00(r0)
            X.2Wb r4 = X.AnonymousClass7TG.A0S(r27)
            X.GMM r11 = new X.GMM
            r11.<init>(r13)
            java.lang.ref.WeakReference r0 = r10.A0M
            r37 = r0
            java.lang.String r12 = "content_notes_"
            r1 = 95
            int r0 = r10.A00
            java.lang.String r12 = X.002.A0V(r12, r14, r1, r0)
            r0 = r22
            java.lang.Object r0 = r0.A03
            float r0 = X.AnonymousClass7TE.A04(r0)
            long r0 = X.C51965G9l.A06(r0)
            java.lang.Integer r14 = X.AnonymousClass05K.A0A
            r13 = r18
            X.2WX r1 = X.AnonymousClass9JR.A00(r13, r14, r8, r0)
            X.2WX r0 = r10.A02
            X.2WX r27 = r1.A00(r0)
            boolean r0 = r10.A0G
            r41 = r0
            X.9Ib r0 = r10.A01
            r26 = r0
            boolean r0 = r10.A0H
            r22 = r0
            X.4GS r0 = r10.A04
            r16 = r0
            X.33B r0 = r10.A06
            r15 = r0
            X.3fL r14 = r10.A07
            X.0sa r13 = r10.A0C
            boolean r1 = r10.A0J
            X.3W1 r10 = r10.A09
            X.GMN r0 = new X.GMN
            r25 = r0
            r29 = r16
            r31 = r2
            r32 = r15
            r33 = r14
            r34 = r11
            r36 = r10
            r38 = r24
            r39 = r13
            r42 = r22
            r43 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            X.AnonymousClass56V.A01(r0, r12)
            r4.A00(r0)
            java.lang.Object r0 = r3.A03
            X.GMO r0 = (X.GMO) r0
            X.JLq r1 = r0.A00
            X.GMm r0 = X.C52296GMm.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0307
            long r2 = X.C51970G9q.A0I()
            r1 = r20
            r0 = r18
            X.2WX r0 = X.AnonymousClass9JR.A00(r0, r1, r8, r2)
            r13 = 1120403456(0x42c80000, float:100.0)
            X.2WX r10 = X.C51971G9r.A0X(r0, r5, r13, r8)
            java.lang.Integer r12 = X.AnonymousClass05K.A0D
            java.lang.String r1 = "content_notes_container_start"
            r0 = r21
            X.2WX r1 = X.C51971G9r.A0Y(r10, r12, r1, r0)
            X.3b9 r11 = X.C244413b9.ABSOLUTE
            java.lang.Integer r10 = X.AnonymousClass05K.A0Y
            r0 = r19
            X.2WX r14 = X.C51971G9r.A0Y(r1, r10, r11, r0)
            long r0 = X.C51969G9p.A0D()
            X.2WX r16 = X.AnonymousClass9JR.A00(r14, r6, r7, r0)
            X.2V1 r6 = r4.A00
            r22 = r6
            X.2Wb r14 = X.AnonymousClass7TG.A0S(r22)
            X.2V1 r6 = r14.A00
            X.GrV r15 = X.C54000Gxi.A00(r6)
            r6 = r23
            r15.A0B(r6)
            X.Gxi r15 = r15.A0A()
            r6 = r16
            X.C51971G9r.A1D(r15, r14, r4, r6)
            X.9JR r15 = X.C51965G9l.A0c(r5, r8, r2)
            r14 = r20
            r6 = r18
            X.2WX r14 = X.C51973G9u.A0S(r6, r15, r14, r13, r8)
            java.lang.String r15 = "content_notes_container_top"
            r6 = r21
            X.9JS r15 = X.C51965G9l.A0d(r12, r15, r6)
            r6 = r19
            X.2WX r14 = X.C51973G9u.A0T(r14, r15, r10, r11, r6)
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            X.2WX r16 = X.AnonymousClass9JR.A00(r14, r6, r7, r0)
            X.2Wb r14 = X.AnonymousClass7TG.A0S(r22)
            X.2V1 r6 = r14.A00
            X.GrV r15 = X.C54000Gxi.A00(r6)
            r6 = r23
            r15.A0B(r6)
            X.Gxi r15 = r15.A0A()
            r6 = r16
            X.C51971G9r.A1D(r15, r14, r4, r6)
            r6 = r20
            X.9JR r14 = X.C51965G9l.A0c(r6, r8, r2)
            r6 = r18
            X.2WX r14 = X.C51973G9u.A0S(r6, r14, r5, r13, r8)
            java.lang.String r15 = "content_notes_container_end"
            r6 = r21
            X.9JS r15 = X.C51965G9l.A0d(r12, r15, r6)
            r6 = r19
            X.2WX r6 = X.C51973G9u.A0T(r14, r15, r10, r11, r6)
            X.2WX r16 = X.AnonymousClass9JR.A00(r6, r10, r7, r0)
            X.2Wb r14 = X.AnonymousClass7TG.A0S(r22)
            X.2V1 r6 = r14.A00
            X.GrV r15 = X.C54000Gxi.A00(r6)
            r6 = r23
            r15.A0B(r6)
            X.Gxi r15 = r15.A0A()
            r6 = r16
            X.C51971G9r.A1D(r15, r14, r4, r6)
            X.9JR r5 = X.C51965G9l.A0c(r5, r8, r2)
            r3 = r20
            r2 = r18
            X.2WX r5 = X.C51973G9u.A0S(r2, r5, r3, r13, r8)
            java.lang.String r3 = "content_notes_container_bottom"
            r2 = r21
            X.9JS r3 = X.C51965G9l.A0d(r12, r3, r2)
            r2 = r19
            X.2WX r3 = X.C51973G9u.A0T(r5, r3, r10, r11, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A0j
            X.2WX r3 = X.AnonymousClass9JR.A00(r3, r2, r7, r0)
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r22)
            X.2V1 r0 = r2.A00
            X.GrV r1 = X.C54000Gxi.A00(r0)
            r0 = r23
            r1.A0B(r0)
            X.Gxi r0 = r1.A0A()
            X.C51971G9r.A1D(r0, r2, r4, r3)
        L_0x0307:
            r0 = r17
            X.2Tl r0 = X.C243563Zg.A02(r4, r9, r0)
            return r0
        L_0x030e:
            r0 = 0
            goto L_0x019a
        L_0x0311:
            java.lang.Object r2 = r3.A03
            goto L_0x0107
        L_0x0315:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GMH.A0X(X.3Y5):X.3mp");
    }

    public static final void A00(2Wa r2, C59492JLq jLq, GMH gmh, boolean z) {
        C59492JLq jLq2;
        if (z) {
            jLq2 = C52296GMm.A00;
        } else {
            jLq2 = ((GMO) r2.A03).A00;
        }
        r2.A01(new GMO(jLq2, jLq));
        C51968G9o.A1O(gmh.A0D, !jLq.equals(C52296GMm.A00));
    }

    public GMH(C376459Ib r2, 2WX r3, UserSession userSession, GK1 gk1, AnonymousClass4GS r6, C246653ex r7, AnonymousClass33B r8, C246853fL r9, AnonymousClass4DU r10, AnonymousClass3W1 r11, AnonymousClass4DV r12, WeakReference weakReference, C62320sa r14, C62320sa r15, 0sP r16, 0sP r17, 0sP r18, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        C51974G9v.A1P(r7, r11, userSession, r10);
        C51969G9p.A1S(r8, 16, r9);
        C51970G9q.A1O(r15, 21, gk1);
        this.A05 = r7;
        this.A09 = r11;
        this.A03 = userSession;
        this.A08 = r10;
        this.A0K = i;
        this.A02 = r3;
        this.A0D = r16;
        this.A0G = z;
        this.A0H = z2;
        this.A0I = z3;
        this.A0E = r17;
        this.A00 = i2;
        this.A0F = r18;
        this.A01 = r2;
        this.A04 = r6;
        this.A06 = r8;
        this.A07 = r9;
        this.A0M = weakReference;
        this.A0C = r14;
        this.A0A = r12;
        this.A0B = r15;
        this.A0J = z4;
        this.A0L = gk1;
    }
}
