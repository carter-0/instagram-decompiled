package X;

import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.user.model.User;

/* renamed from: X.6zb  reason: invalid class name and case insensitive filesystem */
public final class C324606zb {
    public final MerchantCheckoutStyle A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C324606zb(MerchantCheckoutStyle merchantCheckoutStyle, String str, String str2, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = merchantCheckoutStyle;
    }

    public final boolean A00(User user) {
        if (!0qQ.A0K(user.getId(), this.A01) || !0qQ.A0K(user.getUsername(), this.A02) || user.A1P() != this.A03 || user.A03.BRp() != this.A00) {
            return true;
        }
        return false;
    }
}
