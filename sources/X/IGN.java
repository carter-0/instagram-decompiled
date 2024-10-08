package X;

import java.util.List;

public final class IGN implements AnonymousClass5RD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C52754Gc7 A01;
    public final /* synthetic */ JS3 A02;
    public final /* synthetic */ C285975Tl A03;
    public final /* synthetic */ C268024cd A04;
    public final /* synthetic */ 0sP A05;

    public final /* synthetic */ int CmW(C268014cc r2, List list, int i) {
        return C52407GRi.A00(r2, this, list, i);
    }

    public final /* synthetic */ int CoP(C268014cc r2, List list, int i) {
        return C52407GRi.A02(r2, this, list, i);
    }

    public final /* synthetic */ int CoS(C268014cc r2, List list, int i) {
        return C52407GRi.A03(r2, this, list, i);
    }

    public IGN(C52754Gc7 gc7, JS3 js3, C285975Tl r3, C268024cd r4, 0sP r5, int i) {
        this.A01 = gc7;
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = js3;
        this.A04 = r4;
        this.A00 = i;
    }

    public final int CmZ(C268014cc r4, List list, int i) {
        C52754Gc7 gc7 = this.A01;
        gc7.A01.A00(r4.getLayoutDirection());
        AnonymousClass62Z r0 = gc7.A01.A00;
        if (r0 != null) {
            return AnonymousClass5iI.A00(r0.BP9());
        }
        throw AnonymousClass7TE.A0z("layoutIntrinsics must be called first");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C289145d6 Cnx(X.C268004cb r35, java.util.List r36, long r37) {
        /*
            r34 = this;
            r7 = r34
            X.Gc7 r6 = r7.A01
            androidx.compose.runtime.snapshots.Snapshot r3 = X.AnonymousClass5PH.A02()
            r16 = 0
            if (r3 == 0) goto L_0x0015
            X.0sP r2 = r3.A05()
        L_0x0010:
            androidx.compose.runtime.snapshots.Snapshot r1 = X.AnonymousClass5PH.A03(r3)
            goto L_0x0018
        L_0x0015:
            r2 = r16
            goto L_0x0010
        L_0x0018:
            X.5Oz r0 = r6.A0C     // Catch:{ all -> 0x01fe }
            r30 = r0
            java.lang.Object r5 = r30.getValue()     // Catch:{ all -> 0x01fe }
            X.I1h r5 = (X.C56553I1h) r5     // Catch:{ all -> 0x01fe }
            X.AnonymousClass5PH.A06(r3, r1, r2)
            if (r5 == 0) goto L_0x01ec
            X.62f r4 = r5.A02
        L_0x0029:
            X.Hr4 r9 = r6.A01
            r33 = r35
            X.5Q8 r17 = r33.getLayoutDirection()
            r31 = r37
            if (r4 == 0) goto L_0x0162
            X.5Tq r13 = r9.A02
            X.5Z4 r0 = r9.A03
            r21 = r0
            java.util.List r12 = r9.A06
            r11 = 2147483647(0x7fffffff, float:NaN)
            boolean r8 = r9.A07
            r3 = 1
            X.4cd r2 = r9.A05
            X.5Uu r15 = r9.A04
            X.62Y r1 = r4.A04
            X.62d r10 = r4.A03
            X.62Z r0 = r10.A03
            boolean r0 = r0.BC8()
            if (r0 != 0) goto L_0x0162
            X.5Tq r0 = r1.A03
            r20 = r0
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 == 0) goto L_0x0162
            X.5Z4 r13 = r1.A04
            r0 = r21
            boolean r0 = r13.A0E(r0)
            if (r0 == 0) goto L_0x0162
            java.util.List r0 = r1.A08
            r23 = r0
            boolean r0 = X.0qQ.A0K(r0, r12)
            if (r0 == 0) goto L_0x0162
            int r14 = r1.A00
            if (r14 != r11) goto L_0x0162
            boolean r13 = r1.A09
            if (r13 != r8) goto L_0x0162
            int r12 = r1.A01
            if (r12 != r3) goto L_0x0162
            X.4cd r11 = r1.A06
            boolean r0 = X.0qQ.A0K(r11, r2)
            if (r0 == 0) goto L_0x0162
            X.5Q8 r3 = r1.A07
            r0 = r17
            if (r3 != r0) goto L_0x0162
            X.5Uu r2 = r1.A05
            boolean r0 = X.0qQ.A0K(r2, r15)
            if (r0 == 0) goto L_0x0162
            int r15 = androidx.compose.ui.unit.Constraints.A03(r31)
            long r0 = r1.A02
            r18 = r0
            int r0 = androidx.compose.ui.unit.Constraints.A03(r18)
            if (r15 != r0) goto L_0x0162
            if (r8 == 0) goto L_0x00b7
            int r1 = androidx.compose.ui.unit.Constraints.A01(r31)
            int r0 = androidx.compose.ui.unit.Constraints.A01(r18)
            if (r1 != r0) goto L_0x0162
            int r1 = androidx.compose.ui.unit.Constraints.A00(r31)
            int r0 = androidx.compose.ui.unit.Constraints.A00(r18)
            if (r1 != r0) goto L_0x0162
        L_0x00b7:
            X.62Y r8 = new X.62Y
            r17 = r8
            r18 = r20
            r19 = r21
            r20 = r2
            r21 = r11
            r22 = r3
            r24 = r14
            r25 = r12
            r26 = r31
            r28 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            float r0 = r10.A01
            int r1 = X.AnonymousClass5iI.A00(r0)
            float r0 = r10.A00
            int r0 = X.AnonymousClass5iI.A00(r0)
            long r2 = X.C289155d7.A00(r1, r0)
            r0 = r31
            long r0 = X.AnonymousClass5SF.A07(r0, r2)
            X.62f r2 = new X.62f
            r2.<init>(r10, r8, r0)
        L_0x00eb:
            long r0 = r2.A02
            int r3 = X.C51965G9l.A04(r0)
            int r8 = X.C289005cr.A00(r0)
            boolean r0 = X.0qQ.A0K(r4, r2)
            if (r0 != 0) goto L_0x011c
            if (r5 == 0) goto L_0x0101
            X.4ch r0 = r5.A00
            r16 = r0
        L_0x0101:
            X.I1h r1 = new X.I1h
            r0 = r16
            r1.<init>(r0, r2)
            r0 = r30
            r0.Epw(r1)
            r0 = 0
            r6.A06 = r0
            X.0sP r0 = r7.A05
            r0.invoke(r2)
            X.5Tl r1 = r7.A03
            X.JS3 r0 = r7.A02
            X.C52694Gb6.A02(r6, r0, r1)
        L_0x011c:
            X.4cd r5 = r7.A04
            int r4 = r7.A00
            r0 = 1
            r1 = 0
            if (r4 != r0) goto L_0x0160
            X.62d r0 = r2.A03
            float r0 = r0.A03(r1)
            int r0 = X.AnonymousClass5iI.A00(r0)
        L_0x012e:
            float r0 = r5.Ezw(r0)
            X.5Oz r1 = r6.A0D
            X.5d0 r0 = X.C51965G9l.A0T(r0)
            r1.Epw(r0)
            X.5iZ r1 = X.C292185iX.A00
            float r0 = r2.A00
            int r0 = java.lang.Math.round(r0)
            X.0eP r4 = X.AnonymousClass7TF.A0x(r1, r0)
            X.5iZ r1 = X.C292185iX.A01
            float r0 = r2.A01
            int r0 = java.lang.Math.round(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.LinkedHashMap r2 = X.DbY.A0p(r1, r0, r4)
            X.Iz8 r1 = X.C58883Iz8.A00
            r0 = r33
            X.5d6 r0 = r0.Cfi(r2, r1, r3, r8)
            return r0
        L_0x0160:
            r0 = 0
            goto L_0x012e
        L_0x0162:
            r0 = r17
            r9.A00(r0)
            int r2 = androidx.compose.ui.unit.Constraints.A03(r31)
            boolean r10 = r9.A07
            r1 = 0
            if (r10 == 0) goto L_0x01e8
            boolean r0 = androidx.compose.ui.unit.Constraints.A07(r31)
            if (r0 == 0) goto L_0x01e8
            int r3 = androidx.compose.ui.unit.Constraints.A01(r31)
        L_0x017a:
            r25 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L_0x018f
            X.62Z r0 = r9.A00
            if (r0 == 0) goto L_0x01f7
            float r0 = r0.BP9()
            int r0 = X.AnonymousClass5iI.A00(r0)
            int r3 = X.C229632nm.A03(r0, r2, r3)
        L_0x018f:
            X.62Z r2 = r9.A00
            if (r2 == 0) goto L_0x01f0
            int r0 = androidx.compose.ui.unit.Constraints.A00(r31)
            long r21 = X.C288985co.A04(r1, r3, r1, r0)
            r26 = 1
            X.62d r8 = new X.62d
            r18 = r8
            r19 = r2
            r20 = r25
            r23 = r1
            r18.<init>(r19, r20, r21, r23)
            float r0 = r8.A01
            int r1 = X.AnonymousClass5iI.A00(r0)
            float r0 = r8.A00
            int r0 = X.AnonymousClass5iI.A00(r0)
            long r2 = X.C289155d7.A00(r1, r0)
            r0 = r31
            long r0 = X.AnonymousClass5SF.A07(r0, r2)
            X.5Tq r13 = r9.A02
            X.5Z4 r12 = r9.A03
            java.util.List r11 = r9.A06
            X.4cd r2 = r9.A05
            X.5Uu r9 = r9.A04
            X.62Y r3 = new X.62Y
            r18 = r3
            r19 = r13
            r20 = r12
            r21 = r9
            r22 = r2
            r23 = r17
            r24 = r11
            r27 = r31
            r29 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r29)
            X.62f r2 = new X.62f
            r2.<init>(r8, r3, r0)
            goto L_0x00eb
        L_0x01e8:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x017a
        L_0x01ec:
            r4 = r16
            goto L_0x0029
        L_0x01f0:
            java.lang.String r0 = "layoutIntrinsics must be called first"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x01f7:
            java.lang.String r0 = "layoutIntrinsics must be called first"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x01fe:
            r0 = move-exception
            X.AnonymousClass5PH.A06(r3, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IGN.Cnx(X.4cb, java.util.List, long):X.5d6");
    }
}
