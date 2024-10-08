package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;

/* renamed from: X.56L  reason: invalid class name */
public final class AnonymousClass56L extends AnonymousClass0T0 implements C257743xt {
    public final IGFormatLiquidityUseCaseEnum A00;

    public final AnonymousClass56L F4C() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass56L) && this.A00 == ((AnonymousClass56L) obj).A00);
    }

    public final int hashCode() {
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum = this.A00;
        if (iGFormatLiquidityUseCaseEnum == null) {
            return 0;
        }
        return iGFormatLiquidityUseCaseEnum.hashCode();
    }

    public final IGFormatLiquidityUseCaseEnum B7T() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGFormatLiquidityAdsInfoDict", C44179CYs.A00(this));
    }

    public AnonymousClass56L(IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum) {
        this.A00 = iGFormatLiquidityUseCaseEnum;
    }
}
