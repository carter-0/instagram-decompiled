package com.google.android.material.navigation;

import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

public class NavigationBarPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWT.A00(5);
    public int A00;
    public ParcelableSparseArray A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, 0);
    }
}
