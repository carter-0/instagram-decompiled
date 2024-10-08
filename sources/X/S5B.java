package X;

public final class S5B {
    public final String A00;

    public final boolean equals(Object obj) {
        String str = this.A00;
        if (!(obj instanceof S5B) || !0qQ.A0K(str, ((S5B) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return 002.A0S("Url(url=", this.A00, ')');
    }

    public /* synthetic */ S5B(String str) {
        this.A00 = str;
    }
}
