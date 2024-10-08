package X;

import java.io.OutputStream;

/* renamed from: X.RCx  reason: case insensitive filesystem */
public final class C8856RCx extends OutputStream {
    public long A00 = 0;

    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.A00 += (long) i2;
    }

    public final void write(int i) {
        this.A00++;
    }

    public final void write(byte[] bArr) {
        this.A00 += (long) bArr.length;
    }
}
