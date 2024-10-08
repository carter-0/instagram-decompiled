package com.facebookpay.otc.models;

import X.002;
import X.0qQ;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public final class OtcInput implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(8);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OtcInput) {
                OtcInput otcInput = (OtcInput) obj;
                if (!0qQ.A0K(this.A00, otcInput.A00) || !0qQ.A0K(this.A01, otcInput.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("OtcInput(otcSessionId=", this.A00, ", otcType=", this.A01, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public OtcInput(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
