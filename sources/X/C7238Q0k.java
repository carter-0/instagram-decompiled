package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.Q0k  reason: case insensitive filesystem */
public final class C7238Q0k extends FilterInputStream {
    public long A00;
    public final long A01;
    public final C13885Tj8 A02;

    public final int read(byte[] bArr, int i, int i2) {
        0qQ.A0B(bArr, 0);
        int read = super.read(bArr, i, i2);
        if (read >= 0) {
            long j = ((long) read) + this.A00;
            this.A00 = j;
            this.A02.onBytesTransferred(j, this.A01);
        }
        return read;
    }

    public C7238Q0k(C13885Tj8 tj8, InputStream inputStream, long j) {
        super(inputStream);
        this.A01 = j;
        this.A02 = tj8;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            long j = this.A00 + 1;
            this.A00 = j;
            this.A02.onBytesTransferred(j, this.A01);
        }
        return read;
    }
}
