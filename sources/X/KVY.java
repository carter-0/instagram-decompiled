package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.LiveUserPaySupportTier;

public final class KVY extends 17P implements C278104wH {
    public final IGLiveBadgeSettings Af4() {
        return (IGLiveBadgeSettings) A0N(759758260, MNU.A00);
    }

    public final C2816758y Bav() {
        return (C2816758y) A05(2016232121, KVZ.class);
    }

    public final LiveUserPaySupportTier CFE() {
        return (LiveUserPaySupportTier) A0N(1226226015, MNV.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.4wH, X.KVY] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C63021KqC.A00(this), this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.KVY] */
    public final Integer Af5() {
        return getOptionalIntValueByHashCode(-672601792);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.KVY] */
    public final Boolean BP6() {
        return getOptionalBooleanValueByHashCode(-802404186);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, X.KVY] */
    public final C278094wG F5a() {
        C2816658x r3;
        IGLiveBadgeSettings Af4 = Af4();
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-672601792);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-802404186);
        C2816758y Bav = Bav();
        if (Bav != null) {
            r3 = Bav.F5b();
        } else {
            r3 = null;
        }
        return new C278094wG(Af4, CFE(), r3, optionalBooleanValueByHashCode, optionalIntValueByHashCode);
    }
}
