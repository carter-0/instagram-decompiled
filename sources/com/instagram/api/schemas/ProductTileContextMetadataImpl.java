package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.C41847B3o;
import X.C41848B3p;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class ProductTileContextMetadataImpl extends AnonymousClass0T0 implements Parcelable, ProductTileContextMetadata {
    public static final Parcelable.Creator CREATOR = DE6.A00(33);
    public final List A00;

    public ProductTileContextMetadataImpl(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final ProductTileContextMetadataImpl F7z(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductTileContextMetadataImpl) && 0qQ.A0K(this.A00, ((ProductTileContextMetadataImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A00);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
    }
}
