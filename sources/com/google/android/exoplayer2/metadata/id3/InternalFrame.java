package com.google.android.exoplayer2.metadata.id3;

import X.002;
import X.C66583MXo;
import X.JTR;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;

public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = SWW.A00(57);
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            InternalFrame internalFrame = (InternalFrame) obj;
            if (!Util.A0I(this.A00, internalFrame.A00) || !Util.A0I(this.A01, internalFrame.A01) || !Util.A0I(this.A02, internalFrame.A02)) {
                return false;
            }
        }
        return true;
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final int hashCode() {
        return ((C66583MXo.A01(JTR.A0G(this.A01)) + JTR.A0G(this.A00)) * 31) + Pxh.A0B(this.A02);
    }

    public final String toString() {
        return 002.A11(this.A00, ": domain=", this.A01, ", description=", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
