package X;

import com.instagram.user.model.Product;

public final class EJP extends ExY {
    public final Product A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJP) {
                EJP ejp = (EJP) obj;
                if (!0qQ.A0K(this.A01, ejp.A01) || !0qQ.A0K(this.A00, ejp.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJP(Product product, String str) {
        super(2FW.A1Y, str);
        this.A01 = str;
        this.A00 = product;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
