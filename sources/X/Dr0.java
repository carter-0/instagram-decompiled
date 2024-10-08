package X;

import com.instagram.api.schemas.UserMonetizationProductType;

public final class Dr0 extends AnonymousClass0T0 {
    public UserMonetizationProductType A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Dr0) {
                Dr0 dr0 = (Dr0) obj;
                if (this.A00 != dr0.A00 || !0qQ.A0K(this.A02, dr0.A02) || !0qQ.A0K(this.A01, dr0.A01) || !0qQ.A0K(this.A04, dr0.A04) || this.A05 != dr0.A05 || !0qQ.A0K(this.A03, dr0.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A00);
        return AnonymousClass7TF.A09(this.A05, (((AnonymousClass7TF.A08(this.A02, A0K) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + C41845B3m.A00(this.A03);
    }
}
