package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.2kb  reason: invalid class name and case insensitive filesystem */
public final class C227982kb {
    public final int A00;
    public final int A01;
    public final long A02;
    public final byte[] A03;

    public static C227982kb A00(ByteOrder byteOrder, int[] iArr) {
        int i = C227922kK.A0l[3];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r5)]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putShort((short) i2);
        }
        return new C227982kb(-1, wrap.array(), 3, r5);
    }

    public static C227982kb A01(ByteOrder byteOrder, long[] jArr) {
        int i = C227922kK.A0l[4];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r6)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C227982kb(-1, wrap.array(), 4, r6);
    }

    public static C227982kb A02(ByteOrder byteOrder, Q4T[] q4tArr) {
        int i = C227922kK.A0l[5];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * r7)]);
        wrap.order(byteOrder);
        for (Q4T q4t : q4tArr) {
            wrap.putInt((int) q4t.A01);
            wrap.putInt((int) q4t.A00);
        }
        return new C227982kb(-1, wrap.array(), 5, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0164, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0165, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0168, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0169, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006f, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x017b A[SYNTHETIC, Splitter:B:134:0x017b] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0188 A[SYNTHETIC, Splitter:B:143:0x0188] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.nio.ByteOrder r14) {
        /*
            r13 = this;
            java.lang.String r5 = "IOException occurred while closing InputStream"
            java.lang.String r4 = "ExifInterface"
            r12 = 0
            byte[] r9 = r13.A03     // Catch:{ IOException -> 0x016e, all -> 0x016c }
            X.2kZ r6 = new X.2kZ     // Catch:{ IOException -> 0x016e, all -> 0x016c }
            r6.<init>(r9)     // Catch:{ IOException -> 0x016e, all -> 0x016c }
            r6.A02 = r14     // Catch:{ IOException -> 0x016a }
            int r0 = r13.A00     // Catch:{ IOException -> 0x016a }
            r7 = 0
            r11 = 1
            switch(r0) {
                case 1: goto L_0x001f;
                case 2: goto L_0x012a;
                case 3: goto L_0x0111;
                case 4: goto L_0x00f1;
                case 5: goto L_0x00c6;
                case 6: goto L_0x001f;
                case 7: goto L_0x012a;
                case 8: goto L_0x00ad;
                case 9: goto L_0x0094;
                case 10: goto L_0x0070;
                case 11: goto L_0x0056;
                case 12: goto L_0x0047;
                default: goto L_0x0015;
            }     // Catch:{ IOException -> 0x016a }
        L_0x0015:
            r6.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x001e
        L_0x0019:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r12
        L_0x001e:
            return r12
        L_0x001f:
            int r0 = r9.length     // Catch:{ IOException -> 0x016a }
            if (r0 != r11) goto L_0x003e
            byte r0 = r9[r7]     // Catch:{ IOException -> 0x016a }
            if (r0 < 0) goto L_0x003e
            if (r0 > r11) goto L_0x003e
            char[] r2 = new char[r11]     // Catch:{ IOException -> 0x016a }
            int r0 = r0 + 48
            char r0 = (char) r0     // Catch:{ IOException -> 0x016a }
            r2[r7] = r0     // Catch:{ IOException -> 0x016a }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x016a }
            r1.<init>(r2)     // Catch:{ IOException -> 0x016a }
            r6.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003d
        L_0x0038:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x003d:
            return r1
        L_0x003e:
            java.nio.charset.Charset r0 = X.C227922kK.A0L     // Catch:{ IOException -> 0x016a }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x016a }
            r1.<init>(r9, r0)     // Catch:{ IOException -> 0x016a }
            goto L_0x0160
        L_0x0047:
            int r3 = r13.A01     // Catch:{ IOException -> 0x016a }
            double[] r2 = new double[r3]     // Catch:{ IOException -> 0x016a }
        L_0x004b:
            if (r7 >= r3) goto L_0x0066
            double r0 = r6.readDouble()     // Catch:{ IOException -> 0x016a }
            r2[r7] = r0     // Catch:{ IOException -> 0x016a }
            int r7 = r7 + 1
            goto L_0x004b
        L_0x0056:
            int r3 = r13.A01     // Catch:{ IOException -> 0x016a }
            double[] r2 = new double[r3]     // Catch:{ IOException -> 0x016a }
        L_0x005a:
            if (r7 >= r3) goto L_0x0066
            float r0 = r6.readFloat()     // Catch:{ IOException -> 0x016a }
            double r0 = (double) r0     // Catch:{ IOException -> 0x016a }
            r2[r7] = r0     // Catch:{ IOException -> 0x016a }
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0066:
            r6.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x006f
        L_0x006a:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r2
        L_0x006f:
            return r2
        L_0x0070:
            int r10 = r13.A01     // Catch:{ IOException -> 0x016a }
            X.Q4T[] r9 = new X.Q4T[r10]     // Catch:{ IOException -> 0x016a }
        L_0x0074:
            if (r7 >= r10) goto L_0x008a
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x016a }
            long r2 = (long) r0     // Catch:{ IOException -> 0x016a }
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x016a }
            long r0 = (long) r0     // Catch:{ IOException -> 0x016a }
            X.Q4T r8 = new X.Q4T     // Catch:{ IOException -> 0x016a }
            r8.<init>(r2, r0)     // Catch:{ IOException -> 0x016a }
            r9[r7] = r8     // Catch:{ IOException -> 0x016a }
            int r7 = r7 + 1
            goto L_0x0074
        L_0x008a:
            r6.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x0093
        L_0x008e:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r9
        L_0x0093:
            return r9
        L_0x0094:
            int r2 = r13.A01     // Catch:{ IOException -> 0x016a }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x016a }
        L_0x0098:
            if (r7 >= r2) goto L_0x00a3
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x016a }
            r1[r7] = r0     // Catch:{ IOException -> 0x016a }
            int r7 = r7 + 1
            goto L_0x0098
        L_0x00a3:
            r6.close()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00ac
        L_0x00a7:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x00ac:
            return r1
        L_0x00ad:
            int r2 = r13.A01     // Catch:{ IOException -> 0x016a }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x016a }
        L_0x00b1:
            if (r7 >= r2) goto L_0x00bc
            short r0 = r6.readShort()     // Catch:{ IOException -> 0x016a }
            r1[r7] = r0     // Catch:{ IOException -> 0x016a }
            int r7 = r7 + 1
            goto L_0x00b1
        L_0x00bc:
            r6.close()     // Catch:{ IOException -> 0x00c0 }
            goto L_0x00c5
        L_0x00c0:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x00c5:
            return r1
        L_0x00c6:
            int r11 = r13.A01     // Catch:{ IOException -> 0x016a }
            X.Q4T[] r10 = new X.Q4T[r11]     // Catch:{ IOException -> 0x016a }
        L_0x00ca:
            if (r7 >= r11) goto L_0x00e7
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x016a }
            long r2 = (long) r0     // Catch:{ IOException -> 0x016a }
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r8
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x016a }
            long r0 = (long) r0     // Catch:{ IOException -> 0x016a }
            long r0 = r0 & r8
            X.Q4T r8 = new X.Q4T     // Catch:{ IOException -> 0x016a }
            r8.<init>(r2, r0)     // Catch:{ IOException -> 0x016a }
            r10[r7] = r8     // Catch:{ IOException -> 0x016a }
            int r7 = r7 + 1
            goto L_0x00ca
        L_0x00e7:
            r6.close()     // Catch:{ IOException -> 0x00eb }
            goto L_0x00f0
        L_0x00eb:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r10
        L_0x00f0:
            return r10
        L_0x00f1:
            int r9 = r13.A01     // Catch:{ IOException -> 0x016a }
            long[] r8 = new long[r9]     // Catch:{ IOException -> 0x016a }
        L_0x00f5:
            if (r7 >= r9) goto L_0x0107
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x016a }
            long r0 = (long) r0     // Catch:{ IOException -> 0x016a }
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r8[r7] = r0     // Catch:{ IOException -> 0x016a }
            int r7 = r7 + 1
            goto L_0x00f5
        L_0x0107:
            r6.close()     // Catch:{ IOException -> 0x010b }
            goto L_0x0110
        L_0x010b:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r8
        L_0x0110:
            return r8
        L_0x0111:
            int r2 = r13.A01     // Catch:{ IOException -> 0x016a }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x016a }
        L_0x0115:
            if (r7 >= r2) goto L_0x0120
            int r0 = r6.readUnsignedShort()     // Catch:{ IOException -> 0x016a }
            r1[r7] = r0     // Catch:{ IOException -> 0x016a }
            int r7 = r7 + 1
            goto L_0x0115
        L_0x0120:
            r6.close()     // Catch:{ IOException -> 0x0124 }
            goto L_0x0129
        L_0x0124:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0129:
            return r1
        L_0x012a:
            int r10 = r13.A01     // Catch:{ IOException -> 0x016a }
            byte[] r8 = X.C227922kK.A0O     // Catch:{ IOException -> 0x016a }
            r3 = 8
            if (r10 < r3) goto L_0x0144
            r2 = 0
        L_0x0133:
            if (r2 >= r3) goto L_0x0140
            byte r1 = r9[r2]     // Catch:{ IOException -> 0x016a }
            byte r0 = r8[r2]     // Catch:{ IOException -> 0x016a }
            if (r1 == r0) goto L_0x013c
            goto L_0x013f
        L_0x013c:
            int r2 = r2 + 1
            goto L_0x0133
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x0144
            r7 = 8
        L_0x0144:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016a }
            r3.<init>()     // Catch:{ IOException -> 0x016a }
        L_0x0149:
            if (r7 >= r10) goto L_0x015c
            byte r2 = r9[r7]     // Catch:{ IOException -> 0x016a }
            if (r2 == 0) goto L_0x015c
            r1 = 32
            r0 = 63
            if (r2 < r1) goto L_0x0156
            char r0 = (char) r2     // Catch:{ IOException -> 0x016a }
        L_0x0156:
            r3.append(r0)     // Catch:{ IOException -> 0x016a }
            int r7 = r7 + 1
            goto L_0x0149
        L_0x015c:
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x016a }
        L_0x0160:
            r6.close()     // Catch:{ IOException -> 0x0164 }
            goto L_0x0169
        L_0x0164:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0169:
            return r1
        L_0x016a:
            r1 = move-exception
            goto L_0x0170
        L_0x016c:
            r1 = move-exception
            goto L_0x0186
        L_0x016e:
            r1 = move-exception
            r6 = r12
        L_0x0170:
            r0 = 2313(0x909, float:3.241E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0184 }
            android.util.Log.w(r4, r0, r1)     // Catch:{ all -> 0x0184 }
            if (r6 == 0) goto L_0x0183
            r6.close()     // Catch:{ IOException -> 0x017f }
            return r12
        L_0x017f:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
        L_0x0183:
            return r12
        L_0x0184:
            r1 = move-exception
            r12 = r6
        L_0x0186:
            if (r12 == 0) goto L_0x0190
            r12.close()     // Catch:{ IOException -> 0x018c }
            throw r1
        L_0x018c:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
        L_0x0190:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227982kb.A04(java.nio.ByteOrder):java.lang.Object");
    }

    public final String toString() {
        return 002.A09(this.A03.length, "(", C227922kK.A0m[this.A00], AnonymousClass000.A00(2009), ")");
    }

    public C227982kb(long j, byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = bArr;
    }

    public final int A03(ByteOrder byteOrder) {
        Object A04 = A04(byteOrder);
        if (A04 == null) {
            throw new NumberFormatException(AnonymousClass000.A00(2377));
        } else if (A04 instanceof String) {
            return Integer.parseInt((String) A04);
        } else {
            if (A04 instanceof long[]) {
                long[] jArr = (long[]) A04;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (A04 instanceof int[]) {
                int[] iArr = (int[]) A04;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException(AnonymousClass000.A00(2187));
            }
        }
    }

    public final String A05(ByteOrder byteOrder) {
        Object A04 = A04(byteOrder);
        if (A04 == null) {
            return null;
        }
        if (A04 instanceof String) {
            return (String) A04;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (A04 instanceof long[]) {
            long[] jArr = (long[]) A04;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    break;
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(",");
                }
            }
        } else if (A04 instanceof int[]) {
            int[] iArr = (int[]) A04;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    break;
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(",");
                }
            }
        } else if (A04 instanceof double[]) {
            double[] dArr = (double[]) A04;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    break;
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(",");
                }
            }
        } else if (A04 instanceof Q4T[]) {
            Q4T[] q4tArr = (Q4T[]) A04;
            while (true) {
                int length4 = q4tArr.length;
                if (i >= length4) {
                    break;
                }
                Q4T q4t = q4tArr[i];
                sb.append(q4t.A01);
                sb.append('/');
                sb.append(q4t.A00);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        } else {
            return null;
        }
        return sb.toString();
    }
}
