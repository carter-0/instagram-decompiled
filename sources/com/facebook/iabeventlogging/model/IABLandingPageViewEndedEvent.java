package com.facebook.iabeventlogging.model;

import X.0qQ;
import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;

public final class IABLandingPageViewEndedEvent extends IABEvent {
    public final ZonedValue A00;
    public final long A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IABLandingPageViewEndedEvent(ZonedValue zonedValue, String str, long j, long j2) {
        super(C8945RGn.IAB_LANDING_PAGE_VIEW_ENDED, str, j, j2);
        0qQ.A0B(str, 1);
        this.A01 = j2;
        this.A00 = zonedValue;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABLandingPageViewEndedEvent{");
        Pxh.A1C(this, "type=", A16);
        Pxf.A12(this.A01, A16);
        String A0y = Pxg.A0y(A16, this.A01);
        0qQ.A07(A0y);
        return A0y;
    }
}
