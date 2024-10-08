package com.instagram.model.shopping.productcollection;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44925CnI;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoProductCollectionDropsMetadata extends 17P implements ProductCollectionDropsMetadata {
    public static final C3035269k CREATOR = CTA.A00(52);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata, com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionDropsMetadata] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44925CnI.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionDropsMetadata] */
    public final boolean Aoq() {
        return getBooleanValueByHashCode(-861860074);
    }

    public final long BLf() {
        return A03(-230564678);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionDropsMetadata] */
    public final Integer BXB() {
        return getOptionalIntValueByHashCode(665906685);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionDropsMetadata] */
    public final ProductCollectionDropsMetadataImpl FFb() {
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-861860074);
        return new ProductCollectionDropsMetadataImpl(getOptionalIntValueByHashCode(665906685), A03(-230564678), booleanValueByHashCode);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionDropsMetadata] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
