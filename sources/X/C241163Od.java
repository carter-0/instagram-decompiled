package X;

import java.io.OutputStream;

/* renamed from: X.3Od  reason: invalid class name and case insensitive filesystem */
public abstract class C241163Od extends OutputStream {
    public final OutputStream A00;

    public void close() {
        this.A00.close();
    }

    public void flush() {
        this.A00.flush();
    }

    public void write(int i) {
        this.A00.write(i);
    }

    public C241163Od(OutputStream outputStream) {
        this.A00 = outputStream;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A00.write(bArr, i, i2);
    }

    public void write(byte[] bArr) {
        this.A00.write(bArr);
    }
}
