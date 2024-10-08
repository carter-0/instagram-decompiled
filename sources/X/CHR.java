package X;

import kotlin.Deprecated;

@Deprecated(message = "Please use GenericXmaContentViewModel#NavigationFields instead.")
public final class CHR extends C44046CTp {
    public final 1Ns A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public CHR(1Ns r2, String str, String str2, String str3) {
        AnonymousClass7TF.A1D(str3, 3, r2);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CHR) {
                CHR chr = (CHR) obj;
                if (!0qQ.A0K(this.A01, chr.A01) || !0qQ.A0K(this.A02, chr.A02) || !0qQ.A0K(this.A03, chr.A03) || !0qQ.A0K(this.A00, chr.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TG.A0E(this.A01) * 31)));
    }
}
