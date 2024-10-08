package X;

public final class QOn extends AnonymousClass0T0 {
    public String A00 = null;
    public final int A01;
    public final String A02;
    public final String A03;

    public QOn(String str, String str2, int i) {
        this.A01 = i;
        this.A02 = str;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QOn) {
                QOn qOn = (QOn) obj;
                if (this.A01 != qOn.A01 || !0qQ.A0K(this.A02, qOn.A02) || !0qQ.A0K(this.A03, qOn.A03) || !0qQ.A0K(this.A00, qOn.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (G9w.A02(((this.A01 * 31) + AnonymousClass7TG.A0E(this.A02)) * 31, AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A00);
    }
}
