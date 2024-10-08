package com.facebookpay.form.cell.text.formatter;

import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberFormattingTextWatcher;

public class PhoneFormatter extends PhoneNumberFormattingTextWatcher implements TextFormatter {
    public static final Parcelable.Creator CREATOR = SWV.A00(80);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
