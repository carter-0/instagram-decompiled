package com.facebookpay.form.cell.logging;

import X.0qQ;
import X.C51974G9v;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class FormCellFocusEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(71);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public FormCellFocusEvents(String str, String str2, String str3, String str4) {
        C51974G9v.A1P(str, str2, str3, str4);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }
}
