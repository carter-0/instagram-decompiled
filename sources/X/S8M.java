package X;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class S8M {
    public static void A01(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
            return;
        }
        parcel.writeInt(0);
    }

    public static Object A00(Parcel parcel, Parcelable.Creator creator) {
        return Pxj.A0i(parcel, creator);
    }
}
