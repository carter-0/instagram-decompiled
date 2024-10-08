package X;

import java.util.Arrays;

public final class S4C {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            S4C s4c = (S4C) obj;
            if (this.A00 != s4c.A00 || !0qQ.A0K(this.A01, s4c.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1Z(this.A01, this.A00));
    }

    public S4C(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
