package X;

import java.util.List;

/* renamed from: X.Gr1  reason: case insensitive filesystem */
public final class C53586Gr1 extends AnonymousClass0T0 implements JN9 {
    public final 1Xj A00;
    public final List A01;

    public C53586Gr1(1Xj r2, List list) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53586Gr1) {
                C53586Gr1 gr1 = (C53586Gr1) obj;
                if (!0qQ.A0K(this.A01, gr1.A01) || !0qQ.A0K(this.A00, gr1.A00)) {
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
}
