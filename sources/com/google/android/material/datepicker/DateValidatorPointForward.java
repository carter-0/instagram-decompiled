package com.google.android.material.datepicker;

import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator CREATOR = SWR.A00(99);
    public final long A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DateValidatorPointForward) && this.A00 == ((DateValidatorPointForward) obj).A00;
        }
        return true;
    }

    public final boolean CeC(long j) {
        return Pxf.A1R((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)));
    }

    public final int hashCode() {
        return Pxf.A08(Long.valueOf(this.A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
    }

    public DateValidatorPointForward(long j) {
        this.A00 = j;
    }
}
