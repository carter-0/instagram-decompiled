package X;

import java.util.Arrays;

public final class F3A {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            F3A f3a = (F3A) obj;
            if (!0qQ.A0K(this.A00, f3a.A00) || !0qQ.A0K(this.A01, f3a.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public F3A(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
