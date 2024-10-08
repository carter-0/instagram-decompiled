package android.support.v4.media;

import X.002;
import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(3);
    public final float A00;
    public final int A01;

    public final int describeContents() {
        return this.A01;
    }

    public final String toString() {
        String valueOf;
        int i = this.A01;
        float f = this.A00;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        return 002.A05(i, "Rating:style=", " rating=", valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }

    public RatingCompat(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }
}
