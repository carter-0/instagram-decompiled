package X;

import java.io.FileOutputStream;
import java.io.OutputStream;

public final class PyX extends OutputStream {
    public final FileOutputStream A00;

    public final void close() {
    }

    public final void write(byte[] bArr, int i, int i2) {
        0qQ.A0B(bArr, 0);
        this.A00.write(bArr, i, i2);
    }

    public final void flush() {
        this.A00.flush();
    }

    public PyX(FileOutputStream fileOutputStream) {
        this.A00 = fileOutputStream;
    }

    public final void write(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        this.A00.write(bArr);
    }

    public final void write(int i) {
        this.A00.write(i);
    }
}
