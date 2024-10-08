package X;

import android.os.Parcel;

public abstract class SKP {
    public static void A01(Parcel parcel, Boolean bool) {
        byte booleanValue;
        if (bool == null) {
            booleanValue = 2;
        } else {
            booleanValue = bool.booleanValue();
        }
        parcel.writeByte(booleanValue);
    }

    public static void A02(Parcel parcel, Float f) {
        if (f == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeFloat(f.floatValue());
    }

    public static Boolean A00(Parcel parcel) {
        byte readByte = parcel.readByte();
        boolean z = false;
        if (readByte != 0) {
            z = true;
            if (readByte != 1) {
                return null;
            }
        }
        return Boolean.valueOf(z);
    }
}
