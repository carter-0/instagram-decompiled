package com.instagram.creation.photo.edit.filter;

import X.JTS;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.filterkit.filter.FilterGroup;

public final class UnifiedFilterParamCallbackImpl implements FilterGroup.UnifiedFilterParamCallback {
    public static final Parcelable.Creator CREATOR = LVP.A00(45);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        JTS.A0v(parcel);
    }
}
