package com.google.android.material.datepicker;

import X.C51968G9o;
import X.SMY;
import X.SWT;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public final class Month implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = SWT.A00(0);
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Calendar A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.A03 == month.A03 && this.A04 == month.A04;
    }

    public final int A00() {
        Calendar calendar = this.A05;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.A02;
        }
        return firstDayOfWeek;
    }

    public final String A01(Context context) {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        long timeInMillis = this.A05.getTimeInMillis();
        String formatDateTime = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        this.A00 = formatDateTime;
        return formatDateTime;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A05.compareTo(((Month) obj).A05);
    }

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1Z(Integer.valueOf(this.A03), this.A04));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar A012 = SMY.A01(calendar);
        this.A05 = A012;
        this.A03 = A012.get(2);
        this.A04 = A012.get(1);
        this.A02 = A012.getMaximum(7);
        this.A01 = A012.getActualMaximum(5);
        A012.getTimeInMillis();
    }
}
