package com.instagram.api.schemas;

import X.17P;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

public final class ImmutablePandoProductWithMediaImage extends 17P implements ProductWithMediaImage {
    public static final C3035269k CREATOR = CTB.A00(62);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductDetailsProductItemDictIntf BSv() {
        return (ProductDetailsProductItemDictIntf) A04(-694833548, ImmutablePandoProductDetailsProductItemDict.class);
    }

    public final ProductWithMediaImageImpl F87(1E9 r3) {
        return new ProductWithMediaImageImpl(BSv().FGq(r3));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductWithMediaImage] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
