package com.instagram.direct.model.thread;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;

public final class ChannelsContextLine extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(99);
    public String A00 = null;
    public String A01 = null;
    public String A02 = null;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChannelsContextLine) {
                ChannelsContextLine channelsContextLine = (ChannelsContextLine) obj;
                if (!0qQ.A0K(this.A01, channelsContextLine.A01) || !0qQ.A0K(this.A00, channelsContextLine.A00) || !0qQ.A0K(this.A02, channelsContextLine.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A00;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }
}
