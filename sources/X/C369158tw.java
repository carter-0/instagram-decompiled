package X;

/* renamed from: X.8tw  reason: invalid class name and case insensitive filesystem */
public final class C369158tw {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    /* JADX WARNING: Removed duplicated region for block: B:156:0x026e A[SYNTHETIC, Splitter:B:156:0x026e] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x027c A[SYNTHETIC, Splitter:B:165:0x027c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.C369158tw r22, java.nio.ByteOrder r23) {
        /*
            java.lang.String r7 = "IOException occurred while closing InputStream"
            r21 = 0
            r1 = r22
            byte[] r9 = r1.A02     // Catch:{ IOException -> 0x025c, all -> 0x025a }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x025c, all -> 0x025a }
            r0.<init>(r9)     // Catch:{ IOException -> 0x025c, all -> 0x025a }
            X.8tv r6 = new X.8tv     // Catch:{ IOException -> 0x025c, all -> 0x025a }
            r6.<init>(r0)     // Catch:{ IOException -> 0x025c, all -> 0x025a }
            r0 = r23
            r6.A02 = r0     // Catch:{ IOException -> 0x0258 }
            int r0 = r1.A00     // Catch:{ IOException -> 0x0258 }
            r5 = 0
            r10 = 1
            switch(r0) {
                case 1: goto L_0x002b;
                case 2: goto L_0x0216;
                case 3: goto L_0x01f9;
                case 4: goto L_0x01d5;
                case 5: goto L_0x01a6;
                case 6: goto L_0x002b;
                case 7: goto L_0x0216;
                case 8: goto L_0x0189;
                case 9: goto L_0x016c;
                case 10: goto L_0x0144;
                case 11: goto L_0x0122;
                case 12: goto L_0x0057;
                default: goto L_0x001d;
            }     // Catch:{ IOException -> 0x0258 }
        L_0x001d:
            r6.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x002a
        L_0x0021:
            r1 = move-exception
            java.nio.charset.Charset r0 = X.C369128tt.A04
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
            return r21
        L_0x002a:
            return r21
        L_0x002b:
            int r0 = r9.length     // Catch:{ IOException -> 0x0258 }
            if (r0 != r10) goto L_0x004e
            byte r0 = r9[r5]     // Catch:{ IOException -> 0x0258 }
            if (r0 < 0) goto L_0x004e
            if (r0 > r10) goto L_0x004e
            char[] r1 = new char[r10]     // Catch:{ IOException -> 0x0258 }
            int r0 = r0 + 48
            char r0 = (char) r0     // Catch:{ IOException -> 0x0258 }
            r1[r5] = r0     // Catch:{ IOException -> 0x0258 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0258 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0258 }
            r6.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x004d
        L_0x0044:
            r1 = move-exception
            java.nio.charset.Charset r0 = X.C369128tt.A04
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
            return r2
        L_0x004d:
            return r2
        L_0x004e:
            java.nio.charset.Charset r0 = X.C369128tt.A04     // Catch:{ IOException -> 0x0258 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0258 }
            r2.<init>(r9, r0)     // Catch:{ IOException -> 0x0258 }
            goto L_0x024c
        L_0x0057:
            int r0 = r1.A01     // Catch:{ IOException -> 0x0258 }
            r22 = r0
            double[] r15 = new double[r0]     // Catch:{ IOException -> 0x0258 }
        L_0x005d:
            r0 = r22
            if (r5 >= r0) goto L_0x0114
            int r0 = r6.A00     // Catch:{ IOException -> 0x0258 }
            int r1 = r0 + 8
            r6.A00 = r1     // Catch:{ IOException -> 0x0258 }
            int r0 = r6.A03     // Catch:{ IOException -> 0x0258 }
            if (r1 > r0) goto L_0x0108
            java.io.DataInputStream r0 = r6.A01     // Catch:{ IOException -> 0x0258 }
            int r14 = r0.read()     // Catch:{ IOException -> 0x0258 }
            int r11 = r0.read()     // Catch:{ IOException -> 0x0258 }
            int r13 = r0.read()     // Catch:{ IOException -> 0x0258 }
            int r12 = r0.read()     // Catch:{ IOException -> 0x0258 }
            int r9 = r0.read()     // Catch:{ IOException -> 0x0258 }
            int r10 = r0.read()     // Catch:{ IOException -> 0x0258 }
            int r8 = r0.read()     // Catch:{ IOException -> 0x0258 }
            int r4 = r0.read()     // Catch:{ IOException -> 0x0258 }
            r0 = r14 | r11
            r0 = r0 | r13
            r0 = r0 | r12
            r0 = r0 | r9
            r0 = r0 | r10
            r0 = r0 | r8
            r0 = r0 | r4
            if (r0 < 0) goto L_0x010e
            java.nio.ByteOrder r2 = r6.A02     // Catch:{ IOException -> 0x0258 }
            java.nio.ByteOrder r0 = X.C369148tv.A05     // Catch:{ IOException -> 0x0258 }
            r20 = 16
            r19 = 24
            r18 = 32
            r17 = 40
            r16 = 48
            r1 = 56
            if (r2 != r0) goto L_0x00c6
            long r2 = (long) r4     // Catch:{ IOException -> 0x0258 }
            long r2 = r2 << r1
            long r0 = (long) r8     // Catch:{ IOException -> 0x0258 }
            long r0 = r0 << r16
            long r2 = r2 + r0
            long r0 = (long) r10     // Catch:{ IOException -> 0x0258 }
            long r0 = r0 << r17
            long r2 = r2 + r0
            long r0 = (long) r9     // Catch:{ IOException -> 0x0258 }
            long r0 = r0 << r18
            long r2 = r2 + r0
            long r0 = (long) r12     // Catch:{ IOException -> 0x0258 }
            long r0 = r0 << r19
            long r2 = r2 + r0
            long r0 = (long) r13     // Catch:{ IOException -> 0x0258 }
            long r0 = r0 << r20
            long r2 = r2 + r0
            long r0 = (long) r11     // Catch:{ IOException -> 0x0258 }
            r4 = 8
            long r0 = r0 << r4
            long r2 = r2 + r0
            long r0 = (long) r14     // Catch:{ IOException -> 0x0258 }
            goto L_0x00e6
        L_0x00c6:
            java.nio.ByteOrder r0 = X.C369148tv.A04     // Catch:{ IOException -> 0x0258 }
            if (r2 != r0) goto L_0x00f1
            long r2 = (long) r14     // Catch:{ IOException -> 0x0258 }
            long r2 = r2 << r1
            long r0 = (long) r11     // Catch:{ IOException -> 0x0258 }
            long r0 = r0 << r16
            long r2 = r2 + r0
            long r0 = (long) r13     // Catch:{ IOException -> 0x0258 }
            long r0 = r0 << r17
            long r2 = r2 + r0
            long r0 = (long) r12     // Catch:{ IOException -> 0x0258 }
            long r0 = r0 << r18
            long r2 = r2 + r0
            long r0 = (long) r9     // Catch:{ IOException -> 0x0258 }
            long r0 = r0 << r19
            long r2 = r2 + r0
            long r0 = (long) r10     // Catch:{ IOException -> 0x0258 }
            long r0 = r0 << r20
            long r2 = r2 + r0
            long r0 = (long) r8     // Catch:{ IOException -> 0x0258 }
            r8 = 8
            long r0 = r0 << r8
            long r2 = r2 + r0
            long r0 = (long) r4     // Catch:{ IOException -> 0x0258 }
        L_0x00e6:
            long r2 = r2 + r0
            double r0 = java.lang.Double.longBitsToDouble(r2)     // Catch:{ IOException -> 0x0258 }
            r15[r5] = r0     // Catch:{ IOException -> 0x0258 }
            int r5 = r5 + 1
            goto L_0x005d
        L_0x00f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0258 }
            r1.<init>()     // Catch:{ IOException -> 0x0258 }
            java.lang.String r0 = "Invalid byte order: "
            r1.append(r0)     // Catch:{ IOException -> 0x0258 }
            r1.append(r2)     // Catch:{ IOException -> 0x0258 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0258 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0258 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0258 }
            goto L_0x0113
        L_0x0108:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ IOException -> 0x0258 }
            r0.<init>()     // Catch:{ IOException -> 0x0258 }
            goto L_0x0113
        L_0x010e:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ IOException -> 0x0258 }
            r0.<init>()     // Catch:{ IOException -> 0x0258 }
        L_0x0113:
            throw r0     // Catch:{ IOException -> 0x0258 }
        L_0x0114:
            r6.close()     // Catch:{ IOException -> 0x0118 }
            goto L_0x0121
        L_0x0118:
            r1 = move-exception
            java.nio.charset.Charset r0 = X.C369128tt.A04
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
            return r15
        L_0x0121:
            return r15
        L_0x0122:
            int r3 = r1.A01     // Catch:{ IOException -> 0x0258 }
            double[] r2 = new double[r3]     // Catch:{ IOException -> 0x0258 }
        L_0x0126:
            if (r5 >= r3) goto L_0x0136
            int r0 = r6.A01()     // Catch:{ IOException -> 0x0258 }
            float r0 = java.lang.Float.intBitsToFloat(r0)     // Catch:{ IOException -> 0x0258 }
            double r0 = (double) r0     // Catch:{ IOException -> 0x0258 }
            r2[r5] = r0     // Catch:{ IOException -> 0x0258 }
            int r5 = r5 + 1
            goto L_0x0126
        L_0x0136:
            r6.close()     // Catch:{ IOException -> 0x013a }
            goto L_0x0143
        L_0x013a:
            r1 = move-exception
            java.nio.charset.Charset r0 = X.C369128tt.A04
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
            return r2
        L_0x0143:
            return r2
        L_0x0144:
            int r9 = r1.A01     // Catch:{ IOException -> 0x0258 }
            X.8tx[] r8 = new X.C369168tx[r9]     // Catch:{ IOException -> 0x0258 }
        L_0x0148:
            if (r5 >= r9) goto L_0x015e
            int r0 = r6.A01()     // Catch:{ IOException -> 0x0258 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0258 }
            int r0 = r6.A01()     // Catch:{ IOException -> 0x0258 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0258 }
            X.8tx r4 = new X.8tx     // Catch:{ IOException -> 0x0258 }
            r4.<init>(r2, r0)     // Catch:{ IOException -> 0x0258 }
            r8[r5] = r4     // Catch:{ IOException -> 0x0258 }
            int r5 = r5 + 1
            goto L_0x0148
        L_0x015e:
            r6.close()     // Catch:{ IOException -> 0x0162 }
            goto L_0x016b
        L_0x0162:
            r1 = move-exception
            java.nio.charset.Charset r0 = X.C369128tt.A04
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
            return r8
        L_0x016b:
            return r8
        L_0x016c:
            int r1 = r1.A01     // Catch:{ IOException -> 0x0258 }
            int[] r2 = new int[r1]     // Catch:{ IOException -> 0x0258 }
        L_0x0170:
            if (r5 >= r1) goto L_0x017b
            int r0 = r6.A01()     // Catch:{ IOException -> 0x0258 }
            r2[r5] = r0     // Catch:{ IOException -> 0x0258 }
            int r5 = r5 + 1
            goto L_0x0170
        L_0x017b:
            r6.close()     // Catch:{ IOException -> 0x017f }
            goto L_0x0188
        L_0x017f:
            r1 = move-exception
            java.nio.charset.Charset r0 = X.C369128tt.A04
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
            return r2
        L_0x0188:
            return r2
        L_0x0189:
            int r1 = r1.A01     // Catch:{ IOException -> 0x0258 }
            int[] r2 = new int[r1]     // Catch:{ IOException -> 0x0258 }
        L_0x018d:
            if (r5 >= r1) goto L_0x0198
            short r0 = r6.A04()     // Catch:{ IOException -> 0x0258 }
            r2[r5] = r0     // Catch:{ IOException -> 0x0258 }
            int r5 = r5 + 1
            goto L_0x018d
        L_0x0198:
            r6.close()     // Catch:{ IOException -> 0x019c }
            goto L_0x01a5
        L_0x019c:
            r1 = move-exception
            java.nio.charset.Charset r0 = X.C369128tt.A04
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
            return r2
        L_0x01a5:
            return r2
        L_0x01a6:
            int r11 = r1.A01     // Catch:{ IOException -> 0x0258 }
            X.8tx[] r10 = new X.C369168tx[r11]     // Catch:{ IOException -> 0x0258 }
        L_0x01aa:
            if (r5 >= r11) goto L_0x01c7
            int r0 = r6.A01()     // Catch:{ IOException -> 0x0258 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0258 }
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r8
            int r0 = r6.A01()     // Catch:{ IOException -> 0x0258 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0258 }
            long r0 = r0 & r8
            X.8tx r4 = new X.8tx     // Catch:{ IOException -> 0x0258 }
            r4.<init>(r2, r0)     // Catch:{ IOException -> 0x0258 }
            r10[r5] = r4     // Catch:{ IOException -> 0x0258 }
            int r5 = r5 + 1
            goto L_0x01aa
        L_0x01c7:
            r6.close()     // Catch:{ IOException -> 0x01cb }
            goto L_0x01d4
        L_0x01cb:
            r1 = move-exception
            java.nio.charset.Charset r0 = X.C369128tt.A04
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
            return r10
        L_0x01d4:
            return r10
        L_0x01d5:
            int r8 = r1.A01     // Catch:{ IOException -> 0x0258 }
            long[] r4 = new long[r8]     // Catch:{ IOException -> 0x0258 }
        L_0x01d9:
            if (r5 >= r8) goto L_0x01eb
            int r0 = r6.A01()     // Catch:{ IOException -> 0x0258 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0258 }
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            r4[r5] = r2     // Catch:{ IOException -> 0x0258 }
            int r5 = r5 + 1
            goto L_0x01d9
        L_0x01eb:
            r6.close()     // Catch:{ IOException -> 0x01ef }
            goto L_0x01f8
        L_0x01ef:
            r1 = move-exception
            java.nio.charset.Charset r0 = X.C369128tt.A04
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
            return r4
        L_0x01f8:
            return r4
        L_0x01f9:
            int r1 = r1.A01     // Catch:{ IOException -> 0x0258 }
            int[] r2 = new int[r1]     // Catch:{ IOException -> 0x0258 }
        L_0x01fd:
            if (r5 >= r1) goto L_0x0208
            int r0 = r6.A02()     // Catch:{ IOException -> 0x0258 }
            r2[r5] = r0     // Catch:{ IOException -> 0x0258 }
            int r5 = r5 + 1
            goto L_0x01fd
        L_0x0208:
            r6.close()     // Catch:{ IOException -> 0x020c }
            goto L_0x0215
        L_0x020c:
            r1 = move-exception
            java.nio.charset.Charset r0 = X.C369128tt.A04
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
            return r2
        L_0x0215:
            return r2
        L_0x0216:
            int r8 = r1.A01     // Catch:{ IOException -> 0x0258 }
            byte[] r4 = X.C369128tt.A05     // Catch:{ IOException -> 0x0258 }
            r3 = 8
            if (r8 < r3) goto L_0x0230
            r2 = 0
        L_0x021f:
            if (r2 >= r3) goto L_0x022c
            byte r1 = r9[r2]     // Catch:{ IOException -> 0x0258 }
            byte r0 = r4[r2]     // Catch:{ IOException -> 0x0258 }
            if (r1 == r0) goto L_0x0228
            goto L_0x022b
        L_0x0228:
            int r2 = r2 + 1
            goto L_0x021f
        L_0x022b:
            r10 = 0
        L_0x022c:
            if (r10 == 0) goto L_0x0230
            r5 = 8
        L_0x0230:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0258 }
            r3.<init>()     // Catch:{ IOException -> 0x0258 }
        L_0x0235:
            if (r5 >= r8) goto L_0x0248
            byte r2 = r9[r5]     // Catch:{ IOException -> 0x0258 }
            if (r2 == 0) goto L_0x0248
            r1 = 32
            r0 = 63
            if (r2 < r1) goto L_0x0242
            char r0 = (char) r2     // Catch:{ IOException -> 0x0258 }
        L_0x0242:
            r3.append(r0)     // Catch:{ IOException -> 0x0258 }
            int r5 = r5 + 1
            goto L_0x0235
        L_0x0248:
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0258 }
        L_0x024c:
            r6.close()     // Catch:{ IOException -> 0x0250 }
            goto L_0x0257
        L_0x0250:
            r1 = move-exception
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
            return r2
        L_0x0257:
            return r2
        L_0x0258:
            r2 = move-exception
            goto L_0x025f
        L_0x025a:
            r2 = move-exception
            goto L_0x027a
        L_0x025c:
            r2 = move-exception
            r6 = r21
        L_0x025f:
            java.nio.charset.Charset r0 = X.C369128tt.A04     // Catch:{ all -> 0x0277 }
            java.lang.String r1 = "ExifReader"
            r0 = 2313(0x909, float:3.241E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0277 }
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x0277 }
            if (r6 == 0) goto L_0x0276
            r6.close()     // Catch:{ IOException -> 0x0272 }
            return r21
        L_0x0272:
            r0 = move-exception
            android.util.Log.e(r1, r7, r0)
        L_0x0276:
            return r21
        L_0x0277:
            r2 = move-exception
            r21 = r6
        L_0x027a:
            if (r21 == 0) goto L_0x0288
            r21.close()     // Catch:{ IOException -> 0x0280 }
            throw r2
        L_0x0280:
            r1 = move-exception
            java.nio.charset.Charset r0 = X.C369128tt.A04
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r7, r1)
        L_0x0288:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369158tw.A00(X.8tw, java.nio.ByteOrder):java.lang.Object");
    }

    public final String toString() {
        return 002.A09(this.A02.length, "(", C369128tt.A09[this.A00], AnonymousClass000.A00(2009), ")");
    }

    public C369158tw(byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bArr;
    }
}
