package X;

/* renamed from: X.Q3o  reason: case insensitive filesystem */
public final class C7312Q3o extends C7311Q3n {
    public final C7318Q3u A00;
    public final C7305Q3h A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7312Q3o) {
                C7312Q3o q3o = (C7312Q3o) obj;
                if (!0qQ.A0K(this.A02, q3o.A02) || !0qQ.A0K(this.A00, q3o.A00) || !0qQ.A0K(this.A01, q3o.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7312Q3o(C7318Q3u q3u, C7305Q3h q3h, String str) {
        super(q3h, str);
        AnonymousClass7TG.A1P(str, q3h);
        this.A02 = str;
        this.A00 = q3u;
        this.A01 = q3h;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ParseResult(key=");
        A1A.append(this.A02);
        A1A.append(", result=");
        A1A.append(this.A00);
        A1A.append(", summary=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
