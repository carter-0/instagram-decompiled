package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoProductDetailsSellerBadgeContent extends 17P implements ProductDetailsSellerBadgeContent {
    public static final C3035269k CREATOR = CTB.A00(45);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductDetailsSellerBadgeContentImpl F7r() {
        return new ProductDetailsSellerBadgeContentImpl(A0h(-1724546052), A0S());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductDetailsSellerBadgeContent] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
