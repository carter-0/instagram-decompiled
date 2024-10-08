package X;

import android.os.Parcel;

public final class SKK {
    public static Boolean A00(Parcel parcel) {
        if (parcel.readInt() == 1) {
            return Boolean.valueOf(Pxg.A1U(parcel));
        }
        return null;
    }

    public static void A01(Parcel parcel, Boolean bool) {
        parcel.writeInt(C41848B3p.A1Y(parcel, bool) ? 1 : 0);
    }
}
