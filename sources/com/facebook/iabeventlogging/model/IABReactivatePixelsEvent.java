package com.facebook.iabeventlogging.model;

import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import android.os.Parcel;

public class IABReactivatePixelsEvent extends IABEvent {
    public final String A00;
    public final String A01;

    public IABReactivatePixelsEvent(String str, String str2, String str3, long j, long j2) {
        super(C8945RGn.IAB_REACTIVATE_PIXELS, str, j, j2);
        this.A00 = str2;
        this.A01 = str3;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABReactivatePixelsEvent{");
        A16.append("initialUrl='");
        char A002 = Pxf.A00(this.A01, A16);
        A16.append(", clickSource='");
        A16.append(this.A00);
        A16.append(A002);
        Pxh.A1D(this, A16, A002);
        return Pxg.A0y(A16, this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
