package com.instagram.model.rtc;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C71269Ogb;
import X.G9w;
import X.JTR;
import android.os.Parcel;
import android.os.Parcelable;

public final class RtcCallKey extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(71);
    public final String A00;

    public RtcCallKey(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!0qQ.A0K(getClass(), JTR.A0v(obj))) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.model.rtc.RtcCallKey");
        return 0qQ.A0K(this.A00, ((RtcCallKey) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return G9w.A0k("RtcCallKey(serverInfoData=", this.A00);
    }
}
