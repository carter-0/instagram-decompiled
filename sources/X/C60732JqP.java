package X;

import java.util.List;

/* renamed from: X.JqP  reason: case insensitive filesystem */
public final class C60732JqP extends C21289XSu {
    public final List A00;
    public final String A01 = "Colors";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60732JqP) {
                C60732JqP jqP = (C60732JqP) obj;
                if (!0qQ.A0K(this.A01, jqP.A01) || !0qQ.A0K(this.A00, jqP.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C60732JqP(List list) {
        this.A00 = list;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiOutputColors(type=");
        A1A.append(this.A01);
        A1A.append(", colors=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
