package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.RCz  reason: case insensitive filesystem */
public final class C8858RCz extends OutputStream {
    public boolean A00 = false;
    public final FileOutputStream A01;

    public final void close() {
        if (!this.A00) {
            this.A00 = true;
            flush();
            try {
                this.A01.getFD().sync();
            } catch (IOException e) {
                2AG.A06("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.A01.close();
        }
    }

    public final void flush() {
        this.A01.flush();
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
    }

    public C8858RCz(File file) {
        this.A01 = JTO.A0t(file);
    }

    public final void write(int i) {
        this.A01.write(i);
    }

    public final void write(byte[] bArr) {
        this.A01.write(bArr);
    }
}
