package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CPe  reason: case insensitive filesystem */
public final class C43990CPe extends 17P implements C46301DUe {
    public List A00;

    public final List CG0() {
        List list = this.A00;
        if (list == null) {
            return A08(-810660181, CSm.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.DUe, com.facebook.pando.TreeJNI, X.CPe] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44442Cf0.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPe] */
    public final Integer BLb() {
        return getOptionalIntValueByHashCode(-651789604);
    }

    public final String BP8() {
        return A0i(-1081138730);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPe] */
    public final Boolean BU7() {
        return getOptionalBooleanValueByHashCode(1024940639);
    }

    public final C46301DUe E95(1E9 r4) {
        ArrayList arrayList;
        List<C46296DTz> CG0 = CG0();
        if (CG0 != null) {
            arrayList = AnonymousClass7TG.A0r(CG0);
            for (C46296DTz dTz : CG0) {
                dTz.EAS(r4);
                arrayList.add(dTz);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CPe] */
    public final BHL FBK(1E9 r8) {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-651789604);
        String A0i = A0i(-1081138730);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1024940639);
        String A0j = A0j(-795590343);
        List<C46296DTz> CG0 = CG0();
        if (CG0 != null) {
            arrayList = AnonymousClass7TG.A0r(CG0);
            for (C46296DTz FGU : CG0) {
                arrayList.add(FGU.FGU(r8));
            }
        } else {
            arrayList = null;
        }
        return new BHL(optionalBooleanValueByHashCode, optionalIntValueByHashCode, A0i, A0j, arrayList);
    }

    public final BHL FBL(1E6 r2) {
        return FBK(C41846B3n.A0S(r2));
    }

    public final String getSliderId() {
        return A0j(-795590343);
    }
}
