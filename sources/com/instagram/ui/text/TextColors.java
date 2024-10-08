package com.instagram.ui.text;

import X.0qQ;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;

public final class TextColors implements Parcelable {
    public static final TextColors A02;
    public static final TextColors A03;
    public static final Parcelable.Creator CREATOR = new C376399Hv(81);
    public int A00;
    public TextShadow A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
    }

    static {
        TextShadow textShadow = TextShadow.A03;
        A02 = new TextColors(textShadow, -1);
        A03 = new TextColors(textShadow, Integer.MAX_VALUE);
    }

    public TextColors(TextShadow textShadow, int i) {
        this.A00 = i;
        this.A01 = textShadow;
    }

    public TextColors() {
    }
}
