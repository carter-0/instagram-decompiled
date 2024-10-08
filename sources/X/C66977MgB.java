package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.MgB  reason: case insensitive filesystem */
public final class C66977MgB extends C69600Noi {
    public final DirectThreadKey A00;
    public final boolean A01;
    public final boolean A02;

    public C66977MgB(DirectThreadKey directThreadKey, boolean z, boolean z2) {
        0qQ.A0B(directThreadKey, 1);
        this.A00 = directThreadKey;
        this.A01 = z;
        this.A02 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66977MgB) {
                C66977MgB mgB = (C66977MgB) obj;
                if (!(0qQ.A0K(this.A00, mgB.A00) && this.A01 == mgB.A01 && this.A02 == mgB.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }
}
