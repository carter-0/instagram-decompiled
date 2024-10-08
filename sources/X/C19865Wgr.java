package X;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: X.Wgr  reason: case insensitive filesystem */
public final class C19865Wgr implements Closeable {
    public int A00;
    public int A01;
    public byte[] A02;
    public final InputStream A03;
    public final Charset A04;
    public final /* synthetic */ C19866Wgt A05;

    public C19865Wgr(C19866Wgt wgt, InputStream inputStream, Charset charset) {
        this.A05 = wgt;
        if (charset == null) {
            throw null;
        } else if (charset.equals(C19866Wgt.A0F)) {
            this.A03 = inputStream;
            this.A04 = charset;
            this.A02 = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (r4[r2] == 13) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00() {
        /*
            r8 = this;
            java.io.InputStream r3 = r8.A03
            monitor-enter(r3)
            byte[] r4 = r8.A02     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x008e
            int r6 = r8.A01     // Catch:{ all -> 0x009c }
            int r2 = r8.A00     // Catch:{ all -> 0x009c }
            if (r6 < r2) goto L_0x001b
            int r0 = r4.length     // Catch:{ all -> 0x009c }
            r1 = 0
            int r2 = r3.read(r4, r1, r0)     // Catch:{ all -> 0x009c }
            r0 = -1
            if (r2 == r0) goto L_0x0096
            r8.A01 = r1     // Catch:{ all -> 0x009c }
            r6 = 0
            r8.A00 = r2     // Catch:{ all -> 0x009c }
        L_0x001b:
            r5 = r6
        L_0x001c:
            r7 = 10
            if (r5 == r2) goto L_0x002d
            byte[] r4 = r8.A02     // Catch:{ all -> 0x009c }
            byte r0 = r4[r5]     // Catch:{ all -> 0x009c }
            if (r0 != r7) goto L_0x0027
            goto L_0x002a
        L_0x0027:
            int r5 = r5 + 1
            goto L_0x001c
        L_0x002a:
            if (r5 == r6) goto L_0x0085
            goto L_0x006b
        L_0x002d:
            int r2 = r2 - r6
            int r0 = r2 + 80
            X.UvU r6 = new X.UvU     // Catch:{ all -> 0x009c }
            r6.<init>(r8, r0)     // Catch:{ all -> 0x009c }
        L_0x0035:
            byte[] r2 = r8.A02     // Catch:{ all -> 0x009c }
            int r1 = r8.A01     // Catch:{ all -> 0x009c }
            int r0 = r8.A00     // Catch:{ all -> 0x009c }
            int r0 = r0 - r1
            r6.write(r2, r1, r0)     // Catch:{ all -> 0x009c }
            r2 = -1
            r8.A00 = r2     // Catch:{ all -> 0x009c }
            byte[] r1 = r8.A02     // Catch:{ all -> 0x009c }
            int r0 = r1.length     // Catch:{ all -> 0x009c }
            r5 = 0
            int r4 = r3.read(r1, r5, r0)     // Catch:{ all -> 0x009c }
            if (r4 == r2) goto L_0x0088
            r8.A01 = r5     // Catch:{ all -> 0x009c }
            r8.A00 = r4     // Catch:{ all -> 0x009c }
            r2 = 0
        L_0x0051:
            if (r2 == r4) goto L_0x0035
            byte[] r1 = r8.A02     // Catch:{ all -> 0x009c }
            byte r0 = r1[r2]     // Catch:{ all -> 0x009c }
            if (r0 != r7) goto L_0x005a
            goto L_0x005d
        L_0x005a:
            int r2 = r2 + 1
            goto L_0x0051
        L_0x005d:
            if (r2 == r5) goto L_0x0062
            r6.write(r1, r5, r2)     // Catch:{ all -> 0x009c }
        L_0x0062:
            int r0 = r2 + 1
            r8.A01 = r0     // Catch:{ all -> 0x009c }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x009c }
            goto L_0x0083
        L_0x006b:
            int r2 = r5 + -1
            byte r1 = r4[r2]     // Catch:{ all -> 0x009c }
            r0 = 13
            if (r1 != r0) goto L_0x0085
        L_0x0073:
            int r2 = r2 - r6
            java.nio.charset.Charset r0 = r8.A04     // Catch:{ all -> 0x009c }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x009c }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x009c }
            r1.<init>(r4, r6, r2, r0)     // Catch:{ all -> 0x009c }
            int r0 = r5 + 1
            r8.A01 = r0     // Catch:{ all -> 0x009c }
        L_0x0083:
            monitor-exit(r3)     // Catch:{ all -> 0x009c }
            goto L_0x0087
        L_0x0085:
            r2 = r5
            goto L_0x0073
        L_0x0087:
            return r1
        L_0x0088:
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x009c }
            r1.<init>()     // Catch:{ all -> 0x009c }
            goto L_0x009b
        L_0x008e:
            java.lang.String r0 = "LineReader is closed"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x009c }
            r1.<init>(r0)     // Catch:{ all -> 0x009c }
            goto L_0x009b
        L_0x0096:
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ all -> 0x009c }
            r1.<init>()     // Catch:{ all -> 0x009c }
        L_0x009b:
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x009c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19865Wgr.A00():java.lang.String");
    }

    public final void close() {
        InputStream inputStream = this.A03;
        synchronized (inputStream) {
            if (this.A02 != null) {
                this.A02 = null;
                inputStream.close();
            }
        }
    }
}
