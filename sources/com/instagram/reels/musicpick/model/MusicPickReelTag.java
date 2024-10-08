package com.instagram.reels.musicpick.model;

import X.0qQ;
import X.C255793uj;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;

public final class MusicPickReelTag implements Parcelable, C255793uj {
    public static final Parcelable.Creator CREATOR = LVO.A00(98);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public final float BCs() {
        return this.A02;
    }

    public final float Bod() {
        return this.A01;
    }

    public final float CGW() {
        return this.A03;
    }

    public final float CGs() {
        return this.A04;
    }

    public final float CHR() {
        return this.A05;
    }

    public MusicPickReelTag(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.A04 = f;
        this.A05 = f2;
        this.A06 = i;
        this.A03 = f3;
        this.A02 = f4;
        this.A01 = f5;
        this.A00 = f6;
    }
}
