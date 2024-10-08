package X;

import java.util.List;

/* renamed from: X.9ZB  reason: invalid class name */
public final class AnonymousClass9ZB extends C21289XSu {
    public final List A00;
    public final String A01 = "STRINGS";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9ZB) {
                AnonymousClass9ZB r5 = (AnonymousClass9ZB) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass9ZB(List list) {
        this.A00 = list;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiOutputStrings(type=");
        A1A.append(this.A01);
        A1A.append(", listStrings=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
