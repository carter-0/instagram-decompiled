package X;

import android.view.View;

/* renamed from: X.3cG  reason: invalid class name and case insensitive filesystem */
public abstract class C245063cG {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (X.C245073cH.A01(r11) < X.C245073cH.A01(r9)) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r1 > r2) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (X.C245073cH.A00(r9) != ((int) (r13 & 4294967295L))) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (X.C245073cH.A00(r11) < X.C245073cH.A00(r9)) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        if (r1 > r2) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (X.C245073cH.A01(r9) != X.C245143cO.A00(r13)) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(long r9, long r11, long r13) {
        /*
            r8 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x008a
            boolean r0 = X.C245073cH.A08(r9)
            if (r0 == 0) goto L_0x0016
            int r1 = X.C245073cH.A01(r9)
            int r0 = X.C245143cO.A00(r13)
            r5 = 1
            if (r1 == r0) goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            int r0 = X.C245073cH.A03(r11)
            int r4 = X.C245073cH.A03(r9)
            if (r0 > r4) goto L_0x002c
            int r1 = X.C245073cH.A01(r11)
            int r0 = X.C245073cH.A01(r9)
            r3 = 1
            if (r1 >= r0) goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            int r2 = X.C245073cH.A01(r9)
            int r1 = X.C245143cO.A00(r13)
            if (r4 > r1) goto L_0x003a
            r0 = 1
            if (r1 <= r2) goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            if (r5 != 0) goto L_0x0041
            if (r3 == 0) goto L_0x008d
            if (r0 == 0) goto L_0x008d
        L_0x0041:
            r7 = 1
        L_0x0042:
            boolean r0 = X.C245073cH.A07(r9)
            if (r0 == 0) goto L_0x0057
            int r6 = X.C245073cH.A00(r9)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r13 & r3
            int r0 = (int) r1
            r5 = 1
            if (r6 == r0) goto L_0x0058
        L_0x0057:
            r5 = 0
        L_0x0058:
            int r0 = X.C245073cH.A02(r11)
            int r4 = X.C245073cH.A02(r9)
            if (r0 > r4) goto L_0x006d
            int r1 = X.C245073cH.A00(r11)
            int r0 = X.C245073cH.A00(r9)
            r3 = 1
            if (r1 >= r0) goto L_0x006e
        L_0x006d:
            r3 = 0
        L_0x006e:
            int r2 = X.C245073cH.A00(r9)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r0
            int r1 = (int) r13
            if (r4 > r1) goto L_0x007e
            r0 = 1
            if (r1 <= r2) goto L_0x007f
        L_0x007e:
            r0 = 0
        L_0x007f:
            if (r5 != 0) goto L_0x0085
            if (r3 == 0) goto L_0x008b
            if (r0 == 0) goto L_0x008b
        L_0x0085:
            r0 = 1
        L_0x0086:
            if (r7 == 0) goto L_0x008f
            if (r0 == 0) goto L_0x008f
        L_0x008a:
            return r8
        L_0x008b:
            r0 = 0
            goto L_0x0086
        L_0x008d:
            r7 = 0
            goto L_0x0042
        L_0x008f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245063cG.A02(long, long, long):boolean");
    }

    public static final int A00(long j) {
        int i;
        int A02 = C245073cH.A02(j);
        int A00 = C245073cH.A00(j);
        if (A02 == A00) {
            i = SN3.MAX_SIGNED_POWER_OF_TWO;
        } else {
            i = AnonymousClass972.MUTABLE_FLAG_MASK;
            if (A00 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(A00, i);
    }

    public static final int A01(long j) {
        int i;
        int A03 = C245073cH.A03(j);
        int A01 = C245073cH.A01(j);
        if (A03 == A01) {
            i = SN3.MAX_SIGNED_POWER_OF_TWO;
        } else {
            i = AnonymousClass972.MUTABLE_FLAG_MASK;
            if (A01 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(A01, i);
    }
}
