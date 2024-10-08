package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CRb  reason: case insensitive filesystem */
public final class C44019CRb extends 17P implements C46313DUq {
    public 1Xj A00;
    public List A01;

    public final List BH8() {
        List list = this.A01;
        if (list == null) {
            return A08(-1398380940, CRi.class);
        }
        return list;
    }

    public final 1Xj Bke() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRb, X.DUq] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44878CmU.A00(this));
    }

    public final String BCi() {
        return A0i(1184148383);
    }

    public final String BFr() {
        return A0i(-257602966);
    }

    public final String C2C() {
        return A0i(-1323727521);
    }

    public final String C4Z() {
        return A0h(1769642752);
    }

    public final C46313DUq E9t(1E9 r4) {
        ArrayList arrayList;
        List<AnonymousClass3UK> BH8 = BH8();
        if (BH8 != null) {
            arrayList = AnonymousClass7TG.A0r(BH8);
            for (AnonymousClass3UK r0 : BH8) {
                r0.E9x(r4);
                arrayList.add(r0);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        this.A00 = C41847B3o.A0u(r4, this, -1629677032);
        return this;
    }

    public final C42125BId FEk(1E9 r9) {
        ArrayList arrayList;
        String A0i = A0i(1184148383);
        String A0i2 = A0i(-257602966);
        List<AnonymousClass3UK> BH8 = BH8();
        1Xj r2 = null;
        if (BH8 != null) {
            arrayList = AnonymousClass7TG.A0r(BH8);
            for (AnonymousClass3UK FEu : BH8) {
                arrayList.add(FEu.FEu(r9));
            }
        } else {
            arrayList = null;
        }
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A05(-1629677032, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            1Xv r0 = 1Xj.A0h;
            1Xj A002 = 1Xv.A00(r9, immutablePandoMediaDict);
            if (A002 != null) {
                r2 = C41846B3n.A0Y(r9, A002);
            }
        }
        return new C42125BId(r2, A0i, A0i2, A0i(-1323727521), A0h(1769642752), arrayList);
    }

    public final C42125BId FEl(1E6 r2) {
        return FEk(C41847B3o.A0q(r2));
    }
}
