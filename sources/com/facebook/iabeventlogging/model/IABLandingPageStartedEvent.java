package com.facebook.iabeventlogging.model;

import X.0qQ;
import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;

public final class IABLandingPageStartedEvent extends IABEvent {
    public final ZonedValue A00;
    public final boolean A01;
    public final long A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IABLandingPageStartedEvent(ZonedValue zonedValue, String str, long j, long j2, boolean z) {
        super(C8945RGn.IAB_LANDING_PAGE_STARTED, str, j, j2);
        0qQ.A0B(str, 1);
        this.A02 = j2;
        this.A00 = zonedValue;
        this.A01 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABLandingPageStartedEvent{");
        A16.append("isCookieLoadComplete=");
        A16.append(this.A01);
        Pxh.A1C(this, ", type=", A16);
        Pxf.A12(this.A01, A16);
        String A0y = Pxg.A0y(A16, this.A02);
        0qQ.A07(A0y);
        return A0y;
    }
}
