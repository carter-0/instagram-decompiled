package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.List;

public final class CRm extends 17P implements C46304DUh {
    public ProductDetailsProductItemDictIntf A00;
    public List A01;

    public final C66565MWt At9() {
        return (C66565MWt) A04(98832, C62004KVb.class);
    }

    public final ProductDetailsProductItemDictIntf BSv() {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = this.A00;
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) A04(-694833548, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    public final List Btj() {
        List list = this.A01;
        if (list == null) {
            return A08(-1201176455, CND.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRm, X.DUh] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44896Cmm.A00(this));
    }

    public final Long AZ3() {
        return A0L(92655287);
    }

    public final String Ali() {
        return A0i(1721014427);
    }

    public final String Bg4() {
        return A0i(-903067041);
    }

    public final C46304DUh E9z(1E9 r4) {
        ArrayList arrayList;
        ProductDetailsProductItemDictIntf BSv = BSv();
        BSv.EAY(r4);
        this.A00 = BSv;
        List<C46282DTl> Btj = Btj();
        if (Btj != null) {
            arrayList = AnonymousClass7TG.A0r(Btj);
            for (C46282DTl dTl : Btj) {
                dTl.E80(r4);
                arrayList.add(dTl);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        return this;
    }

    public final C42126BIe FEy(1E9 r9) {
        ArrayList arrayList;
        Long A0L = A0L(92655287);
        String A0i = A0i(1721014427);
        C61222JzF FF0 = At9().FF0();
        ProductDetailsProductItemDict FGq = BSv().FGq(r9);
        String A0i2 = A0i(-903067041);
        List<C46282DTl> Btj = Btj();
        if (Btj != null) {
            arrayList = AnonymousClass7TG.A0r(Btj);
            for (C46282DTl F7p : Btj) {
                arrayList.add(F7p.F7p(r9));
            }
        } else {
            arrayList = null;
        }
        return new C42126BIe(FF0, FGq, A0L, A0i, A0i2, arrayList);
    }
}
