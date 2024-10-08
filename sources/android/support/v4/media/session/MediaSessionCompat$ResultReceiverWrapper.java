package android.support.v4.media.session;

import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(5);
    public ResultReceiver A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.A00.writeToParcel(parcel, i);
    }
}
