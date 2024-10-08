package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;

public final class CK8 extends 17P implements C46308DUl {
    public ProductCollection A00;

    public final ProductCollection Aoo() {
        return C41847B3o.A0w(this, this.A00);
    }

    public final DTJ Axv() {
        return (DTJ) A05(1118015597, CMK.class);
    }

    public final C46308DUl E7P(1E9 r2) {
        ProductCollection A0w = C41847B3o.A0w(this, this.A00);
        if (A0w != null) {
            A0w.EAX(r2);
        } else {
            A0w = null;
        }
        this.A00 = A0w;
        return this;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.pando.TreeJNI, X.CK8, X.17P] */
    public final C42035BEn F3A(1E9 r8) {
        ProductCollectionImpl productCollectionImpl;
        ProductCollection A0w = C41847B3o.A0w(this, this.A00);
        BFY bfy = null;
        if (A0w != null) {
            productCollectionImpl = A0w.FGo(r8);
        } else {
            productCollectionImpl = null;
        }
        String A0i = A0i(1060506683);
        DTJ Axv = Axv();
        if (Axv != null) {
            bfy = Axv.F6F();
        }
        return new C42035BEn(bfy, productCollectionImpl, getOptionalBooleanValueByHashCode(1518770791), A0i, A0i(1987220567), A0i(856135849));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CK8, X.DUl] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44143CXi.A00(this));
    }

    public final String Aov() {
        return A0i(1060506683);
    }

    public final String BDT() {
        return A0i(1987220567);
    }

    public final String BDU() {
        return A0i(856135849);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CK8] */
    public final Boolean CP7() {
        return getOptionalBooleanValueByHashCode(1518770791);
    }

    public final C42035BEn F3B(1E6 r2) {
        return F3A(C41846B3n.A0S(r2));
    }
}
