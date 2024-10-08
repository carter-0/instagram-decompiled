package androidx.navigation;

import X.0qQ;
import X.C7216Pzk;
import X.Pxi;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(54);
    public final int A00;
    public final Bundle A01;
    public final Bundle A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeBundle(this.A01);
        parcel.writeBundle(this.A02);
    }

    public NavBackStackEntryState(Parcel parcel) {
        String readString = parcel.readString();
        0qQ.A0A(readString);
        this.A03 = readString;
        this.A00 = parcel.readInt();
        Class<?> cls = getClass();
        this.A01 = Pxi.A0D(parcel, cls);
        Bundle A0D = Pxi.A0D(parcel, cls);
        0qQ.A0A(A0D);
        this.A02 = A0D;
    }
}
