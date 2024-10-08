package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoProductTilePriceLabelOptions extends 17P implements ProductTilePriceLabelOptions {
    public static final C3035269k CREATOR = CTB.A00(57);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTilePriceLabelOptions] */
    public final boolean BvB() {
        return getBooleanValueByHashCode(-1396328189);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTilePriceLabelOptions] */
    public final boolean BvC() {
        return getBooleanValueByHashCode(1133673074);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTilePriceLabelOptions] */
    public final boolean Bvy() {
        return getBooleanValueByHashCode(-588984648);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTilePriceLabelOptions] */
    public final ProductTilePriceLabelOptionsImpl F84() {
        return new ProductTilePriceLabelOptionsImpl(getBooleanValueByHashCode(-1396328189), getBooleanValueByHashCode(1133673074), getBooleanValueByHashCode(-588984648));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTilePriceLabelOptions] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
