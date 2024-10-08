package com.instagram.api.schemas;

import X.17P;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C46069DLa;
import X.CTB;
import android.os.Parcel;

public final class ImmutablePandoProductTileContext extends 17P implements ProductTileContext {
    public static final C3035269k CREATOR = CTB.A00(50);

    public final ProductTileContextVariant CDY() {
        return (ProductTileContextVariant) A0M(236785797, C46069DLa.A00);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final ProductTileContextImpl F7y(1E9 r5) {
        ProductTileContextMetadataImpl productTileContextMetadataImpl;
        ProductTileContextMetadata productTileContextMetadata = (ProductTileContextMetadata) A05(-450004177, ImmutablePandoProductTileContextMetadata.class);
        if (productTileContextMetadata != null) {
            productTileContextMetadataImpl = productTileContextMetadata.F7z(r5);
        } else {
            productTileContextMetadataImpl = null;
        }
        return new ProductTileContextImpl(productTileContextMetadataImpl, CDY(), A0P());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProductTileContext] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
