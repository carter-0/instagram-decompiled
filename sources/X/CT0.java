package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductCollection;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;

public final class CT0 extends 17P implements DU0 {
    public ProductCollection A00;

    public final ProductCollection Axw() {
        ProductCollection productCollection = this.A00;
        if (productCollection == null) {
            return (ProductCollection) A05(1118015597, ImmutablePandoProductCollection.class);
        }
        return productCollection;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CT0, X.DU0] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45131Cqp.A00(this));
    }

    public final Long B1d() {
        return A0L(1725551537);
    }

    public final DU0 EAW(1E9 r2) {
        ProductCollection Axw = Axw();
        if (Axw != null) {
            Axw.EAX(r2);
        } else {
            Axw = null;
        }
        this.A00 = Axw;
        return this;
    }

    public final C42144BIz FGl(1E9 r4) {
        ProductCollectionImpl productCollectionImpl;
        ProductCollection Axw = Axw();
        if (Axw != null) {
            productCollectionImpl = Axw.FGo(r4);
        } else {
            productCollectionImpl = null;
        }
        return new C42144BIz(productCollectionImpl, A0L(1725551537));
    }

    public final C42144BIz FGm(1E6 r2) {
        return FGl(C41846B3n.A0S(r2));
    }
}
