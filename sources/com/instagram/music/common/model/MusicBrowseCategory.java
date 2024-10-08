package com.instagram.music.common.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.C64181LSn;
import X.LVO;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MusicBrowseCategory implements Parcelable {
    public static final C64181LSn A08 = new Object();
    public static final Parcelable.Creator CREATOR = LVO.A00(50);
    public Bundle A00;
    public MusicSearchPlaylistType A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(A00());
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeBundle(this.A00);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public final String A00() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        0qQ.A0F("category");
        throw AnonymousClass00P.createAndThrow();
    }
}
