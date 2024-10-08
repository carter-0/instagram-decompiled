package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class IABAdsMetaCheckoutDataExtension extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(98);
    public final MetaCheckoutExperienceType A00;

    public IABAdsMetaCheckoutDataExtension(MetaCheckoutExperienceType metaCheckoutExperienceType) {
        0qQ.A0B(metaCheckoutExperienceType, 1);
        this.A00 = metaCheckoutExperienceType;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IABAdsMetaCheckoutDataExtension) && this.A00 == ((IABAdsMetaCheckoutDataExtension) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }
}
