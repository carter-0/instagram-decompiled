package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

public final class CKY extends 17P implements DUM {
    public ProductDetailsProductItemDictIntf A00;

    public final ProductImageContainer Bbz() {
        return (ProductImageContainer) A04(106642994, ImmutablePandoProductImageContainer.class);
    }

    public final ProductDetailsProductItemDictIntf Bfu() {
        return C41847B3o.A0x(this, this.A00);
    }

    public final DUM E7T(1E9 r2) {
        this.A00 = C41848B3p.A1A(r2, C41847B3o.A0x(this, this.A00));
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CKY, X.DUM] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CYP.A00(this));
    }

    public final String BRr() {
        return A0k(574223090);
    }

    public final String BgF() {
        return A0k(1777403855);
    }

    public final C42046BEz F3c(1E9 r7) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        String A0k = A0k(574223090);
        ProductImageContainerImpl FFc = Bbz().FFc();
        ProductDetailsProductItemDictIntf A0x = C41847B3o.A0x(this, this.A00);
        if (A0x != null) {
            productDetailsProductItemDict = A0x.FGq(r7);
        } else {
            productDetailsProductItemDict = null;
        }
        return new C42046BEz(FFc, productDetailsProductItemDict, A0k, A0k(1753008747), A0k(1777403855));
    }

    public final String getProductId() {
        return A0k(1753008747);
    }
}
