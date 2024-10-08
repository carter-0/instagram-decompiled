package com.instagram.sponsored.signals.model;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C45104CqM;
import X.C46168DOv;
import X.C46169DOw;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import java.util.List;

public final class ImmutablePandoAdsRatingInfo extends 17P implements AdsRatingInfoIntf {
    public static final C3035269k CREATOR = CTA.A00(79);

    public final AdsRatingAndReviewDisplayFormat BjS() {
        return (AdsRatingAndReviewDisplayFormat) A0N(364443985, C46168DOv.A00);
    }

    public final List BjU() {
        return A0p(-1057513340, C46169DOw.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.AdsRatingInfoIntf, com.instagram.sponsored.signals.model.ImmutablePandoAdsRatingInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45104CqM.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AyC() {
        return A0i(1615269514);
    }

    public final Float BjZ() {
        return A0K(-316741264);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.ImmutablePandoAdsRatingInfo] */
    public final Integer BoI() {
        return getOptionalIntValueByHashCode(-807286424);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.ImmutablePandoAdsRatingInfo] */
    public final Boolean CUs() {
        return getOptionalBooleanValueByHashCode(-1588561853);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.sponsored.signals.model.ImmutablePandoAdsRatingInfo] */
    public final AdsRatingInfo FGh() {
        String A0i = A0i(1615269514);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1588561853);
        return new AdsRatingInfo(BjS(), optionalBooleanValueByHashCode, A0K(-316741264), getOptionalIntValueByHashCode(-807286424), A0i, BjU());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.ImmutablePandoAdsRatingInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
