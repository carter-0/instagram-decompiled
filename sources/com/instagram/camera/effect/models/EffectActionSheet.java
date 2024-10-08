package com.instagram.camera.effect.models;

import X.0qQ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

public final class EffectActionSheet implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(63);
    public List A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
        parcel.writeStringList(this.A01);
    }

    public EffectActionSheet() {
        List emptyList = Collections.emptyList();
        0qQ.A07(emptyList);
        this.A00 = emptyList;
        List emptyList2 = Collections.emptyList();
        0qQ.A07(emptyList2);
        this.A01 = emptyList2;
    }
}
