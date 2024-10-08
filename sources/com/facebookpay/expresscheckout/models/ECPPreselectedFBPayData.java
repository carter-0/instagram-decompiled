package com.facebookpay.expresscheckout.models;

import X.002;
import X.0qQ;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class ECPPreselectedFBPayData implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(41);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ECPPreselectedFBPayData) {
                ECPPreselectedFBPayData eCPPreselectedFBPayData = (ECPPreselectedFBPayData) obj;
                if (!0qQ.A0K(this.A00, eCPPreselectedFBPayData.A00) || !0qQ.A0K(this.A03, eCPPreselectedFBPayData.A03) || !0qQ.A0K(this.A01, eCPPreselectedFBPayData.A01) || !0qQ.A0K(this.A02, eCPPreselectedFBPayData.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A17("ECPPreselectedFBPayData(selectedCredentialId=", this.A00, ", selectedShippingAddressId=", this.A03, ", selectedEmailId=", this.A01, ", selectedPhoneId=", this.A02, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02);
    }

    public ECPPreselectedFBPayData(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public ECPPreselectedFBPayData() {
        this((String) null, (String) null, (String) null, (String) null);
    }
}
