package X;

import android.os.Parcel;

public final class SMU {
    public static final ClassLoader A00 = SMU.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw Pxg.A0M(dataAvail);
        }
    }
}
