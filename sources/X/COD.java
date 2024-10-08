package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.media.ImmutablePandoMediaDict;

public final class COD extends 17P implements AnonymousClass3II {
    public DU7 A00;
    public 1Xj A01;

    public final DU7 ApN() {
        DU7 du7 = this.A00;
        if (du7 == null) {
            return (DU7) A05(-943461556, CJD.class);
        }
        return du7;
    }

    public final Long BEY() {
        return A0L(3355);
    }

    public final 1Xj BPf() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3II, com.facebook.pando.TreeJNI, X.COD] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44341CdN.A00(this));
    }

    public final String BVq() {
        return A0i(-1594628439);
    }

    public final String C9L() {
        return C41847B3o.A1B(this);
    }

    public final AnonymousClass3II E8A(1E9 r2) {
        DU7 ApN = ApN();
        if (ApN != null) {
            ApN.E7E(r2);
        } else {
            ApN = null;
        }
        this.A00 = ApN;
        this.A01 = C41847B3o.A0u(r2, this, 103772132);
        return this;
    }

    public final AnonymousClass3IH F8w(1E9 r11) {
        BEO beo;
        DU7 ApN = ApN();
        1Xj r3 = null;
        if (ApN != null) {
            beo = ApN.F21(r11);
        } else {
            beo = null;
        }
        String A0i = A0i(-815905284);
        Long A0L = A0L(3355);
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A05(103772132, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            1Xv r0 = 1Xj.A0h;
            1Xj A002 = 1Xv.A00(r11, immutablePandoMediaDict);
            if (A002 != null) {
                r3 = C41846B3n.A0Y(r11, A002);
            }
        }
        return new AnonymousClass3IH(beo, r3, A0L, A0i, A0i(-1594628439), A0U(), A0Y(), C41847B3o.A1B(this));
    }

    public final String getCtaText() {
        return A0i(-815905284);
    }

    public final String getSubtitle() {
        return A0U();
    }

    public final String getTitle() {
        return A0Y();
    }
}
