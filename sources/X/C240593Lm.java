package X;

import com.facebook.common.dextricks.DalvikConstants;

/* renamed from: X.3Lm  reason: invalid class name and case insensitive filesystem */
public final class C240593Lm {
    public static final C240593Lm A03;
    public int A00;
    public boolean A01;
    public boolean A02;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C240593Lm)) {
            return false;
        }
        C240593Lm r4 = (C240593Lm) obj;
        return this.A00 == r4.A00 && this.A02 == r4.A02 && this.A01 == r4.A01;
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = 0;
        int i3 = 0;
        if (this.A02) {
            i3 = 4194304;
        }
        int i4 = i ^ i3;
        if (this.A01) {
            i2 = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
        }
        return i4 ^ i2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3Lm, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.A00 = Integer.MAX_VALUE;
        obj.A02 = true;
        obj.A01 = true;
        A03 = obj;
    }
}
