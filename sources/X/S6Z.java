package X;

public final class S6Z {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6Z) {
                S6Z s6z = (S6Z) obj;
                if (!0qQ.A0K(this.A01, s6z.A01) || !0qQ.A0K(this.A05, s6z.A05) || !0qQ.A0K(this.A02, s6z.A02) || this.A03 != s6z.A03 || this.A06 != s6z.A06 || this.A04 != s6z.A04 || !0qQ.A0K(this.A00, s6z.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A03, ((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31))) + C41845B3m.A00(this.A00);
    }

    public S6Z(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A00 = str4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Email(id=");
        A1A.append(this.A01);
        A1A.append(", userInputEmailAddress=");
        A1A.append(this.A05);
        A1A.append(", normalizedEmailAddress=");
        A1A.append(this.A02);
        A1A.append(", isDefault=");
        A1A.append(this.A03);
        A1A.append(", isOneTime=");
        A1A.append(this.A06);
        A1A.append(", isEditable=");
        A1A.append(this.A04);
        A1A.append(", externalSourceLabel=");
        return C51975G9x.A0i(this.A00, A1A);
    }
}
