package X;

import com.google.common.collect.ImmutableList;

public final class S4X {
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;

    public S4X(ImmutableList immutableList, ImmutableList immutableList2, String str) {
        C11367SPk.A03(immutableList, "emailAddresses");
        this.A00 = immutableList;
        this.A02 = str;
        C11367SPk.A03(immutableList2, "phoneNumbers");
        this.A01 = immutableList2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S4X) {
                S4X s4x = (S4X) obj;
                if (!0qQ.A0K(this.A00, s4x.A00) || !0qQ.A0K(this.A02, s4x.A02) || !0qQ.A0K(this.A01, s4x.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A01);
    }
}
