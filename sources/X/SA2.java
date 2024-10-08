package X;

import java.io.IOException;

public abstract class SA2 {
    /* JADX WARNING: type inference failed for: r1v25, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.TA9 A00(X.C12827T8y r14, java.io.InputStream r15) {
        /*
            java.lang.String r2 = "Error in decoding CborValue from bytes"
            X.Rsk r0 = r14.A05()     // Catch:{ IOException -> 0x0337 }
            if (r0 == 0) goto L_0x032f
            byte r5 = r0.A01     // Catch:{ IOException | RuntimeException -> 0x0328 }
            byte r1 = r0.A00     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0 = -128(0xffffffffffffff80, float:NaN)
            r12 = 1000(0x3e8, double:4.94E-321)
            r7 = 0
            if (r1 == r0) goto L_0x02b6
            r0 = -96
            if (r1 == r0) goto L_0x00fb
            r0 = -64
            if (r1 == r0) goto L_0x00f2
            r0 = -32
            if (r1 == r0) goto L_0x00bf
            if (r1 == 0) goto L_0x005f
            r0 = 32
            if (r1 == r0) goto L_0x005f
            r0 = 64
            if (r1 == r0) goto L_0x0049
            r0 = 96
            if (r1 != r0) goto L_0x0318
            X.C12827T8y.A02(r14, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            byte[] r1 = X.C12827T8y.A04(r14)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r3.<init>(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r0 = r3.length()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            long r0 = (long) r0     // Catch:{ IOException | RuntimeException -> 0x0328 }
            A01(r5, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.QvG r1 = new X.QvG     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r3)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            return r1
        L_0x0049:
            X.C12827T8y.A02(r14, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            byte[] r4 = X.C12827T8y.A04(r14)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r3 = r4.length     // Catch:{ IOException | RuntimeException -> 0x0328 }
            long r0 = (long) r3     // Catch:{ IOException | RuntimeException -> 0x0328 }
            A01(r5, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.QvC r0 = X.TAO.A01(r4, r3)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.QvF r1 = new X.QvF     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            return r1
        L_0x005f:
            r14.A05()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Rsk r0 = r14.A00     // Catch:{ IOException | RuntimeException -> 0x0328 }
            byte r1 = r0.A00     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r1 != 0) goto L_0x006a
            r1 = 1
            goto L_0x006f
        L_0x006a:
            r0 = 32
            if (r1 != r0) goto L_0x00ab
            r1 = 0
        L_0x006f:
            long r3 = X.C12827T8y.A00(r14)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0091
            if (r1 != 0) goto L_0x007f
            r0 = -1
            long r0 = r0 ^ r3
            r3 = r0
        L_0x007f:
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0085
            r0 = r3
            goto L_0x0088
        L_0x0085:
            r0 = -1
            long r0 = r0 ^ r3
        L_0x0088:
            A01(r5, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.QvJ r1 = new X.QvJ     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r3)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            return r1
        L_0x0091:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.String r0 = "the maximum supported unsigned/negative integer is %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass7TE.A1B(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x00ab:
            int r0 = r1 >> 5
            r0 = r0 & 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.String r0 = "expected major type 0 or 1 but found %s"
            java.lang.IllegalStateException r1 = X.Pxf.A0Y(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x00bf:
            X.C12827T8y.A02(r14, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Rsk r0 = r14.A00     // Catch:{ IOException | RuntimeException -> 0x0328 }
            byte r1 = r0.A01     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0 = 24
            if (r1 > r0) goto L_0x00ea
            long r3 = X.C12827T8y.A00(r14)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r1 = (int) r3     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0 = 20
            if (r1 != r0) goto L_0x00d5
            r0 = 0
            goto L_0x00da
        L_0x00d5:
            r0 = 21
            if (r1 != r0) goto L_0x00e0
            r0 = 1
        L_0x00da:
            X.QvE r1 = new X.QvE     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            return r1
        L_0x00e0:
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.String r0 = "expected FALSE or TRUE"
            java.lang.IllegalStateException r1 = X.Pxf.A0Y(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x00ea:
            java.lang.String r0 = "expected simple value"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x00f2:
            java.lang.String r0 = "Tags are currently unsupported"
            X.RCN r1 = new X.RCN     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x00fb:
            X.C12827T8y.A02(r14, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.C12827T8y.A01(r14)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            long r0 = X.C12827T8y.A00(r14)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r10 = 0
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x02ae
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x02ae
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0125
            X.SGf r3 = r14.A01     // Catch:{ IOException | RuntimeException -> 0x0328 }
            long r8 = r0 + r0
            java.util.Deque r4 = r3.A00     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r4.push(r3)     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x0125:
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x02a6
            A01(r5, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r6 = (int) r0     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Rsj[] r5 = new X.C10468Rsj[r6]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r10 = 0
            r9 = 0
        L_0x0131:
            long r3 = (long) r9     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r8 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x016a
            X.TA9 r8 = A00(r14, r15)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r10 == 0) goto L_0x015b
            int r3 = r8.compareTo(r10)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r3 > 0) goto L_0x015b
            java.lang.String r3 = "Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s"
            java.lang.String r1 = r10.toString()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.String r0 = r8.toString()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.String r0 = java.lang.String.format(r3, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.RCM r1 = new X.RCM     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x015b:
            X.TA9 r4 = A00(r14, r15)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Rsj r3 = new X.Rsj     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r3.<init>(r8, r4)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r5[r9] = r3     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r9 = r9 + 1
            r10 = r8
            goto L_0x0131
        L_0x016a:
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r4.<init>()     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x016f:
            if (r7 >= r6) goto L_0x018e
            r3 = r5[r7]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.TA9 r0 = r3.A00     // Catch:{ IOException | RuntimeException -> 0x0328 }
            boolean r0 = r4.containsKey(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r0 != 0) goto L_0x0185
            X.TA9 r1 = r3.A00     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.TA9 r0 = r3.A01     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r4.put(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r7 = r7 + 1
            goto L_0x016f
        L_0x0185:
            java.lang.String r0 = "Attempted to add duplicate key to canonical CBOR Map."
            X.RCM r1 = new X.RCM     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x018e:
            java.util.Comparator r6 = X.C8449Quu.A03     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.util.Comparator r0 = r4.comparator()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r7 = 1
            if (r0 != 0) goto L_0x0199
            r12 = 1
            goto L_0x019d
        L_0x0199:
            boolean r12 = r6.equals(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x019d:
            java.util.Set r1 = r4.entrySet()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.util.Map$Entry[] r4 = X.C13136TMu.A01     // Catch:{ IOException | RuntimeException -> 0x0328 }
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r0 != 0) goto L_0x01bc
            java.util.Iterator r3 = r1.iterator()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r3.getClass()     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x01b2:
            boolean r0 = r3.hasNext()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r0 == 0) goto L_0x01bc
            X.JTT.A1U(r1, r3)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x01b2
        L_0x01bc:
            java.lang.Object[] r11 = r1.toArray(r4)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.util.Map$Entry[] r11 = (java.util.Map.Entry[]) r11     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r9 = r11.length     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r9 == 0) goto L_0x025c
            r5 = 0
            r8 = 0
            if (r9 == r7) goto L_0x0261
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r12 != 0) goto L_0x022a
            X.TLl r0 = new X.TLl     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0.<init>(r6)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.util.Arrays.sort(r11, r8, r9, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0 = r11[r8]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0.getClass()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object r12 = r0.getKey()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r10[r8] = r12     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r4[r8] = r1     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0 = r10[r8]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.C9706RfP.A00(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x01ed:
            int r0 = r7 + -1
            r8 = r11[r0]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r8.getClass()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r3 = r11[r7]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r3.getClass()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object r1 = r3.getKey()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.C9706RfP.A00(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r10[r7] = r1     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r4[r7] = r0     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r0 = r6.compare(r12, r1)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r0 == 0) goto L_0x0214
            int r7 = r7 + 1
            r12 = r1
            if (r7 >= r9) goto L_0x0243
            goto L_0x01ed
        L_0x0214:
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.String r1 = "Multiple entries with same key: "
            java.lang.String r0 = " and "
            java.lang.String r0 = X.002.A0u(r1, r4, r0, r3)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x022a:
            r0 = r11[r8]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0.getClass()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.C9706RfP.A00(r1, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r10[r8] = r1     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r4[r8] = r0     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r8 = r8 + 1
            if (r8 >= r9) goto L_0x0243
            goto L_0x022a
        L_0x0243:
            X.Quy r0 = X.C8453Quy.A03     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Qv5 r0 = X.C8448Qut.A00     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Qus r0 = new X.Qus     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0.<init>(r10, r9)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Quy r3 = new X.Quy     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r3.<init>(r0, r6)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Qus r1 = new X.Qus     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r4, r9)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Quu r0 = new X.Quu     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0.<init>(r1, r5, r3)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0296
        L_0x025c:
            X.Quu r0 = X.C8449Quu.A01(r6)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0296
        L_0x0261:
            r0 = r11[r8]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0.getClass()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Quy r0 = X.C8453Quy.A03     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Qv5 r0 = X.C8448Qut.A00     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0 = r1[r8]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r0 == 0) goto L_0x02a1
            X.Qus r0 = new X.Qus     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0.<init>(r1, r7)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Quy r4 = new X.Quy     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r4.<init>(r0, r6)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0 = r3[r8]     // Catch:{ IOException | RuntimeException -> 0x0328 }
            if (r0 == 0) goto L_0x029c
            X.Qus r1 = new X.Qus     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r3, r7)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.Quu r0 = new X.Quu     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r0.<init>(r1, r5, r4)     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x0296:
            X.QvI r1 = new X.QvI     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            return r1
        L_0x029c:
            java.lang.NullPointerException r0 = X.Pxg.A0h(r8)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x02a1:
            java.lang.NullPointerException r0 = X.Pxg.A0h(r8)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            throw r0     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x02a6:
            java.lang.String r0 = "Parser being asked to read a large CBOR map"
            X.RCN r1 = new X.RCN     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x02ae:
            java.lang.String r0 = "the maximum supported map length is 4611686018427387903L"
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass7TE.A1B(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x02b6:
            X.C12827T8y.A02(r14, r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.C12827T8y.A01(r14)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            long r3 = X.C12827T8y.A00(r14)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x02ff
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d5
            X.SGf r0 = r14.A01     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.util.Deque r1 = r0.A00     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.push(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x02d5:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x02f7
            A01(r5, r3)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r0 = (int) r3     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.TA9[] r1 = new X.TA9[r0]     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x02df:
            long r5 = (long) r7     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x02ed
            X.TA9 r0 = A00(r14, r15)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1[r7] = r0     // Catch:{ IOException | RuntimeException -> 0x0328 }
            int r7 = r7 + 1
            goto L_0x02df
        L_0x02ed:
            X.Qut r0 = X.C8448Qut.A00(r1)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.QvH r1 = new X.QvH     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            return r1
        L_0x02f7:
            java.lang.String r0 = "Parser being asked to read a large CBOR array"
            X.RCN r1 = new X.RCN     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x02ff:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.String r0 = "the maximum supported array length is %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass7TE.A1B(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            goto L_0x0327
        L_0x0318:
            int r0 = r1 >> 5
            r1 = r0 & 7
            java.lang.String r0 = "Unidentifiable major type: "
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ IOException | RuntimeException -> 0x0328 }
            X.RCN r1 = new X.RCN     // Catch:{ IOException | RuntimeException -> 0x0328 }
            r1.<init>(r0)     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x0327:
            throw r1     // Catch:{ IOException | RuntimeException -> 0x0328 }
        L_0x0328:
            r1 = move-exception
            X.RCN r0 = new X.RCN
            r0.<init>(r2, r1)
            throw r0
        L_0x032f:
            java.lang.String r1 = "Parser being asked to parse an empty input stream"
            X.RCN r0 = new X.RCN
            r0.<init>(r1)
            throw r0
        L_0x0337:
            r1 = move-exception
            X.RCN r0 = new X.RCN
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SA2.A00(X.T8y, java.io.InputStream):X.TA9");
    }

    public static final void A01(byte b, long j) {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new IOException(002.A0e("Integer value ", " after add info could have been represented in 0 additional bytes, but used 1", j));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new IOException(002.A0e("Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2", j));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new IOException(002.A0e("Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4", j));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new IOException(002.A0e("Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8", j));
                }
                return;
            default:
                return;
        }
    }
}
