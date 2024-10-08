package X;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* renamed from: X.3Ey  reason: invalid class name */
public abstract class AnonymousClass3Ey extends OutputStream {
    public boolean A00;
    public boolean A01;
    public final OutputStream A02;

    public abstract void A02();

    public abstract boolean A03();

    public void close() {
        this.A00 = true;
        try {
            this.A02.close();
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    public final void write(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        try {
            this.A02.write(bArr);
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    public FileChannel A01() {
        throw new UnsupportedOperationException("Stash streams do not support getChannel()");
    }

    public final void flush() {
        try {
            this.A02.flush();
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    public AnonymousClass3Ey(OutputStream outputStream) {
        this.A02 = outputStream;
    }

    public final void write(byte[] bArr, int i, int i2) {
        0qQ.A0B(bArr, 0);
        try {
            this.A02.write(bArr, i, i2);
        } catch (IOException unused) {
            this.A01 = true;
        }
    }

    public final void write(int i) {
        try {
            this.A02.write(i);
        } catch (IOException unused) {
            this.A01 = true;
        }
    }
}
