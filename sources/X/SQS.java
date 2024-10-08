package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class SQS {
    public static final ClassLoader A00 = SQS.class.getClassLoader();

    public static void A01(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        return Pxh.A0L(parcel, creator);
    }
}
