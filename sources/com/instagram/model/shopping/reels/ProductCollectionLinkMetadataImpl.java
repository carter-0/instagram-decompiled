package com.instagram.model.shopping.reels;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44931CnR;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;

public final class ProductCollectionLinkMetadataImpl extends AnonymousClass0T0 implements Parcelable, ProductCollectionLinkMetadata {
    public static final Parcelable.Creator CREATOR = new LVO(28);
    public final ProductCollectionReviewStatus A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ProductCollectionLinkMetadataImpl(ProductCollectionReviewStatus productCollectionReviewStatus, String str, String str2, String str3) {
        0qQ.A0B(str3, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = productCollectionReviewStatus;
    }

    public final ProductCollectionLinkMetadataImpl FFh() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionLinkMetadataImpl) {
                ProductCollectionLinkMetadataImpl productCollectionLinkMetadataImpl = (ProductCollectionLinkMetadataImpl) obj;
                if (!0qQ.A0K(this.A01, productCollectionLinkMetadataImpl.A01) || !0qQ.A0K(this.A02, productCollectionLinkMetadataImpl.A02) || !0qQ.A0K(this.A03, productCollectionLinkMetadataImpl.A03) || this.A00 != productCollectionLinkMetadataImpl.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public final String Aov() {
        return this.A01;
    }

    public final String BRr() {
        return this.A02;
    }

    public final String Bg0() {
        return this.A03;
    }

    public final ProductCollectionReviewStatus BoL() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTSellerProductCollectionMetadata", C44931CnR.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A03, ((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
