package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import X.CVC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

public final class ImmutablePandoBusinessProfileDict extends 17P implements BusinessProfileDict {
    public static final C3035269k CREATOR = CTC.A00(22);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.BusinessProfileDict, com.instagram.api.schemas.ImmutablePandoBusinessProfileDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CVC.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ImageUrl Bh3() {
        return A0A(1782139044);
    }

    public final BusinessProfileDictImpl F12() {
        return new BusinessProfileDictImpl(A0A(1782139044), A0e(), C41845B3m.A0q(this));
    }

    public final String getId() {
        return A0e();
    }

    public final String getUsername() {
        return C41845B3m.A0q(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoBusinessProfileDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
