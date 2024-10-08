package com.instagram.rtc.activity;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class RtcIncomingParams extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(10);
    public final String A00;
    public final boolean A01;
    public final String A02;
    public final boolean A03;

    public RtcIncomingParams(String str, String str2, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcIncomingParams) {
                RtcIncomingParams rtcIncomingParams = (RtcIncomingParams) obj;
                if (!0qQ.A0K(this.A00, rtcIncomingParams.A00) || this.A03 != rtcIncomingParams.A03 || this.A01 != rtcIncomingParams.A01 || !0qQ.A0K(this.A02, rtcIncomingParams.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A09(this.A03, AnonymousClass7TE.A0O(this.A00))) + AnonymousClass7TG.A0E(this.A02);
    }
}
