package com.instagram.model.business;

import X.0qQ;
import X.C71269Ogb;
import X.DbY;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class PublicPhoneContact implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(26);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            PublicPhoneContact publicPhoneContact = (PublicPhoneContact) obj;
            if (!0qQ.A0K(this.A03, publicPhoneContact.A03) || !0qQ.A0K(this.A00, publicPhoneContact.A00) || !0qQ.A0K(this.A01, publicPhoneContact.A01) || !0qQ.A0K(this.A02, publicPhoneContact.A02)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A00, this.A01, this.A02});
    }
}
