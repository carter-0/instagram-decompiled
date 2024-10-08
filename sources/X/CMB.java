package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class CMB extends 17P implements DTI {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CMB] */
    public final ExtendedImageUrl BFv() {
        AnonymousClass9GA r1 = (AnonymousClass9GA) getTreeValueByHashCode(100313435, AnonymousClass9GA.class);
        if (r1 != null) {
            return new ExtendedImageUrl(r1);
        }
        return null;
    }

    public final 1Xj CDp() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMB, X.DTI] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CaJ.A00(this));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.CMB] */
    public final BFU F61(1E9 r4) {
        1Xj r1;
        ExtendedImageUrl BFv = BFv();
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) getTreeValueByHashCode(112202875, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            1Xv r0 = 1Xj.A0h;
            1Xj A00 = 1Xv.A00(r4, immutablePandoMediaDict);
            if (A00 != null) {
                r1 = C41846B3n.A0Y(r4, A00);
                return new BFU(r1, BFv);
            }
        }
        r1 = null;
        return new BFU(r1, BFv);
    }

    public final BFU F62(1E6 r2) {
        return F61(C41847B3o.A0q(r2));
    }
}
