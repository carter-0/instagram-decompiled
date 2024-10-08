package com.instagram.model.shopping.reels;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44931CnR;
import X.C46151DOe;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;

public final class ImmutablePandoProductCollectionLinkMetadata extends 17P implements ProductCollectionLinkMetadata {
    public static final C3035269k CREATOR = CTA.A00(57);

    public final ProductCollectionReviewStatus BoL() {
        return (ProductCollectionReviewStatus) A0N(1206018745, C46151DOe.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ProductCollectionLinkMetadata, com.instagram.model.shopping.reels.ImmutablePandoProductCollectionLinkMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44931CnR.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Aov() {
        return A0i(1060506683);
    }

    public final String BRr() {
        return A0j(574223090);
    }

    public final String Bg0() {
        return A0k(262907660);
    }

    public final ProductCollectionLinkMetadataImpl FFh() {
        return new ProductCollectionLinkMetadataImpl(BoL(), A0i(1060506683), A0j(574223090), A0k(262907660));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoProductCollectionLinkMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
