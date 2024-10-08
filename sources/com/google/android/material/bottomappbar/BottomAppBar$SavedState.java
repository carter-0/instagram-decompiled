package com.google.android.material.bottomappbar;

import X.C14161Tqz;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public class BottomAppBar$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C14161Tqz(5);
    public int A00;
    public boolean A01;

    public final void writeToParcel(Parcel parcel, int i) {
        BottomAppBar$SavedState.super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
