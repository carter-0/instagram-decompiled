package X;

import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.UserMonetizationProductType;

public final class BB2 extends AnonymousClass0T0 {
    public final IGTVAccountLevelMonetizationToggleSetting A00;
    public final UserMonetizationProductType A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BB2) {
                BB2 bb2 = (BB2) obj;
                if (!(this.A00 == bb2.A00 && this.A01 == bb2.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public BB2(IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting, UserMonetizationProductType userMonetizationProductType) {
        AnonymousClass7TG.A1O(iGTVAccountLevelMonetizationToggleSetting, userMonetizationProductType);
        this.A00 = iGTVAccountLevelMonetizationToggleSetting;
        this.A01 = userMonetizationProductType;
    }
}
