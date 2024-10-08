package X;

import org.tukaani.xz.lzma.LZMAEncoder;

/* renamed from: X.0Ts  reason: invalid class name */
public final class AnonymousClass0Ts extends LZMAEncoder {
    public C63230zK A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: org.tukaani.xz.lzma.LZMAEncoder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b3 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02() {
        /*
            r19 = this;
            r3 = r19
            int r11 = r3.A03
            r1 = -1
            if (r11 != r1) goto L_0x0013
            r0 = 0
            r3.A03 = r0
            r11 = 0
            org.tukaani.xz.lz.LZEncoder r0 = r3.A07
            X.0zK r0 = r0.A05()
            r3.A00 = r0
        L_0x0013:
            r3.A01 = r1
            org.tukaani.xz.lz.LZEncoder r5 = r3.A07
            int r1 = r5.A03
            int r0 = r5.A02
            int r1 = r1 - r0
            r0 = 273(0x111, float:3.83E-43)
            int r10 = java.lang.Math.min(r1, r0)
            r8 = 2
            r4 = 1
            if (r10 < r8) goto L_0x0104
            r2 = 0
            r6 = 0
            r9 = 0
            r18 = 0
        L_0x002b:
            int[] r0 = r3.A02
            r17 = r0
            r0 = r0[r6]
            int r1 = r5.A04(r0, r10)
            if (r1 < r8) goto L_0x0048
            int r0 = r3.A06
            if (r1 < r0) goto L_0x0043
            r3.A01 = r6
            int r0 = r1 + -1
            r3.A06(r0)
            return r1
        L_0x0043:
            if (r1 <= r9) goto L_0x0048
            r18 = r6
            r9 = r1
        L_0x0048:
            int r6 = r6 + 1
            r16 = 4
            r0 = r16
            if (r6 < r0) goto L_0x002b
            X.0zK r15 = r3.A00
            int r14 = r15.A00
            if (r14 <= 0) goto L_0x0090
            int[] r13 = r15.A02
            int r0 = r14 - r4
            r6 = r13[r0]
            int[] r12 = r15.A01
            r7 = r12[r0]
            int r0 = r3.A06
            if (r6 < r0) goto L_0x006e
            int r0 = r7 + 4
            r3.A01 = r0
            int r0 = r6 + -1
        L_0x006a:
            r3.A06(r0)
            return r6
        L_0x006e:
            if (r14 <= r4) goto L_0x0088
            int r1 = r14 - r8
            r0 = r13[r1]
            int r0 = r0 + 1
            if (r6 != r0) goto L_0x0088
            r1 = r12[r1]
            int r0 = r7 >>> 7
            if (r1 >= r0) goto L_0x0088
            int r14 = r14 - r4
            r15.A00 = r14
            int r0 = r14 - r4
            r6 = r13[r0]
            r7 = r12[r0]
            goto L_0x006e
        L_0x0088:
            if (r6 != r8) goto L_0x0092
            r0 = 128(0x80, float:1.794E-43)
            if (r7 < r0) goto L_0x0092
            r6 = 1
            goto L_0x0092
        L_0x0090:
            r6 = 0
            r7 = 0
        L_0x0092:
            if (r9 < r8) goto L_0x00b3
            int r0 = r9 + 1
            if (r0 >= r6) goto L_0x00a9
            int r0 = r9 + 2
            if (r0 < r6) goto L_0x00a0
            r0 = 512(0x200, float:7.175E-43)
            if (r7 >= r0) goto L_0x00a9
        L_0x00a0:
            int r0 = r9 + 3
            if (r0 < r6) goto L_0x00b3
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r7 < r0) goto L_0x00b3
        L_0x00a9:
            r0 = r18
            r3.A01 = r0
            int r0 = r9 + -1
            r3.A06(r0)
            return r9
        L_0x00b3:
            if (r6 < r8) goto L_0x0104
            if (r10 <= r8) goto L_0x0104
            int r0 = r11 + 1
            r3.A03 = r0
            X.0zK r9 = r5.A05()
            r3.A00 = r9
            int r1 = r9.A00
            if (r1 <= 0) goto L_0x00e8
            int[] r0 = r9.A02
            int r1 = r1 - r4
            r10 = r0[r1]
            int[] r0 = r9.A01
            r9 = r0[r1]
            if (r10 < r6) goto L_0x00d2
            if (r9 < r7) goto L_0x0104
        L_0x00d2:
            int r1 = r6 + 1
            if (r10 != r1) goto L_0x00da
            int r0 = r9 >>> 7
            if (r7 >= r0) goto L_0x0104
        L_0x00da:
            if (r10 > r1) goto L_0x0104
            int r0 = r10 + 1
            if (r0 < r6) goto L_0x00e8
            r0 = 3
            if (r6 < r0) goto L_0x00e8
            int r0 = r7 >>> 7
            if (r9 >= r0) goto L_0x00e8
            return r4
        L_0x00e8:
            int r0 = r6 + -1
            int r1 = java.lang.Math.max(r0, r8)
        L_0x00ee:
            r0 = r17[r2]
            int r0 = r5.A04(r0, r1)
            if (r0 == r1) goto L_0x0104
            int r2 = r2 + 1
            r0 = r16
            if (r2 < r0) goto L_0x00ee
            int r0 = r7 + 4
            r3.A01 = r0
            int r0 = r6 + -2
            goto L_0x006a
        L_0x0104:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Ts.A02():int");
    }
}
