package com.facebook.iabeventlogging.model;

import X.0qQ;
import X.AnonymousClass59G;
import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import android.os.Parcel;

public final class IABIPAMatchKeyEvent extends IABEvent {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final AnonymousClass59G A06;

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        AnonymousClass59G r1 = this.A06;
        parcel.writeString((String) r1.A00);
        parcel.writeString((String) r1.A01);
        parcel.writeString((String) r1.A02);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
    }

    public IABIPAMatchKeyEvent(String str, String str2, AnonymousClass59G r12, long j, long j2, long j3, long j4) {
        super(C8945RGn.IAB_IPA_MATCH_KEY, str, j, j2);
        this.A05 = str;
        this.A03 = j;
        this.A01 = j2;
        this.A06 = r12;
        this.A02 = j3;
        this.A00 = j4;
        this.A04 = str2;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABOpenSecureInfoPopupEvent{");
        A16.append("type=");
        A16.append(this.A02);
        A16.append(", iabSessionId='");
        Pxf.A1P(A16, this.A05);
        A16.append(", eventTs=");
        Pxf.A12(this.A03, A16);
        A16.append(this.A01);
        A16.append(", firstMatchKey=");
        AnonymousClass59G r1 = this.A06;
        A16.append((String) r1.A00);
        A16.append(", secondMatchKey=");
        A16.append((String) r1.A01);
        A16.append(", thirdMatchKey=");
        A16.append((String) r1.A02);
        A16.append(", elapsedTime=");
        A16.append(this.A02);
        A16.append(", adId=");
        A16.append(this.A00);
        A16.append(", clickId=");
        A16.append(this.A04);
        String A0x = Pxg.A0x(A16);
        0qQ.A07(A0x);
        return A0x;
    }
}
