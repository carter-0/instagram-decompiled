package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class EcpNuxLearnMoreScreenStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(42);
    public final CharSequence A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TextUtils.writeToParcel(this.A00, parcel, i);
    }

    public EcpNuxLearnMoreScreenStyle(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    public EcpNuxLearnMoreScreenStyle() {
        this((CharSequence) null);
    }
}
