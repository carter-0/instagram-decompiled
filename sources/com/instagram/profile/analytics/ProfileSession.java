package com.instagram.profile.analytics;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProfileSession extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(70);
    public final String A00;
    public final String A01;
    public final String A02;

    public ProfileSession(String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileSession) {
                ProfileSession profileSession = (ProfileSession) obj;
                if (!0qQ.A0K(this.A01, profileSession.A01) || !0qQ.A0K(this.A02, profileSession.A02) || !0qQ.A0K(this.A00, profileSession.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
