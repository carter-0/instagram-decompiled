package X;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: X.S5g  reason: case insensitive filesystem */
public final class C11009S5g {
    @SerializedName("num_required_groups")
    public final int A00;
    @SerializedName("auth_factors_groups")
    public final List<S6A> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11009S5g) {
                C11009S5g s5g = (C11009S5g) obj;
                if (!0qQ.A0K(this.A01, s5g.A01) || this.A00 != s5g.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public C11009S5g(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AuthFactorRequirement(authFactorsGroups=");
        A1A.append(this.A01);
        A1A.append(", numRequiredGroups=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
