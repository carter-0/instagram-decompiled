package com.instagram.appreciation.analytics.creator;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51965G9l;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

public final class CreatorLoggingData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(79);
    public final Map A00;
    public final boolean A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorLoggingData) {
                CreatorLoggingData creatorLoggingData = (CreatorLoggingData) obj;
                if (!(this.A01 == creatorLoggingData.A01 && this.A02 == creatorLoggingData.A02 && 0qQ.A0K(this.A00, creatorLoggingData.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        Map map = this.A00;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            parcel.writeLong(AnonymousClass7TE.A0R(A1J.getKey()));
            parcel.writeLong(AnonymousClass7TE.A0R(A1J.getValue()));
        }
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, C51965G9l.A05(this.A01)) + AnonymousClass7TG.A0C(this.A00);
    }

    public CreatorLoggingData(boolean z, boolean z2, Map map) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = map;
    }
}
