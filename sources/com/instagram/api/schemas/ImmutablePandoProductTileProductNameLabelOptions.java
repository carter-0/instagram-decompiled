package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoProductTileProductNameLabelOptions extends 17P implements ProductTileProductNameLabelOptions {
    public static final C3035269k CREATOR = CTB.A00(59);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileProductNameLabelOptions] */
    public final int BWx() {
        return getIntValueByHashCode(1570251014);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileProductNameLabelOptions] */
    public final boolean BvB() {
        return getBooleanValueByHashCode(-1396328189);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileProductNameLabelOptions] */
    public final ProductTileProductNameLabelOptionsImpl F85() {
        return new ProductTileProductNameLabelOptionsImpl(getIntValueByHashCode(1570251014), getBooleanValueByHashCode(-1396328189));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileProductNameLabelOptions] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
