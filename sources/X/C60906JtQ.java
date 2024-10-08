package X;

import java.util.List;

/* renamed from: X.JtQ  reason: case insensitive filesystem */
public final class C60906JtQ extends AnonymousClass0T0 {
    public final C60924Jti A00;
    public final List A01;

    public C60906JtQ(C60924Jti jti, List list) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = jti;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60906JtQ) {
                C60906JtQ jtQ = (C60906JtQ) obj;
                if (!0qQ.A0K(this.A01, jtQ.A01) || !0qQ.A0K(this.A00, jtQ.A00)) {
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
