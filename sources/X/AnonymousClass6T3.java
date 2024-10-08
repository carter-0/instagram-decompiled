package X;

import java.util.Arrays;

/* renamed from: X.6T3  reason: invalid class name */
public final class AnonymousClass6T3 {
    public static final AnonymousClass6T4 A02 = AnonymousClass6T4.AUTO;
    public int A00 = 0;
    public float[] A01 = new float[0];

    public static void A00(AnonymousClass6T3 r3, int i) {
        int i2 = r3.A00 + i;
        float[] fArr = r3.A01;
        int length = fArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            if (i3 < i2) {
                i3 += i2 - i3;
            }
            r3.A01 = Arrays.copyOf(fArr, i3);
        }
    }

    public static boolean A01(float f) {
        if (Float.compare(f, Float.NaN) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0071, code lost:
        r3.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a4, code lost:
        r3.append(r1[r4 + 1]);
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        r3.append(r1[r4 + 1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d9, code lost:
        r3.append(r0);
        r3.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00df, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e2, code lost:
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013f, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0160, code lost:
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0163, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016f, code lost:
        r3.append(r0);
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r17 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
        L_0x0006:
            r12 = r17
            int r0 = r12.A00
            if (r4 >= r0) goto L_0x0176
            r0 = 32
            java.lang.Integer[] r2 = X.AnonymousClass05K.A00(r0)
            float[] r1 = r12.A01
            r0 = r1[r4]
            int r0 = (int) r0
            r0 = r2[r0]
            int r16 = r0.intValue()
            java.lang.String r9 = "  position"
            java.lang.String r15 = "  maxHeight: "
            java.lang.String r14 = "  minHeight: "
            java.lang.String r13 = "  height: "
            java.lang.String r11 = "  maxWidth: "
            java.lang.String r10 = "  minWidth: "
            java.lang.String r2 = "  width: "
            java.lang.String r0 = "  flexBasis: "
            java.lang.String r7 = "  margin"
            java.lang.String r6 = ": "
            java.lang.String r8 = "%\n"
            java.lang.String r5 = "\n"
            switch(r16) {
                case 0: goto L_0x0069;
                case 1: goto L_0x006c;
                case 2: goto L_0x006f;
                case 3: goto L_0x0071;
                case 4: goto L_0x0079;
                case 5: goto L_0x0038;
                case 6: goto L_0x007d;
                case 7: goto L_0x0081;
                case 8: goto L_0x0038;
                case 9: goto L_0x0085;
                case 10: goto L_0x0089;
                case 11: goto L_0x008d;
                case 12: goto L_0x0091;
                case 13: goto L_0x0095;
                case 14: goto L_0x0099;
                case 15: goto L_0x0038;
                case 16: goto L_0x009d;
                case 17: goto L_0x00a1;
                case 18: goto L_0x00af;
                case 19: goto L_0x0075;
                case 20: goto L_0x00ba;
                case 21: goto L_0x00ca;
                case 22: goto L_0x0066;
                case 23: goto L_0x0056;
                case 24: goto L_0x0122;
                case 25: goto L_0x0143;
                case 26: goto L_0x0039;
                case 27: goto L_0x0104;
                case 28: goto L_0x00e6;
                case 29: goto L_0x016a;
                case 30: goto L_0x016d;
                case 31: goto L_0x0167;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x0006
        L_0x0039:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            java.lang.Integer r0 = X.AnonymousClass6TS.A01(r0)
            r3.append(r7)
            java.lang.String r0 = X.AnonymousClass6TS.A02(r0)
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = "auto\n"
            r3.append(r0)
            goto L_0x00e2
        L_0x0056:
            X.XQj[] r2 = X.C21238XQj.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  display: "
            goto L_0x00d9
        L_0x0066:
            java.lang.String r0 = "  aspectRatio: "
            goto L_0x0071
        L_0x0069:
            java.lang.String r0 = "  flex: "
            goto L_0x0071
        L_0x006c:
            java.lang.String r0 = "  flexGrow: "
            goto L_0x0071
        L_0x006f:
            java.lang.String r0 = "  flexShrink: "
        L_0x0071:
            r3.append(r0)
            goto L_0x00b2
        L_0x0075:
            r3.append(r15)
            goto L_0x00a4
        L_0x0079:
            r3.append(r0)
            goto L_0x00a4
        L_0x007d:
            r3.append(r2)
            goto L_0x00b2
        L_0x0081:
            r3.append(r2)
            goto L_0x00a4
        L_0x0085:
            r3.append(r10)
            goto L_0x00b2
        L_0x0089:
            r3.append(r10)
            goto L_0x00a4
        L_0x008d:
            r3.append(r11)
            goto L_0x00b2
        L_0x0091:
            r3.append(r11)
            goto L_0x00a4
        L_0x0095:
            r3.append(r13)
            goto L_0x00b2
        L_0x0099:
            r3.append(r13)
            goto L_0x00a4
        L_0x009d:
            r3.append(r14)
            goto L_0x00b2
        L_0x00a1:
            r3.append(r14)
        L_0x00a4:
            int r0 = r4 + 1
            r0 = r1[r0]
            r3.append(r0)
            r3.append(r8)
            goto L_0x00e2
        L_0x00af:
            r3.append(r15)
        L_0x00b2:
            int r0 = r4 + 1
            r0 = r1[r0]
            r3.append(r0)
            goto L_0x00df
        L_0x00ba:
            X.6T4[] r2 = X.AnonymousClass6T4.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignSelf: "
            goto L_0x00d9
        L_0x00ca:
            X.Uve[] r2 = X.C16484Uve.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  positionType: "
        L_0x00d9:
            r3.append(r0)
            r3.append(r1)
        L_0x00df:
            r3.append(r5)
        L_0x00e2:
            int r4 = r4 + 2
            goto L_0x0006
        L_0x00e6:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            java.lang.Integer r2 = X.AnonymousClass6TS.A01(r0)
            int r0 = r4 + 2
            r1 = r1[r0]
            r3.append(r9)
            java.lang.String r0 = X.AnonymousClass6TS.A02(r2)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
            goto L_0x0160
        L_0x0104:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            java.lang.Integer r2 = X.AnonymousClass6TS.A01(r0)
            int r0 = r4 + 2
            r1 = r1[r0]
            r3.append(r9)
            java.lang.String r0 = X.AnonymousClass6TS.A02(r2)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
            goto L_0x013f
        L_0x0122:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            java.lang.Integer r2 = X.AnonymousClass6TS.A01(r0)
            int r0 = r4 + 2
            r1 = r1[r0]
            r3.append(r7)
            java.lang.String r0 = X.AnonymousClass6TS.A02(r2)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
        L_0x013f:
            r3.append(r5)
            goto L_0x0163
        L_0x0143:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            java.lang.Integer r2 = X.AnonymousClass6TS.A01(r0)
            int r0 = r4 + 2
            r1 = r1[r0]
            r3.append(r7)
            java.lang.String r0 = X.AnonymousClass6TS.A02(r2)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
        L_0x0160:
            r3.append(r8)
        L_0x0163:
            int r4 = r4 + 3
            goto L_0x0006
        L_0x0167:
            java.lang.String r0 = "  enableTextRounding: true\n"
            goto L_0x016f
        L_0x016a:
            java.lang.String r0 = "  hasMeasureFunction: true\n"
            goto L_0x016f
        L_0x016d:
            java.lang.String r0 = "  hasBaselineFunction: true\n"
        L_0x016f:
            r3.append(r0)
            int r4 = r4 + 1
            goto L_0x0006
        L_0x0176:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0189
            java.lang.String r2 = "{\n"
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "}"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            return r0
        L_0x0189:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6T3.toString():java.lang.String");
    }
}
