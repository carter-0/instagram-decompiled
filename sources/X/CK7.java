package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.ImmutablePandoProductTagDict;
import com.instagram.model.shopping.ProductTagDictIntf;
import java.util.ArrayList;
import java.util.List;

public final class CK7 extends 17P implements C275384q4 {
    public List A00;

    public final List CHj() {
        List list = this.A00;
        if (list == null) {
            return A08(3365, ImmutablePandoProductTagDict.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CK7, X.4q4] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, AnonymousClass91F.A00(this));
    }

    public final C275384q4 E7O(1E9 r4) {
        ArrayList arrayList;
        List<ProductTagDictIntf> CHj = CHj();
        if (CHj != null) {
            arrayList = AnonymousClass7TG.A0r(CHj);
            for (ProductTagDictIntf productTagDictIntf : CHj) {
                productTagDictIntf.EA4(r4);
                arrayList.add(productTagDictIntf);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    public final C275374q3 F38(1E9 r4) {
        ArrayList arrayList;
        List<ProductTagDictIntf> CHj = CHj();
        if (CHj != null) {
            arrayList = AnonymousClass7TG.A0r(CHj);
            for (ProductTagDictIntf FFM : CHj) {
                arrayList.add(FFM.FFM(r4));
            }
        } else {
            arrayList = null;
        }
        return new C275374q3(arrayList);
    }

    public final C275374q3 F39(1E6 r2) {
        return F38(C41846B3n.A0S(r2));
    }
}
