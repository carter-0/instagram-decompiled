package X;

public final class EPF extends C48198Eae {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EPF) {
                EPF epf = (EPF) obj;
                if (!0qQ.A0K(this.A01, epf.A01) || !0qQ.A0K(this.A03, epf.A03) || !0qQ.A0K(this.A02, epf.A02) || this.A00 != epf.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A01))) + this.A00;
    }

    public EPF(String str, String str2, String str3, int i) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
    }
}
