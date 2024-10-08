package com.airbnb.lottie;

import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class LottieAnimationView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(83);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public boolean A06;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
    }
}
