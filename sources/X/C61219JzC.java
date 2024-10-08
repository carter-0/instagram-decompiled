package X;

import java.util.List;

/* renamed from: X.JzC  reason: case insensitive filesystem */
public final class C61219JzC extends AnonymousClass0T0 implements C66553MWh {
    public final List A00;
    public final boolean A01;

    public C61219JzC(List list, boolean z) {
        0qQ.A0B(list, 2);
        this.A01 = z;
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61219JzC) {
                C61219JzC jzC = (C61219JzC) obj;
                if (this.A01 != jzC.A01 || !0qQ.A0K(this.A00, jzC.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, C51965G9l.A05(this.A01));
    }
}
