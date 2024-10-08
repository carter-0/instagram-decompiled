package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C45266CtV;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductTileProductImpl extends AnonymousClass0T0 implements Parcelable, ProductTileProduct {
    public static final Parcelable.Creator CREATOR = DE6.A00(43);
    public final FBProductItemDetailsDict A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProductTileProductImpl) && 0qQ.A0K(this.A00, ((ProductTileProductImpl) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final /* bridge */ /* synthetic */ C45266CtV AKL() {
        return new C45266CtV(this);
    }

    public final FBProductItemDetailsDict B4U() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public ProductTileProductImpl(FBProductItemDetailsDict fBProductItemDetailsDict) {
        this.A00 = fBProductItemDetailsDict;
    }
}
