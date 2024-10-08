package com.instagram.clips.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.C51968G9o;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;

public final class ClipsSpotlightModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(72);
    public final long A00;
    public final User A01;

    public ClipsSpotlightModel(User user, long j) {
        0qQ.A0B(user, 1);
        this.A01 = user;
        this.A00 = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsSpotlightModel) {
                ClipsSpotlightModel clipsSpotlightModel = (ClipsSpotlightModel) obj;
                if (!0qQ.A0K(this.A01, clipsSpotlightModel.A01) || this.A00 != clipsSpotlightModel.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeLong(this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + C51968G9o.A03(this.A00);
    }
}
