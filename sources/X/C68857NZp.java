package X;

/* renamed from: X.NZp  reason: case insensitive filesystem */
public final class C68857NZp extends C69602Nok {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68857NZp) {
                C68857NZp nZp = (C68857NZp) obj;
                if (!0qQ.A0K(this.A01, nZp.A01) || this.A00 != nZp.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + this.A00;
    }

    public C68857NZp(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
