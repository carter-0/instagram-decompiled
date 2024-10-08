package com.instagram.barcelona.location.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51968G9o;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public final class LocationModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(87);
    public final long A00;
    public final Double A01;
    public final Double A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public LocationModel(Double d, Double d2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j) {
        0qQ.A0B(str, 2);
        this.A00 = j;
        this.A06 = str;
        this.A01 = d;
        this.A02 = d2;
        this.A05 = str2;
        this.A04 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A07 = str6;
        this.A09 = str7;
        this.A08 = str8;
        this.A0C = str9;
        this.A03 = str10;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationModel) {
                LocationModel locationModel = (LocationModel) obj;
                if (this.A00 != locationModel.A00 || !0qQ.A0K(this.A06, locationModel.A06) || !0qQ.A0K(this.A01, locationModel.A01) || !0qQ.A0K(this.A02, locationModel.A02) || !0qQ.A0K(this.A05, locationModel.A05) || !0qQ.A0K(this.A04, locationModel.A04) || !0qQ.A0K(this.A0A, locationModel.A0A) || !0qQ.A0K(this.A0B, locationModel.A0B) || !0qQ.A0K(this.A07, locationModel.A07) || !0qQ.A0K(this.A09, locationModel.A09) || !0qQ.A0K(this.A08, locationModel.A08) || !0qQ.A0K(this.A0C, locationModel.A0C) || !0qQ.A0K(this.A03, locationModel.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A06);
        Double d = this.A01;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.A02;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return ((((((((((((((((((((AnonymousClass7TF.A08(this.A06, C51968G9o.A03(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31) + C41845B3m.A00(this.A03);
    }
}
