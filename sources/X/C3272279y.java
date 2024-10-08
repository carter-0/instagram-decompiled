package X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: X.79y  reason: invalid class name and case insensitive filesystem */
public final class C3272279y {
    public Map A00;

    public final int A00(String str) {
        Integer num;
        int i = -1;
        int binarySearch = Arrays.binarySearch(AnonymousClass7A2.A00, str);
        if (binarySearch >= 0) {
            return AnonymousClass7A2.A01[binarySearch];
        }
        synchronized (this) {
            Map map = this.A00;
            if (!(map == null || (num = (Integer) map.get(str)) == null)) {
                i = num.intValue();
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = A02((r0 = A00(r5)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L_0x0023
            r1 = -1
            int r0 = r4.A00(r5)
            if (r0 == r1) goto L_0x0023
            java.util.ArrayList r1 = r4.A02(r0)
            if (r1 == 0) goto L_0x0023
            int r0 = r1.size()
            r2 = 1
            if (r0 != r2) goto L_0x0024
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            return r3
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3272279y.A03(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e A[LOOP:0: B:3:0x000e->B:2:0x000c, LOOP_START, PHI: r1 
      PHI: (r1v1 int) = (r1v0 int), (r1v4 int) binds: [B:1:0x0007, B:2:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01(int r4) {
        /*
            r3 = this;
            short[] r2 = X.AnonymousClass7A3.A01
            short r0 = (short) r4
            int r1 = java.util.Arrays.binarySearch(r2, r0)
            if (r1 >= 0) goto L_0x000e
        L_0x0009:
            java.lang.String r0 = "ZZ"
            return r0
        L_0x000c:
            if (r1 < 0) goto L_0x0015
        L_0x000e:
            short r0 = r2[r1]
            if (r0 != r4) goto L_0x0015
            int r1 = r1 + -1
            goto L_0x000c
        L_0x0015:
            int r1 = r1 + 1
            if (r1 < 0) goto L_0x0009
            java.lang.String[] r0 = X.AnonymousClass7A3.A00
            r0 = r0[r1]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3272279y.A01(int):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000d A[LOOP:0: B:4:0x000d->B:3:0x000b, LOOP_START, PHI: r1 
      PHI: (r1v1 int) = (r1v0 int), (r1v4 int) binds: [B:1:0x0007, B:3:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A02(int r6) {
        /*
            r5 = this;
            short[] r4 = X.AnonymousClass7A3.A01
            short r0 = (short) r6
            int r1 = java.util.Arrays.binarySearch(r4, r0)
            if (r1 >= 0) goto L_0x000d
        L_0x0009:
            r3 = 0
        L_0x000a:
            return r3
        L_0x000b:
            if (r1 < 0) goto L_0x0014
        L_0x000d:
            short r0 = r4[r1]
            if (r0 != r6) goto L_0x0014
            int r1 = r1 + -1
            goto L_0x000b
        L_0x0014:
            int r2 = r1 + 1
            if (r2 < 0) goto L_0x0009
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1 = 253(0xfd, float:3.55E-43)
        L_0x001f:
            if (r2 >= r1) goto L_0x000a
            short r0 = r4[r2]
            if (r0 != r6) goto L_0x000a
            java.lang.String[] r0 = X.AnonymousClass7A3.A00
            r0 = r0[r2]
            r3.add(r0)
            int r2 = r2 + 1
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3272279y.A02(int):java.util.ArrayList");
    }
}
