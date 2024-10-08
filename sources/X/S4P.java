package X;

import java.util.Arrays;

public final class S4P {
    public final RJ9 A00;
    public final Integer A01;

    public /* synthetic */ S4P(RJ9 rj9, Integer num) {
        this.A00 = rj9;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof S4P) {
                S4P s4p = (S4P) obj;
                if (!SA1.A01(this.A00, s4p.A00) || !SA1.A01(this.A01, s4p.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, null, null});
    }
}
