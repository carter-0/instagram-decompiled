package com.instagram.model.shopping.reels;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44942Cnc;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoShoppingDestinationMetadata extends 17P implements ShoppingDestinationMetadataIntf {
    public static final C3035269k CREATOR = CTA.A00(62);

    public final ShoppingIncentiveMetadataIntf BGm() {
        return (ShoppingIncentiveMetadataIntf) A05(759953283, ImmutablePandoShoppingIncentiveMetadata.class);
    }

    public final ProductCollectionLinkMetadata BsA() {
        return (ProductCollectionLinkMetadata) A05(402064288, ImmutablePandoProductCollectionLinkMetadata.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf, com.instagram.model.shopping.reels.ImmutablePandoShoppingDestinationMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44942Cnc.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ShoppingDestinationMetadata FFs() {
        ShoppingIncentiveMetadata shoppingIncentiveMetadata;
        ShoppingIncentiveMetadataIntf BGm = BGm();
        ProductCollectionLinkMetadataImpl productCollectionLinkMetadataImpl = null;
        if (BGm != null) {
            shoppingIncentiveMetadata = BGm.FFt();
        } else {
            shoppingIncentiveMetadata = null;
        }
        ProductCollectionLinkMetadata BsA = BsA();
        if (BsA != null) {
            productCollectionLinkMetadataImpl = BsA.FFh();
        }
        return new ShoppingDestinationMetadata(productCollectionLinkMetadataImpl, shoppingIncentiveMetadata);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoShoppingDestinationMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
