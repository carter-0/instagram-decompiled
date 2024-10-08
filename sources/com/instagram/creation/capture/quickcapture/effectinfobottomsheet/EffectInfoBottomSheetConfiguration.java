package com.instagram.creation.capture.quickcapture.effectinfobottomsheet;

import X.28D;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class EffectInfoBottomSheetConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(20);
    public int A00;
    public 28D A01 = 28D.A5J;
    public ImmutableList A02 = ImmutableList.of();
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeSerializable(this.A01);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
    }
}
