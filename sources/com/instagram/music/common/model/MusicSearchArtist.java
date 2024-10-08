package com.instagram.music.common.model;

import X.0qQ;
import X.C61094Jx5;
import X.LVO;
import X.MW4;
import android.os.Parcel;
import android.os.Parcelable;

public final class MusicSearchArtist implements Parcelable {
    public static final LVO CREATOR = LVO.A00(53);
    public String A00 = null;
    public final MW4 A01;

    public MusicSearchArtist(MW4 mw4) {
        this.A01 = mw4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        C61094Jx5 jx5 = (C61094Jx5) this.A01;
        parcel.writeParcelable(jx5.A00, i);
        parcel.writeString(jx5.A03);
        parcel.writeString(jx5.A01);
        parcel.writeString(jx5.A02);
        parcel.writeString(this.A00);
    }
}
