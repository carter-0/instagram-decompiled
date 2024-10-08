package com.instagram.model.shopping.reels;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C46150DOd;
import X.CTA;
import X.CnQ;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiProductComponentDestinationType;

public final class ImmutablePandoProductCollectionLink extends 17P implements ProductCollectionLinkIntf {
    public static final C3035269k CREATOR = CTA.A00(56);

    public final ShoppingDestinationMetadataIntf Awe() {
        return (ShoppingDestinationMetadataIntf) A05(-593684416, ImmutablePandoShoppingDestinationMetadata.class);
    }

    public final MultiProductComponentDestinationType Awh() {
        return (MultiProductComponentDestinationType) A0M(1205427403, C46150DOd.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.model.shopping.reels.ProductCollectionLinkIntf, com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoProductCollectionLink] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CnQ.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Air() {
        return C41847B3o.A1C(this);
    }

    public final String Awd() {
        return A0j(912984812);
    }

    public final String Awf() {
        return A0i(2090789161);
    }

    public final String Awg() {
        return A0i(-1286928665);
    }

    public final ProductCollectionLink FFg() {
        ShoppingDestinationMetadata shoppingDestinationMetadata;
        String A1C = C41847B3o.A1C(this);
        String A0j = A0j(912984812);
        ShoppingDestinationMetadataIntf Awe = Awe();
        if (Awe != null) {
            shoppingDestinationMetadata = Awe.FFs();
        } else {
            shoppingDestinationMetadata = null;
        }
        return new ProductCollectionLink(Awh(), shoppingDestinationMetadata, A1C, A0j, A0i(2090789161), A0i(-1286928665));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.reels.ImmutablePandoProductCollectionLink] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
