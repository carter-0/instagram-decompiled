package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.User;
import java.util.List;

public final class CRn extends 17P implements DUX {
    public User A00;

    public final C66565MWt At9() {
        return (C66565MWt) A04(98832, C62004KVb.class);
    }

    public final User BRo() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'merchant' field.");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRn, X.DUX] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44898Cmo.A00(this));
    }

    public final Long AZ3() {
        return A0L(92655287);
    }

    public final String BRq() {
        return A0h(-353887541);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRn] */
    public final List BgG() {
        ImmutableList stringListByHashCode = getStringListByHashCode(-1311504744);
        0qQ.A07(stringListByHashCode);
        return stringListByHashCode;
    }

    public final DUX EA0(1E9 r2) {
        this.A00 = C41846B3n.A0c(r2, this, -505296440);
        return this;
    }

    public final C42127BIf FEz(1E9 r7) {
        return new C42127BIf(At9().FF0(), C41847B3o.A0r(r7, this, -505296440), A0L(92655287), A0h(-353887541), BgG());
    }
}
