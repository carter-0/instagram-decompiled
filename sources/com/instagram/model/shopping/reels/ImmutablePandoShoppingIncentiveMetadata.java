package com.instagram.model.shopping.reels;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44943Cnd;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoShoppingIncentiveMetadata extends 17P implements ShoppingIncentiveMetadataIntf {
    public static final C3035269k CREATOR = CTA.A00(63);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf, com.instagram.model.shopping.reels.ImmutablePandoShoppingIncentiveMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44943Cnd.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BGl() {
        return A0k(1853315183);
    }

    public final String BRr() {
        return A0k(574223090);
    }

    public final ShoppingIncentiveMetadata FFt() {
        return new ShoppingIncentiveMetadata(A0k(1853315183), A0k(574223090));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoShoppingIncentiveMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
