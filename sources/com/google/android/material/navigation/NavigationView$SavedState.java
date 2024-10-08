package com.google.android.material.navigation;

import X.C14161Tqz;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public class NavigationView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C14161Tqz(10);
    public Bundle A00;

    public final void writeToParcel(Parcel parcel, int i) {
        NavigationView$SavedState.super.writeToParcel(parcel, i);
        parcel.writeBundle(this.A00);
    }
}
