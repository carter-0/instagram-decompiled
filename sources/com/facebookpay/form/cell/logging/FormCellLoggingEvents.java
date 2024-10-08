package com.facebookpay.form.cell.logging;

import X.0qQ;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class FormCellLoggingEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(72);
    public final FormCellFocusEvents A00;

    public FormCellLoggingEvents(FormCellFocusEvents formCellFocusEvents) {
        0qQ.A0B(formCellFocusEvents, 1);
        this.A00 = formCellFocusEvents;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }
}
