package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.B5l  reason: case insensitive filesystem */
public final class C41890B5l extends 17P implements C65531dc {
    public List A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.1dc, X.B5l] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4E.A00(this));
    }

    public final List getItems() {
        List list = this.A00;
        if (list == null) {
            return A08(100526016, CM5.class);
        }
        return list;
    }

    public final C65531dc E7Y(1E9 r4) {
        ArrayList arrayList;
        List<C2809354u> items = getItems();
        if (items != null) {
            arrayList = AnonymousClass7TG.A0r(items);
            for (C2809354u r0 : items) {
                r0.E7X(r4);
                arrayList.add(r0);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    public final 1da F5t(1E9 r4) {
        ArrayList arrayList;
        List<C2809354u> items = getItems();
        if (items != null) {
            arrayList = new ArrayList(0Yv.A1E(items, 10));
            for (C2809354u F5s : items) {
                arrayList.add(F5s.F5s(r4));
            }
        } else {
            arrayList = null;
        }
        return new 1da(arrayList);
    }

    public final 1da F5u(1E6 r2) {
        return F5t(C41846B3n.A0S(r2));
    }
}
