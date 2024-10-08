package com.facebook.push.constants;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C8900REs;
import X.Pxi;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public final class PushProperty implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(43);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C8900REs A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeSerializable(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0E);
        parcel.writeLong(this.A03);
        parcel.writeByte(this.A0G ? (byte) 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A00);
        parcel.writeValue(this.A05);
        parcel.writeLong(this.A01);
    }

    public PushProperty(Parcel parcel) {
        Serializable readSerializable = parcel.readSerializable();
        0qQ.A0C(readSerializable, "null cannot be cast to non-null type com.facebook.push.constants.PushSource");
        this.A04 = (C8900REs) readSerializable;
        this.A0A = parcel.readString();
        this.A02 = parcel.readLong();
        this.A08 = parcel.readString();
        this.A0B = parcel.readString();
        this.A0E = parcel.readString();
        this.A03 = parcel.readLong();
        this.A0G = AnonymousClass7TF.A1P(parcel.readByte());
        this.A06 = parcel.readString();
        this.A0C = parcel.readString();
        this.A09 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0F = parcel.readString();
        this.A0D = parcel.readString();
        this.A00 = parcel.readInt();
        this.A05 = (Integer) Pxi.A0U(parcel, Integer.TYPE);
        this.A01 = parcel.readLong();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PushProperty{source=");
        A1A.append(this.A04);
        A1A.append(", notifId='");
        A1A.append(this.A0A);
        A1A.append("', deliveryId='");
        A1A.append(this.A06);
        A1A.append("', receivedTime=");
        A1A.append(this.A02);
        A1A.append(", msgId='");
        A1A.append(this.A08);
        A1A.append("', notifType='");
        A1A.append(this.A0B);
        A1A.append("', senderId='");
        A1A.append(this.A0E);
        A1A.append("', serverPushTime=");
        A1A.append(this.A03);
        A1A.append(", isLoggedOutPush=");
        A1A.append(this.A0G);
        A1A.append(", pnid='");
        A1A.append(this.A0C);
        A1A.append("', priorityDiff='");
        A1A.append(this.A05);
        return AnonymousClass7TF.A0l("'}", A1A);
    }
}
