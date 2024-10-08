package X;

import java.util.Arrays;

/* renamed from: X.6T6  reason: invalid class name */
public final class AnonymousClass6T6 {
    public static final AnonymousClass6T9 A02 = AnonymousClass6T9.STRETCH;
    public static final AnonymousClass6TA A03 = AnonymousClass6TA.STRETCH;
    public static final AnonymousClass6T7 A04 = AnonymousClass6T7.ROW;
    public static final AnonymousClass6T8 A05 = AnonymousClass6T8.FLEX_START;
    public static final AnonymousClass6TB A06 = AnonymousClass6TB.NO_WRAP;
    public int A00 = 0;
    public float[] A01 = new float[0];

    public static void A00(AnonymousClass6T6 r3, int i) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0126, code lost:
        r3.append(r1);
        r3.append(r0);
        r3.append("\n");
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0085, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0088, code lost:
        r4 = r4 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r8 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
        L_0x0006:
            int r0 = r8.A00
            if (r4 >= r0) goto L_0x016e
            r0 = 11
            java.lang.Integer[] r2 = X.AnonymousClass05K.A00(r0)
            float[] r1 = r8.A01
            r0 = r1[r4]
            int r0 = (int) r0
            r0 = r2[r0]
            int r0 = r0.intValue()
            java.lang.String r7 = "  padding"
            java.lang.String r6 = ": "
            java.lang.String r2 = "\n"
            switch(r0) {
                case 0: goto L_0x0115;
                case 1: goto L_0x00f7;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00ad;
                case 5: goto L_0x009d;
                case 6: goto L_0x008c;
                case 7: goto L_0x0068;
                case 8: goto L_0x0045;
                case 9: goto L_0x0025;
                case 10: goto L_0x0139;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0006
        L_0x0025:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            java.lang.Integer r5 = X.AnonymousClass6TS.A01(r0)
            int r0 = r4 + 2
            r1 = r1[r0]
            java.lang.String r0 = "  border"
            r3.append(r0)
            java.lang.String r0 = X.AnonymousClass6TS.A02(r5)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
            goto L_0x0085
        L_0x0045:
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
            java.lang.String r0 = "%\n"
            r3.append(r0)
            goto L_0x0088
        L_0x0068:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            java.lang.Integer r5 = X.AnonymousClass6TS.A01(r0)
            int r0 = r4 + 2
            r1 = r1[r0]
            r3.append(r7)
            java.lang.String r0 = X.AnonymousClass6TS.A02(r5)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
        L_0x0085:
            r3.append(r2)
        L_0x0088:
            int r4 = r4 + 3
            goto L_0x0006
        L_0x008c:
            X.XQk[] r5 = X.C21239XQk.values()
            float[] r1 = r8.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r0 = r5[r0]
            java.lang.String r1 = "  overflow: "
            goto L_0x0126
        L_0x009d:
            X.6TB[] r5 = X.AnonymousClass6TB.values()
            float[] r1 = r8.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r0 = r5[r0]
            java.lang.String r1 = "  flexWrap: "
            goto L_0x0126
        L_0x00ad:
            X.6TA[] r5 = X.AnonymousClass6TA.values()
            float[] r1 = r8.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r0 = r5[r0]
            java.lang.String r1 = "  alignItems: "
            goto L_0x0126
        L_0x00bd:
            X.6T9[] r5 = X.AnonymousClass6T9.values()
            float[] r1 = r8.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r0 = r5[r0]
            java.lang.String r1 = "  alignContent: "
            goto L_0x0126
        L_0x00cd:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r1 = (int) r0
            if (r1 == 0) goto L_0x00f4
            r0 = 1
            if (r1 == r0) goto L_0x00f1
            r0 = 2
            if (r1 == r0) goto L_0x00ee
            r0 = 3
            if (r1 == r0) goto L_0x00eb
            r0 = 4
            if (r1 == r0) goto L_0x00e8
            r0 = 5
            if (r1 != r0) goto L_0x014a
            X.6T8 r0 = X.AnonymousClass6T8.SPACE_EVENLY
        L_0x00e5:
            java.lang.String r1 = "  justifyContent: "
            goto L_0x0126
        L_0x00e8:
            X.6T8 r0 = X.AnonymousClass6T8.SPACE_AROUND
            goto L_0x00e5
        L_0x00eb:
            X.6T8 r0 = X.AnonymousClass6T8.SPACE_BETWEEN
            goto L_0x00e5
        L_0x00ee:
            X.6T8 r0 = X.AnonymousClass6T8.FLEX_END
            goto L_0x00e5
        L_0x00f1:
            X.6T8 r0 = X.AnonymousClass6T8.CENTER
            goto L_0x00e5
        L_0x00f4:
            X.6T8 r0 = X.AnonymousClass6T8.FLEX_START
            goto L_0x00e5
        L_0x00f7:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r1 = (int) r0
            if (r1 == 0) goto L_0x0112
            r0 = 1
            if (r1 == r0) goto L_0x010f
            r0 = 2
            if (r1 == r0) goto L_0x010c
            r0 = 3
            if (r1 != r0) goto L_0x0156
            X.6T7 r0 = X.AnonymousClass6T7.COLUMN_REVERSE
        L_0x0109:
            java.lang.String r1 = "  flexDirection: "
            goto L_0x0126
        L_0x010c:
            X.6T7 r0 = X.AnonymousClass6T7.COLUMN
            goto L_0x0109
        L_0x010f:
            X.6T7 r0 = X.AnonymousClass6T7.ROW_REVERSE
            goto L_0x0109
        L_0x0112:
            X.6T7 r0 = X.AnonymousClass6T7.ROW
            goto L_0x0109
        L_0x0115:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r1 = (int) r0
            if (r1 == 0) goto L_0x0136
            r0 = 1
            if (r1 == r0) goto L_0x0133
            r0 = 2
            if (r1 != r0) goto L_0x0162
            X.9rj r0 = X.C390719rj.RTL
        L_0x0124:
            java.lang.String r1 = "  direction: "
        L_0x0126:
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            int r4 = r4 + 2
            goto L_0x0006
        L_0x0133:
            X.9rj r0 = X.C390719rj.LTR
            goto L_0x0124
        L_0x0136:
            X.9rj r0 = X.C390719rj.INHERIT
            goto L_0x0124
        L_0x0139:
            int r0 = r4 + 1
            r1 = r1[r0]
            java.lang.String r0 = " pointScalingFactor: "
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            goto L_0x0006
        L_0x014a:
            java.lang.String r0 = "Unknown enum value: "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0156:
            java.lang.String r0 = "Unknown enum value: "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0162:
            java.lang.String r0 = "Unknown enum value: "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x016e:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0181
            java.lang.String r2 = "{\n"
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "}"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            return r0
        L_0x0181:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6T6.toString():java.lang.String");
    }
}
