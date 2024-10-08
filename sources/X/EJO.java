package X;

import com.instagram.shopping.model.share.ShopShareInfo;

public final class EJO extends ExY {
    public final ShopShareInfo A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EJO(ShopShareInfo shopShareInfo, String str) {
        super(2FW.A1a, str);
        0qQ.A0B(shopShareInfo, 2);
        this.A01 = str;
        this.A00 = shopShareInfo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJO) {
                EJO ejo = (EJO) obj;
                if (!0qQ.A0K(this.A01, ejo.A01) || !0qQ.A0K(this.A00, ejo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0E(this.A01) * 31);
    }
}
