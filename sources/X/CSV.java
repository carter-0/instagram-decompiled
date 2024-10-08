package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class CSV extends 17P implements AnonymousClass3I2 {
    public final List At0() {
        return A08(-1362760786, CSU.class);
    }

    public final List BNf() {
        return A08(-997533735, CSU.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.3I2, X.CSV] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B51.A00(this));
    }

    public final List BSa() {
        return A0n(-450145922);
    }

    public final AnonymousClass3I1 FG3() {
        ArrayList arrayList;
        List<C250463lU> At0 = At0();
        ArrayList arrayList2 = null;
        if (At0 != null) {
            arrayList = AnonymousClass7TF.A0p(At0);
            for (C250463lU FG1 : At0) {
                arrayList.add(FG1.FG1());
            }
        } else {
            arrayList = null;
        }
        List<C250463lU> BNf = BNf();
        if (BNf != null) {
            arrayList2 = AnonymousClass7TF.A0p(BNf);
            for (C250463lU FG12 : BNf) {
                arrayList2.add(FG12.FG1());
            }
        }
        return new AnonymousClass3I1(arrayList, arrayList2, A0n(-450145922));
    }
}
