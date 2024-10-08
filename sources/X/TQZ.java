package X;

import android.os.Parcel;

public final class TQZ extends RuntimeException {
    public TQZ(Parcel parcel, String str) {
        super(002.A0o(str, " Parcel: pos=", " size=", parcel.dataPosition(), parcel.dataSize()));
    }
}
