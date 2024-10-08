package X;

public final class QPc extends AnonymousClass0T0 implements C13876Tix {
    public final String A00;
    public final String A01;

    public QPc(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPc) {
                QPc qPc = (QPc) obj;
                if (!0qQ.A0K(this.A00, qPc.A00) || !0qQ.A0K(this.A01, qPc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }
}
