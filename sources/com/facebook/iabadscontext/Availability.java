package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class Availability extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(92);
    public final boolean A00;
    public final List A01;

    public Availability(List list, boolean z) {
        0qQ.A0B(list, 2);
        this.A00 = z;
        this.A01 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Availability) {
                Availability availability = (Availability) obj;
                if (this.A00 != availability.A00 || !0qQ.A0K(this.A01, availability.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeStringList(this.A01);
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return AnonymousClass7TE.A0N(this.A01, i * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Availability(isAvailable=");
        A1A.append(this.A00);
        A1A.append(", availabilityConditions=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
