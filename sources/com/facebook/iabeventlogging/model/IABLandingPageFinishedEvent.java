package com.facebook.iabeventlogging.model;

import X.0qQ;
import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;
import java.util.List;

public final class IABLandingPageFinishedEvent extends IABEvent {
    public final ZonedValue A00;
    public final String A01;
    public final long A02;
    public final List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IABLandingPageFinishedEvent(ZonedValue zonedValue, String str, String str2, List list, long j, long j2) {
        super(C8945RGn.IAB_LANDING_PAGE_FINISHED, str, j, j2);
        0qQ.A0B(str, 1);
        this.A02 = j2;
        this.A00 = zonedValue;
        this.A01 = str2;
        this.A03 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeList(this.A03);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABLandingPageFinishedEvent{");
        A16.append("zonedInitialUrl='");
        char A002 = Pxf.A00("--zone_wrapped_value--", A16);
        A16.append(", initialLandUrl='");
        A16.append(this.A01);
        A16.append(A002);
        Pxh.A1D(this, A16, A002);
        A16.append(this.A02);
        A16.append(", postClickEligibleExperienceTypes=");
        String A0p = Pxg.A0p(this.A03, A16);
        0qQ.A07(A0p);
        return A0p;
    }
}
