package androidx.paging.compose;

import X.0qQ;
import X.C7216Pzk;
import X.G9w;
import android.os.Parcel;
import android.os.Parcelable;

public final class PagingPlaceholderKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(55);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof PagingPlaceholderKey) && this.A00 == ((PagingPlaceholderKey) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public final String toString() {
        return G9w.A0j("PagingPlaceholderKey(index=", this.A00);
    }

    public PagingPlaceholderKey(int i) {
        this.A00 = i;
    }
}
