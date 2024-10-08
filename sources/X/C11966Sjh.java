package X;

import java.io.InputStream;

/* renamed from: X.Sjh  reason: case insensitive filesystem */
public final class C11966Sjh implements C13798ThH {
    public final InputStream A00;

    public final int E6A(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = this.A00.read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 != 0 || i3 != -1) {
            return i2;
        }
        throw new RCT();
    }

    public final short CAz() {
        int read = this.A00.read();
        if (read != -1) {
            return (short) read;
        }
        throw new RCT();
    }

    public final long skip(long j) {
        if (j < 0) {
            return 0;
        }
        long j2 = j;
        while (j2 > 0) {
            InputStream inputStream = this.A00;
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j - j2;
    }

    public C11966Sjh(InputStream inputStream) {
        this.A00 = inputStream;
    }

    public final int CAy() {
        return (CAz() << 8) | CAz();
    }
}
