package com.instagram.model.shopping.reels;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44942Cnc;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ShoppingDestinationMetadata extends AnonymousClass0T0 implements Parcelable, ShoppingDestinationMetadataIntf {
    public static final Parcelable.Creator CREATOR = new LVO(34);
    public final ProductCollectionLinkMetadata A00;
    public final ShoppingIncentiveMetadata A01;

    public final ShoppingDestinationMetadata FFs() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingDestinationMetadata) {
                ShoppingDestinationMetadata shoppingDestinationMetadata = (ShoppingDestinationMetadata) obj;
                if (!0qQ.A0K(this.A01, shoppingDestinationMetadata.A01) || !0qQ.A0K(this.A00, shoppingDestinationMetadata.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        ShoppingIncentiveMetadata shoppingIncentiveMetadata = this.A01;
        if (shoppingIncentiveMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shoppingIncentiveMetadata.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A00, i);
    }

    public final /* bridge */ /* synthetic */ ShoppingIncentiveMetadataIntf BGm() {
        return this.A01;
    }

    public final ProductCollectionLinkMetadata BsA() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTDestinationMetadata", C44942Cnc.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public ShoppingDestinationMetadata(ProductCollectionLinkMetadata productCollectionLinkMetadata, ShoppingIncentiveMetadata shoppingIncentiveMetadata) {
        this.A01 = shoppingIncentiveMetadata;
        this.A00 = productCollectionLinkMetadata;
    }
}
