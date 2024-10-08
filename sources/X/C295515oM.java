package X;

import android.os.BadParcelableException;
import android.os.Parcel;

/* renamed from: X.5oM  reason: invalid class name and case insensitive filesystem */
public final class C295515oM {
    public static final ClassLoader A00 = C295515oM.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(002.A0O("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
