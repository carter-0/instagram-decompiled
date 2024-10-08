package com.google.android.exoplayer2.metadata.id3;

import X.002;
import X.C66583MXo;
import X.JTR;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = SWW.A00(56);
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            GeobFrame geobFrame = (GeobFrame) obj;
            if (!Util.A0I(this.A02, geobFrame.A02) || !Util.A0I(this.A01, geobFrame.A01) || !Util.A0I(this.A00, geobFrame.A00) || !Arrays.equals(this.A03, geobFrame.A03)) {
                return false;
            }
        }
        return true;
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.createByteArray();
    }

    public final int hashCode() {
        return Pxh.A0D(this.A03, (((C66583MXo.A01(JTR.A0G(this.A02)) + JTR.A0G(this.A01)) * 31) + Pxh.A0B(this.A00)) * 31);
    }

    public final String toString() {
        return 002.A15(this.A00, ": mimeType=", this.A02, ", filename=", this.A01, ", description=", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A03);
    }

    public GeobFrame(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = bArr;
    }
}
