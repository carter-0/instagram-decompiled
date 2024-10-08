package X;

import java.io.InputStream;

/* renamed from: X.RCm  reason: case insensitive filesystem */
public final class C8846RCm extends InputStream {
    public final /* synthetic */ C13198TPe A00;

    public final void close() {
    }

    public C8846RCm(C13198TPe tPe) {
        this.A00 = tPe;
    }

    public final int available() {
        return (int) Math.min(this.A00.A00, 2147483647L);
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.A00.A02(bArr, i, i2);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l(".inputStream()", A1A);
    }

    public final int read() {
        C13198TPe tPe = this.A00;
        if (tPe.A00 > 0) {
            return tPe.readByte() & 255;
        }
        return -1;
    }
}
