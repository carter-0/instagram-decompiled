package com.instagram.shopping.model.taggingfeed;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.ProductCollectionV2Type;

public final class ProductCollectionFeedTaggingMeta extends AnonymousClass0T0 implements Parcelable, ProductCollectionFeedTaggingMetaIntf {
    public static final Parcelable.Creator CREATOR = new W6F(58);
    public final ProductCollectionV2Type A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionFeedTaggingMeta) {
                ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = (ProductCollectionFeedTaggingMeta) obj;
                if (!0qQ.A0K(this.A01, productCollectionFeedTaggingMeta.A01) || this.A00 != productCollectionFeedTaggingMeta.A00 || !0qQ.A0K(this.A02, productCollectionFeedTaggingMeta.A02) || !0qQ.A0K(this.A03, productCollectionFeedTaggingMeta.A03) || this.A05 != productCollectionFeedTaggingMeta.A05 || !0qQ.A0K(this.A04, productCollectionFeedTaggingMeta.A04)) {
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A01);
        return AnonymousClass7TF.A09(this.A05, (((AnonymousClass7TF.A07(this.A00, A0O) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }

    public ProductCollectionFeedTaggingMeta(ProductCollectionV2Type productCollectionV2Type, String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass7TG.A1O(str, productCollectionV2Type);
        this.A01 = str;
        this.A00 = productCollectionV2Type;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = z;
        this.A04 = str4;
    }
}
