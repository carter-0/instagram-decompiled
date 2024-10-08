package X;

import java.util.Arrays;

public final class F36 {
    public String A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F36)) {
            return false;
        }
        F36 f36 = (F36) obj;
        return 2PP.A00(this.A01, f36.A01) && 2PP.A00(this.A00, f36.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }
}
