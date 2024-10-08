package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.api.schemas.MoreInfoStickerCTAType;
import com.instagram.api.schemas.MoreInfoTextStyle;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsRatingInfo;
import java.util.ArrayList;
import java.util.List;

public final class CMR extends 17P implements C270854hQ {
    public final AdsRatingInfoIntf Aa4() {
        return (AdsRatingInfoIntf) A05(-398367627, ImmutablePandoAdsRatingInfo.class);
    }

    public final MoreInfoStickerCTAType AtM() {
        return (MoreInfoStickerCTAType) A0N(-1670881216, DLI.A00);
    }

    public final C275704rk B3b() {
        return (C275704rk) A05(497541391, CMP.class);
    }

    public final MoreInfoType BUD() {
        return (MoreInfoType) A0N(-1304465471, DLJ.A00);
    }

    public final MoreInfoProductTagType BgU() {
        return (MoreInfoProductTagType) A0N(1873197583, DLK.A00);
    }

    public final List C2F() {
        return A08(-2070343296, CMS.class);
    }

    public final MoreInfoSUGPositionType C2j() {
        return (MoreInfoSUGPositionType) A0N(-52999709, DLL.A00);
    }

    public final MoreInfoTextStyle C5h() {
        return (MoreInfoTextStyle) A0N(-2100400097, DLM.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.4hQ, X.CMR] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44219Cag.A00(this));
    }

    public final String AyB() {
        return A0i(1775846958);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMR] */
    public final Boolean BDH() {
        return getOptionalBooleanValueByHashCode(-1773577784);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMR] */
    public final Integer CD7() {
        return getOptionalIntValueByHashCode(-168190952);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CMR] */
    public final Boolean CVd() {
        return getOptionalBooleanValueByHashCode(296405837);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.facebook.pando.TreeJNI, X.17P, X.CMR] */
    public final AnonymousClass4hP F6Q() {
        AdsRatingInfo adsRatingInfo;
        C275694rj r2;
        AdsRatingInfoIntf Aa4 = Aa4();
        ArrayList arrayList = null;
        if (Aa4 != null) {
            adsRatingInfo = Aa4.FGh();
        } else {
            adsRatingInfo = null;
        }
        MoreInfoStickerCTAType AtM = AtM();
        String A0i = A0i(1775846958);
        C275704rk B3b = B3b();
        if (B3b != null) {
            r2 = B3b.F6P();
        } else {
            r2 = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1773577784);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(296405837);
        MoreInfoType BUD = BUD();
        MoreInfoProductTagType BgU = BgU();
        List<C46253DSi> C2F = C2F();
        if (C2F != null) {
            arrayList = AnonymousClass7TG.A0r(C2F);
            for (C46253DSi F6R : C2F) {
                arrayList.add(F6R.F6R());
            }
        }
        return new AnonymousClass4hP(r2, BgU, C2j(), AtM, C5h(), BUD, adsRatingInfo, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, getOptionalIntValueByHashCode(-168190952), A0i, arrayList);
    }
}
