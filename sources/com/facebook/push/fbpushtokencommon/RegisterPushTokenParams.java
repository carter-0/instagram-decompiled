package com.facebook.push.fbpushtokencommon;

import X.0qQ;
import X.AnonymousClass7TE;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class RegisterPushTokenParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(44);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeLong(this.A07);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0B);
        parcel.writeLong(this.A06);
        parcel.writeString(this.A0A);
        parcel.writeLong(this.A05);
        parcel.writeString(this.A08);
    }

    public RegisterPushTokenParams(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A0D = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A09 = readString2;
                String readString3 = parcel.readString();
                if (readString3 != null) {
                    this.A0C = readString3;
                    this.A00 = parcel.readInt();
                    this.A02 = parcel.readInt();
                    this.A07 = parcel.readLong();
                    String readString4 = parcel.readString();
                    readString4.getClass();
                    this.A0E = readString4;
                    this.A03 = parcel.readInt();
                    this.A04 = parcel.readInt();
                    this.A01 = parcel.readInt();
                    this.A0B = parcel.readString();
                    this.A06 = parcel.readLong();
                    this.A0A = parcel.readString();
                    this.A05 = parcel.readLong();
                    this.A08 = parcel.readString();
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
