package androidx.appcompat.app;

import X.C14161Tqz;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class AppCompatDelegateImpl$PanelFeatureState$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C14161Tqz(0);
    public int A00;
    public Bundle A01;
    public boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        if (this.A02) {
            parcel.writeBundle(this.A01);
        }
    }
}
