package androidx.compose.foundation.lazy.layout;

import X.C7216Pzk;
import X.G9w;
import android.os.Parcel;
import android.os.Parcelable;

public final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(13);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DefaultLazyKey) && this.A00 == ((DefaultLazyKey) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return G9w.A0j("DefaultLazyKey(index=", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public DefaultLazyKey(int i) {
        this.A00 = i;
    }
}
