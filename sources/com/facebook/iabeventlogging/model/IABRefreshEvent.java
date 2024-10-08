package com.facebook.iabeventlogging.model;

import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import android.os.Parcel;

public class IABRefreshEvent extends IABEvent {
    public final String A00;

    public IABRefreshEvent(long j, String str, long j2, String str2) {
        super(C8945RGn.IAB_REFRESH, str, j, j2);
        this.A00 = str2;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABRefreshEvent{");
        A16.append("refreshFromType='");
        Pxh.A1D(this, A16, Pxf.A00(this.A00, A16));
        return Pxg.A0y(A16, this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
