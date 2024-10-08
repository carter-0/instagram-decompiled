package X;

public final class NTW extends C69570NoE {
    public final Exception A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NTW) {
                NTW ntw = (NTW) obj;
                if (!0qQ.A0K(this.A01, ntw.A01) || !0qQ.A0K(this.A00, ntw.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public NTW(Exception exc, String str) {
        this.A01 = str;
        this.A00 = exc;
    }
}
