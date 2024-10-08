package com.fbpay.hub.transactions.api;

import X.0qQ;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class UpcomingPayout implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(34);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingPayout) {
                UpcomingPayout upcomingPayout = (UpcomingPayout) obj;
                if (!0qQ.A0K(this.A00, upcomingPayout.A00) || !0qQ.A0K(this.A01, upcomingPayout.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C11367SPk.A01(this.A00) * 31) + C51971G9r.A0E(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public UpcomingPayout(Parcel parcel) {
        Pxh.A1H(this);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
