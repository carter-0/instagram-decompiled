package com.instagram.user.model;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C45133Cqr;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import java.util.Iterator;
import java.util.List;

public final class ProductCollectionImpl extends AnonymousClass0T0 implements ProductCollection, Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(87);
    public final ProductCollectionV2Type A00;
    public final ProductCollectionReviewStatus A01;
    public final ProductCollectionCover A02;
    public final ProductCollectionDropsMetadata A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final ProductCollectionImpl FGo(1E9 r1) {
        return this;
    }

    public final ProductCollectionImpl FGp(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionImpl) {
                ProductCollectionImpl productCollectionImpl = (ProductCollectionImpl) obj;
                if (!0qQ.A0K(this.A04, productCollectionImpl.A04) || this.A01 != productCollectionImpl.A01 || this.A00 != productCollectionImpl.A00 || !0qQ.A0K(this.A02, productCollectionImpl.A02) || !0qQ.A0K(this.A05, productCollectionImpl.A05) || !0qQ.A0K(this.A03, productCollectionImpl.A03) || !0qQ.A0K(this.A06, productCollectionImpl.A06) || !0qQ.A0K(this.A07, productCollectionImpl.A07) || !0qQ.A0K(this.A08, productCollectionImpl.A08) || !0qQ.A0K(this.A09, productCollectionImpl.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        List list = this.A09;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            ((User) A1G.next()).writeToParcel(parcel, i);
        }
    }

    public final String Aoi() {
        return this.A04;
    }

    public final ProductCollectionReviewStatus Aor() {
        return this.A01;
    }

    public final ProductCollectionV2Type Aou() {
        return this.A00;
    }

    public final ProductCollectionCover Arp() {
        return this.A02;
    }

    public final ProductCollectionDropsMetadata AzC() {
        return this.A03;
    }

    public final String BRr() {
        return this.A06;
    }

    public final List CD6() {
        return this.A09;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTMicroProductCollectionTileDict", C45133Cqr.A00(this));
    }

    public final String getDescription() {
        return this.A05;
    }

    public final String getSubtitle() {
        return this.A07;
    }

    public final String getTitle() {
        return this.A08;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TE.A0L(this.A09);
    }

    public ProductCollectionImpl(ProductCollectionV2Type productCollectionV2Type, ProductCollectionReviewStatus productCollectionReviewStatus, ProductCollectionCover productCollectionCover, ProductCollectionDropsMetadata productCollectionDropsMetadata, String str, String str2, String str3, String str4, String str5, List list) {
        this.A04 = str;
        this.A01 = productCollectionReviewStatus;
        this.A00 = productCollectionV2Type;
        this.A02 = productCollectionCover;
        this.A05 = str2;
        this.A03 = productCollectionDropsMetadata;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = list;
    }

    public final ProductCollection EAX(1E9 r1) {
        return this;
    }
}
