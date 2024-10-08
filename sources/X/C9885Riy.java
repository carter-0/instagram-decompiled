package X;

import android.os.Parcel;

/* renamed from: X.Riy  reason: case insensitive filesystem */
public abstract class C9885Riy {
    public static int A00(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(65535);
        return parcel.dataPosition();
    }
}
