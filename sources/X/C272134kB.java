package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* renamed from: X.4kB  reason: invalid class name and case insensitive filesystem */
public abstract class C272134kB extends C272144kC {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(java.io.File r10, java.lang.String r11, java.nio.charset.Charset r12) {
        /*
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r10)
            r5 = 0
            int r4 = r11.length()     // Catch:{ all -> 0x00aa }
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r4 >= r0) goto L_0x001e
            byte[] r0 = r11.getBytes(r12)     // Catch:{ all -> 0x00aa }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x00aa }
            r2.write(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x009e
        L_0x001e:
            java.nio.charset.CharsetEncoder r0 = r12.newEncoder()     // Catch:{ all -> 0x00aa }
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPLACE     // Catch:{ all -> 0x00aa }
            java.nio.charset.CharsetEncoder r0 = r0.onMalformedInput(r1)     // Catch:{ all -> 0x00aa }
            java.nio.charset.CharsetEncoder r6 = r0.onUnmappableCharacter(r1)     // Catch:{ all -> 0x00aa }
            r8 = 8192(0x2000, float:1.14794E-41)
            java.nio.CharBuffer r3 = java.nio.CharBuffer.allocate(r8)     // Catch:{ all -> 0x00aa }
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x00aa }
            r0 = 1
            X.0qQ.A0B(r6, r0)     // Catch:{ all -> 0x00aa }
            float r0 = r6.maxBytesPerChar()     // Catch:{ all -> 0x00aa }
            double r0 = (double) r0     // Catch:{ all -> 0x00aa }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x00aa }
            float r7 = (float) r0     // Catch:{ all -> 0x00aa }
            int r0 = (int) r7     // Catch:{ all -> 0x00aa }
            int r8 = r8 * r0
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ all -> 0x00aa }
            X.0qQ.A07(r9)     // Catch:{ all -> 0x00aa }
            r10 = 0
            r8 = 0
        L_0x004e:
            int r1 = 8192 - r8
            int r0 = r4 - r10
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x00aa }
            int r7 = r10 + r1
            char[] r0 = r3.array()     // Catch:{ all -> 0x00aa }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x00aa }
            r11.getChars(r10, r7, r0, r8)     // Catch:{ all -> 0x00aa }
            int r1 = r1 + r8
            r3.limit(r1)     // Catch:{ all -> 0x00aa }
            r8 = 1
            r0 = 0
            if (r7 != r4) goto L_0x006b
            r0 = 1
        L_0x006b:
            java.nio.charset.CoderResult r0 = r6.encode(r3, r9, r0)     // Catch:{ all -> 0x00aa }
            boolean r0 = r0.isUnderflow()     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x00a2
            byte[] r1 = r9.array()     // Catch:{ all -> 0x00aa }
            int r0 = r9.position()     // Catch:{ all -> 0x00aa }
            r2.write(r1, r5, r0)     // Catch:{ all -> 0x00aa }
            int r1 = r3.position()     // Catch:{ all -> 0x00aa }
            int r0 = r3.limit()     // Catch:{ all -> 0x00aa }
            if (r1 == r0) goto L_0x0098
            char r0 = r3.get()     // Catch:{ all -> 0x00aa }
            r3.put(r5, r0)     // Catch:{ all -> 0x00aa }
        L_0x0091:
            r3.clear()     // Catch:{ all -> 0x00aa }
            r9.clear()     // Catch:{ all -> 0x00aa }
            goto L_0x009a
        L_0x0098:
            r8 = 0
            goto L_0x0091
        L_0x009a:
            r10 = r7
            if (r7 >= r4) goto L_0x009e
            goto L_0x004e
        L_0x009e:
            r2.close()
            return
        L_0x00a2:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00aa }
            r0.<init>(r1)     // Catch:{ all -> 0x00aa }
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C272134kB.A01(java.io.File, java.lang.String, java.nio.charset.Charset):void");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, X.UvR] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A03(java.io.File r9) {
        /*
            r8 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r9)
            long r4 = r9.length()     // Catch:{ all -> 0x009b }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r7 = "File "
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0079
            int r6 = (int) r4
            byte[] r1 = new byte[r6]     // Catch:{ all -> 0x009b }
            r4 = r6
            r2 = 0
        L_0x0018:
            if (r4 <= 0) goto L_0x0023
            int r0 = r3.read(r1, r2, r4)     // Catch:{ all -> 0x009b }
            if (r0 < 0) goto L_0x0023
            int r4 = r4 - r0
            int r2 = r2 + r0
            goto L_0x0018
        L_0x0023:
            if (r4 <= 0) goto L_0x002d
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ all -> 0x009b }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x009b }
            goto L_0x0075
        L_0x002d:
            int r2 = r3.read()     // Catch:{ all -> 0x009b }
            r0 = -1
            if (r2 == r0) goto L_0x0075
            r0 = 8193(0x2001, float:1.1481E-41)
            X.UvR r4 = new X.UvR     // Catch:{ all -> 0x009b }
            r4.<init>(r0)     // Catch:{ all -> 0x009b }
            r4.write(r2)     // Catch:{ all -> 0x009b }
            X.C11108SAj.A00(r3, r4)     // Catch:{ all -> 0x009b }
            int r0 = r4.size()     // Catch:{ all -> 0x009b }
            int r0 = r0 + r6
            if (r0 < 0) goto L_0x005b
            byte[] r2 = r4.A00()     // Catch:{ all -> 0x009b }
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ all -> 0x009b }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x009b }
            int r0 = r4.size()     // Catch:{ all -> 0x009b }
            java.lang.System.arraycopy(r2, r8, r1, r6, r0)     // Catch:{ all -> 0x009b }
            goto L_0x0075
        L_0x005b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            r1.append(r7)     // Catch:{ all -> 0x009b }
            r1.append(r9)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = " is too big to fit in memory."
            r1.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x009b }
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x009b }
            r1.<init>(r0)     // Catch:{ all -> 0x009b }
            goto L_0x009a
        L_0x0075:
            r3.close()
            return r1
        L_0x0079:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            r1.append(r7)     // Catch:{ all -> 0x009b }
            r1.append(r9)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = " is too big ("
            r1.append(r0)     // Catch:{ all -> 0x009b }
            r1.append(r4)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = " bytes) to fit in memory."
            r1.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x009b }
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x009b }
            r1.<init>(r0)     // Catch:{ all -> 0x009b }
        L_0x009a:
            throw r1     // Catch:{ all -> 0x009b }
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C272134kB.A03(java.io.File):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        X.1zE.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.io.File r2, java.nio.charset.Charset r3) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r3)
            java.lang.String r0 = X.1r9.A00(r2)     // Catch:{ all -> 0x0012 }
            r2.close()
            return r0
        L_0x0012:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C272134kB.A00(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    public static final void A02(File file, Charset charset, 0sP r3) {
        1r9.A01(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), r3);
    }
}
