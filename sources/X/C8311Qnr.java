package X;

import java.util.Arrays;

/* renamed from: X.Qnr  reason: case insensitive filesystem */
public final class C8311Qnr extends C9144RQv {
    public final RE0 A00;
    public final String A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C9144RQv)) {
                return false;
            }
            C8311Qnr qnr = (C8311Qnr) ((C9144RQv) obj);
            if (!this.A01.equals(qnr.A01) || !Arrays.equals(this.A02, qnr.A02) || !this.A00.equals(qnr.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A01.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.A02)) * 1000003) ^ this.A00.hashCode();
    }

    public C8311Qnr(RE0 re0, String str, byte[] bArr) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = re0;
    }
}
