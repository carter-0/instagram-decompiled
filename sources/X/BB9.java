package X;

import android.os.Parcelable;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;

public final class BB9 extends AnonymousClass0T0 {
    public User A00;
    public Integer A01;
    public ArrayList A02 = null;

    public BB9() {
        Parcelable.Creator creator = User.CREATOR;
        User A022 = 1aC.A02((MerchantCheckoutStyle) null, (SellerShoppableFeedType) null, (ImageUrl) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null);
        Integer num = AnonymousClass05K.A00;
        0qQ.A0B(A022, 1);
        this.A00 = A022;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BB9) {
                BB9 bb9 = (BB9) obj;
                if (!0qQ.A0K(this.A00, bb9.A00) || !0qQ.A0K(this.A02, bb9.A02) || this.A01 != bb9.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A02)) * 31) + -1140810758 + this.A01.intValue();
    }
}
