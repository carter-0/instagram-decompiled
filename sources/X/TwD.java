package X;

import java.util.Arrays;

public final class TwD {
    public int A00 = -16777216;
    public String A01 = "";

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TwD)) {
            return false;
        }
        TwD twD = (TwD) obj;
        return 2Ob.A00(this.A01, twD.A01) && 2Ob.A00(Integer.valueOf(this.A00), Integer.valueOf(twD.A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1Z(this.A01, this.A00));
    }
}
