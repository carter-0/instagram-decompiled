package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

public final class CR3 extends 17P implements C267284bJ {
    public User A00;

    public final User CCd() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'user' field.");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CR3, com.facebook.pando.TreeJNI, X.4bJ] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41877B4v.A00(this));
    }

    public final String getPk() {
        return A0k(3579);
    }

    public final String B7i() {
        return A0i(-811800516);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CR3, com.facebook.pando.TreeJNI] */
    public final Boolean BP3() {
        return getOptionalBooleanValueByHashCode(-98602216);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CR3, com.facebook.pando.TreeJNI] */
    public final Integer BWT() {
        return getOptionalIntValueByHashCode(546409413);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CR3, com.facebook.pando.TreeJNI] */
    public final Integer Bfn() {
        return getOptionalIntValueByHashCode(1837239699);
    }

    public final List BwG() {
        return A0m(1501522776);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CR3, com.facebook.pando.TreeJNI] */
    public final Boolean CWC() {
        return getOptionalBooleanValueByHashCode(-1428701633);
    }

    public final C267284bJ E9c(1E9 r2) {
        this.A00 = C41846B3n.A0c(r2, this, 3599307);
        return this;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.CR3, com.facebook.pando.TreeJNI, X.17P] */
    public final C267274bI FDr(1E9 r13) {
        String A0i = A0i(-811800516);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1428701633);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-517184853);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-98602216);
        String A0a = A0a();
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(546409413);
        String A0k = A0k(3579);
        return new C267274bI(C41847B3o.A0r(r13, this, 3599307), optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalIntValueByHashCode, getOptionalIntValueByHashCode(1837239699), A0i, A0a, A0k, A0i(1014577290), A0m(1501522776), booleanValueByHashCode);
    }

    public final String getMediaType() {
        return A0a();
    }

    public final String getProductType() {
        return A0i(1014577290);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CR3, com.facebook.pando.TreeJNI] */
    public final boolean isPivotPageAvailable() {
        return getBooleanValueByHashCode(-517184853);
    }
}
