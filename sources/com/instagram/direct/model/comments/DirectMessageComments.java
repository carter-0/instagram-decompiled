package com.instagram.direct.model.comments;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;

public final class DirectMessageComments extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(96);
    public int A00 = 0;
    public String A01 = "";

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectMessageComments) {
                DirectMessageComments directMessageComments = (DirectMessageComments) obj;
                if (this.A00 != directMessageComments.A00 || !0qQ.A0K(this.A01, directMessageComments.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }
}
