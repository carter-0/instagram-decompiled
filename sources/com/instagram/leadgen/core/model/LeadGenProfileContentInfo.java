package com.instagram.leadgen.core.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class LeadGenProfileContentInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(89);
    public final ImageUrl A00;
    public final LeadGenTrustSignalsPayload A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenProfileContentInfo) {
                LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) obj;
                if (!0qQ.A0K(this.A02, leadGenProfileContentInfo.A02) || !0qQ.A0K(this.A00, leadGenProfileContentInfo.A00) || !0qQ.A0K(this.A01, leadGenProfileContentInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload = this.A01;
        if (leadGenTrustSignalsPayload == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        leadGenTrustSignalsPayload.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02)) + AnonymousClass7TG.A0C(this.A01);
    }

    public LeadGenProfileContentInfo(ImageUrl imageUrl, LeadGenTrustSignalsPayload leadGenTrustSignalsPayload, String str) {
        AnonymousClass7TG.A1O(str, imageUrl);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = leadGenTrustSignalsPayload;
    }
}
