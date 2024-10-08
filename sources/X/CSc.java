package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class CSc extends 17P implements C46295DTy {
    public List A00;

    public final List AyX() {
        List list = this.A00;
        if (list == null) {
            return A08(1550150433, CSb.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSc, X.DTy] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44976CoF.A00(this));
    }

    public final String BP8() {
        return A0i(-1081138730);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSc] */
    public final Boolean BU7() {
        return getOptionalBooleanValueByHashCode(1024940639);
    }

    public final C46295DTy EAK(1E9 r4) {
        ArrayList arrayList;
        List<C46294DTx> AyX = AyX();
        if (AyX != null) {
            arrayList = AnonymousClass7TG.A0r(AyX);
            for (C46294DTx dTx : AyX) {
                dTx.EAJ(r4);
                arrayList.add(dTx);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.CSc, X.17P] */
    public final C42136BIr FGG(1E9 r5) {
        ArrayList arrayList;
        List<C46294DTx> AyX = AyX();
        if (AyX != null) {
            arrayList = AnonymousClass7TG.A0r(AyX);
            for (C46294DTx FGF : AyX) {
                arrayList.add(FGF.FGF(r5));
            }
        } else {
            arrayList = null;
        }
        return new C42136BIr(getOptionalBooleanValueByHashCode(1024940639), A0i(-1081138730), arrayList);
    }
}
