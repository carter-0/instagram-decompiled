package X;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class S6A {
    @SerializedName("factors")
    public final List<C11027S6f> A00;
    @SerializedName("num_required_factors")
    public final int A01;
    @SerializedName("allow_user_select")
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6A) {
                S6A s6a = (S6A) obj;
                if (!(0qQ.A0K(this.A00, s6a.A00) && this.A02 == s6a.A02 && this.A01 == s6a.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A00)) + this.A01;
    }

    public S6A(int i, boolean z, List list) {
        this.A00 = list;
        this.A02 = z;
        this.A01 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AuthFactorGroup(authFactors=");
        A1A.append(this.A00);
        A1A.append(", allowUserSelect=");
        A1A.append(this.A02);
        A1A.append(", numRequiredFactors=");
        return C51975G9x.A0j(A1A, this.A01);
    }
}
