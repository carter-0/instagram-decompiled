package com.instagram.model.shopping.productlaunchinformation;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44929CnM;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoProductLaunchInformation extends 17P implements ProductLaunchInformation {
    public static final C3035269k CREATOR = CTA.A00(54);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productlaunchinformation.ImmutablePandoProductLaunchInformation, com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44929CnM.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AzA() {
        return A0j(947334735);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productlaunchinformation.ImmutablePandoProductLaunchInformation] */
    public final Boolean BBR() {
        return getOptionalBooleanValueByHashCode(-111871081);
    }

    public final Long BLg() {
        return A0L(-230564678);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productlaunchinformation.ImmutablePandoProductLaunchInformation] */
    public final Boolean CUw() {
        return getOptionalBooleanValueByHashCode(-269940302);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productlaunchinformation.ImmutablePandoProductLaunchInformation, X.17P] */
    public final ProductLaunchInformationImpl FFd() {
        return new ProductLaunchInformationImpl(getOptionalBooleanValueByHashCode(-111871081), getOptionalBooleanValueByHashCode(-269940302), A0L(-230564678), A0j(947334735));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productlaunchinformation.ImmutablePandoProductLaunchInformation] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
