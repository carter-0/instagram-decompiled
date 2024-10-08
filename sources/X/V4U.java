package X;

import android.text.TextUtils;

public final class V4U {
    public int A00;
    public int A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof V4U)) {
            return false;
        }
        V4U v4u = (V4U) obj;
        if (this.A00 == v4u.A00 && this.A01 == v4u.A01 && TextUtils.equals(this.A02, v4u.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, (((527 + this.A00) * 31) + this.A01) * 31);
    }
}
