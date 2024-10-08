package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class Up2 extends 17P implements C274454oN {
    public List A00;

    public final List B80() {
        List list = this.A00;
        if (list == null) {
            return A08(381249571, Up1.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4oN, com.facebook.pando.TreeJNI, X.Up2] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(V8W.A00(this), this);
    }

    public final C274454oN E9P(1E9 r4) {
        ArrayList arrayList;
        List<C21037XAq> B80 = B80();
        if (B80 != null) {
            arrayList = AnonymousClass7TG.A0r(B80);
            for (C21037XAq xAq : B80) {
                xAq.E9O(r4);
                arrayList.add(xAq);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    public final C15066UNj FCY(1E9 r4) {
        ArrayList arrayList;
        List<C21037XAq> B80 = B80();
        if (B80 != null) {
            arrayList = AnonymousClass7TG.A0r(B80);
            for (C21037XAq FCW : B80) {
                arrayList.add(FCW.FCW(r4));
            }
        } else {
            arrayList = null;
        }
        return new C15066UNj(arrayList);
    }

    public final C15066UNj FCZ(1E6 r2) {
        return FCY(C41847B3o.A0q(r2));
    }
}
