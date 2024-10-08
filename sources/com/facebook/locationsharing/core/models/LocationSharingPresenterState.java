package com.facebook.locationsharing.core.models;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass7TF;
import X.C11367SPk;
import X.C18520VtK;
import X.C249803kO;
import X.C51968G9o;
import X.C51971G9r;
import X.Pxf;
import X.Pxg;
import X.Pxi;
import X.Pxj;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class LocationSharingPresenterState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWZ(30);
    public final int A00;
    public final long A01;
    public final Address A02;
    public final LiveLocationSession A03;
    public final Location A04;
    public final Location A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationSharingPresenterState) {
                LocationSharingPresenterState locationSharingPresenterState = (LocationSharingPresenterState) obj;
                if (!0qQ.A0K(this.A06, locationSharingPresenterState.A06) || !0qQ.A0K(this.A04, locationSharingPresenterState.A04) || this.A01 != locationSharingPresenterState.A01 || !0qQ.A0K(this.A03, locationSharingPresenterState.A03) || !0qQ.A0K(this.A02, locationSharingPresenterState.A02) || this.A0D != locationSharingPresenterState.A0D || !0qQ.A0K(this.A05, locationSharingPresenterState.A05) || !0qQ.A0K(this.A07, locationSharingPresenterState.A07) || !0qQ.A0K(this.A08, locationSharingPresenterState.A08) || this.A00 != locationSharingPresenterState.A00 || !0qQ.A0K(this.A0B, locationSharingPresenterState.A0B) || !0qQ.A0K(this.A09, locationSharingPresenterState.A09) || !0qQ.A0K(this.A0A, locationSharingPresenterState.A0A) || !0qQ.A0K(this.A0C, locationSharingPresenterState.A0C)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((C11367SPk.A00(((((((((C51971G9r.A0E(this.A06) + 31) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51968G9o.A03(this.A01)) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A02), this.A0D) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A07)) * 31) + C51971G9r.A0E(this.A08)) * 31) + this.A00) * 31) + C51971G9r.A0E(this.A0B)) * 31) + C51971G9r.A0E(this.A09)) * 31) + C51971G9r.A0E(this.A0A)) * 31) + C51971G9r.A0E(this.A0C);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSharingPresenterState{addedSharerIds=");
        sb.append(this.A06);
        sb.append(", currentLocation=");
        sb.append(this.A04);
        sb.append(", currentTimeMillis=");
        sb.append(this.A01);
        sb.append(", liveLocationSession=");
        sb.append(this.A03);
        sb.append(", mapAddress=");
        sb.append(this.A02);
        sb.append(", mapDragging=");
        sb.append(this.A0D);
        sb.append(", mapLocation=");
        sb.append(this.A05);
        sb.append(", pointsOfInterest=");
        sb.append(this.A07);
        sb.append(", removedSharerIds=");
        sb.append(this.A08);
        sb.append(", selectedPointOfInterestIndex=");
        sb.append(this.A00);
        sb.append(", selectedSharerId=");
        sb.append(this.A0B);
        sb.append(", sharers=");
        sb.append(this.A09);
        sb.append(", updatedSharerIds=");
        sb.append(this.A0A);
        sb.append(AnonymousClass000.A00(855));
        sb.append(this.A0C);
        return AnonymousClass7TF.A0l("}", sb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C249803kO A0P = Pxi.A0P(parcel, this.A06);
        while (A0P.hasNext()) {
            Pxi.A15(parcel, A0P);
        }
        Pxj.A18(parcel, this.A04, i);
        parcel.writeLong(this.A01);
        Pxj.A18(parcel, this.A03, i);
        Pxj.A18(parcel, this.A02, i);
        parcel.writeInt(this.A0D ? 1 : 0);
        Pxj.A18(parcel, this.A05, i);
        C249803kO A0P2 = Pxi.A0P(parcel, this.A07);
        while (A0P2.hasNext()) {
            parcel.writeParcelable((PointOfInterest) A0P2.next(), i);
        }
        C249803kO A0P3 = Pxi.A0P(parcel, this.A08);
        while (A0P3.hasNext()) {
            Pxi.A15(parcel, A0P3);
        }
        parcel.writeInt(this.A00);
        Pxj.A1B(parcel, this.A0B, 0, 1);
        C249803kO A0P4 = Pxi.A0P(parcel, this.A09);
        while (A0P4.hasNext()) {
            parcel.writeParcelable((LiveLocationSharer) A0P4.next(), i);
        }
        C249803kO A0P5 = Pxi.A0P(parcel, this.A0A);
        while (A0P5.hasNext()) {
            Pxi.A15(parcel, A0P5);
        }
        parcel.writeString(this.A0C);
    }

    public LocationSharingPresenterState(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            strArr[i] = parcel.readString();
        }
        this.A06 = ImmutableList.copyOf((Object[]) strArr);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (Location) parcel.readParcelable(A0W);
        }
        this.A01 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (LiveLocationSession) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (Address) parcel.readParcelable(A0W);
        }
        this.A0D = Pxg.A1U(parcel);
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (Location) parcel.readParcelable(A0W);
        }
        int readInt2 = parcel.readInt();
        Object[] objArr = new PointOfInterest[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            objArr[i2] = parcel.readParcelable(A0W);
        }
        this.A07 = ImmutableList.copyOf(objArr);
        int readInt3 = parcel.readInt();
        String[] strArr2 = new String[readInt3];
        for (int i3 = 0; i3 < readInt3; i3++) {
            strArr2[i3] = parcel.readString();
        }
        this.A08 = ImmutableList.copyOf((Object[]) strArr2);
        this.A00 = parcel.readInt();
        this.A0B = parcel.readInt() != 0 ? parcel.readString() : str;
        int readInt4 = parcel.readInt();
        Object[] objArr2 = new LiveLocationSharer[readInt4];
        for (int i4 = 0; i4 < readInt4; i4++) {
            objArr2[i4] = parcel.readParcelable(A0W);
        }
        this.A09 = ImmutableList.copyOf(objArr2);
        int readInt5 = parcel.readInt();
        String[] strArr3 = new String[readInt5];
        for (int i5 = 0; i5 < readInt5; i5++) {
            strArr3[i5] = parcel.readString();
        }
        this.A0A = ImmutableList.copyOf((Object[]) strArr3);
        this.A0C = parcel.readString();
    }

    public LocationSharingPresenterState(C18520VtK vtK) {
        ImmutableList immutableList = vtK.A06;
        C11367SPk.A03(immutableList, "addedSharerIds");
        this.A06 = immutableList;
        this.A04 = vtK.A04;
        this.A01 = vtK.A01;
        this.A03 = vtK.A03;
        this.A02 = vtK.A02;
        this.A0D = vtK.A0D;
        this.A05 = vtK.A05;
        ImmutableList immutableList2 = vtK.A07;
        C11367SPk.A03(immutableList2, "pointsOfInterest");
        this.A07 = immutableList2;
        ImmutableList immutableList3 = vtK.A08;
        C11367SPk.A03(immutableList3, "removedSharerIds");
        this.A08 = immutableList3;
        this.A00 = vtK.A00;
        this.A0B = vtK.A0B;
        ImmutableList immutableList4 = vtK.A09;
        C11367SPk.A03(immutableList4, "sharers");
        this.A09 = immutableList4;
        ImmutableList immutableList5 = vtK.A0A;
        C11367SPk.A03(immutableList5, "updatedSharerIds");
        this.A0A = immutableList5;
        String str = vtK.A0C;
        C11367SPk.A03(str, "userId");
        this.A0C = str;
    }
}
