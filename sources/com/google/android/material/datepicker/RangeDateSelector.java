package com.google.android.material.datepicker;

import X.AnonymousClass34S;
import X.AnonymousClass7TE;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class RangeDateSelector implements DateSelector {
    public static final Parcelable.Creator CREATOR = SWT.A00(1);
    public Long A00 = null;
    public Long A01 = null;

    public final int describeContents() {
        return 0;
    }

    public final ArrayList Brq() {
        Long l;
        Long l2 = this.A01;
        if (l2 == null || (l = this.A00) == null) {
            return AnonymousClass7TE.A1C();
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new AnonymousClass34S(l2, l));
        return A1C;
    }

    public final void EL7(long j) {
        Long l = this.A01;
        if (l != null) {
            if (this.A00 != null || l.longValue() > j) {
                this.A00 = null;
            } else {
                this.A00 = Long.valueOf(j);
                return;
            }
        }
        this.A01 = Long.valueOf(j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A01);
        parcel.writeValue(this.A00);
    }

    public final ArrayList Brc() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Long l = this.A01;
        if (l != null) {
            A1C.add(l);
        }
        Long l2 = this.A00;
        if (l2 != null) {
            A1C.add(l2);
        }
        return A1C;
    }
}
