package X;

import java.util.Arrays;

public final class A9K {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            A9K a9k = (A9K) obj;
            if (this.A00 != a9k.A00 || !0qQ.A0K(this.A01, a9k.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01});
    }

    public A9K(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
