package androidx.test.internal.util;

import X.C7216Pzk;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableIBinder implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(66);
    public final IBinder A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.A00);
    }

    public ParcelableIBinder(Parcel parcel) {
        this.A00 = parcel.readStrongBinder();
    }
}
