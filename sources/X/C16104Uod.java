package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uod  reason: case insensitive filesystem */
public final class C16104Uod extends 17P implements C21036XAp {
    public final C21024XAd Aeh() {
        return (C21024XAd) A05(-1332194002, C16101Uoa.class);
    }

    public final List BSk() {
        return A08(-1941674320, C16109Uoi.class);
    }

    public final XAX C6r() {
        return (XAX) A05(1330532588, C16110Uoj.class);
    }

    public final C21032XAl C7f() {
        return (C21032XAl) A05(110371416, C16109Uoi.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.Uod, X.XAp] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C16832V7n.A00(this), this);
    }

    public final String BsT() {
        return A0i(189658505);
    }

    public final UNI F6f() {
        UNF unf;
        ArrayList arrayList;
        UNO uno;
        C21024XAd Aeh = Aeh();
        UNN unn = null;
        if (Aeh != null) {
            unf = Aeh.F6d();
        } else {
            unf = null;
        }
        String A0T = A0T();
        List<C21032XAl> BSk = BSk();
        if (BSk != null) {
            arrayList = AnonymousClass7TG.A0r(BSk);
            for (C21032XAl F6k : BSk) {
                arrayList.add(F6k.F6k());
            }
        } else {
            arrayList = null;
        }
        String A0i = A0i(189658505);
        String A0p = C41845B3m.A0p(this);
        XAX C6r = C6r();
        if (C6r != null) {
            uno = C6r.F6l();
        } else {
            uno = null;
        }
        C21032XAl C7f = C7f();
        if (C7f != null) {
            unn = C7f.F6k();
        }
        return new UNI(unf, unn, uno, A0T, A0i, A0p, arrayList);
    }

    public final String getDescription() {
        return A0T();
    }

    public final String getTextColor() {
        return C41845B3m.A0p(this);
    }
}
