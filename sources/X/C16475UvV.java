package X;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.UvV  reason: case insensitive filesystem */
public final class C16475UvV extends FilterOutputStream {
    public final /* synthetic */ C17874VhR A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16475UvV(C17874VhR vhR, OutputStream outputStream) {
        super(outputStream);
        this.A00 = vhR;
    }

    public final void close() {
        try {
            this.out.close();
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public final void flush() {
        try {
            this.out.flush();
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }

    public final void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException unused) {
            this.A00.A01 = true;
        }
    }
}
