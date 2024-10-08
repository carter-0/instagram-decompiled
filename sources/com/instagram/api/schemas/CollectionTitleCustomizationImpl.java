package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class CollectionTitleCustomizationImpl extends AnonymousClass0T0 implements Parcelable, CollectionTitleCustomization {
    public static final Parcelable.Creator CREATOR = DE7.A00(14);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CollectionTitleCustomizationImpl) && this.A00 == ((CollectionTitleCustomizationImpl) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public CollectionTitleCustomizationImpl(int i) {
        this.A00 = i;
    }
}
