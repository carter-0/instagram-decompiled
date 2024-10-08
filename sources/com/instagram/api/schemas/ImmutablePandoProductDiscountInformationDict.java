package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44262Cbx;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoProductDiscountInformationDict extends 17P implements ProductDiscountInformationDict {
    public static final C3035269k CREATOR = CTB.A00(46);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ProductDiscountInformationDict, com.instagram.api.schemas.ImmutablePandoProductDiscountInformationDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44262Cbx.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductDiscountInformationDictImpl F7s() {
        return new ProductDiscountInformationDictImpl(A0i(-815905284), A0T(), A0g(), A0W(), A0i(-1137266314));
    }

    public final String getCtaText() {
        return A0i(-815905284);
    }

    public final String getDescription() {
        return A0T();
    }

    public final String getId() {
        return A0g();
    }

    public final String getName() {
        return A0W();
    }

    public final String getSeeDetailsText() {
        return A0i(-1137266314);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductDiscountInformationDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
