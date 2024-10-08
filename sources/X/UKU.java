package X;

public final class UKU extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKU) {
                UKU uku = (UKU) obj;
                if (!0qQ.A0K(this.A03, uku.A03) || !0qQ.A0K(this.A05, uku.A05) || !0qQ.A0K(this.A02, uku.A02) || !0qQ.A0K(this.A01, uku.A01) || !0qQ.A0K(this.A04, uku.A04) || this.A00 != uku.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A03))))) + this.A00;
    }

    public UKU(String str, String str2, String str3, String str4, String str5, int i) {
        this.A03 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A04 = str5;
        this.A00 = i;
    }
}
