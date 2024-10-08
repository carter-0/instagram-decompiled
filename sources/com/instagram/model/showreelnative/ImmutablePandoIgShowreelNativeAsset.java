package com.instagram.model.showreelnative;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C55058HbT;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIgShowreelNativeAsset extends 17P implements IgShowreelNativeAsset {
    public static final C3035269k CREATOR = new CTA(67);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreelnative.IgShowreelNativeAsset, com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAsset] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C55058HbT.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAsset] */
    public final Integer BCu() {
        return getOptionalIntValueByHashCode(-1221029593);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAsset] */
    public final Integer CGY() {
        return getOptionalIntValueByHashCode(113126854);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAsset] */
    public final IgShowreelNativeAssetImpl FFz() {
        return new IgShowreelNativeAssetImpl(getOptionalIntValueByHashCode(-1221029593), getOptionalIntValueByHashCode(113126854), A0V());
    }

    public final String getUrl() {
        return A0V();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreelnative.ImmutablePandoIgShowreelNativeAsset] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
