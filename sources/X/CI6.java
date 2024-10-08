package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CI6 extends 17P implements DU2 {
    public User A00;
    public List A01;

    public final User ByI() {
        return this.A00;
    }

    public final List ByP() {
        return this.A01;
    }

    public final DU2 E73(1E9 r4) {
        ArrayList arrayList;
        this.A00 = C41848B3p.A1B(r4, this, -1998892262);
        ImmutableList A08 = A08(-1836117863, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CI6, X.DU2] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44070CUn.A00(this));
    }

    public final C61096Jx7 F0l(1E9 r7) {
        User user;
        String A0h = A0h(-1938933922);
        Class<ImmutablePandoUserDict> cls = ImmutablePandoUserDict.class;
        User A1B = C41848B3p.A1B(r7, this, -1998892262);
        ArrayList arrayList = null;
        if (A1B != null) {
            user = C41846B3n.A0b(r7, A1B);
        } else {
            user = null;
        }
        ImmutableList A08 = A08(-1836117863, cls);
        if (A08 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r7, A0r, it);
            }
            if (A0r != null) {
                arrayList = AnonymousClass7TG.A0r(A0r);
                Iterator it2 = A0r.iterator();
                while (it2.hasNext()) {
                    C41847B3o.A1Q(r7, arrayList, it2);
                }
            }
        }
        return new C61096Jx7(user, A0h, arrayList);
    }

    public final C61096Jx7 F0m(1E6 r2) {
        return F0l(C41846B3n.A0S(r2));
    }

    public final String getAccessToken() {
        return A0h(-1938933922);
    }
}
