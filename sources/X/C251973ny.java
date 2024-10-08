package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* renamed from: X.3ny  reason: invalid class name and case insensitive filesystem */
public final class C251973ny extends Reader {
    public InputStream A00;
    public CharsetDecoder A01;
    public boolean A02 = false;
    public final ByteBuffer A03;

    public final void close() {
        synchronized (this.lock) {
            CharsetDecoder charsetDecoder = this.A01;
            if (charsetDecoder != null) {
                charsetDecoder.reset();
            }
            this.A01 = null;
            InputStream inputStream = this.A00;
            if (inputStream != null) {
                inputStream.close();
                this.A00 = null;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:20|21|(1:25)|26|27|(1:(1:36))(1:29)) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c0, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(char[] r12, int r13, int r14) {
        /*
            r11 = this;
            java.lang.Object r2 = r11.lock
            monitor-enter(r2)
            java.lang.Object r3 = r11.lock     // Catch:{ all -> 0x00cc }
            monitor-enter(r3)     // Catch:{ all -> 0x00cc }
            java.io.InputStream r6 = r11.A00     // Catch:{ all -> 0x00c9 }
            if (r6 == 0) goto L_0x00c1
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            int r0 = r12.length     // Catch:{ all -> 0x00cc }
            X.1yt.A01(r0, r13, r14)     // Catch:{ all -> 0x00cc }
            r5 = 0
            if (r14 != 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x00cc }
            return r5
        L_0x0014:
            java.nio.CharBuffer r3 = java.nio.CharBuffer.wrap(r12, r13, r14)     // Catch:{ all -> 0x00cc }
            java.nio.charset.CoderResult r7 = java.nio.charset.CoderResult.UNDERFLOW     // Catch:{ all -> 0x00cc }
            java.nio.ByteBuffer r8 = r11.A03     // Catch:{ all -> 0x00cc }
            boolean r0 = r8.hasRemaining()     // Catch:{ all -> 0x00cc }
            r4 = 1
            r9 = 0
            if (r0 != 0) goto L_0x0025
            goto L_0x0095
        L_0x0025:
            boolean r1 = r3.hasRemaining()     // Catch:{ all -> 0x00cc }
            r0 = -1
            if (r1 == 0) goto L_0x0059
            if (r9 == 0) goto L_0x0072
            int r1 = r6.available()     // Catch:{ IOException -> 0x003b }
            if (r1 != 0) goto L_0x003b
            int r1 = r3.position()     // Catch:{ IOException -> 0x003b }
            if (r1 <= r13) goto L_0x003b
            goto L_0x0059
        L_0x003b:
            int r10 = r8.capacity()     // Catch:{ all -> 0x00cc }
            int r1 = r8.limit()     // Catch:{ all -> 0x00cc }
            int r10 = r10 - r1
            int r9 = r8.arrayOffset()     // Catch:{ all -> 0x00cc }
            int r1 = r8.limit()     // Catch:{ all -> 0x00cc }
            int r9 = r9 + r1
            byte[] r1 = r8.array()     // Catch:{ all -> 0x00cc }
            int r9 = r6.read(r1, r9, r10)     // Catch:{ all -> 0x00cc }
            if (r9 != r0) goto L_0x0068
            r11.A02 = r4     // Catch:{ all -> 0x00cc }
        L_0x0059:
            java.nio.charset.CoderResult r5 = java.nio.charset.CoderResult.UNDERFLOW     // Catch:{ all -> 0x00cc }
            if (r7 != r5) goto L_0x00a4
            boolean r1 = r11.A02     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00a4
            java.nio.charset.CharsetDecoder r1 = r11.A01     // Catch:{ all -> 0x00cc }
            java.nio.charset.CoderResult r7 = r1.decode(r8, r3, r4)     // Catch:{ all -> 0x00cc }
            goto L_0x0097
        L_0x0068:
            if (r9 == 0) goto L_0x0059
            int r1 = r8.limit()     // Catch:{ all -> 0x00cc }
            int r1 = r1 + r9
            r8.limit(r1)     // Catch:{ all -> 0x00cc }
        L_0x0072:
            java.nio.charset.CharsetDecoder r1 = r11.A01     // Catch:{ all -> 0x00cc }
            java.nio.charset.CoderResult r7 = r1.decode(r8, r3, r5)     // Catch:{ all -> 0x00cc }
            boolean r1 = r7.isUnderflow()     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x0059
            int r1 = r8.limit()     // Catch:{ all -> 0x00cc }
            int r0 = r8.capacity()     // Catch:{ all -> 0x00cc }
            if (r1 != r0) goto L_0x0095
            r8.compact()     // Catch:{ all -> 0x00cc }
            int r0 = r8.position()     // Catch:{ all -> 0x00cc }
            r8.limit(r0)     // Catch:{ all -> 0x00cc }
            r8.position(r5)     // Catch:{ all -> 0x00cc }
        L_0x0095:
            r9 = 1
            goto L_0x0025
        L_0x0097:
            if (r7 != r5) goto L_0x009f
            java.nio.charset.CharsetDecoder r1 = r11.A01     // Catch:{ all -> 0x00cc }
            java.nio.charset.CoderResult r7 = r1.flush(r3)     // Catch:{ all -> 0x00cc }
        L_0x009f:
            java.nio.charset.CharsetDecoder r1 = r11.A01     // Catch:{ all -> 0x00cc }
            r1.reset()     // Catch:{ all -> 0x00cc }
        L_0x00a4:
            boolean r1 = r7.isMalformed()     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x00b0
            boolean r1 = r7.isUnmappable()     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00b3
        L_0x00b0:
            r7.throwException()     // Catch:{ all -> 0x00cc }
        L_0x00b3:
            int r1 = r3.position()     // Catch:{ all -> 0x00cc }
            int r1 = r1 - r13
            if (r1 == 0) goto L_0x00bf
            int r0 = r3.position()     // Catch:{ all -> 0x00cc }
            int r0 = r0 - r13
        L_0x00bf:
            monitor-exit(r2)     // Catch:{ all -> 0x00cc }
            return r0
        L_0x00c1:
            java.lang.String r1 = "InputStreamReader is closed"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00c9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00cc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251973ny.read(char[], int, int):int");
    }

    public final boolean ready() {
        InputStream inputStream;
        boolean z;
        synchronized (this.lock) {
            synchronized (this.lock) {
                inputStream = this.A00;
                if (inputStream == null) {
                    throw new IOException("InputStreamReader is closed");
                }
            }
            z = false;
            try {
                if (this.A03.hasRemaining() || inputStream.available() > 0) {
                    z = true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
        return z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C251973ny(InputStream inputStream, ByteBuffer byteBuffer) {
        super(inputStream);
        Charset defaultCharset = Charset.defaultCharset();
        this.A03 = byteBuffer;
        this.A00 = inputStream;
        CharsetDecoder newDecoder = defaultCharset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.A01 = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        byteBuffer.limit(0);
    }

    public final int read() {
        char c;
        synchronized (this.lock) {
            if (this.A00 != null) {
                char[] cArr = new char[1];
                c = 65535;
                if (read(cArr, 0, 1) != -1) {
                    c = cArr[0];
                }
            } else {
                throw new IOException("InputStreamReader is closed");
            }
        }
        return c;
    }
}
