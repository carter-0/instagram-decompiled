package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CRc  reason: case insensitive filesystem */
public final class C44020CRc extends 17P implements C239723Ht {
    public List A00;

    public final List B0x() {
        List list = this.A00;
        if (list == null) {
            return A08(455263097, C44019CRb.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CRc, com.facebook.pando.TreeJNI, X.3Ht] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44880CmW.A00(this));
    }

    public final C239723Ht E9u(1E9 r4) {
        ArrayList arrayList;
        List<C46313DUq> B0x = B0x();
        if (B0x != null) {
            arrayList = AnonymousClass7TG.A0r(B0x);
            for (C46313DUq dUq : B0x) {
                dUq.E9t(r4);
                arrayList.add(dUq);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    public final C239713Hs FEm(1E9 r4) {
        ArrayList arrayList;
        List<C46313DUq> B0x = B0x();
        if (B0x != null) {
            arrayList = AnonymousClass7TG.A0r(B0x);
            for (C46313DUq FEk : B0x) {
                arrayList.add(FEk.FEk(r4));
            }
        } else {
            arrayList = null;
        }
        return new C239713Hs(arrayList);
    }
}
