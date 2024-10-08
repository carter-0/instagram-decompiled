package X;

import com.instagram.shopping.model.collection.ProductCollectionShareInfo;

public final class EJN extends ExY {
    public final ProductCollectionShareInfo A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EJN(ProductCollectionShareInfo productCollectionShareInfo, String str) {
        super(2FW.A1Z, str);
        0qQ.A0B(productCollectionShareInfo, 2);
        this.A01 = str;
        this.A00 = productCollectionShareInfo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJN) {
                EJN ejn = (EJN) obj;
                if (!0qQ.A0K(this.A01, ejn.A01) || !0qQ.A0K(this.A00, ejn.A00)) {
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
