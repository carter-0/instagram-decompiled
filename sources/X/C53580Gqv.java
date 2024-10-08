package X;

import java.util.List;

/* renamed from: X.Gqv  reason: case insensitive filesystem */
public final class C53580Gqv extends AnonymousClass0T0 implements C59515JMn {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53580Gqv) {
                C53580Gqv gqv = (C53580Gqv) obj;
                if (!0qQ.A0K(this.A01, gqv.A01) || !0qQ.A0K(this.A00, gqv.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public C53580Gqv(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
