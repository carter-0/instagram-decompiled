package com.encryptedbackups.storagemanagers.otc.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51975G9x;
import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;

public final class OneTimeCodeDevice implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7216Pzk(85);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public OneTimeCodeDevice(String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A02 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OneTimeCodeDevice) {
                OneTimeCodeDevice oneTimeCodeDevice = (OneTimeCodeDevice) obj;
                if (!0qQ.A0K(this.A00, oneTimeCodeDevice.A00) || !0qQ.A0K(this.A04, oneTimeCodeDevice.A04) || !0qQ.A0K(this.A01, oneTimeCodeDevice.A01) || !0qQ.A0K(this.A03, oneTimeCodeDevice.A03) || !0qQ.A0K(this.A02, oneTimeCodeDevice.A02)) {
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
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A02);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OneTimeCodeDevice(deviceId=");
        A1A.append(this.A00);
        A1A.append(", deviceManufacturer=");
        A1A.append(this.A04);
        A1A.append(", deviceModel=");
        A1A.append(this.A01);
        A1A.append(", lastLoginLocation=");
        A1A.append(this.A03);
        A1A.append(", lastLoginDate=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}
