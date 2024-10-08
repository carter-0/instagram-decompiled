package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44253Cbo;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoProductAffiliateInformationDict extends 17P implements ProductAffiliateInformationDict {
    public static final C3035269k CREATOR = CTB.A00(42);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ProductAffiliateInformationDict, com.instagram.api.schemas.ImmutablePandoProductAffiliateInformationDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44253Cbo.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AaC() {
        return A0j(68906680);
    }

    public final String ApW() {
        return A0i(961471412);
    }

    public final ProductAffiliateInformationDictImpl F7m() {
        return new ProductAffiliateInformationDictImpl(A0j(68906680), A0i(961471412));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductAffiliateInformationDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
