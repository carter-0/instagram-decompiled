package com.instagram.direct.model.thread;

import X.0qQ;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class CreatorSubscriberThreadInfo implements Parcelable {
    public static final C376399Hv CREATOR = new C376399Hv(1);
    public ImageUrl A00;
    public Long A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long j;
        0qQ.A0B(parcel, 0);
        Long l = this.A01;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        parcel.writeLong(j);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
