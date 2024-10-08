package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.LinkedHashMap;

public final class CNJ extends 17P implements DTN {
    public ProductDetailsProductItemDictIntf A00;

    public final ProductDetailsProductItemDictIntf BgJ() {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = this.A00;
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) A05(1014244451, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    public final DTN E81(1E9 r2) {
        this.A00 = C41848B3p.A1A(r2, BgJ());
        return this;
    }

    public final BG0 F7v(1E9 r3) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        ProductDetailsProductItemDictIntf BgJ = BgJ();
        if (BgJ != null) {
            productDetailsProductItemDict = BgJ.FGq(r3);
        } else {
            productDetailsProductItemDict = null;
        }
        return new BG0(productDetailsProductItemDict);
    }

    public final BG0 F7w(1E6 r2) {
        return F7v(C41847B3o.A0q(r2));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.DTN, X.CNJ] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (BgJ() != null) {
            A0t.put("product_item", C41846B3n.A0Q(BgJ()));
        }
        return C41846B3n.A0P(this, A0t);
    }
}
