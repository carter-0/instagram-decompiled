package com.instagram.direct.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;

public final class DirectMessageEditHistory extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(94);
    public long A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectMessageEditHistory) {
                DirectMessageEditHistory directMessageEditHistory = (DirectMessageEditHistory) obj;
                if (!0qQ.A0K(this.A01, directMessageEditHistory.A01) || this.A00 != directMessageEditHistory.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
    }

    public final int hashCode() {
        long j = this.A00;
        return (this.A01.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }
}
