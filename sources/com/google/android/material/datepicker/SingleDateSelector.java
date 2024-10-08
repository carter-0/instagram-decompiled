package com.google.android.material.datepicker;

import X.AnonymousClass7TE;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class SingleDateSelector implements DateSelector {
    public static final Parcelable.Creator CREATOR = SWT.A00(2);
    public Long A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A00);
    }

    public final ArrayList Brc() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Long l = this.A00;
        if (l != null) {
            A1C.add(l);
        }
        return A1C;
    }

    public final ArrayList Brq() {
        return AnonymousClass7TE.A1C();
    }

    public final void EL7(long j) {
        this.A00 = Long.valueOf(j);
    }
}
