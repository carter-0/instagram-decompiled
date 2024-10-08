package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CV5;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoBrandedContentGatingCountryMinimumAge extends 17P implements BrandedContentGatingCountryMinimumAge {
    public static final C3035269k CREATOR = CTC.A00(19);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge, com.instagram.api.schemas.ImmutablePandoBrandedContentGatingCountryMinimumAge] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CV5.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Arl() {
        return A0i(1481071862);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandedContentGatingCountryMinimumAge] */
    public final Integer BTM() {
        return getOptionalIntValueByHashCode(1008566606);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoBrandedContentGatingCountryMinimumAge] */
    public final BrandedContentGatingCountryMinimumAgeImpl F0w() {
        return new BrandedContentGatingCountryMinimumAgeImpl(A0i(1481071862), getOptionalIntValueByHashCode(1008566606));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBrandedContentGatingCountryMinimumAge] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
