package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class CNg extends 17P implements AnonymousClass3IU {
    public List A00;

    public final Long BEY() {
        return A0L(3355);
    }

    public final List C9t() {
        List list = this.A00;
        if (list == null) {
            return A08(-16393611, C43996CPs.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.3IU, X.CNg] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44290CcY.A00(this));
    }

    public final String AYU() {
        return A0i(1583739286);
    }

    public final String Aum() {
        return A0i(-1349119146);
    }

    public final String BVq() {
        return A0i(-1594628439);
    }

    public final String BVt() {
        return A0i(-1852539703);
    }

    public final String C9L() {
        return C41847B3o.A1B(this);
    }

    public final Long CAg() {
        return A0L(3575610);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CNg] */
    public final Boolean Cc8() {
        return getOptionalBooleanValueByHashCode(-722325276);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CNg] */
    public final Boolean Cdn() {
        return getOptionalBooleanValueByHashCode(-1947593954);
    }

    public final AnonymousClass3IU E83(1E9 r4) {
        ArrayList arrayList;
        List<DUU> C9t = C9t();
        if (C9t != null) {
            arrayList = AnonymousClass7TG.A0r(C9t);
            for (DUU duu : C9t) {
                duu.E9B(r4);
                arrayList.add(duu);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.facebook.pando.TreeJNI, X.CNg, X.17P] */
    public final AnonymousClass3IT F8I(1E9 r13) {
        ArrayList arrayList;
        String A0i = A0i(1583739286);
        String A0i2 = A0i(-1349119146);
        Long A0L = A0L(3355);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-722325276);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1947593954);
        String A0i3 = A0i(-1594628439);
        String A0i4 = A0i(-1852539703);
        String A1B = C41847B3o.A1B(this);
        List<DUU> C9t = C9t();
        if (C9t != null) {
            arrayList = AnonymousClass7TG.A0r(C9t);
            for (DUU FBo : C9t) {
                arrayList.add(FBo.FBo(r13));
            }
        } else {
            arrayList = null;
        }
        return new AnonymousClass3IT(optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, A0L, A0L(3575610), A0i, A0i2, A0i3, A0i4, A1B, arrayList);
    }
}
