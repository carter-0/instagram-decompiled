package com.facebook.iabeventlogging.model;

import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import android.os.Parcel;

public class IABOpenSecureInfoPopupEvent extends IABEvent {
    public final boolean A00;

    public IABOpenSecureInfoPopupEvent(long j, String str, boolean z, long j2) {
        super(C8945RGn.IAB_OPEN_SECURE_INFO_POPUP, str, j, j2);
        this.A00 = z;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABOpenSecureInfoPopupEvent{");
        Pxh.A1C(this, "type=", A16);
        Pxf.A12(this.A01, A16);
        A16.append(this.A00);
        A16.append(", isSecure=");
        A16.append(this.A00);
        return Pxg.A0x(A16);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }
}
