package com.instagram.rtc.analytics;

import X.0qQ;
import X.G9w;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.rtc.RtcCallFunnelSessionId;

public final class RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString extends RtcCallFunnelSessionId {
    public static final Parcelable.Creator CREATOR = new W6F(12);
    public final String A00;

    public RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString) && 0qQ.A0K(this.A00, ((RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final String A00() {
        return this.A00;
    }

    public final String toString() {
        return G9w.A0k("RtcCallFunnelLoggerImplIdFromString(id=", this.A00);
    }
}
