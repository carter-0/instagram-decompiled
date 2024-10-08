package com.instagram.friendmap.view.fragment;

import X.0qQ;
import X.0sP;
import X.AnonymousClass4A5;
import X.J3W;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class FriendMapAudienceListFragment$CustomAudienceLaunchConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(58);
    public AnonymousClass4A5 A00 = AnonymousClass4A5.ALLOWLIST;
    public 0sP A01 = J3W.A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(1);
    }
}
