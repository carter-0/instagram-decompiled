package com.instagram.leadgen.core.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C16611Uy7;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class LeadGenTrustSignal extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(90);
    public final int A00;
    public final C16611Uy7 A01;
    public final String A02;

    public LeadGenTrustSignal(C16611Uy7 uy7, String str, int i) {
        0qQ.A0B(uy7, 1);
        this.A01 = uy7;
        this.A00 = i;
        this.A02 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenTrustSignal) {
                LeadGenTrustSignal leadGenTrustSignal = (LeadGenTrustSignal) obj;
                if (!(this.A01 == leadGenTrustSignal.A01 && this.A00 == leadGenTrustSignal.A00 && 0qQ.A0K(this.A02, leadGenTrustSignal.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A02);
    }
}
