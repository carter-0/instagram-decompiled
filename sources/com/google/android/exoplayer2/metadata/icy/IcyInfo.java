package com.google.android.exoplayer2.metadata.icy;

import X.AnonymousClass4RQ;
import X.C256683wB;
import X.Pxf;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = SWW.A00(50);
    public final String A00;
    public final String A01;
    public final byte[] A02;

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ byte[] CGn() {
        return null;
    }

    public final /* synthetic */ C256683wB CGo() {
        return null;
    }

    public final void E37(AnonymousClass4RQ r2) {
        String str = this.A00;
        if (str != null) {
            r2.A0F = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((IcyInfo) obj).A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A02);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", Pxf.A1Y(this.A00, this.A01, this.A02.length));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public IcyInfo(String str, String str2, byte[] bArr) {
        this.A02 = bArr;
        this.A00 = str;
        this.A01 = str2;
    }

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.A02 = createByteArray;
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
