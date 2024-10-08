package X;

public final class BF2 extends AnonymousClass0T0 implements C46229DRk {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final BF2 F3j() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BF2) {
                BF2 bf2 = (BF2) obj;
                if (!0qQ.A0K(this.A00, bf2.A00) || !0qQ.A0K(this.A01, bf2.A01) || !0qQ.A0K(this.A02, bf2.A02) || !0qQ.A0K(this.A03, bf2.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00))));
    }

    public BF2(String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1U(str, str2, str3);
        0qQ.A0B(str4, 4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
