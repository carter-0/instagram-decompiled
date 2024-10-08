package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class CSP extends 17P implements C46319DUw {
    public User A00;

    public final User BRo() {
        return this.A00;
    }

    public final List Bzq() {
        return A08(1531715286, C43991CPg.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CSP, X.DUw] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44946Cng.A00(this));
    }

    public final String C5C() {
        return A0i(-1064897719);
    }

    public final String CDo() {
        return A0i(1595179052);
    }

    public final C46319DUw EAE(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, -505296440);
        return this;
    }

    public final C42133BIn FFu(1E9 r11) {
        User user;
        String A0e = A0e();
        String A0f = A0f();
        User A1B = C41848B3p.A1B(r11, this, -505296440);
        ArrayList arrayList = null;
        if (A1B != null) {
            user = C41846B3n.A0b(r11, A1B);
        } else {
            user = null;
        }
        List<DS9> Bzq = Bzq();
        if (Bzq != null) {
            arrayList = AnonymousClass7TG.A0r(Bzq);
            for (DS9 FBO : Bzq) {
                arrayList.add(FBO.FBO());
            }
        }
        return new C42133BIn(user, A0e, A0f, A0X(), A0i(-1064897719), C41845B3m.A0n(this), A0i(1595179052), arrayList);
    }

    public final C42133BIn FFv(1E6 r2) {
        return FFu(C41847B3o.A0p());
    }

    public final String getId() {
        return A0e();
    }

    public final String getMediaId() {
        return A0f();
    }

    public final String getText() {
        return A0X();
    }

    public final String getUserId() {
        return C41845B3m.A0n(this);
    }
}
