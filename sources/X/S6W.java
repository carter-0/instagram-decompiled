package X;

public final class S6W {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6W) {
                S6W s6w = (S6W) obj;
                if (!(0qQ.A0K(this.A01, s6w.A01) && 0qQ.A0K(this.A00, s6w.A00) && this.A04 == s6w.A04 && this.A02 == s6w.A02 && this.A05 == s6w.A05 && this.A03 == s6w.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A04, ((AnonymousClass7TG.A0E(this.A01) * 31) + C41845B3m.A00(this.A00)) * 31))));
    }

    public S6W(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = str;
        this.A00 = str2;
        this.A04 = z;
        this.A02 = z2;
        this.A05 = z3;
        this.A03 = z4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PriceTableRowData(priceLabel=");
        A1A.append(this.A01);
        A1A.append(", priceAmount=");
        A1A.append(this.A00);
        A1A.append(", isLabelEmphasized=");
        A1A.append(this.A04);
        A1A.append(", isAmountEmphasized=");
        A1A.append(this.A02);
        A1A.append(", isPlaceholder=");
        A1A.append(this.A05);
        A1A.append(", isGreen=");
        return G9t.A1C(A1A, this.A03);
    }
}
