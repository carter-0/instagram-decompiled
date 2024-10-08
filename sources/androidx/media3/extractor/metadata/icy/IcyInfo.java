package androidx.media3.extractor.metadata.icy;

import X.C7216Pzk;
import X.Pxf;
import X.Xo1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.Arrays;

public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(32);
    public final String A00;
    public final String A01;
    public final byte[] A02;

    public final int describeContents() {
        return 0;
    }

    public final void E36(Xo1 xo1) {
        String str = this.A00;
        if (str != null) {
            xo1.A0F = str;
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

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.A02 = createByteArray;
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
