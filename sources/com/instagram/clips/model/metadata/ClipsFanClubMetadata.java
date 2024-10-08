package com.instagram.clips.model.metadata;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C46401DeO;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;

public final class ClipsFanClubMetadata extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(76);
    public final C46401DeO A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsFanClubMetadata) {
                ClipsFanClubMetadata clipsFanClubMetadata = (ClipsFanClubMetadata) obj;
                if (!0qQ.A0K(this.A01, clipsFanClubMetadata.A01) || this.A00 != clipsFanClubMetadata.A00) {
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
        AnonymousClass7TE.A1T(parcel, this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public ClipsFanClubMetadata(C46401DeO deO, String str) {
        AnonymousClass7TG.A1O(str, deO);
        this.A01 = str;
        this.A00 = deO;
    }
}
