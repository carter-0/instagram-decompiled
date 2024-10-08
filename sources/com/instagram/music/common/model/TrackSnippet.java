package com.instagram.music.common.model;

import X.002;
import X.0qQ;
import android.os.Parcel;
import android.os.Parcelable;

public final class TrackSnippet implements Parcelable {
    public int A00;
    public int A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public final String toString() {
        return 002.A0X("TrackSnippet[startTimeInMs=", ", durationInMs=", ']', this.A01, this.A00);
    }
}
