package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

public final class CS6 extends 17P implements C46292DTv {
    public ProductDetailsProductItemDictIntf A00;

    public final C74546Pwf Bbg() {
        return (C74546Pwf) A05(-517618225, C69054Ndq.class);
    }

    public final ProductDetailsProductItemDictIntf Bfu() {
        return C41847B3o.A0x(this, this.A00);
    }

    public final C46292DTv EA7(1E9 r2) {
        this.A00 = C41848B3p.A1A(r2, C41847B3o.A0x(this, this.A00));
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CS6, X.DTv] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44919CnA.A00(this));
    }

    public final C42130BIj FFS(1E9 r4) {
        C68282N8v n8v;
        C74546Pwf Bbg = Bbg();
        ProductDetailsProductItemDict productDetailsProductItemDict = null;
        if (Bbg != null) {
            n8v = Bbg.FFU();
        } else {
            n8v = null;
        }
        ProductDetailsProductItemDictIntf A0x = C41847B3o.A0x(this, this.A00);
        if (A0x != null) {
            productDetailsProductItemDict = A0x.FGq(r4);
        }
        return new C42130BIj(n8v, productDetailsProductItemDict);
    }

    public final C42130BIj FFT(1E6 r2) {
        return FFS(C41846B3n.A0S(r2));
    }
}
