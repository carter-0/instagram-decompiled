package com.instagram.creation.base;

import X.0qQ;
import X.A6E;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C41847B3o;
import X.C64919LkJ;
import X.C64920LkL;
import X.C66434MRo;
import X.C66435MRp;
import X.LVP;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

public final class PhotoSession implements MediaSession {
    public static final Parcelable.Creator CREATOR = LVP.A00(6);
    public float A00;
    public int A01;
    public int A02 = -1;
    public long A03;
    public Location A04;
    public CropInfo A05;
    public A6E A06;
    public FilterGroupModel A07;
    public FilterGroupModel A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public final C66434MRo A0D = new C64919LkJ(this);
    public final C66435MRp A0E = new C64920LkL(this);

    public PhotoSession(Parcel parcel) {
        this.A0A = parcel.readString();
        this.A01 = parcel.readInt();
        this.A05 = (CropInfo) C41847B3o.A03(parcel, CropInfo.class);
        Class<FilterGroupModel> cls = FilterGroupModel.class;
        this.A07 = (FilterGroupModel) C41847B3o.A03(parcel, cls);
        this.A08 = (FilterGroupModel) C41847B3o.A03(parcel, cls);
        String readString = parcel.readString();
        if (readString != null) {
            this.A0B = readString;
            this.A09 = parcel.readString();
            this.A0C = parcel.readByte() != 1 ? false : true;
            this.A00 = parcel.readFloat();
            this.A04 = (Location) C41847B3o.A03(parcel, Location.class);
            this.A02 = parcel.readInt();
            this.A03 = parcel.readLong();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeFloat(this.A00);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A02);
        parcel.writeLong(this.A03);
    }

    public final long Afz() {
        return this.A03;
    }

    public final CropInfo Asr() {
        return this.A05;
    }

    public final C66434MRo B2U() {
        return this.A0D;
    }

    public final String B5g() {
        return this.A0B;
    }

    public final FilterGroupModel B5r() {
        return this.A07;
    }

    public final Location BNg() {
        return this.A04;
    }

    public final int BQn() {
        return this.A02;
    }

    public final String BbR() {
        return this.A0A;
    }

    public final C66435MRp BpN() {
        return this.A0E;
    }

    public final A6E BsX() {
        return this.A06;
    }

    public final Integer Bsu() {
        return AnonymousClass05K.A00;
    }

    public final void EPg(long j) {
        this.A03 = j;
    }

    public final void ETK(CropInfo cropInfo) {
        this.A05 = cropInfo;
    }

    public final void EWh(String str) {
        this.A0B = str;
    }

    public final void EWm(FilterGroupModel filterGroupModel) {
        this.A07 = filterGroupModel;
    }

    public final void EcZ(Location location) {
        this.A04 = location;
    }

    public final void EdE(int i) {
        this.A02 = i;
    }

    public final void EfV(String str) {
        this.A0A = str;
    }

    public final void Ejx(A6E a6e) {
        this.A06 = a6e;
    }

    public PhotoSession(String str, String str2) {
        this.A0B = str;
        this.A09 = str2;
    }
}
