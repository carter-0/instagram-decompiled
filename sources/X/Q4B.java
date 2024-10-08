package X;

public final class Q4B extends C7311Q3n {
    public final T9F A00;
    public final C7305Q3h A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q4B) {
                Q4B q4b = (Q4B) obj;
                if (!0qQ.A0K(this.A02, q4b.A02) || !0qQ.A0K(this.A00, q4b.A00) || !0qQ.A0K(this.A01, q4b.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, (AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q4B(C7305Q3h q3h, T9F t9f, String str) {
        super(q3h, str);
        AnonymousClass7TG.A1P(str, q3h);
        this.A02 = str;
        this.A00 = t9f;
        this.A01 = q3h;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Resource(key=");
        A1A.append(this.A02);
        A1A.append(", resources=");
        A1A.append(this.A00);
        A1A.append(", summary=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
