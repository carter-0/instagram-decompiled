package X;

import java.util.Set;

/* renamed from: X.KLl  reason: case insensitive filesystem */
public final class C61772KLl extends C62760Kly {
    public final Set A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61772KLl) {
                C61772KLl kLl = (C61772KLl) obj;
                if (!0qQ.A0K(this.A00, kLl.A00) || this.A01 != kLl.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C61772KLl(Set set, boolean z) {
        this.A00 = set;
        this.A01 = z;
    }

    public C61772KLl() {
        this(0sl.A00, false);
    }
}
