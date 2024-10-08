package android.support.v4.media;

import X.C7216Pzk;
import X.Pxe;
import X.Pxg;
import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(0);
    public final int A00;
    public final MediaDescriptionCompat A01;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("MediaItem{");
        A16.append("mFlags=");
        A16.append(this.A00);
        A16.append(", mDescription=");
        return Pxg.A0p(this.A01, A16);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        this.A01.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
