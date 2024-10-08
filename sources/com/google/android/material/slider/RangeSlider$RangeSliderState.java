package com.google.android.material.slider;

import X.C41847B3o;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public class RangeSlider$RangeSliderState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = SWT.A00(7);
    public float A00;
    public int A01;

    public RangeSlider$RangeSliderState(Parcel parcel) {
        super(C41847B3o.A03(parcel, RangeSlider$RangeSliderState.class));
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }
}
