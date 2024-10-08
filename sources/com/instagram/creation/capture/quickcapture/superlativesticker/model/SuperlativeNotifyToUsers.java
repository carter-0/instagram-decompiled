package com.instagram.creation.capture.quickcapture.superlativesticker.model;

import X.0qQ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

public final class SuperlativeNotifyToUsers implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(35);
    public final User A00;

    public SuperlativeNotifyToUsers(User user) {
        0qQ.A0B(user, 1);
        this.A00 = user;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
