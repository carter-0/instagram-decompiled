package com.instagram.business.promote.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectedInterestRowItem implements Parcelable {
    public static final W6D CREATOR = new W6D(56);
    public AudienceInterest A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AudienceInterest audienceInterest = this.A00;
        if (audienceInterest != null) {
            parcel.writeParcelable(audienceInterest, i);
        } else {
            0qQ.A0F("interest");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
