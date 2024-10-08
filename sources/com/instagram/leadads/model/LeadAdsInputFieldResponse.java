package com.instagram.leadads.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C16676UzC;
import X.C41845B3m;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class LeadAdsInputFieldResponse extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(81);
    public C16676UzC A00 = null;
    public String A01 = null;
    public String A02 = null;
    public String A03 = null;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadAdsInputFieldResponse) {
                LeadAdsInputFieldResponse leadAdsInputFieldResponse = (LeadAdsInputFieldResponse) obj;
                if (this.A00 != leadAdsInputFieldResponse.A00 || !0qQ.A0K(this.A03, leadAdsInputFieldResponse.A03) || !0qQ.A0K(this.A02, leadAdsInputFieldResponse.A02) || !0qQ.A0K(this.A01, leadAdsInputFieldResponse.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        C16676UzC uzC = this.A00;
        if (uzC == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, uzC);
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A01);
    }
}
