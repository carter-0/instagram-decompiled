package com.instagram.music.common.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class DownloadedTrack implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(45);
    public final int A00;
    public final int A01;
    public final String A02;

    public DownloadedTrack(String str, int i, int i2) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public final int A00(int i) {
        int i2 = this.A01;
        if (i2 == -1) {
            return i;
        }
        if (i >= i2 || i <= this.A00 + i2) {
            return i - i2;
        }
        throw AnonymousClass7TE.A0z("requested absolute time not in track segment");
    }
}
