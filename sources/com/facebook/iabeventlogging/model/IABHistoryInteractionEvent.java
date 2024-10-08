package com.facebook.iabeventlogging.model;

import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.RVV;
import android.os.Parcel;

public class IABHistoryInteractionEvent extends IABEvent {
    public final Integer A00;
    public final String A01;

    public IABHistoryInteractionEvent(Integer num, String str, String str2, long j, long j2) {
        super(C8945RGn.IAB_HISTORY_UX_INTERACTION, str, j, j2);
        this.A00 = num;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABHistoryInteractionEvent{");
        A16.append("interaction='");
        Pxh.A1D(this, A16, Pxf.A00(RVV.A00(this.A00), A16));
        A16.append(this.A00);
        A16.append(", errorMessage=");
        A16.append(this.A01);
        return Pxg.A0x(A16);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(RVV.A00(this.A00));
        parcel.writeString(this.A01);
    }
}
