package X;

/* renamed from: X.Hsh  reason: case insensitive filesystem */
public final class C56094Hsh {
    public final String A00;
    public final 0eP A01;

    public C56094Hsh(String str, 0eP r3) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56094Hsh) {
                C56094Hsh hsh = (C56094Hsh) obj;
                if (!0qQ.A0K(this.A00, hsh.A00) || !0qQ.A0K(this.A01, hsh.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0C(this.A01);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NuxStringData(text=");
        A1A.append(this.A00);
        A1A.append(", embeddedLink=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
