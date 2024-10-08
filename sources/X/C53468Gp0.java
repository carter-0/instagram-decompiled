package X;

import java.util.List;

/* renamed from: X.Gp0  reason: case insensitive filesystem */
public final class C53468Gp0 extends AnonymousClass0T0 implements MWY {
    public final List A00;
    public final List A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53468Gp0) {
                C53468Gp0 gp0 = (C53468Gp0) obj;
                if (!0qQ.A0K(this.A01, gp0.A01) || !0qQ.A0K(this.A00, gp0.A00) || !0qQ.A0K(this.A02, gp0.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public C53468Gp0(List list, List list2, List list3) {
        AnonymousClass7TG.A1U(list, list2, list3);
        this.A01 = list;
        this.A00 = list2;
        this.A02 = list3;
    }
}
