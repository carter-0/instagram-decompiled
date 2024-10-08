package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class COO extends 17P implements C258223yf {
    public List A00;

    public final List BxP() {
        return A08(-688652874, C54427HCw.class);
    }

    public final List BxQ() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'socialContextFacepileUsers' field.");
    }

    public final List BxU() {
        return A08(-1263111006, COP.class);
    }

    public final SocialContextType BxW() {
        return (SocialContextType) A0M(1882641244, C46089DLu.A00);
    }

    public final C258223yf E8E(1E9 r4) {
        List A0o = A0o(378965114, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r4, A0r, it);
        }
        this.A00 = A0r;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COO, X.3yf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4R.A00(this));
    }

    public final String BxR() {
        return A0i(985509442);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.pando.TreeJNI, X.COO, X.17P] */
    public final C258213ye F99(1E9 r8) {
        ArrayList arrayList;
        List<C258203yd> BxP = BxP();
        ArrayList arrayList2 = null;
        if (BxP != null) {
            arrayList = AnonymousClass7TF.A0p(BxP);
            for (C258203yd F98 : BxP) {
                arrayList.add(F98.F98());
            }
        } else {
            arrayList = null;
        }
        List A0o = A0o(378965114, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r8, A0r, it);
        }
        ArrayList A0p = AnonymousClass7TF.A0p(A0r);
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            C41847B3o.A1Q(r8, A0p, it2);
        }
        String A0i = A0i(985509442);
        List<C2608647i> BxU = BxU();
        if (BxU != null) {
            arrayList2 = AnonymousClass7TF.A0p(BxU);
            for (C2608647i F9B : BxU) {
                arrayList2.add(F9B.F9B());
            }
        }
        return new C258213ye(BxW(), A0i, arrayList, A0p, arrayList2, getIntValueByHashCode(567070134));
    }

    public final C258213ye F9A(1E6 r2) {
        return F99(C41846B3n.A0S(r2));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COO] */
    public final int getSocialContextUsersCount() {
        return getIntValueByHashCode(567070134);
    }
}
