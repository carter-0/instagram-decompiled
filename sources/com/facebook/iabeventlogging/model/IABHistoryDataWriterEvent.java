package com.facebook.iabeventlogging.model;

import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import android.os.Parcel;

public class IABHistoryDataWriterEvent extends IABEvent {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public IABHistoryDataWriterEvent(String str, String str2, String str3, long j, long j2, long j3, long j4) {
        super(C8945RGn.IAB_HISTORY_SAVE_URL, str, j, j2);
        this.A03 = str2;
        this.A01 = j3;
        this.A00 = j4;
        this.A02 = str3;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABDropPixelsEvent{");
        A16.append("url='");
        char A002 = Pxf.A00(this.A03, A16);
        A16.append(", startTs='");
        A16.append(this.A01);
        A16.append(A002);
        A16.append(", endTs='");
        A16.append(this.A00);
        A16.append(A002);
        A16.append(", title='");
        A16.append(this.A02);
        A16.append(A002);
        Pxh.A1D(this, A16, A002);
        return Pxg.A0y(A16, this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
    }
}
