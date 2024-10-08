package com.instagram.business.promote.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class PromotionMetric implements Parcelable {
    public static final W6D CREATOR = new W6D(52);
    public Integer A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        String str = this.A01;
        if (str != null) {
            parcel.writeString(str);
            parcel.writeValue(this.A00);
            return;
        }
        0qQ.A0F("metricName");
        throw AnonymousClass00P.createAndThrow();
    }
}
