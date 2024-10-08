package X;

import java.util.List;

/* renamed from: X.KVi  reason: case insensitive filesystem */
public final class C62009KVi extends C62844KnK {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62009KVi) {
                C62009KVi kVi = (C62009KVi) obj;
                if (!0qQ.A0K(this.A00, kVi.A00) || !0qQ.A0K(this.A01, kVi.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C62009KVi(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
