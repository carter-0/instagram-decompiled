package com.facebook.iabeventlogging.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C391449t6;
import X.C51974G9v;
import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.RIX;
import android.os.Parcel;

public final class IABChangeViewModeEvent extends IABEvent {
    public final C391449t6 A00;
    public final RIX A01;
    public final RIX A02;
    public final String A03;
    public final long A04;
    public final long A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IABChangeViewModeEvent(C391449t6 r8, RIX rix, RIX rix2, String str, String str2, long j, long j2) {
        super(C8945RGn.IAB_CHANGE_VIEW_MODE, str, j, j2);
        C51974G9v.A0d(1, str, rix, rix2, r8);
        this.A05 = j;
        this.A04 = j2;
        this.A01 = rix;
        this.A02 = rix2;
        this.A00 = r8;
        this.A03 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        AnonymousClass7TE.A1T(parcel, this.A01);
        AnonymousClass7TE.A1T(parcel, this.A02);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeString(this.A03);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABChangeViewModeEvent{");
        A16.append("fromMode='");
        Pxf.A1O(A16, this.A01);
        A16.append('\'');
        A16.append(", toMode='");
        Pxf.A1O(A16, this.A02);
        A16.append('\'');
        A16.append(", reason='");
        Pxf.A1O(A16, this.A00);
        A16.append('\'');
        A16.append(", type=");
        A16.append(this.A02);
        A16.append(", iabSessionId='");
        A16.append(this.A03);
        A16.append('\'');
        A16.append(", eventTs=");
        Pxf.A12(this.A05, A16);
        A16.append(this.A04);
        A16.append(", clickSource='");
        A16.append(this.A03);
        A16.append('\'');
        String A0x = Pxg.A0x(A16);
        0qQ.A07(A0x);
        return A0x;
    }
}
