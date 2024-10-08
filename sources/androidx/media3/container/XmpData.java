package androidx.media3.container;

import X.002;
import X.C7216Pzk;
import X.Xo1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import java.util.Arrays;

public final class XmpData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(24);
    public final byte[] A00;

    public final /* synthetic */ void E36(Xo1 xo1) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A00, ((XmpData) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return 002.A0R("XMP: ", Util.A0A(this.A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.A00);
    }

    public XmpData(Parcel parcel) {
        this.A00 = parcel.createByteArray();
    }
}
