package X;

/* renamed from: X.XdZ  reason: case insensitive filesystem */
public abstract class C21507XdZ {
    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, X.XU5] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.XU5 A00(X.2d3 r6, X.XU5 r7, java.util.ArrayList r8, int r9) {
        /*
            if (r9 != 0) goto L_0x00bc
            int r5 = r6.A07
        L_0x0004:
            r3 = 0
            r4 = -1
            if (r5 == r4) goto L_0x006c
            if (r7 == 0) goto L_0x000e
            int r0 = r7.A00
            if (r5 == r0) goto L_0x0059
        L_0x000e:
            r2 = 0
        L_0x000f:
            int r0 = r8.size()
            if (r2 >= r0) goto L_0x006c
            java.lang.Object r1 = r8.get(r2)
            X.XU5 r1 = (X.XU5) r1
            int r0 = r1.A00
            if (r0 != r5) goto L_0x0069
            if (r7 == 0) goto L_0x0027
            r7.A01(r1, r9)
            r8.remove(r7)
        L_0x0027:
            r7 = r1
        L_0x0028:
            java.util.ArrayList r1 = r7.A04
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x0059
            r1.add(r6)
            boolean r0 = r6 instanceof X.AnonymousClass3MQ
            if (r0 == 0) goto L_0x0044
            r0 = r6
            X.3MQ r0 = (X.AnonymousClass3MQ) r0
            X.2d6 r1 = r0.A04
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0041
            r3 = 1
        L_0x0041:
            r1.A07(r7, r8, r3)
        L_0x0044:
            int r0 = r7.A00
            if (r9 != 0) goto L_0x005a
            r6.A07 = r0
            X.2d6 r0 = r6.A0e
            r0.A07(r7, r8, r9)
            X.2d6 r0 = r6.A0f
        L_0x0051:
            r0.A07(r7, r8, r9)
            X.2d6 r0 = r6.A0b
            r0.A07(r7, r8, r9)
        L_0x0059:
            return r7
        L_0x005a:
            r6.A0X = r0
            X.2d6 r0 = r6.A0g
            r0.A07(r7, r8, r9)
            X.2d6 r0 = r6.A0Z
            r0.A07(r7, r8, r9)
            X.2d6 r0 = r6.A0a
            goto L_0x0051
        L_0x0069:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x006c:
            if (r7 != 0) goto L_0x0028
            boolean r0 = r6 instanceof X.AnonymousClass3MF
            if (r0 == 0) goto L_0x009d
            r5 = r6
            X.3MF r5 = (X.AnonymousClass3MF) r5
            r1 = 0
        L_0x0076:
            int r0 = r5.A00
            if (r1 >= r0) goto L_0x009d
            X.2d3[] r0 = r5.A01
            r0 = r0[r1]
            if (r9 != 0) goto L_0x009a
            int r2 = r0.A07
        L_0x0082:
            int r1 = r1 + 1
            if (r2 == r4) goto L_0x0076
            r1 = 0
        L_0x0087:
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x009d
            java.lang.Object r7 = r8.get(r1)
            X.XU5 r7 = (X.XU5) r7
            int r0 = r7.A00
            if (r0 == r2) goto L_0x00b7
            int r1 = r1 + 1
            goto L_0x0087
        L_0x009a:
            int r2 = r0.A0X
            goto L_0x0082
        L_0x009d:
            X.XU5 r7 = new X.XU5
            r7.<init>()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r7.A04 = r0
            r0 = 0
            r7.A03 = r0
            r7.A01 = r4
            int r1 = X.XU5.A05
            int r0 = r1 + 1
            X.XU5.A05 = r0
            r7.A00 = r1
            r7.A02 = r9
        L_0x00b7:
            r8.add(r7)
            goto L_0x0028
        L_0x00bc:
            int r5 = r6.A0X
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21507XdZ.A00(X.2d3, X.XU5, java.util.ArrayList, int):X.XU5");
    }

    public static boolean A01(Integer num, Integer num2, Integer num3, Integer num4) {
        boolean z;
        boolean z2;
        Integer num5;
        Integer num6;
        Integer num7 = AnonymousClass05K.A00;
        if (num3 == num7 || num3 == (num6 = AnonymousClass05K.A01) || (num3 == AnonymousClass05K.A0N && num != num6)) {
            z = true;
        } else {
            z = false;
        }
        if (num4 == num7 || num4 == (num5 = AnonymousClass05K.A01) || (num4 == AnonymousClass05K.A0N && num2 != num5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
