package android.support.v4.media.session;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(4);
    public final long A00;
    public final MediaDescriptionCompat A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.A01.writeToParcel(parcel, i);
        parcel.writeLong(this.A00);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readLong();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediaSession.QueueItem {Description=");
        A1A.append(this.A01);
        A1A.append(", Id=");
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l(" }", A1A);
    }
}
