package com.facebook.cellinfo.parcelable;

import X.C21455XbI;
import X.SWS;
import X.XnC;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableGeneralCellInfo extends C21455XbI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWS(63);

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.XbI, com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo] */
    public static ParcelableGeneralCellInfo A00(C21455XbI xbI) {
        XnC xnC;
        C21455XbI xbI2 = xbI;
        if (xbI == null) {
            return null;
        }
        String str = xbI2.A05;
        String str2 = xbI2.A06;
        String str3 = xbI2.A07;
        String str4 = xbI2.A08;
        boolean z = xbI2.A09;
        String str5 = xbI2.A04;
        String str6 = xbI2.A01;
        String str7 = xbI2.A02;
        String str8 = xbI2.A03;
        boolean z2 = xbI2.A0A;
        XnC xnC2 = xbI2.A00;
        if (xnC2 == null) {
            xnC = null;
        } else {
            int i = xnC2.A01;
            int i2 = xnC2.A02;
            int i3 = xnC2.A00;
            Double d = xnC2.A03;
            Double d2 = xnC2.A04;
            Double d3 = d;
            xnC = new XnC(d3, d2, i, i2, i3);
        }
        return new C21455XbI(xnC, str, str2, str3, str4, str5, str6, str7, str8, z, z2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeParcelable((ParcelableCdmaCellInfo) this.A00, i);
    }
}
