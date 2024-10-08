package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C54803HTk;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoMetaPlaceDict extends 17P implements MetaPlaceDict {
    public static final C3035269k CREATOR = CTB.A00(19);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.MetaPlaceDict, com.instagram.api.schemas.ImmutablePandoMetaPlaceDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C54803HTk.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final MetaPlaceDictImpl F6D() {
        return new MetaPlaceDictImpl(A0e(), A0W());
    }

    public final String getId() {
        return A0e();
    }

    public final String getName() {
        return A0W();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoMetaPlaceDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
