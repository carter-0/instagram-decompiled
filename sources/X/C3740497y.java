package X;

import java.util.Arrays;

/* renamed from: X.97y  reason: invalid class name and case insensitive filesystem */
public final class C3740497y {
    public final byte[] A00;

    public C3740497y(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.A00 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static C3740497y A00(byte[] bArr) {
        if (bArr != null) {
            return new C3740497y(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final byte[] A01() {
        byte[] bArr = this.A00;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3740497y)) {
            return false;
        }
        return Arrays.equals(((C3740497y) obj).A00, this.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return 002.A0g("Bytes(", C374809Aw.A00(this.A00), ")");
    }
}
