package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class CollectionCustomization extends AnonymousClass0T0 implements Parcelable, CollectionCustomizationIntf {
    public static final Parcelable.Creator CREATOR = DE7.A00(12);
    public final CollectionButtonCustomization A00;
    public final CollectionTitleCustomization A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CollectionCustomization) {
                CollectionCustomization collectionCustomization = (CollectionCustomization) obj;
                if (!0qQ.A0K(this.A00, collectionCustomization.A00) || !0qQ.A0K(this.A01, collectionCustomization.A01)) {
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
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public CollectionCustomization(CollectionButtonCustomization collectionButtonCustomization, CollectionTitleCustomization collectionTitleCustomization) {
        this.A00 = collectionButtonCustomization;
        this.A01 = collectionTitleCustomization;
    }
}
