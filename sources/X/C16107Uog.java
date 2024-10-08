package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uog  reason: case insensitive filesystem */
public final class C16107Uog extends 17P implements C21025XAe {
    public final XAQ Abh() {
        return (XAQ) A05(1118509956, C16106Uof.class);
    }

    public final C21024XAd Aeh() {
        return (C21024XAd) A05(-1332194002, C16101Uoa.class);
    }

    public final XAP Af0() {
        return (XAP) A05(93494179, C16100UoZ.class);
    }

    public final List BcE() {
        return A08(-989034367, C16105Uoe.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.XAe, X.Uog] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C16837V7s.A00(this), this);
    }

    public final UNL F6h() {
        UNK unk;
        UNF unf;
        UNE une;
        XAQ Abh = Abh();
        ArrayList arrayList = null;
        if (Abh != null) {
            unk = Abh.F6g();
        } else {
            unk = null;
        }
        C21024XAd Aeh = Aeh();
        if (Aeh != null) {
            unf = Aeh.F6d();
        } else {
            unf = null;
        }
        XAP Af0 = Af0();
        if (Af0 != null) {
            une = Af0.F6b();
        } else {
            une = null;
        }
        List<C21035XAo> BcE = BcE();
        if (BcE != null) {
            arrayList = AnonymousClass7TG.A0r(BcE);
            for (C21035XAo F6i : BcE) {
                arrayList.add(F6i.F6i());
            }
        }
        return new UNL(une, unf, unk, arrayList);
    }
}
