package X;

import java.util.List;

public abstract class SIU {
    public int A00;
    public int A01;
    public int A02 = -1;
    public List A03;

    public abstract String A03();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.QYx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.QYs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: X.QYw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: X.QYs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: X.QYs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: X.QYs} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r25 = this;
            r1 = r25
            boolean r0 = r1 instanceof X.C7818QYd
            if (r0 == 0) goto L_0x0036
            r6 = r1
            X.QYd r6 = (X.C7818QYd) r6
            X.SSb r5 = r6.A03
            int r0 = r6.A01
            X.SIU r1 = X.C11404SSb.A00(r5, r0)
            boolean r0 = r1 instanceof X.QYz
            r4 = 0
            if (r0 == 0) goto L_0x0034
            X.QYz r1 = (X.QYz) r1
        L_0x0018:
            java.lang.String r3 = "toValue"
            X.SpN r2 = r6.A04
            if (r1 == 0) goto L_0x002e
            double r0 = r1.A05()
            r2.putDouble(r3, r0)
        L_0x0026:
            int r1 = r6.A00
            int r0 = r6.A02
            r5.A0I(r4, r2, r1, r0)
        L_0x002d:
            return
        L_0x002e:
            java.util.Map r0 = r2.A00
            r0.put(r3, r4)
            goto L_0x0026
        L_0x0034:
            r1 = r4
            goto L_0x0018
        L_0x0036:
            boolean r0 = r1 instanceof X.QYv
            if (r0 == 0) goto L_0x0064
            r7 = r1
            X.QYv r7 = (X.QYv) r7
            int[] r6 = r7.A01
            int r5 = r6.length
            r4 = 0
        L_0x0041:
            if (r4 >= r5) goto L_0x002d
            X.SSb r1 = r7.A00
            r0 = r6[r4]
            X.SIU r1 = X.C11404SSb.A00(r1, r0)
            if (r1 == 0) goto L_0x0195
            boolean r0 = r1 instanceof X.QYz
            if (r0 == 0) goto L_0x0195
            X.QYz r1 = (X.QYz) r1
            double r2 = r1.A05()
            if (r4 != 0) goto L_0x005e
            r7.A00 = r2
        L_0x005b:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x005e:
            double r0 = r7.A00
            double r0 = r0 - r2
            r7.A00 = r0
            goto L_0x005b
        L_0x0064:
            boolean r0 = r1 instanceof X.QYu
            if (r0 == 0) goto L_0x0091
            r7 = r1
            X.QYu r7 = (X.QYu) r7
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r7.A00 = r0
            int[] r6 = r7.A00
            int r5 = r6.length
            r4 = 0
        L_0x0073:
            if (r4 >= r5) goto L_0x002d
            X.SSb r1 = r7.A01
            r0 = r6[r4]
            X.SIU r1 = X.C11404SSb.A00(r1, r0)
            if (r1 == 0) goto L_0x019d
            boolean r0 = r1 instanceof X.QYz
            if (r0 == 0) goto L_0x019d
            X.QYz r1 = (X.QYz) r1
            double r2 = r1.A05()
            double r0 = r7.A00
            double r0 = r0 * r2
            r7.A00 = r0
            int r4 = r4 + 1
            goto L_0x0073
        L_0x0091:
            boolean r0 = r1 instanceof X.QYw
            if (r0 == 0) goto L_0x00b2
            r9 = r1
            X.QYw r9 = (X.QYw) r9
            X.SSb r1 = r9.A02
            int r0 = r9.A01
            X.SIU r1 = X.C11404SSb.A00(r1, r0)
            boolean r0 = r1 instanceof X.QYz
            if (r0 == 0) goto L_0x01a5
            X.QYz r1 = (X.QYz) r1
            double r4 = r1.A05()
            double r0 = r9.A00
            double r4 = r4 % r0
            double r4 = r4 + r0
            double r4 = r4 % r0
        L_0x00af:
            r9.A00 = r4
            return
        L_0x00b2:
            boolean r0 = r1 instanceof X.QYy
            if (r0 == 0) goto L_0x00f3
            r0 = r1
            X.QYy r0 = (X.QYy) r0
            X.QYz r1 = r0.A00
            if (r1 == 0) goto L_0x002d
            double r15 = r1.A05()
            java.lang.Integer r1 = r0.A01
            int r2 = r1.intValue()
            r1 = 0
            if (r2 == r1) goto L_0x0239
            r5 = 1
            if (r2 == r5) goto L_0x01f6
            r3 = 2
            java.lang.String r2 = r0.A04
            if (r2 == 0) goto L_0x002d
            double[] r6 = r0.A07
            java.lang.Object r4 = r0.A03
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.DoubleArray>"
            X.0qQ.A0C(r4, r1)
            double[][] r4 = (double[][]) r4
            java.lang.String r13 = r0.A05
            java.lang.String r14 = r0.A06
            X.AnonymousClass7TF.A1C(r6, r3, r4)
            r3 = 1
        L_0x00e6:
            int r1 = r6.length
            int r1 = r1 - r5
            if (r3 >= r1) goto L_0x01ad
            r7 = r6[r3]
            int r1 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r1 >= 0) goto L_0x01ad
            int r3 = r3 + 1
            goto L_0x00e6
        L_0x00f3:
            boolean r0 = r1 instanceof X.QYt
            if (r0 == 0) goto L_0x0137
            r7 = r1
            X.QYt r7 = (X.QYt) r7
            int[] r9 = r7.A01
            int r8 = r9.length
            r6 = 0
            r2 = 0
        L_0x00ff:
            if (r6 >= r8) goto L_0x002d
            r1 = r9[r6]
            int r5 = r2 + 1
            X.SSb r0 = r7.A00
            X.SIU r1 = X.C11404SSb.A00(r0, r1)
            if (r1 == 0) goto L_0x026d
            boolean r0 = r1 instanceof X.QYz
            if (r0 == 0) goto L_0x026d
            X.QYz r1 = (X.QYz) r1
            double r3 = r1.A00
            if (r2 != 0) goto L_0x011d
            r7.A00 = r3
        L_0x0119:
            int r6 = r6 + 1
            r2 = r5
            goto L_0x00ff
        L_0x011d:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0131
            java.lang.String r1 = "Detected a division by zero in Animated.divide node with Animated ID "
            int r0 = r7.A02
            java.lang.String r1 = X.002.A0O(r1, r0)
            X.TQP r0 = new X.TQP
            r0.<init>(r1)
            throw r0
        L_0x0131:
            double r0 = r7.A00
            double r0 = r0 / r3
            r7.A00 = r0
            goto L_0x0119
        L_0x0137:
            boolean r0 = r1 instanceof X.C7829QYx
            if (r0 == 0) goto L_0x0169
            r9 = r1
            X.QYx r9 = (X.C7829QYx) r9
            X.SSb r1 = r9.A04
            int r0 = r9.A03
            X.SIU r1 = X.C11404SSb.A00(r1, r0)
            if (r1 == 0) goto L_0x027b
            boolean r0 = r1 instanceof X.QYz
            if (r0 == 0) goto L_0x027b
            X.QYz r1 = (X.QYz) r1
            double r4 = r1.A05()
            double r2 = r9.A00
            double r0 = r4 - r2
            r9.A00 = r4
            double r2 = r9.A00
            double r2 = r2 + r0
            double r0 = r9.A02
            double r2 = java.lang.Math.max(r2, r0)
            double r0 = r9.A01
            double r4 = java.lang.Math.min(r2, r0)
            goto L_0x00af
        L_0x0169:
            boolean r0 = r1 instanceof X.QYs
            if (r0 == 0) goto L_0x002d
            r9 = r1
            X.QYs r9 = (X.QYs) r9
            r2 = 0
            r9.A00 = r2
            r4 = 0
            int[] r8 = r9.A01
            int r7 = r8.length
            r6 = 0
        L_0x017a:
            if (r6 >= r7) goto L_0x0192
            r1 = r8[r6]
            X.SSb r0 = r9.A00
            X.SIU r1 = X.C11404SSb.A00(r0, r1)
            boolean r0 = r1 instanceof X.QYz
            if (r0 == 0) goto L_0x0283
            X.QYz r1 = (X.QYz) r1
            double r0 = r1.A05()
            double r2 = r2 + r0
            int r6 = r6 + 1
            goto L_0x017a
        L_0x0192:
            double r4 = r4 + r2
            goto L_0x00af
        L_0x0195:
            java.lang.String r1 = "Illegal node ID set as an input for Animated.subtract node"
            X.TQP r0 = new X.TQP
            r0.<init>(r1)
            throw r0
        L_0x019d:
            java.lang.String r1 = "Illegal node ID set as an input for Animated.multiply node"
            X.TQP r0 = new X.TQP
            r0.<init>(r1)
            throw r0
        L_0x01a5:
            java.lang.String r1 = "Illegal node ID set as an input for Animated.modulus node"
            X.TQP r0 = new X.TQP
            r0.<init>(r1)
            throw r0
        L_0x01ad:
            int r3 = r3 - r5
            int r1 = r2.length()
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            r9.<init>(r1)
            java.util.regex.Pattern r1 = X.QYy.A08
            java.util.regex.Matcher r10 = r1.matcher(r2)
            r5 = 0
        L_0x01be:
            boolean r1 = r10.find()
            if (r1 == 0) goto L_0x01ee
            r1 = r4[r3]
            int r2 = r1.length
            if (r5 >= r2) goto L_0x01ee
            r17 = r6[r3]
            int r2 = r3 + 1
            r19 = r6[r2]
            r21 = r1[r5]
            r1 = r4[r2]
            r23 = r1[r5]
            double r1 = X.S99.A00(r13, r14, r15, r17, r19, r21, r23)
            int r11 = (int) r1
            double r7 = (double) r11
            int r12 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r12 != 0) goto L_0x01e9
            java.lang.String r1 = java.lang.String.valueOf(r11)
        L_0x01e3:
            r10.appendReplacement(r9, r1)
            int r5 = r5 + 1
            goto L_0x01be
        L_0x01e9:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x01e3
        L_0x01ee:
            r10.appendTail(r9)
            java.lang.String r1 = X.DbT.A10(r9)
            goto L_0x022d
        L_0x01f6:
            double[] r8 = r0.A07
            java.lang.Object r6 = r0.A03
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.IntArray"
            X.0qQ.A0C(r6, r1)
            int[] r6 = (int[]) r6
            X.AnonymousClass7TF.A1B(r8, r5, r6)
            r4 = 1
        L_0x0206:
            int r1 = r8.length
            int r1 = r1 - r5
            if (r4 >= r1) goto L_0x0213
            r2 = r8[r4]
            int r1 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r1 >= 0) goto L_0x0213
            int r4 = r4 + 1
            goto L_0x0206
        L_0x0213:
            int r4 = r4 - r5
            r7 = r6[r4]
            int r1 = r4 + 1
            r6 = r6[r1]
            if (r7 == r6) goto L_0x0229
            r4 = r8[r4]
            r2 = r8[r1]
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0230
            int r1 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0229
            r7 = r6
        L_0x0229:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
        L_0x022d:
            r0.A02 = r1
            return
        L_0x0230:
            double r15 = r15 - r4
            double r2 = r2 - r4
            double r15 = r15 / r2
            float r1 = (float) r15
            int r7 = X.2eL.A03(r1, r7, r6)
            goto L_0x0229
        L_0x0239:
            double[] r7 = r0.A07
            java.lang.Object r4 = r0.A03
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.DoubleArray"
            X.0qQ.A0C(r4, r1)
            double[] r4 = (double[]) r4
            java.lang.String r13 = r0.A05
            java.lang.String r14 = r0.A06
            X.AnonymousClass7TG.A1O(r7, r4)
            r6 = 1
            r5 = 1
        L_0x024e:
            int r1 = r7.length
            int r1 = r1 - r6
            if (r5 >= r1) goto L_0x025b
            r2 = r7[r5]
            int r1 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r1 >= 0) goto L_0x025b
            int r5 = r5 + 1
            goto L_0x024e
        L_0x025b:
            int r5 = r5 - r6
            r17 = r7[r5]
            int r1 = r5 + 1
            r19 = r7[r1]
            r21 = r4[r5]
            r23 = r4[r1]
            double r1 = X.S99.A00(r13, r14, r15, r17, r19, r21, r23)
            r0.A00 = r1
            return
        L_0x026d:
            java.lang.String r1 = "Illegal node ID set as an input for Animated.divide node with Animated ID "
            int r0 = r7.A02
            java.lang.String r1 = X.002.A0O(r1, r0)
            X.TQP r0 = new X.TQP
            r0.<init>(r1)
            throw r0
        L_0x027b:
            java.lang.String r1 = "Illegal node ID set as an input for Animated.DiffClamp node"
            X.TQP r0 = new X.TQP
            r0.<init>(r1)
            throw r0
        L_0x0283:
            java.lang.String r1 = "Illegal node ID set as an input for Animated.Add node"
            X.TQP r0 = new X.TQP
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SIU.A04():void");
    }

    public static void A02(SIU siu, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(siu.A02);
    }
}
