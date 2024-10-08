package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class CollectionButtonCustomization extends AnonymousClass0T0 implements Parcelable, CollectionButtonCustomizationIntf {
    public static final Parcelable.Creator CREATOR = DE7.A00(11);
    public final MiniShopColorCustomization A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CollectionButtonCustomization) && 0qQ.A0K(this.A00, ((CollectionButtonCustomization) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public CollectionButtonCustomization(MiniShopColorCustomization miniShopColorCustomization) {
        this.A00 = miniShopColorCustomization;
    }
}
