package X;

import java.io.InputStream;
import java.nio.channels.FileChannel;

/* renamed from: X.2jb  reason: invalid class name and case insensitive filesystem */
public abstract class C227602jb extends InputStream {
    public final InputStream A00;

    public final synchronized void mark(int i) {
        this.A00.mark(i);
    }

    public final synchronized void reset() {
        this.A00.reset();
    }

    public final String A00() {
        if (this instanceof AnonymousClass3EV) {
            return ((AnonymousClass3EV) this).A00;
        }
        String path = ((C227592ja) this).A00.getPath();
        0qQ.A07(path);
        return path;
    }

    public FileChannel A01() {
        throw new UnsupportedOperationException("Stash streams do not support getChannel()");
    }

    public final int available() {
        return this.A00.available();
    }

    public final void close() {
        this.A00.close();
    }

    public final boolean markSupported() {
        return this.A00.markSupported();
    }

    public final int read(byte[] bArr) {
        return this.A00.read(bArr);
    }

    public final long skip(long j) {
        return this.A00.skip(j);
    }

    public C227602jb(InputStream inputStream) {
        this.A00 = inputStream;
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.A00.read(bArr, i, i2);
    }

    public final int read() {
        return this.A00.read();
    }
}
