package X;

import java.util.List;

/* renamed from: X.JzP  reason: case insensitive filesystem */
public final class C61231JzP extends AnonymousClass0T0 implements C74269Prx {
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61231JzP) {
                C61231JzP jzP = (C61231JzP) obj;
                if (!(0qQ.A0K(this.A00, jzP.A00) && this.A01 == jzP.A01 && this.A02 == jzP.A02)) {
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

    public C61231JzP(List list, boolean z, boolean z2) {
        this.A00 = list;
        this.A01 = z;
        this.A02 = z2;
    }
}
