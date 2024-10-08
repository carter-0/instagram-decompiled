package X;

import com.facebook.common.dextricks.Constants;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class RC9 extends FilterInputStream {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public final ST0 A04;
    public volatile byte[] A05;

    public final synchronized void A01() {
        if (this.A05 != null) {
            this.A04.A05(this.A05);
            this.A05 = null;
        }
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.A05 == null || inputStream == null) {
            throw JTO.A0u("BufferedInputStream is closed");
        }
        return (this.A02 - this.A03) + inputStream.available();
    }

    public final synchronized void mark(int i) {
        this.A00 = Math.max(this.A00, i);
        this.A01 = this.A03;
    }

    public final boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0066, code lost:
        if (r2 == r9) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0068, code lost:
        r5 = r9 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006f, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r4 = r6.A05     // Catch:{ all -> 0x0077 }
            if (r4 == 0) goto L_0x0070
            if (r9 != 0) goto L_0x000a
            r5 = 0
        L_0x0008:
            monitor-exit(r6)
            return r5
        L_0x000a:
            java.io.InputStream r3 = r6.in     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0070
            int r0 = r6.A03     // Catch:{ all -> 0x0077 }
            int r1 = r6.A02     // Catch:{ all -> 0x0077 }
            if (r0 >= r1) goto L_0x002c
            int r1 = r1 - r0
            if (r1 < r9) goto L_0x0018
            r1 = r9
        L_0x0018:
            java.lang.System.arraycopy(r4, r0, r7, r8, r1)     // Catch:{ all -> 0x0077 }
            int r0 = r6.A03     // Catch:{ all -> 0x0077 }
            int r0 = r0 + r1
            r6.A03 = r0     // Catch:{ all -> 0x0077 }
            if (r1 == r9) goto L_0x006b
            int r0 = r3.available()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x006b
            int r8 = r8 + r1
            int r2 = r9 - r1
            goto L_0x002d
        L_0x002c:
            r2 = r9
        L_0x002d:
            int r0 = r6.A01     // Catch:{ all -> 0x0077 }
            r5 = -1
            if (r0 != r5) goto L_0x003c
            int r0 = r4.length     // Catch:{ all -> 0x0077 }
            if (r2 < r0) goto L_0x003c
            int r1 = r3.read(r7, r8, r2)     // Catch:{ all -> 0x0077 }
            if (r1 != r5) goto L_0x005a
            goto L_0x0066
        L_0x003c:
            int r0 = r6.A00(r3, r4)     // Catch:{ all -> 0x0077 }
            if (r0 == r5) goto L_0x0066
            byte[] r0 = r6.A05     // Catch:{ all -> 0x0077 }
            if (r4 == r0) goto L_0x004a
            byte[] r4 = r6.A05     // Catch:{ all -> 0x0077 }
            if (r4 == 0) goto L_0x0070
        L_0x004a:
            int r1 = r6.A02     // Catch:{ all -> 0x0077 }
            int r0 = r6.A03     // Catch:{ all -> 0x0077 }
            int r1 = r1 - r0
            if (r1 < r2) goto L_0x0052
            r1 = r2
        L_0x0052:
            java.lang.System.arraycopy(r4, r0, r7, r8, r1)     // Catch:{ all -> 0x0077 }
            int r0 = r6.A03     // Catch:{ all -> 0x0077 }
            int r0 = r0 + r1
            r6.A03 = r0     // Catch:{ all -> 0x0077 }
        L_0x005a:
            int r2 = r2 - r1
            if (r2 == 0) goto L_0x006e
            int r0 = r3.available()     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0064
            goto L_0x006d
        L_0x0064:
            int r8 = r8 + r1
            goto L_0x002d
        L_0x0066:
            if (r2 == r9) goto L_0x0008
            int r5 = r9 - r2
            goto L_0x0008
        L_0x006b:
            monitor-exit(r6)
            return r1
        L_0x006d:
            int r9 = r9 - r2
        L_0x006e:
            monitor-exit(r6)
            return r9
        L_0x0070:
            java.lang.String r0 = "BufferedInputStream is closed"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RC9.read(byte[], int, int):int");
    }

    public final synchronized void reset() {
        IOException iOException;
        if (this.A05 != null) {
            int i = this.A01;
            if (-1 != i) {
                this.A03 = i;
            } else {
                iOException = new IOException(002.A02(this.A03, this.A00, "Mark has been invalidated, pos: ", " markLimit: "));
            }
        } else {
            iOException = JTO.A0u("Stream is closed");
        }
        throw iOException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long skip(long r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r1 = 1
            r9 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x000b
            monitor-exit(r11)
            return r9
        L_0x000b:
            byte[] r7 = r11.A05     // Catch:{ all -> 0x0069 }
            if (r7 == 0) goto L_0x0062
            java.io.InputStream r6 = r11.in     // Catch:{ all -> 0x0069 }
            if (r6 == 0) goto L_0x0062
            int r8 = r11.A02     // Catch:{ all -> 0x0069 }
            int r5 = r11.A03     // Catch:{ all -> 0x0069 }
            int r0 = r8 - r5
            long r1 = (long) r0     // Catch:{ all -> 0x0069 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0021
            long r1 = (long) r5     // Catch:{ all -> 0x0069 }
            long r1 = r1 + r12
            goto L_0x0048
        L_0x0021:
            long r3 = (long) r8     // Catch:{ all -> 0x0069 }
            long r0 = (long) r5     // Catch:{ all -> 0x0069 }
            long r3 = r3 - r0
            r11.A03 = r8     // Catch:{ all -> 0x0069 }
            int r0 = r11.A01     // Catch:{ all -> 0x0069 }
            r5 = -1
            if (r0 == r5) goto L_0x0054
            int r0 = r11.A00     // Catch:{ all -> 0x0069 }
            long r1 = (long) r0     // Catch:{ all -> 0x0069 }
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
            int r0 = r11.A00(r6, r7)     // Catch:{ all -> 0x0069 }
            if (r0 == r5) goto L_0x0060
            int r7 = r11.A02     // Catch:{ all -> 0x0069 }
            int r8 = r11.A03     // Catch:{ all -> 0x0069 }
            int r0 = r7 - r8
            long r5 = (long) r0     // Catch:{ all -> 0x0069 }
            long r1 = r12 - r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004d
            long r1 = (long) r8     // Catch:{ all -> 0x0069 }
            long r1 = r1 + r12
            long r1 = r1 - r3
        L_0x0048:
            int r0 = (int) r1     // Catch:{ all -> 0x0069 }
            r11.A03 = r0     // Catch:{ all -> 0x0069 }
            monitor-exit(r11)
            return r12
        L_0x004d:
            long r0 = (long) r7
            long r3 = r3 + r0
            long r0 = (long) r8
            long r3 = r3 - r0
            r11.A03 = r7     // Catch:{ all -> 0x0069 }
            goto L_0x0060
        L_0x0054:
            long r12 = r12 - r3
            long r1 = r6.skip(r12)     // Catch:{ all -> 0x0069 }
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x005f
            r11.A01 = r5     // Catch:{ all -> 0x0069 }
        L_0x005f:
            long r3 = r3 + r1
        L_0x0060:
            monitor-exit(r11)
            return r3
        L_0x0062:
            java.lang.String r0 = "BufferedInputStream is closed"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RC9.skip(long):long");
    }

    public RC9(ST0 st0, InputStream inputStream) {
        super(inputStream);
        this.A04 = st0;
        this.A05 = (byte[]) st0.A04(Constants.LOAD_RESULT_PGO_ATTEMPTED, byte[].class);
    }

    private int A00(InputStream inputStream, byte[] bArr) {
        int read;
        int i;
        int i2 = this.A01;
        if (i2 == -1 || this.A03 - i2 >= (i = this.A00)) {
            read = inputStream.read(bArr);
            if (read > 0) {
                this.A01 = -1;
                this.A03 = 0;
                this.A02 = read;
                return read;
            }
        } else {
            if (i2 == 0) {
                int length = bArr.length;
                if (i > length && this.A02 == length) {
                    int i3 = length * 2;
                    if (i3 <= i) {
                        i = i3;
                    }
                    ST0 st0 = this.A04;
                    byte[] bArr2 = (byte[]) st0.A04(i, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                    this.A05 = bArr2;
                    st0.A05(bArr);
                    bArr = bArr2;
                }
            } else if (i2 > 0) {
                System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
            }
            int i4 = this.A03 - this.A01;
            this.A03 = i4;
            this.A01 = 0;
            this.A02 = 0;
            read = inputStream.read(bArr, i4, bArr.length - i4);
            int i5 = this.A03;
            if (read > 0) {
                i5 += read;
            }
            this.A02 = i5;
        }
        return read;
    }

    public final void close() {
        if (this.A05 != null) {
            this.A04.A05(this.A05);
            this.A05 = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r4 = r5.A05     // Catch:{ all -> 0x0039 }
            java.io.InputStream r3 = r5.in     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            int r1 = r5.A03     // Catch:{ all -> 0x0039 }
            int r0 = r5.A02     // Catch:{ all -> 0x0039 }
            r2 = -1
            if (r1 < r0) goto L_0x0017
            int r0 = r5.A00(r3, r4)     // Catch:{ all -> 0x0039 }
            if (r0 != r2) goto L_0x0017
            goto L_0x0030
        L_0x0017:
            byte[] r0 = r5.A05     // Catch:{ all -> 0x0039 }
            if (r4 == r0) goto L_0x001f
            byte[] r4 = r5.A05     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0032
        L_0x001f:
            int r0 = r5.A02     // Catch:{ all -> 0x0039 }
            int r1 = r5.A03     // Catch:{ all -> 0x0039 }
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0030
            int r0 = r1 + 1
            r5.A03 = r0     // Catch:{ all -> 0x0039 }
            byte r0 = r4[r1]     // Catch:{ all -> 0x0039 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0030:
            monitor-exit(r5)
            return r2
        L_0x0032:
            java.lang.String r0 = "BufferedInputStream is closed"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x0039 }
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RC9.read():int");
    }
}
