package com.instagram.business.promote.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class PromoteCampaignControlsHeaderViewModel implements Parcelable {
    public static final W6D CREATOR = new W6D(36);
    public String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        String str = this.A00;
        if (str != null) {
            parcel.writeString(str);
        } else {
            0qQ.A0F("headerText");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
