package com.instagram.leadads.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.DbS;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class LeadAdsDisclaimerResponse extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(80);
    public String A00 = null;
    public boolean A01 = false;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadAdsDisclaimerResponse) {
                LeadAdsDisclaimerResponse leadAdsDisclaimerResponse = (LeadAdsDisclaimerResponse) obj;
                if (!0qQ.A0K(this.A00, leadAdsDisclaimerResponse.A00) || this.A01 != leadAdsDisclaimerResponse.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TG.A0E(this.A00) * 31);
    }
}
