package androidx.media3.extractor.metadata.id3;

import X.C66583MXo;
import X.C7216Pzk;
import X.Pxh;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(34);
    public final byte[] A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (!this.A00.equals(binaryFrame.A00) || !Arrays.equals(this.A00, binaryFrame.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Pxh.A0D(this.A00, C66583MXo.A06(this.A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A00);
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.A00 = bArr;
    }

    public BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.createByteArray();
    }
}
