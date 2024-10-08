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

public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = SWW.A00(51);
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.A00 != apicFrame.A00 || !Util.A0I(this.A02, apicFrame.A02) || !Util.A0I(this.A01, apicFrame.A01) || !Arrays.equals(this.A03, apicFrame.A03)) {
                return false;
            }
        }
        return true;
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }

    public final int hashCode() {
        return Pxh.A0D(this.A03, (((C66583MXo.A01(this.A00) + JTR.A0G(this.A02)) * 31) + Pxh.A0B(this.A01)) * 31);
    }

    public final String toString() {
        return 002.A11(this.A00, ": mimeType=", this.A02, ", description=", this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }

    public ApicFrame(String str, String str2, byte[] bArr, int i) {
        super("APIC");
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = bArr;
    }
}
