package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.Dsw  reason: case insensitive filesystem */
public final class C47209Dsw extends AnonymousClass0T0 implements G8e {
    public final IGTVAccountLevelMonetizationToggleSetting A00;
    public final UserMonetizationProductType A01;

    public C47209Dsw(IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting, UserMonetizationProductType userMonetizationProductType) {
        0qQ.A0B(userMonetizationProductType, 2);
        this.A00 = iGTVAccountLevelMonetizationToggleSetting;
        this.A01 = userMonetizationProductType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47209Dsw) {
                C47209Dsw dsw = (C47209Dsw) obj;
                if (!(this.A00 == dsw.A00 && this.A01 == dsw.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }
}
