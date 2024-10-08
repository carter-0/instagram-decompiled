package com.instagram.creation.base;

import X.0qQ;
import X.A6E;
import X.AnonymousClass05K;
import X.AnonymousClass3Q2;
import X.AnonymousClass7TF;
import X.C376399Hv;
import X.C41847B3o;
import X.C64921LkM;
import X.C66434MRo;
import X.C66435MRp;
import X.LVP;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;

public final class VideoSession implements MediaSession {
    public static final Parcelable.Creator CREATOR = LVP.A00(7);
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -1;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public Location A0B;
    public CropInfo A0C;
    public FilterGroupModel A0D;
    public FilterGroupModel A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public A6E A0M;
    public final C66435MRp A0N = new C64921LkM(this);
    public final C66434MRo A0O = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.MRo] */
    public VideoSession(Parcel parcel) {
        this.A0G = parcel.readString();
        this.A0C = (CropInfo) C41847B3o.A03(parcel, CropInfo.class);
        this.A0D = (FilterGroupModel) C41847B3o.A03(parcel, FilterGroupModel.class);
        boolean z = false;
        this.A0I = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        this.A0K = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        this.A00 = parcel.readFloat();
        String readString = parcel.readString();
        0qQ.A0A(readString);
        this.A0H = readString;
        this.A0F = parcel.readString();
        this.A0B = (Location) C41847B3o.A03(parcel, Location.class);
        this.A08 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0L = AnonymousClass7TF.A1S(parcel.readByte(), 1);
        this.A09 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0J = parcel.readByte() == 1 ? true : z;
        this.A04 = parcel.readInt();
        this.A0A = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeParcelable(this.A0D, i);
        parcel.writeByte(this.A0I ? (byte) 1 : 0);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0F);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A0J ? (byte) 1 : 0);
        parcel.writeInt(this.A04);
        parcel.writeLong(this.A0A);
    }

    public final void A00(AnonymousClass3Q2 r3) {
        ClipInfo clipInfo;
        if (r3 != null && (clipInfo = r3.A1N) != null && !clipInfo.equals(C376399Hv.A00())) {
            this.A08 = r3.A1i.A01;
            this.A07 = r3.A05;
            ClipInfo clipInfo2 = r3.A1N;
            this.A06 = clipInfo2.A07;
            this.A05 = clipInfo2.A05;
            this.A0L = r3.A5F;
        }
    }

    public final long Afz() {
        return this.A0A;
    }

    public final CropInfo Asr() {
        return this.A0C;
    }

    public final C66434MRo B2U() {
        return this.A0O;
    }

    public final String B5g() {
        return this.A0H;
    }

    public final FilterGroupModel B5r() {
        return this.A0D;
    }

    public final Location BNg() {
        return this.A0B;
    }

    public final int BQn() {
        return this.A04;
    }

    public final String BbR() {
        return this.A0G;
    }

    public final C66435MRp BpN() {
        return this.A0N;
    }

    public final A6E BsX() {
        return this.A0M;
    }

    public final Integer Bsu() {
        return AnonymousClass05K.A01;
    }

    public final void EPg(long j) {
        this.A0A = j;
    }

    public final void ETK(CropInfo cropInfo) {
        this.A0C = cropInfo;
    }

    public final void EWh(String str) {
        this.A0H = str;
    }

    public final void EWm(FilterGroupModel filterGroupModel) {
        this.A0D = filterGroupModel;
    }

    public final void EcZ(Location location) {
        this.A0B = location;
    }

    public final void EdE(int i) {
        this.A04 = i;
    }

    public final void EfV(String str) {
        this.A0G = str;
    }

    public final void Ejx(A6E a6e) {
        this.A0M = a6e;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.MRo] */
    public VideoSession(String str, String str2) {
        this.A0H = str;
        this.A0F = str2;
    }
}
