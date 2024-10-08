package androidx.versionedparcelable;

import X.C345717ty;
import X.C7216Pzk;
import X.N00;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7216Pzk(67);
    public final C345717ty A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new N00(parcel).A08(this.A00);
    }

    public ParcelImpl(Parcel parcel) {
        this.A00 = new N00(parcel).A04();
    }
}
