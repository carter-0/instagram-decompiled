package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class CN5 extends 17P implements C46299DUc {
    public User A00;
    public List A01;

    public final List Ai9() {
        List list = this.A01;
        if (list == null) {
            return A08(1354444754, CIG.class);
        }
        return list;
    }

    public final User CCd() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DUc, X.CN5] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44243Cbe.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CN5] */
    public final Boolean AkR() {
        return getOptionalBooleanValueByHashCode(373873083);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CN5] */
    public final Boolean AkT() {
        return getOptionalBooleanValueByHashCode(-1482588131);
    }

    public final Float BLJ() {
        return A0K(74499224);
    }

    public final C46299DUc E7x(1E9 r4) {
        ArrayList arrayList;
        List<C239663Hm> Ai9 = Ai9();
        if (Ai9 != null) {
            arrayList = AnonymousClass7TG.A0r(Ai9);
            for (C239663Hm r0 : Ai9) {
                r0.E76(r4);
                arrayList.add(r0);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        this.A00 = C41847B3o.A0y(r4, this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CN5] */
    public final C42064BFr F7c(1E9 r9) {
        ArrayList arrayList;
        User A0b;
        List<C239663Hm> Ai9 = Ai9();
        User user = null;
        if (Ai9 != null) {
            arrayList = AnonymousClass7TG.A0r(Ai9);
            for (C239663Hm F0z : Ai9) {
                arrayList.add(F0z.F0z(r9));
            }
        } else {
            arrayList = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(373873083);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1482588131);
        Float A0K = A0K(74499224);
        String A0o = C41845B3m.A0o(this);
        ImmutablePandoUserDict A0Z = C41846B3n.A0Z(this);
        if (!(A0Z == null || (A0b = C41845B3m.A0b(r9, A0Z)) == null)) {
            user = C41846B3n.A0b(r9, A0b);
        }
        return new C42064BFr(user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, A0K, A0o, arrayList);
    }

    public final String getPk() {
        return C41845B3m.A0o(this);
    }
}
