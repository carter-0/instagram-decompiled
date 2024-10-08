package X;

import java.io.InputStream;

/* renamed from: X.2jZ  reason: invalid class name and case insensitive filesystem */
public abstract class C227582jZ extends InputStream {
    public final InputStream A00;

    public final synchronized void mark(int i) {
        this.A00.mark(i);
    }

    public final synchronized void reset() {
        this.A00.reset();
    }

    public final int available() {
        return this.A00.available();
    }

    public void close() {
        this.A00.close();
    }

    public final boolean markSupported() {
        return this.A00.markSupported();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A00.read(bArr, i, i2);
    }

    public final long skip(long j) {
        return this.A00.skip(j);
    }

    public C227582jZ(InputStream inputStream) {
        this.A00 = inputStream;
    }
}
