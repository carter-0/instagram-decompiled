package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CIZ extends 17P implements C239783Id {
    public final List BG8() {
        ImmutableList A08 = A08(-1787408664, AnonymousClass9GA.class);
        if (A08 == null) {
            return null;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A08);
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            AnonymousClass9GA r1 = (AnonymousClass9GA) it.next();
            0qQ.A0A(r1);
            A0r.add(new ExtendedImageUrl(r1));
        }
        return A0r;
    }

    public final List CE3() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CIZ, com.facebook.pando.TreeJNI, X.3Id] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CVU.A00(this));
    }

    public final List BPh() {
        return A08(103772132, CM1.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CIZ, com.facebook.pando.TreeJNI] */
    public final Integer CDj() {
        return getOptionalIntValueByHashCode(351608024);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.CIZ, com.facebook.pando.TreeJNI, X.17P] */
    public final C239773Ic F1N(1E9 r8) {
        ArrayList arrayList;
        List BG8 = BG8();
        List<C46251DSg> BPh = BPh();
        ArrayList arrayList2 = null;
        if (BPh != null) {
            arrayList = AnonymousClass7TF.A0p(BPh);
            for (C46251DSg F5o : BPh) {
                arrayList.add(F5o.F5o(r8));
            }
        } else {
            arrayList = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(351608024);
        ImmutableList A08 = A08(1375134216, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            ArrayList A0p = AnonymousClass7TF.A0p(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r8, A0p, it);
            }
            arrayList2 = AnonymousClass7TF.A0p(A0p);
            Iterator it2 = A0p.iterator();
            while (it2.hasNext()) {
                C41848B3p.A1V(r8, arrayList2, it2);
            }
        }
        return new C239773Ic(optionalIntValueByHashCode, BG8, arrayList, arrayList2);
    }
}
