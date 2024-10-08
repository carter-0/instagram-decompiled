package com.facebookpay.msc.logging;

import X.002;
import X.0qQ;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public final class LoggingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(7);
    public final String A00;

    public LoggingData(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LoggingData) && 0qQ.A0K(this.A00, ((LoggingData) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return 002.A0S("LoggingData(sessionId=", this.A00, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }
}
