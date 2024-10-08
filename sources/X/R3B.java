package X;

import com.google.protobuf.CodedOutputStream;

public final class R3B extends CodedOutputStream {
    public int A00;
    public final int A01;
    public final byte[] A02;

    public R3B(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.A02 = bArr;
            this.A00 = 0;
            this.A01 = i;
            return;
        }
        throw Pxf.A0X("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Pxh.A1a(length, 0, i));
    }

    public final void A0K(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.A02, this.A00, i2);
            this.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw SQE.A07(String.format("Pos: %d, limit: %d, len: %d", Pxg.A1a(Integer.valueOf(this.A00), this.A01, i2)), e);
        }
    }
}
