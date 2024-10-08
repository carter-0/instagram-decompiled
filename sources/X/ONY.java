package X;

public final class ONY {
    public String A00 = null;
    public String A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ONY) {
                ONY ony = (ONY) obj;
                if (!0qQ.A0K(this.A00, ony.A00) || !0qQ.A0K(this.A01, ony.A01) || this.A03 != ony.A03 || this.A02 != ony.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A09(this.A03, G9w.A01(((AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01)) * 31)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetricProperties(openThreadId=");
        A1A.append(this.A00);
        A1A.append(", pushCategory=");
        A1A.append(this.A01);
        C51975G9x.A1G(A1A, ", messageMatched=");
        A1A.append(", missingMessageId=");
        A1A.append(this.A03);
        A1A.append(", isInstamadillo=");
        return G9t.A1C(A1A, this.A02);
    }
}
