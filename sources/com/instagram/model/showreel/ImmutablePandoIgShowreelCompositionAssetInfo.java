package com.instagram.model.showreel;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44948Cni;
import X.C46154DOh;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIgShowreelCompositionAssetInfo extends 17P implements IgShowreelCompositionAssetInfoIntf {
    public static final C3035269k CREATOR = CTA.A00(65);

    public final IgShowreelCompositionAssetType CAb() {
        return (IgShowreelCompositionAssetType) A0N(3575610, C46154DOh.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreel.ImmutablePandoIgShowreelCompositionAssetInfo, com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44948Cni.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final IgShowreelCompositionAssetInfo FFw() {
        return new IgShowreelCompositionAssetInfo(CAb(), A0V());
    }

    public final String getUrl() {
        return A0V();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.showreel.ImmutablePandoIgShowreelCompositionAssetInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
