package android.support.v4.media.session;

import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(7);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }
}
