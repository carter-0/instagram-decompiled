package X;

import java.util.Arrays;

/* renamed from: X.Mo9  reason: case insensitive filesystem */
public final class C67454Mo9 {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C67454Mo9)) {
            return false;
        }
        C67454Mo9 mo9 = (C67454Mo9) obj;
        if (this.A01 == mo9.A01 && this.A00 == mo9.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1Z(Integer.valueOf(this.A01), this.A00));
    }

    public C67454Mo9(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
