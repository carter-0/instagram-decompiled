package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class SMV {
    public static final ClassLoader A00 = SMV.class.getClassLoader();

    public static void A00(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
