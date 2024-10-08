package com.instagram.sponsored.signals.model;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C45103CqL;
import X.C46167DOu;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ImmutablePandoAdsIAWRatingInfo extends 17P implements AdsIAWRatingInfoIntf {
    public static final C3035269k CREATOR = CTA.A00(78);

    public final List BjU() {
        return A0p(-1057513340, C46167DOu.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf, com.instagram.sponsored.signals.model.ImmutablePandoAdsIAWRatingInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C45103CqL.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AfA() {
        return A0i(-1218051907);
    }

    public final Float BjZ() {
        return A0K(-316741264);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.ImmutablePandoAdsIAWRatingInfo] */
    public final Integer BoI() {
        return getOptionalIntValueByHashCode(-807286424);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.ImmutablePandoAdsIAWRatingInfo] */
    public final Boolean CRN() {
        return getOptionalBooleanValueByHashCode(414389290);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.ImmutablePandoAdsIAWRatingInfo, X.17P] */
    public final AdsIAWRatingInfo FGg() {
        String A0i = A0i(-1218051907);
        return new AdsIAWRatingInfo(getOptionalBooleanValueByHashCode(414389290), A0K(-316741264), getOptionalIntValueByHashCode(-807286424), A0i, BjU());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.sponsored.signals.model.ImmutablePandoAdsIAWRatingInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
