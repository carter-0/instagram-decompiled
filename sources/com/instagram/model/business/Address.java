package com.instagram.model.business;

import X.0qQ;
import X.C71269Ogb;
import X.DbY;
import X.Dba;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class Address implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(23);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            Address address = (Address) obj;
            if (!0qQ.A0K(this.A03, address.A03) || !0qQ.A0K(this.A01, address.A01) || !0qQ.A0K(this.A04, address.A04) || !0qQ.A0K(this.A00, address.A00) || !0qQ.A0K(this.A02, address.A02)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A01, this.A04, this.A00, this.A02});
    }

    public Address(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7 = null;
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean A1a = Dbb.A1a(str, !z ? i : length);
                if (z) {
                    if (!A1a) {
                        break;
                    }
                    length--;
                } else if (!A1a) {
                    z = true;
                } else {
                    i++;
                }
            }
            str6 = Dba.A0c(str, length, i);
        } else {
            str6 = null;
        }
        this.A04 = str6;
        this.A01 = str2;
        if (str4 != null) {
            int length2 = str4.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length2) {
                boolean A1a2 = Dbb.A1a(str4, !z2 ? i2 : length2);
                if (z2) {
                    if (!A1a2) {
                        break;
                    }
                    length2--;
                } else if (!A1a2) {
                    z2 = true;
                } else {
                    i2++;
                }
            }
            str7 = Dba.A0c(str4, length2, i2);
        }
        this.A02 = str7;
        this.A00 = str3;
        this.A03 = str5;
    }

    public Address() {
    }
}
