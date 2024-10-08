package androidx.media3.extractor.metadata.id3;

import X.002;
import X.C66583MXo;
import X.C7216Pzk;
import X.JTR;
import X.Pxh;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import java.util.Arrays;

public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(41);
    public final String A00;
    public final byte[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PrivFrame privFrame = (PrivFrame) obj;
            if (!Util.A0E(this.A00, privFrame.A00) || !Arrays.equals(this.A01, privFrame.A01)) {
                return false;
            }
        }
        return true;
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.A00 = str;
        this.A01 = bArr;
    }

    public final int hashCode() {
        return Pxh.A0D(this.A01, C66583MXo.A01(JTR.A0G(this.A00)));
    }

    public final String toString() {
        return 002.A0g(this.A00, ": owner=", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A01);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.A00 = parcel.readString();
        this.A01 = parcel.createByteArray();
    }
}
