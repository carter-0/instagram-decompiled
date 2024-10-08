package X;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class RC6 extends FilterInputStream {
    public int A00;
    public final long A01;

    public final synchronized int available() {
        return (int) Math.max(this.A01 - ((long) this.A00), (long) this.in.available());
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        A00(read);
        return read;
    }

    private void A00(int i) {
        if (i >= 0) {
            this.A00 += i;
            return;
        }
        long j = this.A01;
        int i2 = this.A00;
        if (j - ((long) i2) > 0) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Failed to read all expected data, expected: ");
            A1A.append(j);
            throw JTO.A0u(Pxg.A0t(", but read: ", A1A, i2));
        }
    }

    public RC6(InputStream inputStream, long j) {
        super(inputStream);
        this.A01 = j;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        int i = -1;
        if (read >= 0) {
            i = 1;
        }
        A00(i);
        return read;
    }
}
