package X;

public final class ONL {
    public final String A00;
    public final 0sP A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONL) {
                ONL onl = (ONL) obj;
                if (!0qQ.A0K(this.A00, onl.A00) || !0qQ.A0K(this.A01, onl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public ONL(String str, 0sP r2) {
        this.A00 = str;
        this.A01 = r2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FieldExtractionDefinition(id=");
        A1A.append(this.A00);
        A1A.append(", extractor=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
