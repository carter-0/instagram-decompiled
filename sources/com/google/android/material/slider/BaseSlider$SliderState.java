package com.google.android.material.slider;

import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

public class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = SWT.A00(6);
    public float A00;
    public float A01;
    public float A02;
    public ArrayList A03;
    public boolean A04;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeList(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeBooleanArray(new boolean[]{this.A04});
    }
}
