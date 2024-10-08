package X;

/* renamed from: X.AAt  reason: case insensitive filesystem */
public abstract class C39822AAt {
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        r2 = 0.45f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        r2 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        r2 = 0.0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Rect A01(android.content.Context r7, java.lang.Integer r8, float r9, int r10, int r11, boolean r12) {
        /*
            r0 = 5
            X.0qQ.A0B(r8, r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.AnonymousClass7TE.A00(r9, r3)
            double r0 = (double) r0
            r4 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            int r6 = r8.intValue()
            if (r2 >= 0) goto L_0x0072
            switch(r6) {
                case 1: goto L_0x006e;
                case 2: goto L_0x001b;
                case 3: goto L_0x007a;
                case 4: goto L_0x007e;
                case 5: goto L_0x001b;
                case 6: goto L_0x007e;
                case 7: goto L_0x0081;
                default: goto L_0x001b;
            }
        L_0x001b:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x001d:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            float r0 = (float) r10
            float r0 = r0 * r2
            int r5 = (int) r0
            float r0 = (float) r5
            if (r1 > 0) goto L_0x0069
            float r3 = r3 / r9
            float r0 = r0 * r3
            int r0 = (int) r0
        L_0x0028:
            switch(r6) {
                case 1: goto L_0x0066;
                case 2: goto L_0x002b;
                case 3: goto L_0x0066;
                case 4: goto L_0x002b;
                case 5: goto L_0x002b;
                case 6: goto L_0x0066;
                default: goto L_0x002b;
            }
        L_0x002b:
            r1 = 0
        L_0x002c:
            float r1 = X.0nA.A04(r7, r1)
            int r4 = (int) r1
            if (r12 != 0) goto L_0x0036
            switch(r6) {
                case 1: goto L_0x0062;
                case 2: goto L_0x0036;
                case 3: goto L_0x0062;
                case 4: goto L_0x0036;
                case 5: goto L_0x0036;
                case 6: goto L_0x0062;
                default: goto L_0x0036;
            }
        L_0x0036:
            float r2 = (float) r11
            switch(r6) {
                case 1: goto L_0x0053;
                case 2: goto L_0x003a;
                case 3: goto L_0x0057;
                case 4: goto L_0x005b;
                case 5: goto L_0x003a;
                case 6: goto L_0x005e;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 0
        L_0x003b:
            float r2 = r2 * r1
            int r3 = (int) r2
            int r5 = r5 + r4
            float r2 = (float) r3
            float r1 = (float) r0
            switch(r6) {
                case 2: goto L_0x004e;
                case 3: goto L_0x0043;
                case 4: goto L_0x0043;
                case 5: goto L_0x004e;
                case 6: goto L_0x0043;
                case 7: goto L_0x0051;
                default: goto L_0x0043;
            }
        L_0x0043:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0045:
            float r1 = r1 * r0
            float r2 = r2 + r1
            int r1 = (int) r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r3, r5, r1)
            return r0
        L_0x004e:
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0045
        L_0x0051:
            r0 = 0
            goto L_0x0045
        L_0x0053:
            r1 = 1041865114(0x3e19999a, float:0.15)
            goto L_0x003b
        L_0x0057:
            r1 = 1036831949(0x3dcccccd, float:0.1)
            goto L_0x003b
        L_0x005b:
            r1 = 1048576000(0x3e800000, float:0.25)
            goto L_0x003b
        L_0x005e:
            r1 = 1036160860(0x3dc28f5c, float:0.095)
            goto L_0x003b
        L_0x0062:
            int r10 = r10 - r4
            int r4 = r10 - r5
            goto L_0x0036
        L_0x0066:
            r1 = 20
            goto L_0x002c
        L_0x0069:
            float r0 = r0 * r9
            int r1 = (int) r0
            r0 = r5
            r5 = r1
            goto L_0x0028
        L_0x006e:
            r2 = 1053609165(0x3ecccccd, float:0.4)
            goto L_0x001d
        L_0x0072:
            switch(r6) {
                case 1: goto L_0x0076;
                case 2: goto L_0x0075;
                case 3: goto L_0x007a;
                case 4: goto L_0x007e;
                case 5: goto L_0x0075;
                case 6: goto L_0x007e;
                case 7: goto L_0x0081;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x001b
        L_0x0076:
            r2 = 1051260355(0x3ea8f5c3, float:0.33)
            goto L_0x001d
        L_0x007a:
            r2 = 1055286886(0x3ee66666, float:0.45)
            goto L_0x001d
        L_0x007e:
            r2 = 1056964608(0x3f000000, float:0.5)
            goto L_0x001d
        L_0x0081:
            r2 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39822AAt.A01(android.content.Context, java.lang.Integer, float, int, int, boolean):android.graphics.Rect");
    }

    public static final float A00(float f, float f2) {
        float f3 = f2 % 360.0f;
        float A00 = AnonymousClass7TE.A00(f % 360.0f, f3);
        float f4 = f3 + 360.0f;
        float f5 = f3 - 360.0f;
        float abs = Math.abs(f4);
        if (abs < A00) {
            f3 = f4;
            A00 = abs;
        }
        if (Math.abs(f5) >= A00) {
            return f3;
        }
        return f5;
    }
}
