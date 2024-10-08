package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CRG extends 17P implements C46314DUr {
    public DUO A00;
    public List A01;

    public final List Bf5() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'previewMedias' field.");
    }

    public final DUO Bhn() {
        DUO duo = this.A00;
        if (duo == null) {
            return (DUO) A05(1633979813, CM9.class);
        }
        return duo;
    }

    public final C46314DUr E9m(1E9 r4) {
        List A0o = A0o(232478054, ImmutablePandoMediaDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41848B3p.A1T(r4, A0r, it);
        }
        this.A01 = A0r;
        DUO Bhn = Bhn();
        if (Bhn != null) {
            Bhn.E7Z(r4);
        } else {
            Bhn = null;
        }
        this.A00 = Bhn;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUr, X.CRG] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44747CkG.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRG] */
    public final int AdF() {
        return getIntValueByHashCode(975628804);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRG] */
    public final List AqJ() {
        return getOptionalStringListByHashCode(1186418019);
    }

    public final Long B2n() {
        return A0L(31792438);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRG] */
    public final int BPs() {
        return getIntValueByHashCode(-9393932);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRG] */
    public final int C1Y() {
        return getIntValueByHashCode(1416817934);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CRG] */
    public final BIS FED(1E9 r10) {
        BFT bft;
        int intValueByHashCode = getIntValueByHashCode(975628804);
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(1186418019);
        Long A0L = A0L(31792438);
        int intValueByHashCode2 = getIntValueByHashCode(-9393932);
        List A0o = A0o(232478054, ImmutablePandoMediaDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41848B3p.A1T(r10, A0r, it);
        }
        ArrayList A0r2 = AnonymousClass7TG.A0r(A0r);
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            C41848B3p.A1V(r10, A0r2, it2);
        }
        DUO Bhn = Bhn();
        if (Bhn != null) {
            bft = Bhn.F5y(r10);
        } else {
            bft = null;
        }
        return new BIS(bft, A0L, optionalStringListByHashCode, A0r2, intValueByHashCode, intValueByHashCode2, getIntValueByHashCode(1416817934));
    }

    public final BIS FEE(1E6 r2) {
        return FED(C41846B3n.A0S(r2));
    }
}
