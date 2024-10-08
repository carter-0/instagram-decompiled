package X;

import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProductImpl;

public final class W0O {
    public int A00 = -1;
    public int A01;
    public C17985VjN A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W0O)) {
            return false;
        }
        W0O w0o = (W0O) obj;
        return this.A02.equals(w0o.A02) && this.A01 == w0o.A01 && this.A00 == w0o.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.VjN] */
    public static W0O A00(Product product, int i) {
        W0O w0o = new W0O();
        ? obj = new Object();
        w0o.A02 = obj;
        obj.A00 = new ProductTile(product);
        w0o.A01 = i;
        return w0o;
    }

    public final Product A03() {
        ProductTile productTile = this.A02.A00;
        if (productTile != null) {
            return productTile.A07;
        }
        return null;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(Integer.valueOf(this.A00), AnonymousClass7TF.A07(Integer.valueOf(this.A01), AnonymousClass7TE.A0K(this.A02)));
    }

    public static void A01(0Aj r2, W0O w0o) {
        r2.AAJ("quantity", String.valueOf(w0o.A02()));
    }

    public final int A02() {
        ProductCheckoutProperties productCheckoutProperties;
        Integer num;
        Product A03 = A03();
        if (A03 == null || (productCheckoutProperties = A03.A01.A0C) == null || (num = productCheckoutProperties.A0C) == null || !A03.A0P) {
            return this.A01;
        }
        return Math.min(this.A01, num.intValue());
    }

    public final String A04() {
        Product A03 = A03();
        if (A03 != null) {
            return A03.A0H;
        }
        UnavailableProductImpl unavailableProductImpl = this.A02.A02;
        if (unavailableProductImpl != null) {
            return unavailableProductImpl.A01;
        }
        throw new IllegalStateException("Shopping cart item is not associated with any product.");
    }
}
