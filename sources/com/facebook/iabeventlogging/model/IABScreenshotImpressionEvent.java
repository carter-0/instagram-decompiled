package com.facebook.iabeventlogging.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C8945RGn;
import X.RIk;
import android.os.Parcel;

public final class IABScreenshotImpressionEvent extends IABEvent {
    public final RIk A00;
    public final String A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IABScreenshotImpressionEvent(RIk rIk, String str, String str2, String str3, long j) {
        super(C8945RGn.IAB_SCREENSHOT_IMPRESSION, str, j, j);
        0qQ.A0B(rIk, 4);
        this.A02 = str2;
        this.A00 = rIk;
        this.A01 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeString(this.A01);
    }
}
