package com.instagram.appreciation.analytics;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41845B3m;
import X.C51974G9v;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public final class LoggingFanData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(78);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggingFanData) {
                LoggingFanData loggingFanData = (LoggingFanData) obj;
                if (!0qQ.A0K(this.A03, loggingFanData.A03) || !0qQ.A0K(this.A02, loggingFanData.A02) || !0qQ.A0K(this.A00, loggingFanData.A00) || !0qQ.A0K(this.A01, loggingFanData.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A08(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A03))));
    }

    public LoggingFanData(String str, String str2, String str3, String str4) {
        C51974G9v.A1P(str, str2, str3, str4);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A01 = str4;
    }
}
