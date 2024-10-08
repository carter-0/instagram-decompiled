package X;

public final class W1H {
    public final C19872Wgz A00;

    public static float A00(C18634VvU vvU, C18634VvU vvU2, W1H w1h) {
        int i = (int) vvU.A00;
        int i2 = (int) vvU.A01;
        int i3 = (int) vvU2.A00;
        int i4 = (int) vvU2.A01;
        float A02 = A02(w1h, i, i2, i3, i4);
        float A022 = A02(w1h, i3, i4, i, i2);
        if (Float.isNaN(A02)) {
            return A022 / 7.0f;
        }
        if (Float.isNaN(A022)) {
            return A02 / 7.0f;
        }
        return (A02 + A022) / 14.0f;
    }

    public static float A01(W1H w1h, int i, int i2, int i3, int i4) {
        double d;
        double d2;
        int i5 = i2;
        int i6 = i4;
        int i7 = i3;
        int i8 = i;
        boolean z = false;
        int i9 = i5;
        int i10 = i6;
        if (C13988Tno.A06(i6, i5) > C13988Tno.A06(i7, i8)) {
            z = true;
            i9 = i8;
            i8 = i5;
            i10 = i7;
            i7 = i6;
        }
        int A06 = C13988Tno.A06(i7, i8);
        int i11 = i10 - i9;
        int abs = Math.abs(i11);
        int i12 = (-A06) / 2;
        int i13 = -1;
        int i14 = -1;
        if (i8 < i7) {
            i14 = 1;
        }
        if (i9 < i10) {
            i13 = 1;
        }
        int i15 = i7 + i14;
        int i16 = i8;
        int i17 = i9;
        int i18 = 0;
        while (true) {
            if (i16 == i15) {
                break;
            }
            int i19 = i16;
            int i20 = i17;
            if (z) {
                i19 = i17;
                i20 = i16;
            }
            if (AnonymousClass7TF.A1S(i18, 1) == w1h.A00.A03(i19, i20)) {
                if (i18 == 2) {
                    d = (double) (i16 - i8);
                    d2 = (double) (i17 - i9);
                    break;
                }
                i18++;
            }
            i12 += abs;
            if (i12 > 0) {
                if (i17 == i10) {
                    break;
                }
                i17 += i13;
                i12 -= A06;
            }
            i16 += i14;
        }
        if (i18 != 2) {
            return Float.NaN;
        }
        d = (double) (i15 - i8);
        d2 = (double) i11;
        return (float) Math.sqrt((d * d) + (d2 * d2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0254, code lost:
        if (r0 < 0) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0388, code lost:
        r20 = 2.0f;
        r16 = r10 / 2.0f;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0393, code lost:
        if (X.C13990Tnq.A04(r4, r10, r0) >= r16) goto L_0x0564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0395, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0397, code lost:
        if (r0 < 3) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0399, code lost:
        r14 = r4[0];
        r1 = r4[1];
        r0 = r4[2];
        r14 = (r14 + r1) + r0;
        r13 = ((float) (r9 - r0)) - (((float) r1) / 2.0f);
        r12 = (int) r13;
        r11 = r1 * 2;
        r6[0] = 0;
        r6[1] = 0;
        r6[2] = 0;
        r15 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b2, code lost:
        if (r15 < 0) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03ba, code lost:
        if (r38.A03(r12, r15) == false) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03bc, code lost:
        r0 = r6[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03be, code lost:
        if (r0 > r11) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03c0, code lost:
        r6[1] = r0 + 1;
        r15 = r15 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03c7, code lost:
        r1 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03c9, code lost:
        if (r15 < 0) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03cd, code lost:
        if (r6[1] <= r11) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03d3, code lost:
        if (java.lang.Float.isNaN(r1) != false) goto L_0x0564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03d5, code lost:
        r12 = ((float) ((r4[0] + r4[1]) + r4[2])) / 3.0f;
        r3 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03e8, code lost:
        if (r3.hasNext() == false) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03ea, code lost:
        r11 = (X.C15233UWs) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03f4, code lost:
        if (r11.A00(r12, r1, r13) == false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03f6, code lost:
        r3 = (r11.A00 + r13) / 2.0f;
        r0 = (r11.A01 + r1) / 2.0f;
        r4 = r11.A00 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x040b, code lost:
        if (r38.A03(r12, r15) != false) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x040d, code lost:
        r0 = r6[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x040f, code lost:
        if (r0 > r11) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0411, code lost:
        r6[0] = r0 + 1;
        r15 = r15 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0417, code lost:
        if (r15 < 0) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x041c, code lost:
        if (r6[0] <= r11) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x041f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0423, code lost:
        if (r3 >= r29) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x042b, code lost:
        if (r38.A03(r12, r3) == false) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x042d, code lost:
        r0 = r6[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x042f, code lost:
        if (r0 > r11) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0431, code lost:
        r6[1] = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0438, code lost:
        if (r3 == r29) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x043c, code lost:
        if (r6[1] <= r11) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r0 == 1) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0441, code lost:
        if (r3 >= r29) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0449, code lost:
        if (r38.A03(r12, r3) != false) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x044b, code lost:
        r0 = r6[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x044d, code lost:
        if (r0 > r11) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x044f, code lost:
        r6[2] = r0 + 1;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0456, code lost:
        r12 = r6[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0458, code lost:
        if (r12 > r11) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x045a, code lost:
        r0 = r6[0];
        r11 = r6[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0468, code lost:
        if ((X.C13988Tno.A06((r0 + r11) + r12, r14) * 5) >= (r14 * 2)) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x046a, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0471, code lost:
        if (X.C13990Tnq.A04(r6, r10, r0) >= r16) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0473, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0475, code lost:
        if (r0 < 3) goto L_0x046b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0477, code lost:
        r1 = ((float) (r3 - r12)) - (((float) r11) / 2.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x055a, code lost:
        r1.add(new X.C15233UWs(r13, r1, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0564, code lost:
        r21 = r21 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0564, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x023e, code lost:
        if (r0 != 3) goto L_0x0240;
     */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0719  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x071f  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0755  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C10481Rsw A03(java.util.Map r40) {
        /*
            r39 = this;
            r1 = r40
            if (r40 == 0) goto L_0x0009
            X.UwS r0 = X.C16523UwS.NEED_RESULT_POINT_CALLBACK
            r1.get(r0)
        L_0x0009:
            r26 = r39
            r0 = r26
            X.Wgz r0 = r0.A00
            r38 = r0
            X.W1K r6 = new X.W1K
            r6.<init>(r0)
            r8 = 0
            r2 = 1
            if (r40 == 0) goto L_0x0023
            X.UwS r0 = X.C16523UwS.TRY_HARDER
            boolean r0 = r1.containsKey(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            X.Wgz r9 = r6.A01
            int r5 = r9.A00
            int r4 = r9.A02
            int r0 = r5 * 3
            int r3 = r0 / 388
            r7 = 3
            if (r3 < r7) goto L_0x0033
            if (r1 == 0) goto L_0x0034
        L_0x0033:
            r3 = 3
        L_0x0034:
            r35 = 5
            r0 = r35
            int[] r10 = new int[r0]
            int r1 = r3 + -1
            r15 = 0
        L_0x003d:
            if (r1 >= r5) goto L_0x00e7
            if (r15 != 0) goto L_0x00e7
            java.util.Arrays.fill(r10, r8)
            r13 = 0
            r14 = 0
        L_0x0046:
            if (r13 >= r4) goto L_0x00ce
            boolean r11 = r9.A03(r13, r1)
            r12 = 2
            r0 = r14 & 1
            if (r11 == 0) goto L_0x005b
            if (r0 != r2) goto L_0x0055
        L_0x0053:
            int r14 = r14 + 1
        L_0x0055:
            X.C13990Tnq.A1Z(r10, r14)
        L_0x0058:
            int r13 = r13 + 1
            goto L_0x0046
        L_0x005b:
            if (r0 != 0) goto L_0x0055
            r11 = 4
            if (r14 != r11) goto L_0x0053
            boolean r0 = X.W1K.A01(r10)
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r6.A02(r10, r1, r13)
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x007a
            boolean r15 = X.W1K.A00(r6)
        L_0x0074:
            java.util.Arrays.fill(r10, r8)
            r3 = 2
            r14 = 0
            goto L_0x0058
        L_0x007a:
            java.util.ArrayList r11 = r6.A02
            int r0 = r11.size()
            if (r0 <= r2) goto L_0x009b
            r3 = 0
            java.util.Iterator r11 = r11.iterator()
        L_0x0087:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r14 = r11.next()
            X.UWr r14 = (X.C15232UWr) r14
            int r0 = r14.A01
            if (r0 < r12) goto L_0x0087
            if (r3 != 0) goto L_0x009d
            r3 = r14
            goto L_0x0087
        L_0x009b:
            r0 = 0
            goto L_0x00b2
        L_0x009d:
            r6.A00 = r2
            float r11 = r3.A00
            float r0 = r14.A00
            float r11 = X.AnonymousClass7TE.A00(r11, r0)
            float r3 = r3.A01
            float r0 = r14.A01
            float r0 = X.AnonymousClass7TE.A00(r3, r0)
            float r11 = r11 - r0
            int r0 = (int) r11
            int r0 = r0 / r12
        L_0x00b2:
            r3 = r10[r12]
            if (r0 <= r3) goto L_0x0074
            int r0 = r0 - r3
            int r0 = r0 - r12
            int r1 = r1 + r0
            int r13 = r4 + -1
            goto L_0x0074
        L_0x00bc:
            r0 = r10[r12]
            r10[r8] = r0
            r0 = r10[r7]
            r10[r2] = r0
            r0 = r10[r11]
            r10[r12] = r0
            r10[r7] = r2
            r10[r11] = r8
            r14 = 3
            goto L_0x0058
        L_0x00ce:
            boolean r0 = X.W1K.A01(r10)
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r6.A02(r10, r1, r4)
            if (r0 == 0) goto L_0x00e4
            r3 = r10[r8]
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x00e4
            boolean r15 = X.W1K.A00(r6)
        L_0x00e4:
            int r1 = r1 + r3
            goto L_0x003d
        L_0x00e7:
            java.util.ArrayList r0 = r6.A02
            r25 = r0
            int r0 = r25.size()
            if (r0 < r7) goto L_0x07d4
            X.WqO r1 = X.W1K.A04
            r0 = r25
            java.util.Collections.sort(r0, r1)
            double[] r14 = new double[r7]
            X.UWr[] r6 = new X.C15232UWr[r7]
            r15 = 0
            r23 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x0102:
            int r0 = r25.size()
            r5 = 2
            int r0 = r0 - r5
            if (r15 >= r0) goto L_0x01aa
            r0 = r25
            java.lang.Object r11 = r0.get(r15)
            X.UWr r11 = (X.C15232UWr) r11
            float r0 = r11.A00
            r22 = r0
            int r15 = r15 + 1
            r21 = r15
        L_0x011a:
            int r1 = r25.size()
            int r1 = r1 - r2
            r0 = r21
            if (r0 >= r1) goto L_0x0102
            r1 = r25
            java.lang.Object r12 = r1.get(r0)
            X.VvU r12 = (X.C18634VvU) r12
            float r1 = r11.A00
            float r0 = r12.A00
            float r1 = r1 - r0
            double r9 = (double) r1
            float r1 = r11.A01
            float r0 = r12.A01
            float r1 = r1 - r0
            double r0 = (double) r1
            double r9 = r9 * r9
            double r0 = r0 * r0
            double r9 = r9 + r0
            int r21 = r21 + 1
            r20 = r21
        L_0x013e:
            int r1 = r25.size()
            r0 = r20
            if (r0 >= r1) goto L_0x011a
            r1 = r25
            java.lang.Object r13 = r1.get(r0)
            X.UWr r13 = (X.C15232UWr) r13
            float r1 = r13.A00
            r0 = 1068708659(0x3fb33333, float:1.4)
            float r0 = r0 * r22
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01a7
            r14[r8] = r9
            float r1 = r12.A00
            float r0 = r13.A00
            r17 = r0
            float r1 = r1 - r0
            double r3 = (double) r1
            float r1 = r12.A01
            float r0 = r13.A01
            r16 = r0
            float r1 = r1 - r0
            double r0 = (double) r1
            double r3 = r3 * r3
            double r0 = r0 * r0
            double r3 = r3 + r0
            r14[r2] = r3
            float r0 = r11.A00
            float r0 = r0 - r17
            double r3 = (double) r0
            float r0 = r11.A01
            float r0 = r0 - r16
            double r0 = (double) r0
            double r3 = r3 * r3
            double r0 = r0 * r0
            double r3 = r3 + r0
            r14[r5] = r3
            java.util.Arrays.sort(r14)
            r18 = r14[r5]
            r3 = r14[r2]
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = r3 * r16
            double r0 = r18 - r3
            double r3 = java.lang.Math.abs(r0)
            r0 = r14[r8]
            double r0 = r0 * r16
            double r18 = r18 - r0
            double r0 = java.lang.Math.abs(r18)
            double r3 = r3 + r0
            int r0 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a7
            r6[r8] = r11
            r6[r2] = r12
            r6[r5] = r13
            r23 = r3
        L_0x01a7:
            int r20 = r20 + 1
            goto L_0x013e
        L_0x01aa:
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r23 > r3 ? 1 : (r23 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x07d4
            r10 = r6[r8]
            r9 = r6[r2]
            float r11 = X.C18634VvU.A00(r10, r9)
            r4 = r6[r5]
            float r3 = X.C18634VvU.A00(r9, r4)
            float r1 = X.C18634VvU.A00(r10, r4)
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x024d
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x024d
            r11 = r10
            r10 = r9
        L_0x01cf:
            r13 = r4
            float r12 = r11.A00
            float r9 = r11.A01
            float r3 = r4.A00
            float r3 = r3 - r12
            float r0 = r10.A01
            float r0 = r0 - r9
            float r3 = r3 * r0
            float r1 = r4.A01
            float r1 = r1 - r9
            float r0 = r10.A00
            float r0 = r0 - r12
            float r1 = r1 * r0
            float r3 = r3 - r1
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ea
            r4 = r10
            r10 = r13
        L_0x01ea:
            r6[r8] = r10
            r6[r2] = r11
            r6[r5] = r4
            r25 = r6[r8]
            r24 = r6[r2]
            r23 = r6[r5]
            r3 = r24
            r1 = r23
            r0 = r26
            float r10 = A00(r3, r1, r0)
            r1 = r25
            float r0 = A00(r3, r1, r0)
            float r10 = r10 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r0
            r18 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x07d4
            r0 = r23
            float r3 = X.C18634VvU.A00(r3, r0)
            float r3 = r3 / r10
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r1 >= 0) goto L_0x021f
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
        L_0x021f:
            float r3 = r3 + r0
            int r3 = (int) r3
            r1 = r24
            r0 = r25
            float r4 = X.C18634VvU.A00(r1, r0)
            float r4 = r4 / r10
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r1 >= 0) goto L_0x0232
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
        L_0x0232:
            float r4 = r4 + r0
            int r0 = (int) r4
            int r3 = r3 + r0
            int r3 = r3 / r5
            int r27 = r3 + 7
            r0 = r27 & 3
            if (r0 == 0) goto L_0x024a
            if (r0 == r5) goto L_0x0247
            if (r0 == r7) goto L_0x07d4
        L_0x0240:
            int r0 = r27 % 4
            if (r0 != r2) goto L_0x07cf
            int r0 = r27 + -17
            goto L_0x025a
        L_0x0247:
            int r27 = r27 + -1
            goto L_0x0240
        L_0x024a:
            int r27 = r27 + 1
            goto L_0x0240
        L_0x024d:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0256
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            r11 = r9
            if (r0 >= 0) goto L_0x01cf
        L_0x0256:
            r11 = r4
            r4 = r9
            goto L_0x01cf
        L_0x025a:
            int r0 = r0 / 4
            X.W3o r3 = X.C18811W3o.A09(r0)     // Catch:{ IllegalArgumentException -> 0x07ca }
            int r0 = r3.A01
            int r0 = r0 * 4
            int r0 = r0 + 17
            int r1 = r0 + -7
            r26 = 0
            int[] r0 = r3.A02
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0586
            r0 = r23
            float r3 = r0.A00
            r0 = r24
            float r4 = r0.A00
            float r3 = r3 - r4
            r0 = r25
            float r0 = r0.A00
            float r3 = r3 + r0
            r0 = r23
            float r6 = r0.A01
            r0 = r24
            float r9 = r0.A01
            float r6 = r6 - r9
            r0 = r25
            float r0 = r0.A01
            float r6 = r6 + r0
            r36 = 1077936128(0x40400000, float:3.0)
            float r0 = (float) r1
            float r0 = r36 / r0
            float r1 = r18 - r0
            float r3 = r3 - r4
            float r3 = r3 * r1
            float r4 = r4 + r3
            int r0 = (int) r4
            r34 = r0
            float r0 = X.C13988Tno.A00(r6, r9, r1)
            int r0 = (int) r0
            r33 = r0
            r32 = 4
        L_0x02a1:
            r0 = r32
            float r0 = (float) r0
            float r0 = r0 * r10
            int r1 = (int) r0     // Catch:{ R7E -> 0x057a }
            r0 = r34
            int r31 = X.C13988Tno.A07(r0, r1, r8)     // Catch:{ R7E -> 0x057a }
            r0 = r38
            int r0 = r0.A02     // Catch:{ R7E -> 0x057a }
            int r3 = r0 + -1
            int r0 = r34 + r1
            int r9 = java.lang.Math.min(r3, r0)     // Catch:{ R7E -> 0x057a }
            int r9 = r9 - r31
            float r0 = (float) r9     // Catch:{ R7E -> 0x057a }
            float r4 = r36 * r10
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0577
            r0 = r33
            int r30 = X.C13988Tno.A07(r0, r1, r8)     // Catch:{ R7E -> 0x057a }
            r0 = r38
            int r0 = r0.A00     // Catch:{ R7E -> 0x057a }
            r29 = r0
            int r3 = r0 + -1
            int r0 = r33 + r1
            int r28 = java.lang.Math.min(r3, r0)     // Catch:{ R7E -> 0x057a }
            int r28 = r28 - r30
            r0 = r28
            float r0 = (float) r0     // Catch:{ R7E -> 0x057a }
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0577
            java.util.ArrayList r22 = new java.util.ArrayList     // Catch:{ R7E -> 0x057a }
            r1 = r22
            r0 = r35
            r1.<init>(r0)     // Catch:{ R7E -> 0x057a }
            int[] r6 = new int[r7]     // Catch:{ R7E -> 0x057a }
            int r9 = r9 + r31
            int r0 = r28 / 2
            int r30 = r30 + r0
            int[] r4 = new int[r7]     // Catch:{ R7E -> 0x057a }
            r21 = 0
        L_0x02f3:
            r1 = r21
            r0 = r28
            if (r1 >= r0) goto L_0x0568
            r0 = r21 & 1
            int r3 = r21 + 1
            int r3 = r3 / r5
            if (r0 == 0) goto L_0x0301
            int r3 = -r3
        L_0x0301:
            int r3 = r3 + r30
            r4[r8] = r8     // Catch:{ R7E -> 0x057a }
            r4[r2] = r8     // Catch:{ R7E -> 0x057a }
            r4[r5] = r8     // Catch:{ R7E -> 0x057a }
            r1 = r31
        L_0x030b:
            if (r1 >= r9) goto L_0x0318
            r0 = r38
            boolean r0 = r0.A03(r1, r3)     // Catch:{ R7E -> 0x057a }
            if (r0 != 0) goto L_0x0318
            int r1 = r1 + 1
            goto L_0x030b
        L_0x0318:
            r11 = 0
        L_0x0319:
            if (r1 >= r9) goto L_0x0388
            r0 = r38
            boolean r0 = r0.A03(r1, r3)     // Catch:{ R7E -> 0x057a }
            if (r0 == 0) goto L_0x0380
            if (r11 != r2) goto L_0x032a
            X.C13990Tnq.A1Z(r4, r2)     // Catch:{ R7E -> 0x057a }
            goto L_0x0556
        L_0x032a:
            if (r11 != r5) goto L_0x037d
            r20 = 1073741824(0x40000000, float:2.0)
            float r19 = r10 / r20
            r0 = 0
        L_0x0331:
            float r11 = X.C13990Tnq.A04(r4, r10, r0)     // Catch:{ R7E -> 0x057a }
            int r11 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r11 >= 0) goto L_0x054d
            int r0 = r0 + 1
            if (r0 < r7) goto L_0x0331
            r17 = r4[r8]     // Catch:{ R7E -> 0x057a }
            r11 = r4[r2]     // Catch:{ R7E -> 0x057a }
            int r17 = r17 + r11
            r0 = r4[r5]     // Catch:{ R7E -> 0x057a }
            int r17 = r17 + r0
            int r0 = r1 - r0
            float r0 = (float) r0     // Catch:{ R7E -> 0x057a }
            r16 = r0
            float r0 = (float) r11     // Catch:{ R7E -> 0x057a }
            float r0 = r0 / r20
            float r16 = r16 - r0
            r0 = r16
            int r0 = (int) r0     // Catch:{ R7E -> 0x057a }
            r37 = r0
            int r13 = r11 * 2
            r12 = r3
            r6[r8] = r8     // Catch:{ R7E -> 0x057a }
            r6[r2] = r8     // Catch:{ R7E -> 0x057a }
            r6[r5] = r8     // Catch:{ R7E -> 0x057a }
            r14 = r3
        L_0x0360:
            if (r14 < 0) goto L_0x0377
            r11 = r38
            r0 = r37
            boolean r0 = r11.A03(r0, r14)     // Catch:{ R7E -> 0x057a }
            if (r0 == 0) goto L_0x0377
            r0 = r6[r2]     // Catch:{ R7E -> 0x057a }
            if (r0 > r13) goto L_0x0377
            int r0 = r0 + 1
            r6[r2] = r0     // Catch:{ R7E -> 0x057a }
            int r14 = r14 + -1
            goto L_0x0360
        L_0x0377:
            r11 = 2143289344(0x7fc00000, float:NaN)
            if (r14 < 0) goto L_0x0483
            goto L_0x047f
        L_0x037d:
            int r11 = r11 + 1
            goto L_0x0383
        L_0x0380:
            if (r11 != r2) goto L_0x0383
            r11 = 2
        L_0x0383:
            X.C13990Tnq.A1Z(r4, r11)     // Catch:{ R7E -> 0x057a }
            goto L_0x0556
        L_0x0388:
            r20 = 1073741824(0x40000000, float:2.0)
            float r16 = r10 / r20
            r0 = 0
        L_0x038d:
            float r1 = X.C13990Tnq.A04(r4, r10, r0)     // Catch:{ R7E -> 0x057a }
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0564
            int r0 = r0 + 1
            if (r0 < r7) goto L_0x038d
            r14 = r4[r8]     // Catch:{ R7E -> 0x057a }
            r1 = r4[r2]     // Catch:{ R7E -> 0x057a }
            int r14 = r14 + r1
            r0 = r4[r5]     // Catch:{ R7E -> 0x057a }
            int r14 = r14 + r0
            int r0 = r9 - r0
            float r13 = (float) r0     // Catch:{ R7E -> 0x057a }
            float r0 = (float) r1     // Catch:{ R7E -> 0x057a }
            float r0 = r0 / r20
            float r13 = r13 - r0
            int r12 = (int) r13     // Catch:{ R7E -> 0x057a }
            int r11 = r1 * 2
            r6[r8] = r8     // Catch:{ R7E -> 0x057a }
            r6[r2] = r8     // Catch:{ R7E -> 0x057a }
            r6[r5] = r8     // Catch:{ R7E -> 0x057a }
            r15 = r3
        L_0x03b2:
            if (r15 < 0) goto L_0x03c7
            r0 = r38
            boolean r0 = r0.A03(r12, r15)     // Catch:{ R7E -> 0x057a }
            if (r0 == 0) goto L_0x03c7
            r0 = r6[r2]     // Catch:{ R7E -> 0x057a }
            if (r0 > r11) goto L_0x03c7
            int r0 = r0 + 1
            r6[r2] = r0     // Catch:{ R7E -> 0x057a }
            int r15 = r15 + -1
            goto L_0x03b2
        L_0x03c7:
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r15 < 0) goto L_0x03cf
            r0 = r6[r2]     // Catch:{ R7E -> 0x057a }
            if (r0 <= r11) goto L_0x0405
        L_0x03cf:
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ R7E -> 0x057a }
            if (r0 != 0) goto L_0x0564
            r0 = r4[r8]     // Catch:{ R7E -> 0x057a }
            r3 = r4[r2]     // Catch:{ R7E -> 0x057a }
            int r0 = r0 + r3
            r3 = r4[r5]     // Catch:{ R7E -> 0x057a }
            int r0 = r0 + r3
            float r12 = (float) r0     // Catch:{ R7E -> 0x057a }
            float r12 = r12 / r36
            java.util.Iterator r3 = r22.iterator()     // Catch:{ R7E -> 0x057a }
        L_0x03e4:
            boolean r0 = r3.hasNext()     // Catch:{ R7E -> 0x057a }
            if (r0 == 0) goto L_0x055a
            java.lang.Object r11 = r3.next()     // Catch:{ R7E -> 0x057a }
            X.UWs r11 = (X.C15233UWs) r11     // Catch:{ R7E -> 0x057a }
            boolean r0 = r11.A00(r12, r1, r13)     // Catch:{ R7E -> 0x057a }
            if (r0 == 0) goto L_0x03e4
            float r3 = r11.A00     // Catch:{ R7E -> 0x057a }
            float r3 = r3 + r13
            float r3 = r3 / r20
            float r0 = r11.A01     // Catch:{ R7E -> 0x057a }
            float r0 = r0 + r1
            float r0 = r0 / r20
            float r4 = r11.A00     // Catch:{ R7E -> 0x057a }
            float r4 = r4 + r12
            goto L_0x04ba
        L_0x0405:
            r0 = r38
            boolean r0 = r0.A03(r12, r15)     // Catch:{ R7E -> 0x057a }
            if (r0 != 0) goto L_0x041a
            r0 = r6[r8]     // Catch:{ R7E -> 0x057a }
            if (r0 > r11) goto L_0x041a
            int r0 = r0 + 1
            r6[r8] = r0     // Catch:{ R7E -> 0x057a }
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x041a
            goto L_0x0405
        L_0x041a:
            r0 = r6[r8]     // Catch:{ R7E -> 0x057a }
            if (r0 <= r11) goto L_0x041f
            goto L_0x03cf
        L_0x041f:
            int r3 = r3 + 1
            r0 = r29
            if (r3 >= r0) goto L_0x0436
            r0 = r38
            boolean r0 = r0.A03(r12, r3)     // Catch:{ R7E -> 0x057a }
            if (r0 == 0) goto L_0x0436
            r0 = r6[r2]     // Catch:{ R7E -> 0x057a }
            if (r0 > r11) goto L_0x0436
            int r0 = r0 + 1
            r6[r2] = r0     // Catch:{ R7E -> 0x057a }
            goto L_0x041f
        L_0x0436:
            r0 = r29
            if (r3 == r0) goto L_0x03cf
            r0 = r6[r2]     // Catch:{ R7E -> 0x057a }
            if (r0 <= r11) goto L_0x043f
            goto L_0x03cf
        L_0x043f:
            r0 = r29
            if (r3 >= r0) goto L_0x0456
            r0 = r38
            boolean r0 = r0.A03(r12, r3)     // Catch:{ R7E -> 0x057a }
            if (r0 != 0) goto L_0x0456
            r0 = r6[r5]     // Catch:{ R7E -> 0x057a }
            if (r0 > r11) goto L_0x0456
            int r0 = r0 + 1
            r6[r5] = r0     // Catch:{ R7E -> 0x057a }
            int r3 = r3 + 1
            goto L_0x043f
        L_0x0456:
            r12 = r6[r5]     // Catch:{ R7E -> 0x057a }
            if (r12 > r11) goto L_0x03cf
            r0 = r6[r8]     // Catch:{ R7E -> 0x057a }
            r11 = r6[r2]     // Catch:{ R7E -> 0x057a }
            int r0 = r0 + r11
            int r0 = r0 + r12
            int r0 = X.C13988Tno.A06(r0, r14)     // Catch:{ R7E -> 0x057a }
            int r0 = r0 * 5
            int r14 = r14 * 2
            if (r0 >= r14) goto L_0x03cf
            r0 = 0
        L_0x046b:
            float r14 = X.C13990Tnq.A04(r6, r10, r0)     // Catch:{ R7E -> 0x057a }
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x03cf
            int r0 = r0 + 1
            if (r0 < r7) goto L_0x046b
            int r3 = r3 - r12
            float r1 = (float) r3     // Catch:{ R7E -> 0x057a }
            float r0 = (float) r11     // Catch:{ R7E -> 0x057a }
            float r0 = r0 / r20
            float r1 = r1 - r0
            goto L_0x03cf
        L_0x047f:
            r0 = r6[r2]     // Catch:{ R7E -> 0x057a }
            if (r0 <= r13) goto L_0x04c3
        L_0x0483:
            boolean r0 = java.lang.Float.isNaN(r11)     // Catch:{ R7E -> 0x057a }
            if (r0 != 0) goto L_0x054d
            r0 = r4[r8]     // Catch:{ R7E -> 0x057a }
            r12 = r4[r2]     // Catch:{ R7E -> 0x057a }
            int r0 = r0 + r12
            r12 = r4[r5]     // Catch:{ R7E -> 0x057a }
            int r0 = r0 + r12
            float r13 = (float) r0     // Catch:{ R7E -> 0x057a }
            float r13 = r13 / r36
            java.util.Iterator r14 = r22.iterator()     // Catch:{ R7E -> 0x057a }
        L_0x0498:
            boolean r0 = r14.hasNext()     // Catch:{ R7E -> 0x057a }
            if (r0 == 0) goto L_0x0541
            java.lang.Object r12 = r14.next()     // Catch:{ R7E -> 0x057a }
            X.UWs r12 = (X.C15233UWs) r12     // Catch:{ R7E -> 0x057a }
            r0 = r16
            boolean r0 = r12.A00(r13, r11, r0)     // Catch:{ R7E -> 0x057a }
            if (r0 == 0) goto L_0x0498
            float r3 = r12.A00     // Catch:{ R7E -> 0x057a }
            float r3 = r3 + r16
            float r3 = r3 / r20
            float r0 = r12.A01     // Catch:{ R7E -> 0x057a }
            float r0 = r0 + r11
            float r0 = r0 / r20
            float r4 = r12.A00     // Catch:{ R7E -> 0x057a }
            float r4 = r4 + r13
        L_0x04ba:
            float r4 = r4 / r20
            X.UWs r1 = new X.UWs     // Catch:{ R7E -> 0x057a }
            r1.<init>(r3, r0, r4)     // Catch:{ R7E -> 0x057a }
            goto L_0x0584
        L_0x04c3:
            r15 = r38
            r0 = r37
            boolean r0 = r15.A03(r0, r14)     // Catch:{ R7E -> 0x057a }
            if (r0 != 0) goto L_0x04da
            r0 = r6[r8]     // Catch:{ R7E -> 0x057a }
            if (r0 > r13) goto L_0x04da
            int r0 = r0 + 1
            r6[r8] = r0     // Catch:{ R7E -> 0x057a }
            int r14 = r14 + -1
            if (r14 < 0) goto L_0x04da
            goto L_0x04c3
        L_0x04da:
            r0 = r6[r8]     // Catch:{ R7E -> 0x057a }
            if (r0 <= r13) goto L_0x04df
            goto L_0x0483
        L_0x04df:
            int r12 = r12 + 1
            r0 = r29
            if (r12 >= r0) goto L_0x04f6
            r0 = r37
            boolean r0 = r15.A03(r0, r12)     // Catch:{ R7E -> 0x057a }
            if (r0 == 0) goto L_0x04f6
            r0 = r6[r2]     // Catch:{ R7E -> 0x057a }
            if (r0 > r13) goto L_0x04f6
            int r0 = r0 + 1
            r6[r2] = r0     // Catch:{ R7E -> 0x057a }
            goto L_0x04df
        L_0x04f6:
            r0 = r29
            if (r12 == r0) goto L_0x0483
            r0 = r6[r2]     // Catch:{ R7E -> 0x057a }
            if (r0 <= r13) goto L_0x04ff
            goto L_0x0483
        L_0x04ff:
            r0 = r29
            if (r12 >= r0) goto L_0x0516
            r0 = r37
            boolean r0 = r15.A03(r0, r12)     // Catch:{ R7E -> 0x057a }
            if (r0 != 0) goto L_0x0516
            r0 = r6[r5]     // Catch:{ R7E -> 0x057a }
            if (r0 > r13) goto L_0x0516
            int r0 = r0 + 1
            r6[r5] = r0     // Catch:{ R7E -> 0x057a }
            int r12 = r12 + 1
            goto L_0x04ff
        L_0x0516:
            r15 = r6[r5]     // Catch:{ R7E -> 0x057a }
            if (r15 > r13) goto L_0x0483
            r14 = r6[r8]     // Catch:{ R7E -> 0x057a }
            r13 = r6[r2]     // Catch:{ R7E -> 0x057a }
            int r14 = r14 + r13
            int r14 = r14 + r15
            r0 = r17
            int r0 = X.C13988Tno.A06(r14, r0)     // Catch:{ R7E -> 0x057a }
            int r0 = r0 * 5
            int r14 = r17 * 2
            if (r0 >= r14) goto L_0x0483
            r0 = 0
        L_0x052d:
            float r14 = X.C13990Tnq.A04(r6, r10, r0)     // Catch:{ R7E -> 0x057a }
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 >= 0) goto L_0x0483
            int r0 = r0 + 1
            if (r0 < r7) goto L_0x052d
            int r12 = r12 - r15
            float r11 = (float) r12     // Catch:{ R7E -> 0x057a }
            float r0 = (float) r13     // Catch:{ R7E -> 0x057a }
            float r0 = r0 / r20
            float r11 = r11 - r0
            goto L_0x0483
        L_0x0541:
            X.UWs r12 = new X.UWs     // Catch:{ R7E -> 0x057a }
            r0 = r16
            r12.<init>(r0, r11, r13)     // Catch:{ R7E -> 0x057a }
            r0 = r22
            r0.add(r12)     // Catch:{ R7E -> 0x057a }
        L_0x054d:
            r0 = r4[r5]     // Catch:{ R7E -> 0x057a }
            r4[r8] = r0     // Catch:{ R7E -> 0x057a }
            r4[r2] = r2     // Catch:{ R7E -> 0x057a }
            r4[r5] = r8     // Catch:{ R7E -> 0x057a }
            r11 = 1
        L_0x0556:
            int r1 = r1 + 1
            goto L_0x0319
        L_0x055a:
            X.UWs r3 = new X.UWs     // Catch:{ R7E -> 0x057a }
            r3.<init>(r13, r1, r12)     // Catch:{ R7E -> 0x057a }
            r0 = r22
            r0.add(r3)     // Catch:{ R7E -> 0x057a }
        L_0x0564:
            int r21 = r21 + 1
            goto L_0x02f3
        L_0x0568:
            boolean r0 = r22.isEmpty()     // Catch:{ R7E -> 0x057a }
            if (r0 != 0) goto L_0x0577
            r0 = r22
            java.lang.Object r1 = r0.get(r8)     // Catch:{ R7E -> 0x057a }
            X.VvU r1 = (X.C18634VvU) r1     // Catch:{ R7E -> 0x057a }
            goto L_0x0584
        L_0x0577:
            X.R7E r0 = X.R7E.A00     // Catch:{ R7E -> 0x057a }
            throw r0     // Catch:{ R7E -> 0x057a }
        L_0x057a:
            int r32 = r32 << 1
            r1 = 16
            r0 = r32
            if (r0 > r1) goto L_0x0586
            goto L_0x02a1
        L_0x0584:
            r26 = r1
        L_0x0586:
            r0 = r27
            float r4 = (float) r0
            r0 = 1080033280(0x40600000, float:3.5)
            float r4 = r4 - r0
            if (r26 == 0) goto L_0x07a7
            r0 = r26
            float r3 = r0.A00
            float r1 = r0.A01
            r0 = 1077936128(0x40400000, float:3.0)
            float r32 = r4 - r0
        L_0x0598:
            r0 = r24
            float r0 = r0.A00
            r17 = r0
            r0 = r24
            float r15 = r0.A01
            r0 = r23
            float r14 = r0.A00
            float r13 = r0.A01
            r0 = r25
            float r12 = r0.A00
            float r11 = r0.A01
            r28 = 1080033280(0x40600000, float:3.5)
            r29 = r28
            r31 = r28
            r33 = r32
            r34 = r28
            r35 = r4
            r30 = r4
            X.Vt3 r4 = X.C18506Vt3.A00(r28, r29, r30, r31, r32, r33, r34, r35)
            float r9 = r4.A04
            float r29 = r9 * r18
            float r8 = r4.A05
            float r10 = r4.A07
            float r0 = r8 * r10
            float r29 = r29 - r0
            float r7 = r4.A06
            float r30 = r8 * r7
            float r6 = r4.A03
            float r0 = r6 * r18
            float r30 = r30 - r0
            float r31 = r6 * r10
            float r0 = r9 * r7
            float r31 = r31 - r0
            float r5 = r4.A02
            float r32 = r5 * r10
            float r0 = r4.A01
            float r16 = r0 * r18
            float r32 = r32 - r16
            float r4 = r4.A00
            float r33 = r18 * r4
            float r16 = r5 * r7
            float r33 = r33 - r16
            float r7 = r7 * r0
            float r10 = r10 * r4
            float r7 = r7 - r10
            float r35 = r0 * r8
            float r10 = r5 * r9
            float r35 = r35 - r10
            float r5 = r5 * r6
            float r8 = r8 * r4
            float r5 = r5 - r8
            float r4 = r4 * r9
            float r0 = r0 * r6
            float r4 = r4 - r0
            X.Vt3 r0 = new X.Vt3
            r34 = r7
            r36 = r5
            r37 = r4
            r28 = r0
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r4 = r17
            r5 = r15
            r6 = r14
            r7 = r13
            r8 = r3
            r9 = r1
            r10 = r12
            X.Vt3 r10 = X.C18506Vt3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            float r9 = r10.A00
            float r8 = r0.A00
            float r29 = r9 * r8
            float r11 = r10.A03
            float r7 = r0.A01
            float r1 = r11 * r7
            float r29 = r29 + r1
            float r1 = r10.A06
            float r6 = r0.A02
            float r3 = r1 * r6
            float r29 = r29 + r3
            float r5 = r0.A03
            float r30 = r9 * r5
            float r4 = r0.A04
            float r3 = r11 * r4
            float r30 = r30 + r3
            float r3 = r0.A05
            float r12 = r1 * r3
            float r30 = r30 + r12
            float r14 = r0.A06
            float r9 = r9 * r14
            float r13 = r0.A07
            float r11 = r11 * r13
            float r9 = r9 + r11
            float r12 = r0.A08
            float r1 = r1 * r12
            float r9 = r9 + r1
            float r11 = r10.A01
            float r32 = r11 * r8
            float r1 = r10.A04
            float r0 = r1 * r7
            float r32 = r32 + r0
            float r0 = r10.A07
            float r15 = r0 * r6
            float r32 = r32 + r15
            float r33 = r11 * r5
            float r15 = r1 * r4
            float r33 = r33 + r15
            float r15 = r0 * r3
            float r33 = r33 + r15
            float r11 = r11 * r14
            float r1 = r1 * r13
            float r11 = r11 + r1
            float r0 = r0 * r12
            float r0 = r0 + r11
            float r1 = r10.A02
            float r8 = r8 * r1
            float r10 = r10.A05
            float r7 = r7 * r10
            float r8 = r8 + r7
            float r6 = r6 * r18
            float r6 = r6 + r8
            float r5 = r5 * r1
            float r4 = r4 * r10
            float r5 = r5 + r4
            float r3 = r3 * r18
            float r5 = r5 + r3
            float r1 = r1 * r14
            float r10 = r10 * r13
            float r1 = r1 + r10
            float r18 = r18 * r12
            float r1 = r1 + r18
            X.Vt3 r3 = new X.Vt3
            r28 = r3
            r31 = r9
            r34 = r0
            r35 = r6
            r36 = r5
            r37 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            if (r27 <= 0) goto L_0x07d4
            X.Wgz r4 = new X.Wgz
            r1 = r27
            r4.<init>(r1, r1)
            int r7 = r27 * 2
            float[] r6 = new float[r7]
            r5 = 0
        L_0x069c:
            float r8 = (float) r5
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r9
            r1 = 0
        L_0x06a1:
            if (r1 >= r7) goto L_0x06b0
            int r0 = r1 / 2
            float r0 = (float) r0
            float r0 = r0 + r9
            r6[r1] = r0
            int r0 = r1 + 1
            r6[r0] = r8
            int r1 = r1 + 2
            goto L_0x06a1
        L_0x06b0:
            float r0 = r3.A00
            r22 = r0
            float r15 = r3.A01
            float r14 = r3.A02
            float r13 = r3.A03
            float r12 = r3.A04
            float r11 = r3.A05
            float r10 = r3.A06
            float r9 = r3.A07
            float r8 = r3.A08
            int r1 = r7 + -1
            r0 = 0
        L_0x06c7:
            if (r0 >= r1) goto L_0x06f2
            r21 = r6[r0]
            int r20 = r0 + 1
            r19 = r6[r20]
            float r18 = r14 * r21
            float r16 = r11 * r19
            float r18 = r18 + r16
            float r18 = r18 + r8
            float r17 = r22 * r21
            float r16 = r13 * r19
            float r17 = r17 + r16
            float r17 = r17 + r10
            float r17 = r17 / r18
            r6[r0] = r17
            float r21 = r21 * r15
            float r19 = r19 * r12
            float r21 = r21 + r19
            float r21 = r21 + r9
            float r21 = r21 / r18
            r6[r20] = r21
            int r0 = r0 + 2
            goto L_0x06c7
        L_0x06f2:
            r0 = r38
            int r10 = r0.A02
            int r11 = r0.A00
            int r12 = r7 - r2
            r8 = 0
            r0 = 1
        L_0x06fc:
            r15 = 0
            r9 = -1
            if (r8 >= r12) goto L_0x0731
            if (r0 == 0) goto L_0x0731
            r0 = r6[r8]
            int r14 = (int) r0
            int r13 = r8 + 1
            r0 = r6[r13]
            int r1 = (int) r0
            if (r14 < r9) goto L_0x07d4
            if (r14 > r10) goto L_0x07d4
            if (r1 < r9) goto L_0x07d4
            if (r1 > r11) goto L_0x07d4
            if (r14 != r9) goto L_0x0727
            r6[r8] = r15
        L_0x0716:
            r0 = 1
        L_0x0717:
            if (r1 != r9) goto L_0x071f
            r6[r13] = r15
        L_0x071b:
            r0 = 1
        L_0x071c:
            int r8 = r8 + 2
            goto L_0x06fc
        L_0x071f:
            if (r1 != r11) goto L_0x071c
            int r0 = r11 + -1
            float r0 = (float) r0
            r6[r13] = r0
            goto L_0x071b
        L_0x0727:
            if (r14 != r10) goto L_0x072f
            int r0 = r10 + -1
            float r0 = (float) r0
            r6[r8] = r0
            goto L_0x0716
        L_0x072f:
            r0 = 0
            goto L_0x0717
        L_0x0731:
            int r13 = r7 + -2
            r0 = 1
        L_0x0734:
            if (r13 < 0) goto L_0x0767
            if (r0 == 0) goto L_0x0767
            r0 = r6[r13]
            int r12 = (int) r0
            int r8 = r13 + 1
            r0 = r6[r8]
            int r1 = (int) r0
            if (r12 < r9) goto L_0x07d4
            if (r12 > r10) goto L_0x07d4
            if (r1 < r9) goto L_0x07d4
            if (r1 > r11) goto L_0x07d4
            if (r12 != r9) goto L_0x075d
            r6[r13] = r15
        L_0x074c:
            r0 = 1
        L_0x074d:
            if (r1 != r9) goto L_0x0755
            r6[r8] = r15
        L_0x0751:
            r0 = 1
        L_0x0752:
            int r13 = r13 + -2
            goto L_0x0734
        L_0x0755:
            if (r1 != r11) goto L_0x0752
            int r0 = r11 + -1
            float r0 = (float) r0
            r6[r8] = r0
            goto L_0x0751
        L_0x075d:
            if (r12 != r10) goto L_0x0765
            int r0 = r10 + -1
            float r0 = (float) r0
            r6[r13] = r0
            goto L_0x074c
        L_0x0765:
            r0 = 0
            goto L_0x074d
        L_0x0767:
            r9 = 0
        L_0x0768:
            if (r9 >= r7) goto L_0x0782
            r0 = r6[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07c7 }
            int r8 = (int) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07c7 }
            int r0 = r9 + 1
            r0 = r6[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07c7 }
            int r1 = (int) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07c7 }
            r0 = r38
            boolean r0 = r0.A03(r8, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07c7 }
            if (r0 == 0) goto L_0x077f
            int r0 = r9 / 2
            r4.A01(r0, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07c7 }
        L_0x077f:
            int r9 = r9 + 2
            goto L_0x0768
        L_0x0782:
            int r5 = r5 + 1
            r0 = r27
            if (r5 < r0) goto L_0x069c
            if (r26 != 0) goto L_0x079a
            r2 = r25
            r1 = r24
            r0 = r23
            X.VvU[] r0 = new X.C18634VvU[]{r2, r1, r0}
        L_0x0794:
            X.Rsw r1 = new X.Rsw
            r1.<init>(r4, r0)
            return r1
        L_0x079a:
            r3 = r25
            r2 = r24
            r1 = r23
            r0 = r26
            X.VvU[] r0 = new X.C18634VvU[]{r3, r2, r1, r0}
            goto L_0x0794
        L_0x07a7:
            r0 = r23
            float r3 = r0.A00
            r0 = r24
            float r0 = r0.A00
            float r3 = r3 - r0
            r0 = r25
            float r0 = r0.A00
            float r3 = r3 + r0
            r0 = r23
            float r1 = r0.A01
            r0 = r24
            float r0 = r0.A01
            float r1 = r1 - r0
            r0 = r25
            float r0 = r0.A01
            float r1 = r1 + r0
            r32 = r4
            goto L_0x0598
        L_0x07c7:
            X.R7E r0 = X.R7E.A00
            throw r0
        L_0x07ca:
            X.R7F r0 = X.R7F.A00()
            throw r0
        L_0x07cf:
            X.R7F r0 = X.R7F.A00()
            throw r0
        L_0x07d4:
            X.R7E r0 = X.R7E.A00
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1H.A03(java.util.Map):X.Rsw");
    }

    public W1H(C19872Wgz wgz) {
        this.A00 = wgz;
    }

    public static float A02(W1H w1h, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float A01 = A01(w1h, i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = ((float) i) / ((float) (i - i5));
            i5 = 0;
        } else {
            int i7 = w1h.A00.A02;
            if (i5 >= i7) {
                int i8 = i7 - 1;
                f = ((float) (i8 - i)) / ((float) (i5 - i));
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f4 = (float) i2;
        int i9 = (int) (f4 - (((float) (i4 - i2)) * f));
        if (i9 < 0) {
            f3 = (float) (i2 - i9);
        } else {
            int i10 = w1h.A00.A00;
            if (i9 >= i10) {
                i6 = i10 - 1;
                f4 = (float) (i6 - i2);
                f3 = (float) (i9 - i2);
            } else {
                i6 = i9;
                f2 = 1.0f;
                return (A01 + A01(w1h, i, i2, (int) (((float) i) + (((float) (i5 - i)) * f2)), i6)) - 1.0f;
            }
        }
        f2 = f4 / f3;
        return (A01 + A01(w1h, i, i2, (int) (((float) i) + (((float) (i5 - i)) * f2)), i6)) - 1.0f;
    }
}
