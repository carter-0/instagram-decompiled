package com.instagram.wonderwall.model;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public final class WallTextPostItem extends AnonymousClass0T0 implements WallPostItem {
    public static final Parcelable.Creator CREATOR = new SWU(15);
    public final WallPostInfo A00;

    public WallTextPostItem(WallPostInfo wallPostInfo) {
        0qQ.A0B(wallPostInfo, 1);
        this.A00 = wallPostInfo;
    }

    public final boolean BAY() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof WallTextPostItem) && 0qQ.A0K(this.A00, ((WallTextPostItem) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }

    public final String BK1() {
        return 002.A0R(this.A00.A06, "_text");
    }

    public final WallPostInfo BeB() {
        return this.A00;
    }
}
