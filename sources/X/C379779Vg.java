package X;

import java.util.Arrays;

/* renamed from: X.9Vg  reason: invalid class name and case insensitive filesystem */
public final class C379779Vg {
    public final int A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C379779Vg r5 = (C379779Vg) obj;
            if (this.A00 != r5.A00 || this.A01 != r5.A01) {
                return false;
            }
            String str = this.A02;
            return str.length() == 0 ? r5.A02.length() == 0 : str.equals(r5.A02);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02});
    }

    public C379779Vg(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }
}
