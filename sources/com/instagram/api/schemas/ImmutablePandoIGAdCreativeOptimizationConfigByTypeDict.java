package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44164CYd;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoIGAdCreativeOptimizationConfigByTypeDict extends 17P implements IGAdCreativeOptimizationConfigByTypeDict {
    public static final C3035269k CREATOR = CTC.A00(89);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreativeOptimizationConfigByTypeDict, com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44164CYd.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BYY() {
        return A0i(-1007675833);
    }

    public final String BYb() {
        return A0i(-367322628);
    }

    public final IGAdCreativeOptimizationConfigByTypeDictImpl F3n() {
        return new IGAdCreativeOptimizationConfigByTypeDictImpl(A0i(-1007675833), A0i(-367322628));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGAdCreativeOptimizationConfigByTypeDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
