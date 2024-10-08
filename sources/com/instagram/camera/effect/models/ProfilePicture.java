package com.instagram.camera.effect.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C41847B3o;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class ProfilePicture implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(64);
    public final ImageUrl A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public ProfilePicture(Parcel parcel) {
        Parcelable A03 = C41847B3o.A03(parcel, ImageUrl.class);
        if (A03 != null) {
            this.A00 = (ImageUrl) A03;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public ProfilePicture(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
