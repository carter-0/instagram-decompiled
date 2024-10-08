package X;

public abstract class HRJ {
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0083, code lost:
        if (X.0qQ.A0K(r5.Atk(r0), r10.Atk(r0)) != false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x005e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C268794e0 r10, X.0sP r11, int r12) {
        /*
            r8 = 1024(0x400, float:1.435E-42)
            X.4cD r1 = r10.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0132
            X.4cD r7 = r1.A04
            X.5R6 r6 = X.AnonymousClass5WH.A02(r10)
        L_0x000e:
            r9 = 0
            if (r6 == 0) goto L_0x0070
            X.5RP r0 = r6.A0W
            X.4cD r0 = r0.A02
            int r0 = r0.A00
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0061
        L_0x001a:
            if (r7 == 0) goto L_0x0061
            int r0 = r7.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x005e
            r5 = r7
            r4 = r9
        L_0x0023:
            boolean r0 = r5 instanceof X.C268794e0
            if (r0 != 0) goto L_0x0071
            int r0 = r5.A01
            r0 = r0 & r8
            r3 = 1
            if (r0 == 0) goto L_0x0054
            boolean r0 = r5 instanceof X.C267944cV
            if (r0 == 0) goto L_0x0054
            r0 = r5
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x0037:
            if (r2 == 0) goto L_0x0059
            int r0 = r2.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0043
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x0046
            r5 = r2
        L_0x0043:
            X.4cD r2 = r2.A02
            goto L_0x0037
        L_0x0046:
            X.5Pl r4 = X.C51973G9u.A0C(r4)
            if (r5 == 0) goto L_0x0050
            r4.A09(r5)
            r5 = r9
        L_0x0050:
            r4.A09(r2)
            goto L_0x0043
        L_0x0054:
            X.4cD r5 = X.AnonymousClass5WH.A00(r4)
            goto L_0x005b
        L_0x0059:
            if (r1 != r3) goto L_0x0054
        L_0x005b:
            if (r5 == 0) goto L_0x005e
            goto L_0x0023
        L_0x005e:
            X.4cD r7 = r7.A04
            goto L_0x001a
        L_0x0061:
            X.5R6 r6 = r6.A0B()
            if (r6 == 0) goto L_0x006e
            X.5RP r0 = r6.A0W
            if (r0 == 0) goto L_0x006e
            X.4cD r7 = r0.A05
            goto L_0x000e
        L_0x006e:
            r7 = r9
            goto L_0x000e
        L_0x0070:
            r5 = r9
        L_0x0071:
            X.4e0 r5 = (X.C268794e0) r5
            if (r5 == 0) goto L_0x0086
            X.5VK r0 = X.C52312GNe.A00
            java.lang.Object r1 = r5.Atk(r0)
            java.lang.Object r0 = r10.Atk(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0086
        L_0x0085:
            return r9
        L_0x0086:
            X.5VK r0 = X.C52312GNe.A00
            java.lang.Object r4 = r10.Atk(r0)
            X.6Hk r4 = (X.C305316Hk) r4
            if (r4 == 0) goto L_0x0085
            r0 = 5
            if (r12 != r0) goto L_0x0101
            r8 = 5
        L_0x0094:
            X.6Hj r4 = (X.C305306Hj) r4
            X.6Hh r7 = r4.A02
            int r0 = r7.getItemCount()
            if (r0 <= 0) goto L_0x0124
            boolean r0 = r7.BCT()
            if (r0 == 0) goto L_0x0124
            boolean r0 = X.C305306Hj.A01(r4, r8)
            if (r0 == 0) goto L_0x00fc
            int r2 = r7.BLE()
        L_0x00ae:
            X.0rm r6 = X.C51965G9l.A11()
            X.6H6 r1 = r4.A01
            X.6H7 r0 = new X.6H7
            r0.<init>(r2, r2)
            X.5Pl r5 = r1.A00
            r5.A09(r0)
            r6.A00 = r0
            r9 = 0
        L_0x00c1:
            java.lang.Object r0 = r6.A00
            X.6H7 r0 = (X.AnonymousClass6H7) r0
            boolean r0 = X.C305306Hj.A00(r0, r4, r8)
            if (r0 == 0) goto L_0x011b
            java.lang.Object r0 = r6.A00
            X.6H7 r0 = (X.AnonymousClass6H7) r0
            int r3 = r0.A01
            int r2 = r0.A00
            boolean r0 = X.C305306Hj.A01(r4, r8)
            if (r0 == 0) goto L_0x00f9
            int r2 = r2 + 1
        L_0x00db:
            X.6H7 r1 = new X.6H7
            r1.<init>(r3, r2)
            r5.A09(r1)
            java.lang.Object r0 = r6.A00
            r5.A0B(r0)
            r6.A00 = r1
            r7.ECv()
            X.IGA r0 = new X.IGA
            r0.<init>(r4, r6, r8)
            java.lang.Object r9 = r11.invoke(r0)
            if (r9 != 0) goto L_0x011b
            goto L_0x00c1
        L_0x00f9:
            int r3 = r3 + -1
            goto L_0x00db
        L_0x00fc:
            int r2 = r7.B67()
            goto L_0x00ae
        L_0x0101:
            r0 = 6
            if (r12 != r0) goto L_0x0106
            r8 = 6
            goto L_0x0094
        L_0x0106:
            r0 = 3
            if (r12 != r0) goto L_0x010b
            r8 = 3
            goto L_0x0094
        L_0x010b:
            r0 = 4
            if (r12 != r0) goto L_0x0110
            r8 = 4
            goto L_0x0094
        L_0x0110:
            r0 = 1
            if (r12 != r0) goto L_0x0115
            r8 = 2
            goto L_0x0094
        L_0x0115:
            r0 = 2
            if (r12 != r0) goto L_0x012b
            r8 = 1
            goto L_0x0094
        L_0x011b:
            java.lang.Object r0 = r6.A00
            r5.A0B(r0)
            r7.ECv()
            return r9
        L_0x0124:
            X.6Hl r0 = X.C305306Hj.A05
            java.lang.Object r9 = r11.invoke(r0)
            return r9
        L_0x012b:
            java.lang.String r0 = "Unsupported direction for beyond bounds layout"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0132:
            java.lang.String r0 = "visitAncestors called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HRJ.A00(X.4e0, X.0sP, int):java.lang.Object");
    }
}
