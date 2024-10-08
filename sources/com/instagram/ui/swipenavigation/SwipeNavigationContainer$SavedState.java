package com.instagram.ui.swipenavigation;

import X.0qQ;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class SwipeNavigationContainer$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C376399Hv(79);
    public final float A00;

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A00);
    }

    public SwipeNavigationContainer$SavedState(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readFloat();
    }

    public SwipeNavigationContainer$SavedState(Parcelable parcelable, float f) {
        super(parcelable);
        this.A00 = f;
    }
}
