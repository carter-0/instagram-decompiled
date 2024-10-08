package X;

public final class BHm extends AnonymousClass0T0 implements DRW {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHm) {
                BHm bHm = (BHm) obj;
                if (!0qQ.A0K(this.A00, bHm.A00) || !0qQ.A0K(this.A01, bHm.A01) || !0qQ.A0K(this.A02, bHm.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00)));
    }

    public BHm(String str, String str2, String str3) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
