package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.4yv  reason: invalid class name and case insensitive filesystem */
public final class C279604yv extends InputStream {
    public boolean A00;
    public final C279424yc A01;
    public final ByteArrayOutputStream A02 = new ByteArrayOutputStream();
    public final InputStream A03;

    public final int available() {
        try {
            return this.A03.available();
        } catch (IOException e) {
            0KC.A0C("AtomicStreamDeferWrapper", "Exception on available input stream");
            throw e;
        }
    }

    public final void close() {
        try {
            this.A03.close();
            if (!this.A00) {
                this.A01.DfF(this.A02);
                this.A00 = true;
            }
        } catch (IOException e) {
            0KC.A0C("AtomicStreamDeferWrapper", "Exception on close input stream");
            throw e;
        }
    }

    public final void mark(int i) {
        throw new RuntimeException("Operation not supported");
    }

    public final boolean markSupported() {
        throw new RuntimeException("Operation not supported");
    }

    public final int read(byte[] bArr) {
        try {
            int read = this.A03.read(bArr);
            if (!(read == -1 || bArr == null)) {
                this.A02.write(bArr, 0, read);
            }
            return read;
        } catch (IOException e) {
            0KC.A0C("AtomicStreamDeferWrapper", "Exception on read response input stream");
            throw e;
        }
    }

    public final void reset() {
        throw new RuntimeException("Operation not supported");
    }

    public final long skip(long j) {
        throw new RuntimeException("Operation not supported");
    }

    public C279604yv(C279424yc r2, InputStream inputStream) {
        this.A03 = inputStream;
        this.A01 = r2;
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.A03.read(bArr, i, i2);
            if (!(read == -1 || bArr == null)) {
                this.A02.write(bArr, i, read);
            }
            return read;
        } catch (IOException e) {
            0KC.A0C("AtomicStreamDeferWrapper", "Exception on read response input stream");
            throw e;
        }
    }

    public final int read() {
        try {
            int read = this.A03.read();
            if (read != -1) {
                this.A02.write(read);
            }
            return read;
        } catch (IOException e) {
            0KC.A0C("AtomicStreamDeferWrapper", "Exception on read response input stream");
            throw e;
        }
    }
}
