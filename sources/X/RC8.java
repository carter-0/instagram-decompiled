package X;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class RC8 extends FilterInputStream {
    public static final byte[] A02 = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public int A00;
    public final byte A01;

    public final boolean markSupported() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 > 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            int r3 = r4.A00
            r0 = 31
            if (r3 <= r0) goto L_0x0012
            int r1 = super.read(r5, r6, r7)
        L_0x000a:
            if (r1 <= 0) goto L_0x0011
        L_0x000c:
            int r0 = r4.A00
            int r0 = r0 + r1
            r4.A00 = r0
        L_0x0011:
            return r1
        L_0x0012:
            if (r3 != r0) goto L_0x001a
            byte r0 = r4.A01
            r5[r6] = r0
            r1 = 1
            goto L_0x000c
        L_0x001a:
            r2 = 2
            if (r3 >= r2) goto L_0x0023
            int r2 = r2 - r3
            int r1 = super.read(r5, r6, r2)
            goto L_0x000a
        L_0x0023:
            int r0 = r0 - r3
            int r1 = java.lang.Math.min(r0, r7)
            byte[] r0 = A02
            int r3 = r3 - r2
            java.lang.System.arraycopy(r0, r3, r5, r6, r1)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RC8.read(byte[], int, int):int");
    }

    public RC8(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw DbW.A0a("Cannot add invalid orientation: ", i);
        }
        this.A01 = (byte) i;
    }

    public final void mark(int i) {
        throw C66580MXl.A11();
    }

    public final void reset() {
        throw C66580MXl.A11();
    }

    public final long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.A00 = (int) (((long) this.A00) + skip);
        }
        return skip;
    }

    public final int read() {
        int read;
        int i = this.A00;
        if (i < 2 || i > 31) {
            read = super.read();
        } else if (i == 31) {
            read = this.A01;
        } else {
            read = A02[i - 2] & 255;
        }
        if (read != -1) {
            this.A00++;
        }
        return read;
    }
}
