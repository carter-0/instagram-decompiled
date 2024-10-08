package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;

public final class GuidanceTipResponseImpl extends AnonymousClass0T0 implements Parcelable, GuidanceTipResponse {
    public static final Parcelable.Creator CREATOR = DE7.A00(93);
    public final String A00;
    public final GuidanceTipIconAsset A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GuidanceTipResponseImpl) {
                GuidanceTipResponseImpl guidanceTipResponseImpl = (GuidanceTipResponseImpl) obj;
                if (!0qQ.A0K(this.A00, guidanceTipResponseImpl.A00) || !0qQ.A0K(this.A02, guidanceTipResponseImpl.A02) || this.A01 != guidanceTipResponseImpl.A01) {
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
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public final String AqT() {
        return this.A00;
    }

    public final String Avk() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, (AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A02)) * 31);
    }

    public GuidanceTipResponseImpl(GuidanceTipIconAsset guidanceTipIconAsset, String str, String str2) {
        AnonymousClass7TG.A1P(str, guidanceTipIconAsset);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = guidanceTipIconAsset;
    }
}
