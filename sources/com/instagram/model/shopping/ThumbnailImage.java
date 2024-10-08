package com.instagram.model.shopping;

import X.0qQ;
import X.C71269Ogb;
import X.DbY;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;

public final class ThumbnailImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(92);
    public ImageUrl A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !DbY.A1b(this, obj)) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((ThumbnailImage) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }
}
