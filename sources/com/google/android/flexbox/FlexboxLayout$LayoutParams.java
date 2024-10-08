package com.google.android.flexbox;

import X.Pxk;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

public class FlexboxLayout$LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
    public static final Parcelable.Creator CREATOR = SWW.A00(77);
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public boolean A09;

    public final int describeContents() {
        return 0;
    }

    public final int Aag() {
        return this.A03;
    }

    public final float B6U() {
        return this.A00;
    }

    public final float B6V() {
        return this.A01;
    }

    public final float B6W() {
        return this.A02;
    }

    public final int BP7() {
        return this.A04;
    }

    public final int BPT() {
        return this.A05;
    }

    public final int BT6() {
        return this.A06;
    }

    public final int BTI() {
        return this.A07;
    }

    public final boolean Cex() {
        return this.A09;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        Pxk.A0R(parcel, this, this.A09 ? (byte) 1 : 0);
    }
}
