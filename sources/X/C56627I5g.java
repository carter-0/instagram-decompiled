package X;

/* renamed from: X.I5g  reason: case insensitive filesystem */
public abstract class C56627I5g {
    public static final int A00(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    public static final void A03(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    public static final boolean A04(C56013HrL hrL, int[] iArr, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (hrL.A09.A02(iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (hrL.A09.A02(iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int A01 = hrL.A09.A01(0);
        if (A01 == 0 || A01 == -1 || A01 == -2) {
            return false;
        }
        return true;
    }

    public static final int A01(int[] iArr, long j) {
        int A02 = C51968G9o.A02(j);
        int i = AnonymousClass972.MUTABLE_FLAG_MASK;
        for (int A04 = C51965G9l.A04(j); A04 < A02; A04++) {
            i = Math.max(i, iArr[A04]);
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0366, code lost:
        r1 = A00(r3, X.AnonymousClass972.MUTABLE_FLAG_MASK);
        r12 = -1;
        r11 = X.AnonymousClass972.MUTABLE_FLAG_MASK;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0370, code lost:
        if (r10 >= r7) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0372, code lost:
        r0 = r4[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0374, code lost:
        if (r11 >= r0) goto L_0x0378;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0376, code lost:
        r12 = r10;
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0378, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x037b, code lost:
        if (r1 == r12) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0381, code lost:
        if (r3[r1] != r3[r12]) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0383, code lost:
        r1 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0384, code lost:
        r10 = r4[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0388, code lost:
        if (r10 != -1) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x038a, code lost:
        r10 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x038c, code lost:
        r12 = r2.A09;
        r11 = r12.A02(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0392, code lost:
        if (r11 >= 0) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0394, code lost:
        if (r30 != false) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x039a, code lost:
        if (A04(r2, r4, r3, r1) == false) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x039c, code lost:
        if (r54 == false) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x039e, code lost:
        r12.A03();
        r10 = new int[r7];
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03a4, code lost:
        if (r0 >= r7) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03a6, code lost:
        r10[r0] = -1;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03ab, code lost:
        r30 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03ae, code lost:
        r14 = r2.A00(r20, r11, r1);
        r29 = X.C51968G9o.A02(r14);
        r10 = X.C51965G9l.A04(r14);
        r1 = r29 - r10;
        r16 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03c4, code lost:
        if (r1 == 1) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03c6, code lost:
        r16 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x03c8, code lost:
        r12.A05(r11, r16);
        r16 = r2.A0A.A00(r11, r14);
        r14 = A01(r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x03d9, code lost:
        if (r1 == 1) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x03db, code lost:
        r12 = r12.A06(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x03e1, code lost:
        if (r10 >= r29) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x03e5, code lost:
        if (r3[r10] == r14) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x03e7, code lost:
        r30 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x03e9, code lost:
        r0 = r16;
        r21[r10].addFirst(r0);
        r4[r10] = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x03f2, code lost:
        if (r12 != null) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03f4, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03f5, code lost:
        r3[r10] = (r0.A09 + r14) + r1;
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03fe, code lost:
        r1 = r12[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0401, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0407, code lost:
        r7 = new int[r9];
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x040a, code lost:
        if (r4 >= r9) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x040c, code lost:
        r7[r4] = r3[r1];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x045b, code lost:
        if (java.lang.Math.abs(r10) < java.lang.Math.abs(r8)) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0504, code lost:
        if (r4[r1] > r8) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0523, code lost:
        if (r11 == null) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00af, code lost:
        r6 = -1;
        r9 = X.AnonymousClass972.MUTABLE_FLAG_MASK;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b3, code lost:
        if (r1 >= r7) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        r0 = r4[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
        if (r9 >= r0) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        r6 = r1;
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x06dc, code lost:
        r48 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        r10 = r4[r6];
        r11 = r3.length;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        if (r9 >= r11) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c8, code lost:
        if (r4[r9] == r4[r6]) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ca, code lost:
        r1 = r3[r9];
        r0 = r3[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        if (r1 >= r0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d0, code lost:
        r3[r9] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d2, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d5, code lost:
        r12 = r2.A09;
        r11 = r12.A02(r10, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00db, code lost:
        if (r11 < 0) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dd, code lost:
        r0 = r2.A00(r20, r11, r6);
        r13 = X.C51968G9o.A02(r0);
        r10 = X.C51965G9l.A04(r0);
        r9 = r13 - r10;
        r5 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        if (r9 == 1) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f1, code lost:
        r5 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f2, code lost:
        r12.A05(r11, r5);
        r5 = r2.A0A.A00(r11, r0);
        r14 = A01(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ff, code lost:
        if (r9 == 1) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0101, code lost:
        r6 = r12.A06(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        if (r10 >= r13) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0107, code lost:
        r4[r10] = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0109, code lost:
        if (r6 != null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010b, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010c, code lost:
        r1 = (r5.A09 + r14) + r0;
        r3[r10] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0115, code lost:
        if ((r2.A03 + r1) > 0) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0117, code lost:
        r50 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0119, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011c, code lost:
        r0 = r6[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011f, code lost:
        r6 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x05f4 A[LOOP:33: B:288:0x04ed->B:345:0x05f4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0523 A[EDGE_INSN: B:476:0x0523->B:299:0x0523 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.IGX A02(X.C56013HrL r50, int[] r51, int[] r52, int r53, boolean r54) {
        /*
            r2 = r50
            r8 = r53
            X.6Iq r0 = r2.A07
            r53 = r0
            X.JSj r0 = r2.A08
            r20 = r0
            int r17 = r20.getItemCount()
            r4 = r51
            r3 = r52
            if (r17 <= 0) goto L_0x0724
            int r0 = r2.A02
            r26 = r0
            if (r0 == 0) goto L_0x0724
            int r0 = r4.length
            int[] r4 = java.util.Arrays.copyOf(r4, r0)
            X.0qQ.A07(r4)
            int r0 = r3.length
            int[] r3 = java.util.Arrays.copyOf(r3, r0)
            X.0qQ.A07(r3)
            int r7 = r4.length
            int r5 = r7 + -1
            if (r5 < 0) goto L_0x0071
        L_0x0031:
            int r9 = r5 + -1
        L_0x0033:
            r1 = r4[r5]
            r0 = r17
            if (r1 >= r0) goto L_0x0066
            X.I24 r1 = r2.A09
            r0 = r4[r5]
            int r6 = r1.A01(r0)
            if (r6 == r5) goto L_0x0049
            r0 = -1
            if (r6 == r0) goto L_0x0049
            r0 = -2
            if (r6 != r0) goto L_0x0066
        L_0x0049:
            r0 = r4[r5]
            if (r0 < 0) goto L_0x0062
            r6 = r4[r5]
            r0 = r20
            X.IFP r0 = (X.IFP) r0
            X.GeU r0 = r0.A01
            X.HpY r0 = r0.A01
            boolean r0 = r0.A00(r6)
            if (r0 != 0) goto L_0x0062
            r0 = r4[r5]
            r1.A05(r0, r5)
        L_0x0062:
            if (r9 < 0) goto L_0x0071
            r5 = r9
            goto L_0x0031
        L_0x0066:
            r1 = r4[r5]
            X.I24 r0 = r2.A09
            int r0 = r0.A02(r1, r5)
            r4[r5] = r0
            goto L_0x0033
        L_0x0071:
            int r0 = -r8
            A03(r3, r0)
            r0 = r26
            X.01W[] r0 = new X.01W[r0]
            r21 = r0
            r5 = 0
        L_0x007c:
            r0 = r26
            if (r5 >= r0) goto L_0x0090
            r0 = 16
            X.01W r1 = new X.01W
            r1.<init>()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.A01 = r0
            r21[r5] = r1
            int r5 = r5 + 1
            goto L_0x007c
        L_0x0090:
            int r0 = r2.A01
            r24 = r0
            int r0 = -r0
            r25 = r0
            A03(r3, r0)
            r50 = 0
        L_0x009c:
            r5 = 0
            r6 = 0
        L_0x009e:
            if (r6 >= r7) goto L_0x0125
            r9 = r4[r6]
            r1 = r3[r6]
            int r0 = r2.A04
            int r0 = -r0
            int r0 = java.lang.Math.max(r0, r5)
            if (r1 >= r0) goto L_0x0121
            if (r9 <= 0) goto L_0x0121
            r6 = -1
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
        L_0x00b3:
            if (r1 >= r7) goto L_0x00be
            r0 = r4[r1]
            if (r9 >= r0) goto L_0x00bb
            r6 = r1
            r9 = r0
        L_0x00bb:
            int r1 = r1 + 1
            goto L_0x00b3
        L_0x00be:
            r10 = r4[r6]
            int r11 = r3.length
            r9 = 0
        L_0x00c2:
            if (r9 >= r11) goto L_0x00d5
            r1 = r4[r9]
            r0 = r4[r6]
            if (r1 == r0) goto L_0x00d2
            r1 = r3[r9]
            r0 = r3[r6]
            if (r1 >= r0) goto L_0x00d2
            r3[r9] = r0
        L_0x00d2:
            int r9 = r9 + 1
            goto L_0x00c2
        L_0x00d5:
            X.I24 r12 = r2.A09
            int r11 = r12.A02(r10, r6)
            if (r11 < 0) goto L_0x0126
            r0 = r20
            long r0 = r2.A00(r0, r11, r6)
            int r13 = X.C51968G9o.A02(r0)
            int r10 = X.C51965G9l.A04(r0)
            int r9 = r13 - r10
            r6 = 1
            r5 = r10
            if (r9 == r6) goto L_0x00f2
            r5 = -2
        L_0x00f2:
            r12.A05(r11, r5)
            X.IFI r5 = r2.A0A
            X.IFH r5 = r5.A00(r11, r0)
            int r14 = A01(r3, r0)
            if (r9 == r6) goto L_0x011f
            int[] r6 = r12.A06(r11)
        L_0x0105:
            if (r10 >= r13) goto L_0x009c
            r4[r10] = r11
            if (r6 != 0) goto L_0x011c
            r0 = 0
        L_0x010c:
            int r1 = r5.A09
            int r1 = r1 + r14
            int r1 = r1 + r0
            r3[r10] = r1
            int r0 = r2.A03
            int r0 = r0 + r1
            if (r0 > 0) goto L_0x0119
            r50 = 1
        L_0x0119:
            int r10 = r10 + 1
            goto L_0x0105
        L_0x011c:
            r0 = r6[r10]
            goto L_0x010c
        L_0x011f:
            r6 = 0
            goto L_0x0105
        L_0x0121:
            int r6 = r6 + 1
            goto L_0x009e
        L_0x0125:
            r6 = -1
        L_0x0126:
            r0 = r3[r5]
            r1 = r25
            if (r0 >= r1) goto L_0x0132
            int r8 = r8 + r0
            int r0 = r25 - r0
            A03(r3, r0)
        L_0x0132:
            r0 = r24
            A03(r3, r0)
            r11 = -1
            if (r6 != r11) goto L_0x0144
            r6 = 0
        L_0x013b:
            if (r6 >= r7) goto L_0x016a
            r0 = r4[r6]
            if (r5 == r0) goto L_0x0144
            int r6 = r6 + 1
            goto L_0x013b
        L_0x0144:
            if (r6 == r11) goto L_0x016a
            boolean r0 = A04(r2, r4, r3, r6)
            if (r0 == 0) goto L_0x016a
            if (r54 == 0) goto L_0x016a
            X.I24 r0 = r2.A09
            r0.A03()
            int[] r10 = new int[r7]
            r0 = 0
        L_0x0156:
            if (r0 >= r7) goto L_0x015d
            r10[r0] = r11
            int r0 = r0 + 1
            goto L_0x0156
        L_0x015d:
            int r4 = r3.length
            int[] r7 = new int[r4]
            r1 = 0
        L_0x0161:
            if (r1 >= r4) goto L_0x0413
            r0 = r3[r6]
            r7[r1] = r0
            int r1 = r1 + 1
            goto L_0x0161
        L_0x016a:
            int[] r19 = java.util.Arrays.copyOf(r4, r7)
            X.0qQ.A07(r19)
            int r9 = r3.length
            int[] r6 = new int[r9]
            r1 = 0
        L_0x0175:
            if (r1 >= r9) goto L_0x017f
            r0 = r3[r1]
            int r0 = -r0
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x0175
        L_0x017f:
            int r0 = r2.A04
            r27 = r0
            int r35 = r25 + r0
            int r0 = r2.A03
            r22 = r0
            int r0 = r2.A00
            r18 = r0
            int r23 = r22 + r0
            r0 = r23
            if (r0 >= r5) goto L_0x0195
            r23 = 0
        L_0x0195:
            r33 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r19
            r0 = r33
            int r15 = A00(r1, r0)
            r1 = r15
            r12 = 0
        L_0x01a1:
            r34 = -1
        L_0x01a3:
            if (r15 == r11) goto L_0x0214
            r0 = r26
            if (r12 >= r0) goto L_0x0214
            r10 = r19[r15]
            r0 = r19
            int r15 = A00(r0, r10)
            int r12 = r12 + 1
            if (r10 < 0) goto L_0x0212
            r0 = r20
            long r31 = r2.A00(r0, r10, r1)
            X.IFI r13 = r2.A0A
            r0 = r31
            X.IFH r13 = r13.A00(r10, r0)
            X.I24 r0 = r2.A09
            r34 = r0
            int r30 = X.C51968G9o.A02(r31)
            int r29 = X.C51965G9l.A04(r31)
            int r28 = r30 - r29
            r16 = 1
            r14 = r29
            r1 = r28
            r0 = r16
            if (r1 == r0) goto L_0x01dc
            r14 = -2
        L_0x01dc:
            r0 = r34
            r0.A05(r10, r14)
            r0 = r31
            int r14 = A01(r6, r0)
            r1 = r29
        L_0x01e9:
            r0 = r30
            if (r1 >= r0) goto L_0x01fc
            int r0 = r13.A09
            int r0 = r0 + r14
            r6[r1] = r0
            r19[r1] = r10
            r0 = r21[r1]
            r0.addLast(r13)
            int r1 = r1 + 1
            goto L_0x01e9
        L_0x01fc:
            r0 = r35
            if (r14 >= r0) goto L_0x0208
            r1 = r6[r29]
            if (r1 > r0) goto L_0x0208
            r13.A04 = r5
            r50 = 1
        L_0x0208:
            r1 = r28
            r0 = r16
            if (r1 == r0) goto L_0x0210
            r12 = r26
        L_0x0210:
            r1 = r15
            goto L_0x01a1
        L_0x0212:
            r1 = r15
            goto L_0x01a3
        L_0x0214:
            r10 = 0
        L_0x0215:
            if (r10 >= r9) goto L_0x0222
            r1 = r6[r10]
            r0 = r23
            if (r1 < r0) goto L_0x027e
            if (r1 <= 0) goto L_0x027e
            int r10 = r10 + 1
            goto L_0x0215
        L_0x0222:
            r1 = 0
        L_0x0223:
            r0 = r26
            if (r1 >= r0) goto L_0x027e
            r0 = r21[r1]
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x027b
            r13 = 1
        L_0x0230:
            r1 = 0
        L_0x0231:
            r0 = r26
            if (r1 >= r0) goto L_0x031c
            r14 = r21[r1]
        L_0x0237:
            int r0 = r14.size()
            if (r0 <= r13) goto L_0x026a
            java.lang.Object r0 = r14.A0O()
            X.IFH r0 = (X.IFH) r0
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x026a
            java.lang.Object r11 = r14.removeFirst()
            X.IFH r11 = (X.IFH) r11
            int r0 = r11.A0A
            if (r0 == r13) goto L_0x0268
            X.I24 r10 = r2.A09
            int r0 = r11.A07
            int[] r10 = r10.A06(r0)
        L_0x0259:
            r12 = r3[r1]
            int r0 = r11.A09
            if (r10 != 0) goto L_0x0265
            r10 = 0
        L_0x0260:
            int r0 = r0 + r10
            int r12 = r12 - r0
            r3[r1] = r12
            goto L_0x0237
        L_0x0265:
            r10 = r10[r1]
            goto L_0x0260
        L_0x0268:
            r10 = 0
            goto L_0x0259
        L_0x026a:
            java.lang.Object r0 = r14.A0P()
            X.IFH r0 = (X.IFH) r0
            if (r0 == 0) goto L_0x0279
            int r0 = r0.A07
        L_0x0274:
            r4[r1] = r0
            int r1 = r1 + 1
            goto L_0x0231
        L_0x0279:
            r0 = -1
            goto L_0x0274
        L_0x027b:
            int r1 = r1 + 1
            goto L_0x0223
        L_0x027e:
            r13 = 1
            r0 = r33
            int r1 = A00(r6, r0)
            int r0 = X.03t.A01(r19)
            int r12 = r0 + 1
            r0 = r17
            if (r12 >= r0) goto L_0x0230
            r0 = r20
            long r0 = r2.A00(r0, r12, r1)
            X.I24 r11 = r2.A09
            int r15 = X.C51968G9o.A02(r0)
            int r16 = X.C51965G9l.A04(r0)
            int r14 = r15 - r16
            r10 = r16
            if (r14 == r13) goto L_0x02a6
            r10 = -2
        L_0x02a6:
            r11.A05(r12, r10)
            X.IFI r10 = r2.A0A
            X.IFH r10 = r10.A00(r12, r0)
            int r0 = A01(r6, r0)
            if (r14 == r13) goto L_0x02da
            int[] r13 = r11.A06(r12)
            if (r13 != 0) goto L_0x02bf
            r1 = r26
            int[] r13 = new int[r1]
        L_0x02bf:
            r1 = r16
        L_0x02c1:
            if (r1 >= r15) goto L_0x02dc
            if (r13 == 0) goto L_0x02cb
            r14 = r6[r1]
            int r14 = r0 - r14
            r13[r1] = r14
        L_0x02cb:
            r19[r1] = r12
            int r14 = r10.A09
            int r14 = r14 + r0
            r6[r1] = r14
            r14 = r21[r1]
            r14.addLast(r10)
            int r1 = r1 + 1
            goto L_0x02c1
        L_0x02da:
            r13 = 0
            goto L_0x02bf
        L_0x02dc:
            X.01W r11 = r11.A02
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            int r15 = r11.size()
            r1 = 47
            X.J6G r1 = X.J6G.A00(r14, r1)
            int r1 = X.0sr.A1K(r11, r1, r15)
            if (r1 >= 0) goto L_0x030d
            if (r13 == 0) goto L_0x02ff
            int r1 = r1 + 1
            int r14 = -r1
            X.Hjz r1 = new X.Hjz
            r1.<init>(r12, r13)
            r11.add(r14, r1)
        L_0x02ff:
            r1 = r35
            if (r0 >= r1) goto L_0x0214
            r1 = r6[r16]
            r0 = r35
            if (r1 > r0) goto L_0x0214
            r10.A04 = r5
            goto L_0x0214
        L_0x030d:
            if (r13 != 0) goto L_0x0313
            r11.remove(r1)
            goto L_0x02ff
        L_0x0313:
            java.lang.Object r1 = r11.get(r1)
            X.Hjz r1 = (X.C55579Hjz) r1
            r1.A00 = r13
            goto L_0x02ff
        L_0x031c:
            r0 = r19
            int r0 = r0.length
            r52 = r0
            r10 = 0
        L_0x0322:
            r0 = r52
            if (r10 >= r0) goto L_0x0332
            r1 = r19[r10]
            int r0 = r17 + -1
            if (r1 != r0) goto L_0x033e
            r0 = r27
            int r0 = -r0
            A03(r6, r0)
        L_0x0332:
            r10 = 0
        L_0x0333:
            if (r10 >= r9) goto L_0x0341
            r1 = r6[r10]
            r0 = r22
            if (r1 >= r0) goto L_0x043b
            int r10 = r10 + 1
            goto L_0x0333
        L_0x033e:
            int r10 = r10 + 1
            goto L_0x0322
        L_0x0341:
            r11 = -1
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
        L_0x0345:
            if (r1 >= r9) goto L_0x0350
            r0 = r6[r1]
            if (r10 >= r0) goto L_0x034d
            r11 = r1
            r10 = r0
        L_0x034d:
            int r1 = r1 + 1
            goto L_0x0345
        L_0x0350:
            r0 = r6[r11]
            int r13 = r22 - r0
            int r0 = -r13
            A03(r3, r0)
            A03(r6, r13)
            r30 = 0
        L_0x035d:
            r10 = 0
        L_0x035e:
            if (r10 >= r9) goto L_0x0418
            r1 = r3[r10]
            r0 = r24
            if (r1 >= r0) goto L_0x0403
            r0 = r33
            int r1 = A00(r3, r0)
            r12 = -1
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 0
        L_0x0370:
            if (r10 >= r7) goto L_0x037b
            r0 = r4[r10]
            if (r11 >= r0) goto L_0x0378
            r12 = r10
            r11 = r0
        L_0x0378:
            int r10 = r10 + 1
            goto L_0x0370
        L_0x037b:
            if (r1 == r12) goto L_0x0384
            r10 = r3[r1]
            r0 = r3[r12]
            if (r10 != r0) goto L_0x03ab
            r1 = r12
        L_0x0384:
            r10 = r4[r1]
            r0 = r34
            if (r10 != r0) goto L_0x038c
            r10 = r17
        L_0x038c:
            X.I24 r12 = r2.A09
            int r11 = r12.A02(r10, r1)
            if (r11 >= 0) goto L_0x03ae
            if (r30 != 0) goto L_0x039c
            boolean r0 = A04(r2, r4, r3, r1)
            if (r0 == 0) goto L_0x0418
        L_0x039c:
            if (r54 == 0) goto L_0x0418
            r12.A03()
            int[] r10 = new int[r7]
            r0 = 0
        L_0x03a4:
            if (r0 >= r7) goto L_0x0407
            r10[r0] = r34
            int r0 = r0 + 1
            goto L_0x03a4
        L_0x03ab:
            r30 = 1
            goto L_0x0384
        L_0x03ae:
            r0 = r20
            long r14 = r2.A00(r0, r11, r1)
            int r29 = X.C51968G9o.A02(r14)
            int r10 = X.C51965G9l.A04(r14)
            int r1 = r29 - r10
            r28 = 1
            r16 = r10
            r0 = r28
            if (r1 == r0) goto L_0x03c8
            r16 = -2
        L_0x03c8:
            r0 = r16
            r12.A05(r11, r0)
            X.IFI r0 = r2.A0A
            X.IFH r16 = r0.A00(r11, r14)
            int r14 = A01(r3, r14)
            r0 = r28
            if (r1 == r0) goto L_0x0401
            int[] r12 = r12.A06(r11)
        L_0x03df:
            r0 = r29
            if (r10 >= r0) goto L_0x035d
            r0 = r3[r10]
            if (r0 == r14) goto L_0x03e9
            r30 = 1
        L_0x03e9:
            r1 = r21[r10]
            r0 = r16
            r1.addFirst(r0)
            r4[r10] = r11
            if (r12 != 0) goto L_0x03fe
            r1 = 0
        L_0x03f5:
            int r0 = r0.A09
            int r0 = r0 + r14
            int r0 = r0 + r1
            r3[r10] = r0
            int r10 = r10 + 1
            goto L_0x03df
        L_0x03fe:
            r1 = r12[r10]
            goto L_0x03f5
        L_0x0401:
            r12 = 0
            goto L_0x03df
        L_0x0403:
            int r10 = r10 + 1
            goto L_0x035e
        L_0x0407:
            int[] r7 = new int[r9]
            r4 = 0
        L_0x040a:
            if (r4 >= r9) goto L_0x0413
            r0 = r3[r1]
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x040a
        L_0x0413:
            X.IGX r16 = A02(r2, r10, r7, r8, r5)
            return r16
        L_0x0418:
            if (r30 == 0) goto L_0x0426
            if (r54 == 0) goto L_0x0426
            X.I24 r0 = r2.A09
            r0.A03()
            X.IGX r16 = A02(r2, r4, r3, r8, r5)
            return r16
        L_0x0426:
            int r8 = r8 + r13
            r11 = 0
            r0 = r33
            int r0 = A00(r3, r0)
            r0 = r3[r0]
            if (r0 >= 0) goto L_0x043c
            int r8 = r8 + r0
            A03(r6, r0)
            int r0 = -r0
            A03(r3, r0)
            goto L_0x043c
        L_0x043b:
            r11 = 0
        L_0x043c:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r0 = r2.A0C
            r36 = r0
            float r12 = r0.A00
            int r10 = java.lang.Math.round(r12)
            int r1 = java.lang.Integer.signum(r10)
            int r0 = java.lang.Integer.signum(r8)
            if (r1 != r0) goto L_0x045d
            int r10 = java.lang.Math.abs(r10)
            int r1 = java.lang.Math.abs(r8)
            float r0 = (float) r8
            r51 = r0
            if (r10 >= r1) goto L_0x045f
        L_0x045d:
            r51 = r12
        L_0x045f:
            int[] r10 = java.util.Arrays.copyOf(r3, r9)
            X.0qQ.A07(r10)
            int r8 = r10.length
            r1 = 0
        L_0x0468:
            if (r1 >= r8) goto L_0x0472
            r0 = r10[r1]
            int r0 = -r0
            r10[r1] = r0
            int r1 = r1 + 1
            goto L_0x0468
        L_0x0472:
            r1 = r24
            r0 = r27
            if (r1 <= r0) goto L_0x04bc
            r14 = 0
        L_0x0479:
            r0 = r26
            if (r14 >= r0) goto L_0x04bc
            r13 = r21[r14]
            int r15 = r13.size()
            r12 = 0
        L_0x0484:
            if (r12 >= r15) goto L_0x04b9
            java.lang.Object r8 = r13.get(r12)
            X.IFH r8 = (X.IFH) r8
            X.I24 r1 = r2.A09
            int r0 = r8.A07
            int[] r0 = r1.A06(r0)
            int r1 = r8.A09
            if (r0 != 0) goto L_0x04b6
            r0 = 0
        L_0x0499:
            int r1 = r1 + r0
            int r0 = X.C51966G9m.A06(r13)
            if (r12 == r0) goto L_0x04b9
            r0 = r3[r14]
            if (r0 == 0) goto L_0x04b9
            if (r0 < r1) goto L_0x04b9
            int r0 = r0 - r1
            r3[r14] = r0
            int r12 = r12 + 1
            java.lang.Object r0 = r13.get(r12)
            X.IFH r0 = (X.IFH) r0
            int r0 = r0.A07
            r4[r14] = r0
            goto L_0x0484
        L_0x04b6:
            r0 = r0[r14]
            goto L_0x0499
        L_0x04b9:
            int r14 = r14 + 1
            goto L_0x0479
        L_0x04bc:
            int r33 = r24 + r18
            boolean r0 = r2.A0G
            r32 = r0
            long r0 = r2.A05
            r48 = r0
            if (r32 == 0) goto L_0x0602
            int r31 = androidx.compose.ui.unit.Constraints.A01(r48)
            int r8 = X.03t.A01(r6)
            int r8 = r8 + r33
            int r12 = X.AnonymousClass5SF.A02(r0, r8)
            r1 = r12
        L_0x04d7:
            r0 = r22
            int r13 = java.lang.Math.min(r1, r0)
            int r13 = r13 - r24
            int r13 = r13 + r18
            r14 = r10[r5]
            java.util.List r0 = r2.A0E
            r35 = r0
            int r1 = X.C51966G9m.A06(r35)
            if (r1 < 0) goto L_0x0525
        L_0x04ed:
            int r16 = r1 + -1
            r0 = r35
            int r8 = X.C51971G9r.A0I(r0, r1)
            X.I24 r0 = r2.A09
            int r1 = r0.A01(r8)
            r0 = -2
            if (r1 == r0) goto L_0x05f8
            r0 = r34
            if (r1 == r0) goto L_0x05f8
            r0 = r4[r1]
            if (r0 <= r8) goto L_0x0521
        L_0x0506:
            r0 = r20
            long r0 = r2.A00(r0, r8, r5)
            if (r11 != 0) goto L_0x0512
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
        L_0x0512:
            X.IFI r15 = r2.A0A
            X.IFH r1 = r15.A00(r8, r0)
            int r0 = r1.A09
            int r14 = r14 - r0
            r1.A01(r14, r5, r13)
            r11.add(r1)
        L_0x0521:
            if (r16 >= 0) goto L_0x05f4
            if (r11 != 0) goto L_0x0527
        L_0x0525:
            X.0sn r11 = X.0sn.A00
        L_0x0527:
            r1 = 0
            r7 = 0
        L_0x0529:
            r0 = r21[r1]
            int r0 = r0.size()
            int r7 = r7 + r0
            int r1 = r1 + 1
            r0 = r26
            if (r1 < r0) goto L_0x0529
            java.util.ArrayList r30 = X.DbS.A0v(r7)
        L_0x053a:
            r1 = 0
        L_0x053b:
            r0 = r21[r1]
            boolean r0 = X.DbT.A1b(r0)
            if (r0 == 0) goto L_0x059d
            r15 = -1
            r7 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0548:
            r0 = r21[r7]
            java.lang.Object r0 = r0.A0P()
            X.IFH r0 = (X.IFH) r0
            if (r0 == 0) goto L_0x0558
            int r0 = r0.A07
            if (r1 <= r0) goto L_0x0558
            r15 = r7
            r1 = r0
        L_0x0558:
            int r7 = r7 + 1
            r0 = r26
            if (r7 < r0) goto L_0x0548
            r0 = r21[r15]
            java.lang.Object r14 = r0.removeFirst()
            X.IFH r14 = (X.IFH) r14
            int r1 = r14.A08
            if (r1 != r15) goto L_0x053a
            int r0 = r14.A0A
            int r0 = r0 + r1
            long r7 = (long) r1
            r16 = 32
            long r7 = r7 << r16
            long r0 = (long) r0
            r28 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r28
            long r0 = r0 | r7
            int r7 = A01(r10, r0)
            X.Hk0 r8 = r2.A0B
            int[] r8 = r8.A00
            r8 = r8[r15]
            r14.A01(r7, r8, r13)
            r8 = r30
            r8.add(r14)
            long r15 = r0 >> r16
            int r8 = (int) r15
            long r0 = r0 & r28
            int r15 = (int) r0
        L_0x0593:
            if (r8 >= r15) goto L_0x053a
            int r0 = r14.A09
            int r0 = r0 + r7
            r10[r8] = r0
            int r8 = r8 + 1
            goto L_0x0593
        L_0x059d:
            int r1 = r1 + 1
            r0 = r26
            if (r1 < r0) goto L_0x053b
            r14 = r10[r5]
            int r16 = r35.size()
            r10 = 0
            r8 = 0
        L_0x05ab:
            r0 = r16
            if (r10 >= r0) goto L_0x0614
            r0 = r35
            int r7 = X.C51971G9r.A0I(r0, r10)
            r0 = r17
            if (r7 >= r0) goto L_0x05e5
            X.I24 r0 = r2.A09
            int r1 = r0.A01(r7)
            r0 = -2
            if (r1 == r0) goto L_0x05e8
            r0 = r34
            if (r1 == r0) goto L_0x05e8
            r0 = r19[r1]
            if (r0 >= r7) goto L_0x05e5
        L_0x05ca:
            r0 = r20
            long r0 = r2.A00(r0, r7, r5)
            if (r8 != 0) goto L_0x05d6
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
        L_0x05d6:
            X.IFI r15 = r2.A0A
            X.IFH r1 = r15.A00(r7, r0)
            r1.A01(r14, r5, r13)
            int r0 = r1.A09
            int r14 = r14 + r0
            r8.add(r1)
        L_0x05e5:
            int r10 = r10 + 1
            goto L_0x05ab
        L_0x05e8:
            r1 = 0
        L_0x05e9:
            r0 = r52
            if (r1 >= r0) goto L_0x05ca
            r0 = r19[r1]
            if (r0 >= r7) goto L_0x05e5
            int r1 = r1 + 1
            goto L_0x05e9
        L_0x05f4:
            r1 = r16
            goto L_0x04ed
        L_0x05f8:
            r1 = 0
        L_0x05f9:
            if (r1 >= r7) goto L_0x0506
            r0 = r4[r1]
            if (r0 <= r8) goto L_0x0521
            int r1 = r1 + 1
            goto L_0x05f9
        L_0x0602:
            int r8 = X.03t.A01(r6)
            int r8 = r8 + r33
            int r31 = X.AnonymousClass5SF.A03(r0, r8)
            int r12 = androidx.compose.ui.unit.Constraints.A00(r48)
            r1 = r31
            goto L_0x04d7
        L_0x0614:
            if (r8 != 0) goto L_0x0618
            X.0sn r8 = X.0sn.A00
        L_0x0618:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r7.addAll(r11)
            r0 = r30
            r7.addAll(r0)
            r7.addAll(r8)
            r0 = r36
            X.6H4 r15 = r0.A09
            r0 = r51
            int r13 = (int) r0
            X.IFI r11 = r2.A0A
            X.JSj r0 = r11.A01
            X.IFP r0 = (X.IFP) r0
            X.6Ix r10 = r0.A00
            r14 = 1
            if (r9 != 0) goto L_0x063f
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x063f:
            r8 = r3[r5]
            int r1 = r9 + -1
            if (r14 > r1) goto L_0x064f
        L_0x0645:
            r0 = r3[r14]
            if (r8 <= r0) goto L_0x064a
            r8 = r0
        L_0x064a:
            if (r14 == r1) goto L_0x064f
            int r14 = r14 + 1
            goto L_0x0645
        L_0x064f:
            int r44 = X.03t.A01(r6)
            int r44 = r44 + r33
            X.4Cq r14 = r2.A0F
            X.5Sz r0 = r2.A0D
            r33 = r15
            r34 = r10
            r35 = r11
            r36 = r0
            r37 = r7
            r38 = r14
            r39 = r13
            r40 = r31
            r41 = r12
            r42 = r26
            r43 = r8
            r45 = r32
            r46 = r5
            r47 = r5
            r33.A07(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            long r15 = r15.A04()
            r10 = 0
            int r0 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x06c3
            r8 = r31
            if (r32 == 0) goto L_0x0687
            r8 = r12
        L_0x0687:
            int r1 = X.C51965G9l.A04(r15)
            r0 = r31
            int r5 = java.lang.Math.max(r0, r1)
            r0 = r48
            int r31 = X.AnonymousClass5SF.A03(r0, r5)
            int r0 = X.C289005cr.A00(r15)
            int r5 = java.lang.Math.max(r12, r0)
            r0 = r48
            int r12 = X.AnonymousClass5SF.A02(r0, r5)
            r10 = r31
            if (r32 == 0) goto L_0x06aa
            r10 = r12
        L_0x06aa:
            if (r10 == r8) goto L_0x06c3
            int r8 = r7.size()
            r5 = 0
        L_0x06b1:
            if (r5 >= r8) goto L_0x06c3
            java.lang.Object r1 = r7.get(r5)
            X.IFH r1 = (X.IFH) r1
            r1.A00 = r10
            int r0 = r1.A06
            int r0 = r0 + r10
            r1.A01 = r0
            int r5 = r5 + 1
            goto L_0x06b1
        L_0x06c3:
            r1 = 0
        L_0x06c4:
            r0 = r6[r1]
            r5 = r22
            if (r0 > r5) goto L_0x06dc
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x06c4
            r5 = 0
        L_0x06cf:
            r0 = r52
            if (r5 >= r0) goto L_0x06dc
            r1 = r19[r5]
            int r0 = r17 + -1
            if (r1 >= r0) goto L_0x06df
            int r5 = r5 + 1
            goto L_0x06cf
        L_0x06dc:
            r48 = 1
            goto L_0x06e1
        L_0x06df:
            r48 = 0
        L_0x06e1:
            r0 = 28
            X.J6U r1 = new X.J6U
            r1.<init>(r0, r7, r2)
            r5 = r53
            r0 = r31
            X.5d6 r33 = X.C51969G9p.A0a(r5, r1, r0, r12)
            long r46 = X.C289155d7.A00(r0, r12)
            X.Hk0 r0 = r2.A0B
            r1 = r20
            X.IFP r1 = (X.IFP) r1
            X.GeU r1 = r1.A01
            X.HpY r1 = r1.A01
            X.IGX r16 = new X.IGX
            r34 = r5
            r35 = r30
            r36 = r14
            r37 = r4
            r38 = r3
            r39 = r51
            r40 = r17
            r41 = r25
            r42 = r23
            r43 = r24
            r44 = r18
            r45 = r27
            r49 = r32
            r32 = r1
            r30 = r16
            r31 = r0
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49, r50)
            return r16
        L_0x0724:
            long r0 = r2.A05
            int r13 = androidx.compose.ui.unit.Constraints.A03(r0)
            r11 = r13
            int r12 = androidx.compose.ui.unit.Constraints.A02(r0)
            r10 = r12
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r5 = r2.A0C
            X.6H4 r9 = r5.A09
            java.util.ArrayList r25 = X.AnonymousClass7TE.A1C()
            X.IFI r8 = r2.A0A
            X.JSj r5 = r8.A01
            X.IFP r5 = (X.IFP) r5
            X.6Ix r7 = r5.A00
            int r6 = r2.A02
            boolean r15 = r2.A0G
            X.4Cq r14 = r2.A0F
            X.5Sz r5 = r2.A0D
            r34 = 0
            r23 = r8
            r24 = r5
            r26 = r14
            r27 = r34
            r28 = r13
            r29 = r12
            r30 = r6
            r31 = r34
            r32 = r34
            r33 = r15
            r35 = r34
            r21 = r9
            r22 = r7
            r21.A07(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            long r8 = r9.A04()
            r6 = 0
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0781
            int r5 = X.C51965G9l.A04(r8)
            int r13 = X.AnonymousClass5SF.A03(r0, r5)
            int r5 = X.C289005cr.A00(r8)
            int r12 = X.AnonymousClass5SF.A02(r0, r5)
        L_0x0781:
            X.Iz0 r1 = X.C58875Iz0.A00
            r0 = r53
            X.5d6 r19 = X.C51969G9p.A0a(r0, r1, r13, r12)
            X.0sn r21 = X.0sn.A00
            long r32 = X.C289155d7.A00(r11, r10)
            int r8 = r2.A01
            int r7 = -r8
            int r6 = r2.A03
            int r5 = r2.A00
            int r6 = r6 + r5
            int r1 = r2.A04
            X.Hk0 r2 = r2.A0B
            r0 = r20
            X.IFP r0 = (X.IFP) r0
            X.GeU r0 = r0.A01
            X.HpY r0 = r0.A01
            r25 = 0
            X.IGX r16 = new X.IGX
            r20 = r53
            r22 = r14
            r23 = r4
            r24 = r3
            r26 = r17
            r27 = r7
            r28 = r6
            r29 = r8
            r30 = r5
            r31 = r1
            r35 = r15
            r36 = r34
            r18 = r0
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r35, r36)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56627I5g.A02(X.HrL, int[], int[], int, boolean):X.IGX");
    }
}
