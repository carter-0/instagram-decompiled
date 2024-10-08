package com.instagram.barcelona.creation.location.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.barcelona.location.model.LocationModel;

public final class PostLocationModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = FK6.A00(84);
    public final LocationModel A00;
    public final String A01;

    public PostLocationModel(LocationModel locationModel, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = locationModel;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PostLocationModel) {
                PostLocationModel postLocationModel = (PostLocationModel) obj;
                if (!0qQ.A0K(this.A01, postLocationModel.A01) || !0qQ.A0K(this.A00, postLocationModel.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }
}
