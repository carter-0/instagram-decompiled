package X;

import java.util.List;

/* renamed from: X.Gl2  reason: case insensitive filesystem */
public final class C53254Gl2 extends AnonymousClass0T0 {
    public final C276124sb A00;
    public final List A01;

    public C53254Gl2(C276124sb r2, List list) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53254Gl2) {
                C53254Gl2 gl2 = (C53254Gl2) obj;
                if (!0qQ.A0K(this.A01, gl2.A01) || !0qQ.A0K(this.A00, gl2.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }
}
