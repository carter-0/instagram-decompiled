package X;

import java.io.Serializable;

/* renamed from: X.Qwz  reason: case insensitive filesystem */
public final class C8561Qwz extends SJv implements Serializable {
    public final byte[] A00;

    public final int A01() {
        return this.A00.length * 8;
    }

    public final byte[] A03() {
        return this.A00;
    }

    public final int A00() {
        byte[] bArr = this.A00;
        int length = bArr.length;
        if (length >= 4) {
            byte b = bArr[0] & 255;
            byte b2 = bArr[1] & 255;
            byte b3 = bArr[2] & 255;
            return ((bArr[3] & 255) << 24) | b | (b2 << 8) | (b3 << 16);
        }
        throw AnonymousClass7TE.A0z(C9719Rfc.A00("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", AnonymousClass7TF.A1b(length)));
    }

    public C8561Qwz(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }

    public final boolean A02(SJv sJv) {
        byte[] A03 = sJv.A03();
        int length = A03.length;
        byte[] bArr = this.A00;
        int length2 = bArr.length;
        if (length2 != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < length2; i++) {
            z &= AnonymousClass7TF.A1S(bArr[i], A03[i]);
        }
        return z;
    }
}
