package com.facebook.iabeventlogging.model;

import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;

public class IABReportStartEvent extends IABEvent {
    public final ZonedValue A00;
    public final String A01;
    public final String A02;

    public IABReportStartEvent(ZonedValue zonedValue, String str, String str2, String str3, long j, long j2) {
        super(C8945RGn.IAB_REPORT_START, str, j, j2);
        this.A01 = str2;
        this.A00 = zonedValue;
        this.A02 = str3;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABReportStartEvent{");
        A16.append("targetUrl='");
        char A002 = Pxf.A00(this.A02, A16);
        A16.append(", clickSource='");
        A16.append(this.A01);
        A16.append(A002);
        Pxh.A1D(this, A16, A002);
        return Pxg.A0y(A16, this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }
}
