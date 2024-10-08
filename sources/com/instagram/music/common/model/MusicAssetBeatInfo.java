package com.instagram.music.common.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class MusicAssetBeatInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(48);
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public MusicAssetBeatInfo(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A04 = z4;
    }

    public MusicAssetBeatInfo() {
        this(false, 0, false, false, false);
    }
}
