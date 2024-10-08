package com.google.android.material.datepicker;

import X.C13744TgG;
import X.SWR;
import X.SzL;
import X.SzM;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final C13744TgG A02 = new SzM();
    public static final C13744TgG A03 = new SzL();
    public static final Parcelable.Creator CREATOR = SWR.A00(97);
    public final C13744TgG A00;
    public final List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.A01.equals(compositeDateValidator.A01) && this.A00.BEU() == compositeDateValidator.A00.BEU();
    }

    public final boolean CeC(long j) {
        return this.A00.CeD(this.A01, j);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeInt(this.A00.BEU());
    }

    public CompositeDateValidator(C13744TgG tgG, List list) {
        this.A01 = list;
        this.A00 = tgG;
    }
}
