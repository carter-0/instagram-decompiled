package com.instagram.mainfeed.intentawaread.api;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;

public final class ContextualOrganicInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(10);
    public String A00 = null;
    public String A01 = null;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContextualOrganicInfo) {
                ContextualOrganicInfo contextualOrganicInfo = (ContextualOrganicInfo) obj;
                if (!0qQ.A0K(this.A01, contextualOrganicInfo.A01) || !0qQ.A0K(this.A00, contextualOrganicInfo.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("ContextualOrganicInfo(seedMediaId=", this.A01, ", mediaAuthorIgid=", this.A00, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + C41845B3m.A00(this.A00);
    }
}
