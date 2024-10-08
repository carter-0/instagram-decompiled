package androidx.media3.exoplayer.scheduler;

import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;

public final class Requirements implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(26);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((Requirements) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public Requirements(int i) {
        this.A00 = (i & 2) != 0 ? i | 1 : i;
    }
}
