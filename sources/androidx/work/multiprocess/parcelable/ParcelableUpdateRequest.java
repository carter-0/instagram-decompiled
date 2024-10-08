package androidx.work.multiprocess.parcelable;

import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableUpdateRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(75);
    public final ParcelableData A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        this.A00.writeToParcel(parcel, i);
    }

    public ParcelableUpdateRequest(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = new ParcelableData(parcel);
    }
}
