package X;

import java.util.Arrays;

/* renamed from: X.Qkk  reason: case insensitive filesystem */
public final class C8237Qkk extends C282595Dw {
    public static final C8237Qkk A01 = new C8237Qkk(new byte[0]);
    public final byte[] A00;

    public final String A06() {
        return C268964eM.A01.A05(this.A00);
    }

    public final 16L A0B() {
        return 16L.A0E;
    }

    public final void EN9(17Z r5, C269504fE r6) {
        C268974eN r3 = r6.A05.A01.A00;
        byte[] bArr = this.A00;
        r5.A0i(r3, bArr, 0, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C8237Qkk)) {
            return false;
        }
        return Arrays.equals(((C8237Qkk) obj).A00, this.A00);
    }

    public final int hashCode() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    public C8237Qkk(byte[] bArr) {
        this.A00 = bArr;
    }
}
