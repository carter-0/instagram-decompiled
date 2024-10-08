package X;

import java.io.InputStream;

public final class XQY extends InputStream {
    public boolean A00 = false;
    public long A01;
    public boolean A02 = false;
    public final C257113ws A03;
    public final C257263x7 A04;
    public final byte[] A05;

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final void close() {
        if (!this.A02) {
            this.A03.close();
            this.A02 = true;
        }
    }

    public XQY(C257113ws r2, C257263x7 r3) {
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = new byte[1];
    }

    public final int read(byte[] bArr, int i, int i2) {
        C256703wD.A04(!this.A02);
        if (!this.A00) {
            this.A03.open(this.A04);
            this.A00 = true;
        }
        int read = this.A03.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.A01 += (long) read;
        return read;
    }

    public final int read() {
        byte[] bArr = this.A05;
        if (read(bArr) != -1) {
            return bArr[0] & 255;
        }
        return -1;
    }
}
