package X;

import java.util.Arrays;

/* renamed from: X.4Xh  reason: invalid class name and case insensitive filesystem */
public final class C266034Xh {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C266034Xh r5 = (C266034Xh) obj;
            if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00 && Arrays.equals(this.A03, r5.A03))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + Arrays.hashCode(this.A03)) * 31) + this.A02) * 31) + this.A00;
    }

    public C266034Xh(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }
}
