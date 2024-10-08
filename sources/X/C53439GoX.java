package X;

import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.GoX  reason: case insensitive filesystem */
public final class C53439GoX extends AnonymousClass0T0 implements JRX {
    public final UserMonetizationProductType A00;
    public final boolean A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public C53439GoX(UserMonetizationProductType userMonetizationProductType, String str, boolean z, boolean z2, boolean z3) {
        DbW.A1N(str, 3, userMonetizationProductType);
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str;
        this.A01 = z3;
        this.A00 = userMonetizationProductType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53439GoX) {
                C53439GoX goX = (C53439GoX) obj;
                if (!(this.A03 == goX.A03 && this.A04 == goX.A04 && 0qQ.A0K(this.A02, goX.A02) && this.A01 == goX.A01 && this.A00 == goX.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A09(this.A04, C51965G9l.A05(this.A03)))));
    }
}
