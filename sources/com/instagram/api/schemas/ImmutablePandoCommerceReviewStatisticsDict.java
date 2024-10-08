package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CWD;
import X.DKQ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class ImmutablePandoCommerceReviewStatisticsDict extends 17P implements CommerceReviewStatisticsDictIntf {
    public static final C3035269k CREATOR = CTC.A00(41);

    public final List Bja() {
        return A0p(-316248257, DKQ.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.CommerceReviewStatisticsDictIntf, com.instagram.api.schemas.ImmutablePandoCommerceReviewStatisticsDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CWD.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Float Aeb() {
        return A0K(2031429119);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommerceReviewStatisticsDict] */
    public final Integer BoI() {
        return getOptionalIntValueByHashCode(-807286424);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommerceReviewStatisticsDict, X.17P] */
    public final CommerceReviewStatisticsDict F23() {
        return new CommerceReviewStatisticsDict(A0K(2031429119), getOptionalIntValueByHashCode(-807286424), Bja());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoCommerceReviewStatisticsDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
