package com.facebook.iabeventlogging.model;

import X.0qQ;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;

public final class IABLandingPageInteractiveEvent extends IABEvent {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final ZonedValue A04;
    public final String A05;
    public final String A06;
    public final long A07;
    public final boolean A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IABLandingPageInteractiveEvent(com.facebook.privacy.zone.api.ZonedValue r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, int r15, long r16, long r18, long r20, boolean r22) {
        /*
            r9 = this;
            r0 = 1
            r4 = r11
            X.0qQ.A0B(r11, r0)
            X.RGn r3 = X.C8945RGn.IAB_LANDING_PAGE_INTERACTIVE
            r2 = r9
            r5 = r16
            r7 = r18
            r2.<init>(r3, r4, r5, r7)
            r9.A02 = r5
            r9.A07 = r7
            r9.A04 = r10
            r9.A06 = r12
            r9.A01 = r14
            r9.A00 = r15
            r0 = r22
            r9.A08 = r0
            r9.A05 = r13
            r0 = r20
            r9.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent.<init>(com.facebook.privacy.zone.api.ZonedValue, java.lang.String, java.lang.String, java.lang.String, int, int, long, long, long, boolean):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A03);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABLandingPageInteractiveEvent{");
        A16.append(", initialLandUrl='");
        char A002 = Pxf.A00(this.A06, A16);
        A16.append(", screenWidth=");
        A16.append(this.A01);
        A16.append(", pageContentWidth=");
        A16.append(this.A00);
        A16.append(", isCookieLoadComplete=");
        A16.append(this.A08);
        Pxh.A1D(this, A16, A002);
        A16.append(this.A07);
        A16.append(", clickSource=");
        A16.append(this.A05);
        A16.append(", userClickTs=");
        String A0y = Pxg.A0y(A16, this.A03);
        0qQ.A07(A0y);
        return A0y;
    }
}
