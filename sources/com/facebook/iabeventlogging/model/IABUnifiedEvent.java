package com.facebook.iabeventlogging.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C391409su;
import X.C8945RGn;
import X.DbW;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.RVW;
import android.os.Parcel;

public final class IABUnifiedEvent extends IABEvent {
    public final C391409su A00;
    public final Integer A01;
    public final String A02;
    public final long A03;
    public final long A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IABUnifiedEvent(C391409su r8, Integer num, String str, String str2, long j, long j2) {
        super(C8945RGn.IAB_UNIFIED, str, j, j2);
        DbW.A1N(str, 1, num);
        this.A05 = str;
        this.A04 = j;
        this.A03 = j2;
        this.A00 = r8;
        this.A01 = num;
        this.A02 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeString(RVW.A00(this.A01));
        parcel.writeString(this.A02);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABUnifiedEvent{");
        A16.append(", type=");
        A16.append(this.A02);
        A16.append(", iabSessionId='");
        Pxf.A1P(A16, this.A05);
        A16.append(", eventTs=");
        Pxf.A12(this.A04, A16);
        A16.append(this.A03);
        A16.append(", unifiedEventName=");
        A16.append(this.A00);
        A16.append(", unifiedEventCategory=");
        A16.append(RVW.A00(this.A01));
        A16.append(", reason=");
        A16.append(this.A02);
        String A0x = Pxg.A0x(A16);
        0qQ.A07(A0x);
        return A0x;
    }
}
