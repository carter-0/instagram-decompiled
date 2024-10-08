package com.google.android.exoplayer2.metadata.flac;

import X.002;
import X.AnonymousClass4RQ;
import X.AnonymousClass7TF;
import X.C256683wB;
import X.C66583MXo;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = SWW.A00(47);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (!(this.A03 == pictureFrame.A03 && this.A06.equals(pictureFrame.A06) && this.A05.equals(pictureFrame.A05) && this.A04 == pictureFrame.A04 && this.A02 == pictureFrame.A02 && this.A01 == pictureFrame.A01 && this.A00 == pictureFrame.A00 && Arrays.equals(this.A07, pictureFrame.A07))) {
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

    public final void E37(AnonymousClass4RQ r3) {
        r3.A01(this.A07, this.A03);
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A06, C66583MXo.A01(this.A03));
        return Pxh.A0D(this.A07, (((((((AnonymousClass7TF.A08(this.A05, A08) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public final String toString() {
        return 002.A0u("Picture: mimeType=", this.A06, ", description=", this.A05);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A07);
    }

    public PictureFrame(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = parcel.createByteArray();
    }
}
