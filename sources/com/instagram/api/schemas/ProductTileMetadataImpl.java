package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.C45371CvD;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class ProductTileMetadataImpl extends AnonymousClass0T0 implements Parcelable, ProductTileMetadata {
    public static final Parcelable.Creator CREATOR = DE6.A00(41);
    public final ProductTileMetadataDecorations A00;
    public final List A01;
    public final ProductTileMetadataDestination A02;

    public ProductTileMetadataImpl(ProductTileMetadataDecorations productTileMetadataDecorations, ProductTileMetadataDestination productTileMetadataDestination, List list) {
        0qQ.A0B(list, 3);
        this.A00 = productTileMetadataDecorations;
        this.A02 = productTileMetadataDestination;
        this.A01 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductTileMetadataImpl) {
                ProductTileMetadataImpl productTileMetadataImpl = (ProductTileMetadataImpl) obj;
                if (!0qQ.A0K(this.A00, productTileMetadataImpl.A00) || this.A02 != productTileMetadataImpl.A02 || !0qQ.A0K(this.A01, productTileMetadataImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        Iterator A1F = C41848B3p.A1F(parcel, this.A01);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
    }

    public final /* bridge */ /* synthetic */ C45371CvD AKK() {
        return new C45371CvD(this);
    }

    public final ProductTileMetadataDecorations Avh() {
        return this.A00;
    }

    public final ProductTileMetadataDestination AwY() {
        return this.A02;
    }

    public final List BKR() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, ((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }
}
