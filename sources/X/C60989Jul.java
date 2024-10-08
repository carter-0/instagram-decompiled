package X;

import java.util.List;

/* renamed from: X.Jul  reason: case insensitive filesystem */
public final class C60989Jul extends AnonymousClass0T0 {
    public final C61050Jvo A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60989Jul) {
                C60989Jul jul = (C60989Jul) obj;
                if (!0qQ.A0K(this.A00, jul.A00) || !0qQ.A0K(this.A01, jul.A01)) {
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

    public C60989Jul(C61050Jvo jvo, List list) {
        AnonymousClass7TG.A1O(jvo, list);
        this.A00 = jvo;
        this.A01 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Ctas(selectedCta=");
        A1A.append(this.A00);
        A1A.append(", availableCtas=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
