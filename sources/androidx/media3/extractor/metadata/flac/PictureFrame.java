package androidx.media3.extractor.metadata.flac;

import X.002;
import X.AnonymousClass2RN;
import X.AnonymousClass7TF;
import X.C11389SRd;
import X.C66583MXo;
import X.C7216Pzk;
import X.Pxh;
import X.SQX;
import X.Xo1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.Arrays;

public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(29);
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

    public final void E36(Xo1 xo1) {
        xo1.A00(this.A07, this.A03);
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

    public static PictureFrame A00(C11389SRd sRd) {
        int A012 = sRd.A01();
        String A022 = SQX.A02(sRd.A0I(AnonymousClass2RN.A01, sRd.A01()));
        String A0I = sRd.A0I(AnonymousClass2RN.A05, sRd.A01());
        int A013 = sRd.A01();
        int A014 = sRd.A01();
        int A015 = sRd.A01();
        int A016 = sRd.A01();
        int A017 = sRd.A01();
        byte[] bArr = new byte[A017];
        sRd.A0R(bArr, 0, A017);
        return new PictureFrame(A022, A0I, bArr, A012, A013, A014, A015, A016);
    }

    public PictureFrame(String str, String str2, byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.A03 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A07 = bArr;
    }
}
