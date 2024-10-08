package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CornerStyle;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class COE extends 17P implements AnonymousClass56P {
    public ProductDetailsProductItemDictIntf A00;

    public final List Abc() {
        return A08(-683992599, ImmutablePandoAndroidLink.class);
    }

    public final CornerStyle ArW() {
        return (CornerStyle) A0N(972889927, C46087DLs.A00);
    }

    public final List BIw() {
        return A08(1180716295, ImmutablePandoAndroidLink.class);
    }

    public final List BN4() {
        return A08(102977465, ImmutablePandoAndroidLink.class);
    }

    public final ProductDetailsProductItemDictIntf Bfu() {
        return C41847B3o.A0x(this, this.A00);
    }

    public final AnonymousClass56P E8B(1E9 r2) {
        this.A00 = C41848B3p.A1A(r2, C41847B3o.A0x(this, this.A00));
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.56P, X.COE] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44343CdP.A00(this));
    }

    public final String BgN() {
        return A0i(1014375387);
    }

    public final AnonymousClass56O F8y(1E9 r9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List Abc = Abc();
        ProductDetailsProductItemDict productDetailsProductItemDict = null;
        if (Abc != null) {
            arrayList = AnonymousClass7TF.A0p(Abc);
            Iterator it = Abc.iterator();
            while (it.hasNext()) {
                C41846B3n.A1W(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        CornerStyle ArW = ArW();
        List BIw = BIw();
        if (BIw != null) {
            arrayList2 = AnonymousClass7TF.A0p(BIw);
            Iterator it2 = BIw.iterator();
            while (it2.hasNext()) {
                C41846B3n.A1W(arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        List BN4 = BN4();
        if (BN4 != null) {
            arrayList3 = AnonymousClass7TF.A0p(BN4);
            Iterator it3 = BN4.iterator();
            while (it3.hasNext()) {
                C41846B3n.A1W(arrayList3, it3);
            }
        } else {
            arrayList3 = null;
        }
        ProductDetailsProductItemDictIntf A0x = C41847B3o.A0x(this, this.A00);
        if (A0x != null) {
            productDetailsProductItemDict = A0x.FGq(r9);
        }
        return new AnonymousClass56O(ArW, productDetailsProductItemDict, A0i(1014375387), arrayList, arrayList2, arrayList3);
    }

    public final AnonymousClass56O F8z(1E6 r2) {
        return F8y(C41846B3n.A0S(r2));
    }
}
