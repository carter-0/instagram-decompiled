package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class Up5 extends 17P implements XAS {
    public final C21024XAd Aeh() {
        return (C21024XAd) A05(-1332194002, C16101Uoa.class);
    }

    public final List ApR() {
        return A08(-602415628, C16102Uob.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.Up5, X.XAS] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C16847V8c.A00(this), this);
    }

    public final C15068UNl FDV() {
        UNF unf;
        C21024XAd Aeh = Aeh();
        ArrayList arrayList = null;
        if (Aeh != null) {
            unf = Aeh.F6d();
        } else {
            unf = null;
        }
        List<C21030XAj> ApR = ApR();
        if (ApR != null) {
            arrayList = AnonymousClass7TG.A0r(ApR);
            for (C21030XAj F6e : ApR) {
                arrayList.add(F6e.F6e());
            }
        }
        return new C15068UNl(unf, arrayList);
    }
}
