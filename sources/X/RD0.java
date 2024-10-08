package X;

import com.facebook.common.dextricks.Constants;
import java.io.OutputStream;

public final class RD0 extends OutputStream {
    public int A00;
    public ST0 A01;
    public byte[] A02;
    public final OutputStream A03;

    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.A00;
            if (i6 != 0 || i4 < this.A02.length) {
                byte[] bArr2 = this.A02;
                int A04 = Pxh.A04(bArr2.length, i6, i4);
                System.arraycopy(bArr, i5, bArr2, i6, A04);
                int i7 = this.A00 + A04;
                this.A00 = i7;
                i3 += A04;
                byte[] bArr3 = this.A02;
                if (i7 == bArr3.length && i7 > 0) {
                    this.A03.write(bArr3, 0, i7);
                    this.A00 = 0;
                    continue;
                }
            } else {
                this.A03.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }

    public RD0(ST0 st0, OutputStream outputStream) {
        this.A03 = outputStream;
        this.A01 = st0;
        this.A02 = (byte[]) st0.A04(Constants.LOAD_RESULT_PGO_ATTEMPTED, byte[].class);
    }

    public final void flush() {
        int i = this.A00;
        if (i > 0) {
            this.A03.write(this.A02, 0, i);
            this.A00 = 0;
        }
        this.A03.flush();
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        try {
            flush();
            this.A03.close();
            byte[] bArr = this.A02;
            if (bArr != null) {
                this.A01.A05(bArr);
                this.A02 = null;
            }
        } catch (Throwable th) {
            this.A03.close();
            throw th;
        }
    }

    public final void write(int i) {
        byte[] bArr = this.A02;
        int i2 = this.A00;
        int i3 = i2 + 1;
        this.A00 = i3;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length && i3 > 0) {
            this.A03.write(bArr, 0, i3);
            this.A00 = 0;
        }
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
