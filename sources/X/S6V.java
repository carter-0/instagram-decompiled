package X;

public final class S6V {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6V) {
                S6V s6v = (S6V) obj;
                if (!0qQ.A0K(this.A02, s6v.A02) || !0qQ.A0K(this.A03, s6v.A03) || !0qQ.A0K(this.A01, s6v.A01) || this.A04 != s6v.A04 || this.A05 != s6v.A05 || !0qQ.A0K(this.A00, s6v.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A04;
        return AnonymousClass7TF.A09(this.A05, (AnonymousClass7TF.A09(z, ((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C54732HQn.A00()) * 31) + C41845B3m.A00(this.A00);
    }

    public S6V(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = str4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PhoneNumber(id=");
        A1A.append(this.A02);
        A1A.append(", normalizedPhoneNumber=");
        A1A.append(this.A03);
        A1A.append(", formattedPhoneNumberWithPlus=");
        A1A.append(this.A01);
        A1A.append(", isDefault=");
        A1A.append(this.A04);
        C51975G9x.A1G(A1A, ", isOneTime=");
        A1A.append(", isEditable=");
        A1A.append(this.A05);
        A1A.append(", externalSourceLabel=");
        return C51975G9x.A0i(this.A00, A1A);
    }
}
