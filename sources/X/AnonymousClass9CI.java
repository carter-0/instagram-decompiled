package X;

/* renamed from: X.9CI  reason: invalid class name */
public abstract class AnonymousClass9CI {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r13 < 2048) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0184, code lost:
        if (r6 < 2048) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[LOOP:1: B:15:0x003c->B:21:0x004e, LOOP_START, PHI: r1 r2 r14 
      PHI: (r1v18 char) = (r1v17 char), (r1v23 char) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v4 long) = (r2v3 long), (r2v15 long) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v2 int) = (r14v1 int), (r14v8 int) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
        /*
            r20 = this;
            r0 = r20
            r9 = r24
            r1 = r23
            boolean r0 = r0 instanceof X.C384479hO
            r8 = r21
            r7 = r22
            if (r0 == 0) goto L_0x014d
            long r2 = (long) r1
            long r5 = (long) r9
            long r5 = r5 + r2
            int r4 = r8.length()
            java.lang.String r12 = " at index "
            java.lang.String r11 = "Failed writing "
            if (r4 > r9) goto L_0x012a
            int r0 = r7.length
            int r0 = r0 - r24
            if (r0 < r1) goto L_0x012a
            r14 = 0
        L_0x0021:
            r1 = 128(0x80, float:1.794E-43)
            r18 = 1
            if (r14 >= r4) goto L_0x0038
            char r0 = r8.charAt(r14)
            if (r0 >= r1) goto L_0x0038
            long r18 = r18 + r2
            byte r0 = (byte) r0
            X.AnonymousClass9CA.A07(r7, r0, r2)
            int r14 = r14 + 1
            r2 = r18
            goto L_0x0021
        L_0x0038:
            if (r14 != r4) goto L_0x003c
        L_0x003a:
            int r0 = (int) r2
            return r0
        L_0x003c:
            if (r14 >= r4) goto L_0x003a
            char r13 = r8.charAt(r14)
            if (r13 >= r1) goto L_0x0054
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            long r15 = r2 + r18
            byte r0 = (byte) r13
            X.AnonymousClass9CA.A07(r7, r0, r2)
        L_0x004e:
            int r14 = r14 + 1
            r1 = 128(0x80, float:1.794E-43)
            r2 = r15
            goto L_0x003c
        L_0x0054:
            r0 = 2048(0x800, float:2.87E-42)
            if (r13 >= r0) goto L_0x0076
        L_0x0058:
            r0 = 2
            long r9 = r5 - r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0076
            long r0 = r2 + r18
            int r9 = r13 >>> 6
            r9 = r9 | 960(0x3c0, float:1.345E-42)
            byte r9 = (byte) r9
            X.AnonymousClass9CA.A07(r7, r9, r2)
            long r15 = r0 + r18
            r9 = r13 & 63
            r2 = 128(0x80, float:1.794E-43)
            r9 = r9 | r2
        L_0x0071:
            byte r2 = (byte) r9
            X.AnonymousClass9CA.A07(r7, r2, r0)
            goto L_0x004e
        L_0x0076:
            r15 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r1) goto L_0x0080
            if (r15 >= r13) goto L_0x00a5
        L_0x0080:
            r16 = 3
            long r9 = r5 - r16
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00a5
            long r9 = r2 + r18
            int r0 = r13 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            X.AnonymousClass9CA.A07(r7, r0, r2)
            long r0 = r9 + r18
            int r2 = r13 >>> 6
            r2 = r2 & 63
            r3 = 128(0x80, float:1.794E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            X.AnonymousClass9CA.A07(r7, r2, r9)
            long r15 = r0 + r18
            r9 = r13 & 63
            r9 = r9 | r3
            goto L_0x0071
        L_0x00a5:
            r16 = 4
            long r9 = r5 - r16
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00f7
            int r9 = r14 + 1
            if (r9 == r4) goto L_0x00ef
            char r1 = r8.charAt(r9)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r1)
            if (r0 == 0) goto L_0x00ee
            int r14 = java.lang.Character.toCodePoint(r13, r1)
            long r0 = r2 + r18
            int r10 = r14 >>> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            X.AnonymousClass9CA.A07(r7, r10, r2)
            long r2 = r0 + r18
            int r10 = r14 >>> 12
            r10 = r10 & 63
            r13 = 128(0x80, float:1.794E-43)
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            X.AnonymousClass9CA.A07(r7, r10, r0)
            long r0 = r2 + r18
            int r10 = r14 >>> 6
            r10 = r10 & 63
            r10 = r10 | r13
            byte r10 = (byte) r10
            X.AnonymousClass9CA.A07(r7, r10, r2)
            long r15 = r0 + r18
            r2 = r14 & 63
            r2 = r2 | r13
            byte r2 = (byte) r2
            X.AnonymousClass9CA.A07(r7, r2, r0)
            r14 = r9
            goto L_0x004e
        L_0x00ee:
            r14 = r9
        L_0x00ef:
            int r1 = r14 + -1
            X.9GS r0 = new X.9GS
            r0.<init>(r1, r4)
            throw r0
        L_0x00f7:
            if (r1 > r13) goto L_0x010f
            if (r13 > r15) goto L_0x010f
            int r0 = r14 + 1
            if (r0 == r4) goto L_0x0109
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x010f
        L_0x0109:
            X.9GS r0 = new X.9GS
            r0.<init>(r14, r4)
            throw r0
        L_0x010f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r13)
            r0.append(r12)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x012a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            int r0 = r4 + -1
            char r0 = r8.charAt(r0)
            r2.append(r0)
            r2.append(r12)
            int r1 = r23 + r24
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x014d:
            int r2 = r8.length()
            int r9 = r24 + r23
            r10 = 0
        L_0x0154:
            r5 = 128(0x80, float:1.794E-43)
            if (r10 >= r2) goto L_0x0168
            int r3 = r10 + r23
            if (r3 >= r9) goto L_0x0168
            char r0 = r8.charAt(r10)
            if (r0 >= r5) goto L_0x0168
            byte r0 = (byte) r0
            r22[r3] = r0
            int r10 = r10 + 1
            goto L_0x0154
        L_0x0168:
            int r4 = r23 + r10
            if (r10 != r2) goto L_0x016f
            int r4 = r23 + r2
        L_0x016e:
            return r4
        L_0x016f:
            if (r10 >= r2) goto L_0x016e
            char r6 = r8.charAt(r10)
            if (r6 >= r5) goto L_0x0182
            if (r4 >= r9) goto L_0x0186
            int r1 = r4 + 1
        L_0x017b:
            byte r0 = (byte) r6
            r22[r4] = r0
            r4 = r1
        L_0x017f:
            int r10 = r10 + 1
            goto L_0x016f
        L_0x0182:
            r0 = 2048(0x800, float:2.87E-42)
            if (r6 >= r0) goto L_0x019c
        L_0x0186:
            int r0 = r9 + -2
            if (r4 > r0) goto L_0x019c
            int r1 = r4 + 1
            int r0 = r6 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            byte r0 = (byte) r0
            r22[r4] = r0
            int r4 = r1 + 1
            r0 = r6 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0
            r22[r1] = r0
            goto L_0x017f
        L_0x019c:
            r3 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L_0x01a6
            if (r3 >= r6) goto L_0x01c3
        L_0x01a6:
            int r0 = r9 + -3
            if (r4 > r0) goto L_0x01c3
            int r1 = r4 + 1
            int r0 = r6 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            r22[r4] = r0
            int r4 = r1 + 1
            int r0 = r6 >>> 6
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0
            r22[r1] = r0
            int r1 = r4 + 1
            r6 = r6 & 63
            r6 = r6 | r5
            goto L_0x017b
        L_0x01c3:
            int r0 = r9 + -4
            if (r4 > r0) goto L_0x020e
            int r3 = r10 + 1
            int r0 = r8.length()
            if (r3 == r0) goto L_0x0206
            char r1 = r8.charAt(r3)
            boolean r0 = java.lang.Character.isSurrogatePair(r6, r1)
            if (r0 == 0) goto L_0x0205
            int r6 = java.lang.Character.toCodePoint(r6, r1)
            int r1 = r4 + 1
            int r0 = r6 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0
            r22[r4] = r0
            int r4 = r1 + 1
            int r0 = r6 >>> 12
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0
            r22[r1] = r0
            int r1 = r4 + 1
            int r0 = r6 >>> 6
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0
            r22[r4] = r0
            int r4 = r1 + 1
            r0 = r6 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0
            r22[r1] = r0
            r10 = r3
            goto L_0x017f
        L_0x0205:
            r10 = r3
        L_0x0206:
            int r0 = r10 + -1
            X.9GS r1 = new X.9GS
            r1.<init>(r0, r2)
            throw r1
        L_0x020e:
            if (r1 > r6) goto L_0x022a
            if (r6 > r3) goto L_0x022a
            int r1 = r10 + 1
            int r0 = r8.length()
            if (r1 == r0) goto L_0x0224
            char r0 = r8.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r6, r0)
            if (r0 != 0) goto L_0x022a
        L_0x0224:
            X.9GS r1 = new X.9GS
            r1.<init>(r10, r2)
            throw r1
        L_0x022a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " at index "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CI.A00(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x0097 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f4 A[LOOP:5: B:67:0x00fa->B:64:0x00f4, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(byte[] r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r3 = r20
            r7 = r19
            boolean r0 = r0 instanceof X.C384479hO
            r8 = r18
            if (r0 == 0) goto L_0x0088
            r2 = r19 | r20
            int r1 = r8.length
            int r0 = r1 - r20
            r2 = r2 | r0
            if (r2 < 0) goto L_0x0068
            long r4 = (long) r7
            long r0 = (long) r3
            long r0 = r0 - r4
            int r9 = (int) r0
            r14 = r4
            r3 = 0
            r0 = 16
            if (r9 < r0) goto L_0x00f7
            int r0 = (int) r4
            r0 = r0 & 7
            int r6 = 8 - r0
        L_0x0023:
            r12 = 1
            if (r3 >= r6) goto L_0x0037
            long r12 = r12 + r14
            X.9CD r2 = X.AnonymousClass9CA.A01
            long r0 = X.AnonymousClass9CA.A00
            long r0 = r0 + r14
            byte r0 = r2.A00(r8, r0)
            if (r0 < 0) goto L_0x00f7
            int r3 = r3 + 1
            r14 = r12
            goto L_0x0023
        L_0x0037:
            int r6 = r3 + 8
            if (r6 > r9) goto L_0x0055
            long r0 = X.AnonymousClass9CA.A00
            long r0 = r0 + r14
            X.9CD r2 = X.AnonymousClass9CA.A01
            long r10 = r2.A05(r8, r0)
            r0 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r0
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            r0 = 8
            long r14 = r14 + r0
            r3 = r6
            goto L_0x0037
        L_0x0055:
            if (r3 >= r9) goto L_0x00f6
            long r6 = r14 + r12
            X.9CD r2 = X.AnonymousClass9CA.A01
            long r0 = X.AnonymousClass9CA.A00
            long r0 = r0 + r14
            byte r0 = r2.A00(r8, r0)
            if (r0 < 0) goto L_0x00f7
            int r3 = r3 + 1
            r14 = r6
            goto L_0x0055
        L_0x0068:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            r0 = 354(0x162, float:4.96E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        L_0x0088:
            if (r7 >= r3) goto L_0x0091
            byte r0 = r18[r7]
            if (r0 < 0) goto L_0x0091
            int r7 = r7 + 1
            goto L_0x0088
        L_0x0091:
            if (r7 < r3) goto L_0x0094
            goto L_0x00d4
        L_0x0094:
            if (r7 < r3) goto L_0x0098
            r14 = 0
        L_0x0097:
            return r14
        L_0x0098:
            int r5 = r7 + 1
            byte r7 = r18[r7]
            if (r7 >= 0) goto L_0x017d
            r9 = -32
            r14 = -1
            r6 = -65
            if (r7 >= r9) goto L_0x00b2
            if (r5 >= r3) goto L_0x00d5
            r0 = -62
            if (r7 < r0) goto L_0x0097
            int r7 = r5 + 1
            byte r0 = r18[r5]
        L_0x00af:
            if (r0 <= r6) goto L_0x0094
            return r14
        L_0x00b2:
            r0 = -16
            if (r7 >= r0) goto L_0x015d
            int r0 = r20 + -1
            if (r5 >= r0) goto L_0x0180
            int r4 = r5 + 1
            byte r2 = r18[r5]
            if (r2 > r6) goto L_0x0097
            r1 = -96
            if (r7 != r9) goto L_0x00cb
            if (r2 < r1) goto L_0x0097
        L_0x00c6:
            int r7 = r4 + 1
            byte r0 = r18[r4]
            goto L_0x00af
        L_0x00cb:
            r0 = -19
            if (r7 != r0) goto L_0x00c6
            if (r2 >= r1) goto L_0x0097
            goto L_0x00c6
        L_0x00d2:
            if (r9 != 0) goto L_0x00d7
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            return r7
        L_0x00d6:
            r4 = r10
        L_0x00d7:
            int r1 = r9 + -1
            r13 = -32
            r6 = -65
            r14 = -1
            if (r7 >= r13) goto L_0x0110
            if (r1 == 0) goto L_0x00d5
            int r9 = r1 + -1
            r0 = -62
            if (r7 < r0) goto L_0x0097
        L_0x00e8:
            long r15 = r15 + r4
            X.9CD r12 = X.AnonymousClass9CA.A01
            long r2 = X.AnonymousClass9CA.A00
            long r2 = r2 + r4
        L_0x00ee:
            byte r0 = r12.A00(r8, r2)
            if (r0 > r6) goto L_0x0097
            r4 = r15
            goto L_0x00fa
        L_0x00f6:
            r3 = r9
        L_0x00f7:
            int r9 = r9 - r3
            long r0 = (long) r3
            long r4 = r4 + r0
        L_0x00fa:
            r7 = 0
        L_0x00fb:
            r15 = 1
            if (r9 <= 0) goto L_0x00d2
            long r10 = r4 + r15
            X.9CD r2 = X.AnonymousClass9CA.A01
            long r0 = X.AnonymousClass9CA.A00
            long r0 = r0 + r4
            byte r7 = r2.A00(r8, r0)
            if (r7 < 0) goto L_0x00d6
            int r9 = r9 + -1
            r4 = r10
            goto L_0x00fb
        L_0x0110:
            r0 = -16
            if (r7 >= r0) goto L_0x0137
            r0 = 2
            if (r1 < r0) goto L_0x01a8
            int r9 = r1 + -2
            long r10 = r4 + r15
            X.9CD r12 = X.AnonymousClass9CA.A01
            long r2 = X.AnonymousClass9CA.A00
            long r0 = r2 + r4
            byte r4 = r12.A00(r8, r0)
            if (r4 > r6) goto L_0x0097
            r1 = -96
            if (r7 != r13) goto L_0x0130
            if (r4 < r1) goto L_0x0097
        L_0x012d:
            long r15 = r15 + r10
            long r2 = r2 + r10
            goto L_0x00ee
        L_0x0130:
            r0 = -19
            if (r7 != r0) goto L_0x012d
            if (r4 >= r1) goto L_0x0097
            goto L_0x012d
        L_0x0137:
            r0 = 3
            if (r1 < r0) goto L_0x01a8
            int r9 = r1 + -3
            long r11 = r4 + r15
            X.9CD r10 = X.AnonymousClass9CA.A01
            long r2 = X.AnonymousClass9CA.A00
            long r0 = r2 + r4
            byte r0 = r10.A00(r8, r0)
            if (r0 > r6) goto L_0x0097
            int r1 = r7 << 28
            int r0 = r0 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L_0x0097
            long r4 = r11 + r15
            long r2 = r2 + r11
            byte r0 = r10.A00(r8, r2)
            if (r0 > r6) goto L_0x0097
            goto L_0x00e8
        L_0x015d:
            int r0 = r20 + -2
            if (r5 >= r0) goto L_0x0180
            int r2 = r5 + 1
            byte r0 = r18[r5]
            if (r0 > r6) goto L_0x0097
            int r1 = r7 << 28
            int r0 = r0 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L_0x0097
            int r1 = r2 + 1
            byte r0 = r18[r2]
            if (r0 > r6) goto L_0x0097
            int r5 = r1 + 1
            byte r0 = r18[r1]
            if (r0 <= r6) goto L_0x017d
            return r14
        L_0x017d:
            r7 = r5
            goto L_0x0094
        L_0x0180:
            X.9CI r0 = X.AnonymousClass9CG.A00
            int r0 = r5 + -1
            byte r7 = r18[r0]
            int r3 = r20 - r5
            if (r3 == 0) goto L_0x01a2
            r0 = 1
            if (r3 == r0) goto L_0x019d
            r0 = 2
            if (r3 != r0) goto L_0x0197
            byte r2 = r18[r5]
            int r0 = r5 + 1
            byte r1 = r18[r0]
            goto L_0x01c2
        L_0x0197:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x019d:
            byte r1 = r18[r5]
            goto L_0x01dc
        L_0x01a0:
            X.9CI r0 = X.AnonymousClass9CG.A00
        L_0x01a2:
            r0 = -12
            if (r7 <= r0) goto L_0x01d0
        L_0x01a6:
            r7 = -1
            return r7
        L_0x01a8:
            if (r1 == 0) goto L_0x01a0
            r0 = 1
            if (r1 == r0) goto L_0x01d1
            r0 = 2
            if (r1 != r0) goto L_0x01e5
            X.9CD r9 = X.AnonymousClass9CA.A01
            long r0 = X.AnonymousClass9CA.A00
            long r2 = r0 + r4
            byte r2 = r9.A00(r8, r2)
            long r4 = r4 + r15
            long r0 = r0 + r4
            byte r1 = r9.A00(r8, r0)
            X.9CI r0 = X.AnonymousClass9CG.A00
        L_0x01c2:
            r0 = -12
            if (r7 > r0) goto L_0x01a6
            if (r2 > r6) goto L_0x01a6
            if (r1 > r6) goto L_0x01a6
            int r0 = r2 << 8
            r7 = r7 ^ r0
            int r0 = r1 << 16
        L_0x01cf:
            r7 = r7 ^ r0
        L_0x01d0:
            return r7
        L_0x01d1:
            X.9CD r2 = X.AnonymousClass9CA.A01
            long r0 = X.AnonymousClass9CA.A00
            long r0 = r0 + r4
            byte r1 = r2.A00(r8, r0)
            X.9CI r0 = X.AnonymousClass9CG.A00
        L_0x01dc:
            r0 = -12
            if (r7 > r0) goto L_0x01a6
            if (r1 > r6) goto L_0x01a6
            int r0 = r1 << 8
            goto L_0x01cf
        L_0x01e5:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CI.A01(byte[], int, int):int");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v15, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v21, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fc, code lost:
        r1 = new java.io.IOException("Protocol message had invalid UTF-8.");
        r1.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0106, code lost:
        throw r1;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r6v7, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r6v9, types: [byte] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A02(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.AnonymousClass9CH
            if (r0 == 0) goto L_0x012d
            r2 = r14 | r15
            int r1 = r13.length
            int r0 = r1 - r14
            int r0 = r0 - r15
            r2 = r2 | r0
            r3 = 0
            if (r2 < 0) goto L_0x010d
            int r4 = r14 + r15
            char[] r2 = new char[r15]
            r5 = 0
        L_0x0013:
            if (r14 >= r4) goto L_0x0022
            byte r0 = r13[r14]
            if (r0 < 0) goto L_0x0022
            int r14 = r14 + 1
            int r1 = r5 + 1
            char r0 = (char) r0
            r2[r5] = r0
            r5 = r1
            goto L_0x0013
        L_0x0022:
            r9 = r5
            if (r14 >= r4) goto L_0x0107
            int r6 = r14 + 1
            byte r11 = r13[r14]
            if (r11 < 0) goto L_0x0041
            int r5 = r5 + 1
            char r0 = (char) r11
            r2[r9] = r0
        L_0x0030:
            if (r6 >= r4) goto L_0x003f
            byte r0 = r13[r6]
            if (r0 < 0) goto L_0x003f
            int r6 = r6 + 1
            int r1 = r5 + 1
            char r0 = (char) r0
            r2[r5] = r0
            r5 = r1
            goto L_0x0030
        L_0x003f:
            r14 = r6
            goto L_0x0022
        L_0x0041:
            r0 = -32
            if (r11 >= r0) goto L_0x0060
            if (r6 >= r4) goto L_0x00fc
            int r14 = r6 + 1
            byte r6 = r13[r6]
            int r5 = r5 + 1
            r0 = -62
            if (r11 < r0) goto L_0x00db
            r0 = -65
            if (r6 > r0) goto L_0x00db
            r0 = r11 & 31
            int r1 = r0 << 6
        L_0x0059:
            r0 = r6 & 63
            r1 = r1 | r0
            char r0 = (char) r1
            r2[r9] = r0
            goto L_0x0022
        L_0x0060:
            r0 = -16
            if (r11 >= r0) goto L_0x0091
            int r0 = r4 + -1
            if (r6 >= r0) goto L_0x00fc
            int r0 = r6 + 1
            byte r8 = r13[r6]
            int r14 = r0 + 1
            byte r6 = r13[r0]
            int r5 = r5 + 1
            r7 = -65
            if (r8 > r7) goto L_0x00e6
            r0 = -32
            r1 = -96
            if (r11 != r0) goto L_0x008a
            if (r8 < r1) goto L_0x00e6
        L_0x007e:
            if (r6 > r7) goto L_0x00e6
            r0 = r11 & 15
            int r1 = r0 << 12
            r0 = r8 & 63
            int r0 = r0 << 6
            r1 = r1 | r0
            goto L_0x0059
        L_0x008a:
            r0 = -19
            if (r11 != r0) goto L_0x007e
            if (r8 >= r1) goto L_0x00e6
            goto L_0x007e
        L_0x0091:
            int r0 = r4 + -2
            if (r6 >= r0) goto L_0x00fc
            int r1 = r6 + 1
            byte r9 = r13[r6]
            int r0 = r1 + 1
            byte r7 = r13[r1]
            int r14 = r0 + 1
            byte r1 = r13[r0]
            int r10 = r5 + 1
            r8 = -65
            if (r9 > r8) goto L_0x00f1
            int r6 = r11 << 28
            int r0 = r9 + 112
            int r6 = r6 + r0
            int r0 = r6 >> 30
            if (r0 != 0) goto L_0x00f1
            if (r7 > r8) goto L_0x00f1
            if (r1 > r8) goto L_0x00f1
            r0 = r11 & 7
            int r6 = r0 << 18
            r0 = r9 & 63
            int r0 = r0 << 12
            r6 = r6 | r0
            r0 = r7 & 63
            int r0 = r0 << 6
            r6 = r6 | r0
            r0 = r1 & 63
            r6 = r6 | r0
            int r1 = r6 >>> 10
            r0 = 55232(0xd7c0, float:7.7397E-41)
            int r1 = r1 + r0
            char r0 = (char) r1
            r2[r5] = r0
            r1 = r6 & 1023(0x3ff, float:1.434E-42)
            r0 = 56320(0xdc00, float:7.8921E-41)
            int r1 = r1 + r0
            char r0 = (char) r1
            r2[r10] = r0
            int r5 = r10 + 1
            goto L_0x0022
        L_0x00db:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.9GO r1 = new X.9GO
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        L_0x00e6:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.9GO r1 = new X.9GO
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        L_0x00f1:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.9GO r1 = new X.9GO
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        L_0x00fc:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.9GO r1 = new X.9GO
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        L_0x0107:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r3, r5)
            return r0
        L_0x010d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            r0 = 192(0xc0, float:2.69E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        L_0x012d:
            java.nio.charset.Charset r1 = X.AnonymousClass97S.A04
            java.lang.String r2 = new java.lang.String
            r2.<init>(r13, r14, r15, r1)
            java.lang.String r0 = "�"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0157
            byte[] r1 = r2.getBytes(r1)
            int r15 = r15 + r14
            byte[] r0 = java.util.Arrays.copyOfRange(r13, r14, r15)
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0157
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.9GO r1 = new X.9GO
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        L_0x0157:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CI.A02(byte[], int, int):java.lang.String");
    }
}
