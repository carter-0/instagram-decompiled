package androidx.media3.container;

import X.002;
import X.1WJ;
import X.AnonymousClass2RN;
import X.C66583MXo;
import X.C7216Pzk;
import X.Pxh;
import X.Xo1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import java.util.Arrays;

public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(20);
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public final /* synthetic */ void E36(Xo1 xo1) {
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

    public final int hashCode() {
        return (((Pxh.A0D(this.A03, C66583MXo.A06(this.A02)) * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        String str;
        int i = this.A01;
        if (i == 1) {
            str = new String(this.A03, AnonymousClass2RN.A05);
        } else if (i != 23) {
            byte[] bArr = this.A03;
            if (i != 67) {
                str = Util.A0A(bArr);
            } else {
                str = String.valueOf(1WJ.A03(bArr));
            }
        } else {
            str = String.valueOf(Float.intBitsToFloat(1WJ.A03(this.A03)));
        }
        return 002.A0u("mdta: key=", this.A02, ", value=", str);
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

    public MdtaMetadataEntry(byte[] bArr, int i, int i2, String str) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
