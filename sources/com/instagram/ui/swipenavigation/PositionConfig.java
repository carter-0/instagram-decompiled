package com.instagram.ui.swipenavigation;

import X.0qQ;
import X.AnonymousClass3QO;
import X.AnonymousClass57C;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;

public final class PositionConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(78);
    public final float A00;
    public final int A01;
    public final AnonymousClass57C A02;
    public final CameraConfiguration A03;
    public final AnonymousClass3QO A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A0D);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A09);
        AnonymousClass57C r0 = this.A02;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(r0.name());
        }
        parcel.writeString(this.A08);
        AnonymousClass3QO r02 = this.A04;
        if (r02 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(r02.name());
    }

    public PositionConfig(AnonymousClass57C r2, CameraConfiguration cameraConfiguration, AnonymousClass3QO r4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, float f, int i, boolean z) {
        this.A00 = f;
        this.A0F = z;
        this.A0D = str;
        this.A03 = cameraConfiguration;
        this.A05 = str2;
        this.A0B = str3;
        this.A0C = str4;
        this.A0A = str5;
        this.A01 = i;
        this.A06 = str6;
        this.A07 = str7;
        this.A0E = str8;
        this.A09 = str9;
        this.A02 = r2;
        this.A08 = str10;
        this.A04 = r4;
    }
}
