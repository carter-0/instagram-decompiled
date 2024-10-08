package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class CPV extends 17P implements DUS {
    public List A00;

    public final List Bal() {
        List list = this.A00;
        if (list == null) {
            return A08(-1979713632, CPU.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUS, X.CPV] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44431Cep.A00(this));
    }

    public final String BP8() {
        return A0i(-1081138730);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPV] */
    public final Boolean BU7() {
        return getOptionalBooleanValueByHashCode(1024940639);
    }

    public final String Biw() {
        return A0j(659010373);
    }

    public final DUS E8y(1E9 r4) {
        ArrayList arrayList;
        List<DUC> Bal = Bal();
        if (Bal != null) {
            arrayList = AnonymousClass7TG.A0r(Bal);
            for (DUC duc : Bal) {
                duc.E8x(r4);
                arrayList.add(duc);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CPV] */
    public final BHD FB3(1E9 r6) {
        ArrayList arrayList;
        String A0i = A0i(-1081138730);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1024940639);
        List<DUC> Bal = Bal();
        if (Bal != null) {
            arrayList = AnonymousClass7TG.A0r(Bal);
            for (DUC FB1 : Bal) {
                arrayList.add(FB1.FB1(r6));
            }
        } else {
            arrayList = null;
        }
        return new BHD(optionalBooleanValueByHashCode, A0i, A0j(659010373), arrayList);
    }

    public final BHD FB4(1E6 r2) {
        return FB3(C41846B3n.A0S(r2));
    }
}
