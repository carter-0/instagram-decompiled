package com.instagram.creation.genai.magicmod.model;

import X.0qQ;
import X.LVP;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

public final class ExpanderConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(40);
    public final Rect A00;

    public ExpanderConfig(Rect rect) {
        0qQ.A0B(rect, 1);
        this.A00 = rect;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
