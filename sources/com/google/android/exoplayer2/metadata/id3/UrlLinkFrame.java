package com.google.android.exoplayer2.metadata.id3;

import X.002;
import X.C66583MXo;
import X.JTR;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;

public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = SWW.A00(61);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (!this.A00.equals(urlLinkFrame.A00) || !Util.A0I(this.A00, urlLinkFrame.A00) || !Util.A0I(this.A01, urlLinkFrame.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((C66583MXo.A06(this.A00) + JTR.A0G(this.A00)) * 31) + Pxh.A0B(this.A01);
    }

    public final String toString() {
        return 002.A0g(this.A00, ": url=", this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
