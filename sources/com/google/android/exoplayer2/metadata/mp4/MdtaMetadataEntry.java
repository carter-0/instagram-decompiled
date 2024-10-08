package com.google.android.exoplayer2.metadata.mp4;

import X.002;
import X.AnonymousClass4RQ;
import X.C256683wB;
import X.C66583MXo;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = SWW.A00(62);
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public final /* synthetic */ void E37(AnonymousClass4RQ r1) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (!this.A02.equals(mdtaMetadataEntry.A02) || !Arrays.equals(this.A03, mdtaMetadataEntry.A03) || this.A00 != mdtaMetadataEntry.A00 || this.A01 != mdtaMetadataEntry.A01) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ byte[] CGn() {
        return null;
    }

    public final /* synthetic */ C256683wB CGo() {
        return null;
    }

    public final int hashCode() {
        return (((Pxh.A0D(this.A03, C66583MXo.A06(this.A02)) * 31) + this.A00) * 31) + this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeByteArray(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.createByteArray();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public final String toString() {
        return 002.A0R("mdta: key=", this.A02);
    }

    public MdtaMetadataEntry(byte[] bArr, int i, int i2, String str) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
