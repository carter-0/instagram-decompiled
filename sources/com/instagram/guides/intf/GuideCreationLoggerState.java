package com.instagram.guides.intf;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.EZL;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class GuideCreationLoggerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(63);
    public int A00;
    public int A01;
    public long A02;
    public GuideCreationType A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final EZL A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        AnonymousClass7TE.A1T(parcel, this.A09);
        this.A03.writeToParcel(parcel, i);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public GuideCreationLoggerState(EZL ezl, GuideCreationType guideCreationType, String str, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TG.A1Q(ezl, guideCreationType);
        this.A04 = str;
        this.A09 = ezl;
        this.A03 = guideCreationType;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = z;
        this.A08 = z2;
        this.A05 = z3;
        this.A06 = z4;
        if (ezl == EZL.CREATION_EDIT_GUIDE) {
            this.A05 = true;
            this.A06 = true;
        }
    }
}
