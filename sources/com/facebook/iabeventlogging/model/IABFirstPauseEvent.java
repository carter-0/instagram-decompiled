package com.facebook.iabeventlogging.model;

import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;
import java.util.ArrayList;

public class IABFirstPauseEvent extends IABEvent {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final ZonedValue A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final ArrayList A0J;
    public final boolean A0K;
    public final boolean A0L;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IABFirstPauseEvent(com.facebook.privacy.zone.api.ZonedValue r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.ArrayList r15, int r16, int r17, int r18, int r19, long r20, long r22, long r24, long r26, long r28, long r30, long r32, long r34, long r36, long r38, long r40, long r42, boolean r44, boolean r45) {
        /*
            r9 = this;
            X.RGn r3 = X.C8945RGn.IAB_FIRST_PAUSE
            r5 = r20
            r2 = r9
            r7 = r22
            r4 = r11
            r2.<init>(r3, r4, r5, r7)
            r0 = r38
            r9.A07 = r0
            r0 = r40
            r9.A08 = r0
            r0 = r24
            r9.A0D = r0
            r0 = r26
            r9.A0E = r0
            r0 = r28
            r9.A05 = r0
            r0 = r30
            r9.A0C = r0
            r0 = r32
            r9.A06 = r0
            r0 = r34
            r9.A09 = r0
            r0 = r36
            r9.A0A = r0
            r9.A04 = r5
            r9.A0J = r15
            if (r10 != 0) goto L_0x003e
            com.facebook.privacy.zone.policy.ZonePolicy r1 = com.facebook.privacy.zone.policy.ZonePolicy.A05
            java.lang.String r0 = ""
            com.facebook.privacy.zone.api.ZonedValue r10 = new com.facebook.privacy.zone.api.ZonedValue
            r10.<init>(r1, r0)
        L_0x003e:
            r9.A0F = r10
            r9.A0I = r12
            r9.A0G = r13
            r0 = r16
            r9.A00 = r0
            r0 = r17
            r9.A02 = r0
            r0 = r18
            r9.A03 = r0
            r0 = r19
            r9.A01 = r0
            r0 = r44
            r9.A0K = r0
            r9.A0H = r14
            r0 = r45
            r9.A0L = r0
            r0 = r42
            r9.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.iabeventlogging.model.IABFirstPauseEvent.<init>(com.facebook.privacy.zone.api.ZonedValue, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, int, int, int, int, long, long, long, long, long, long, long, long, long, long, long, long, boolean, boolean):void");
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABFirstPauseEvent{");
        A16.append("userClickTs=");
        A16.append(this.A0D);
        A16.append(", webRequestStartedTs=");
        A16.append(this.A0E);
        A16.append(", browserOpenTs=");
        A16.append(this.A05);
        A16.append(", scrollReadyTs=");
        A16.append(this.A0C);
        A16.append(", landingPageDomContentLoadedTs=");
        A16.append(this.A06);
        A16.append(", landingPageLoadedTs=");
        A16.append(this.A09);
        A16.append(", landingPageViewEndedTs=");
        A16.append(this.A0A);
        A16.append(", browserCloseTs=");
        A16.append(this.A04);
        A16.append(", backgroundTimePairs=");
        A16.append(this.A0J);
        A16.append(", initialLandUrl='");
        char A002 = Pxf.A00(this.A0I, A16);
        A16.append(", clickSource='");
        A16.append(this.A0G);
        A16.append(A002);
        A16.append(", dismissMethod=");
        A16.append(this.A00);
        A16.append(", landingPageStatusCode=");
        A16.append(this.A02);
        A16.append(", sslErrorCode=");
        A16.append(this.A03);
        A16.append(", interactionCount=");
        A16.append(this.A01);
        Pxh.A1D(this, A16, A002);
        A16.append(this.A00);
        A16.append(", isInitialUrlIsOpenApp=");
        A16.append(this.A0K);
        A16.append(", deepLinkUrl=");
        A16.append(this.A0H);
        A16.append(", shouldUseLEDesign=");
        A16.append(this.A0L);
        A16.append(", landingPageFirstContentfulPaintTs=");
        A16.append(this.A07);
        A16.append(", landingPageLargestContentfulPaintTs=");
        A16.append(this.A08);
        A16.append(", maxInteractionDelayMs=");
        return Pxg.A0y(A16, this.A0B);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0E);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A0C);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A09);
        parcel.writeLong(this.A0A);
        parcel.writeList(this.A0J);
        parcel.writeParcelable(this.A0F, i);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeString(this.A0H);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A0B);
    }
}
