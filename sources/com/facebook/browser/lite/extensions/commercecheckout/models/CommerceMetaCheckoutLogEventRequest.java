package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51971G9r;
import X.RUZ;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.MetaCheckoutExperienceType;

public final class CommerceMetaCheckoutLogEventRequest extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(18);
    public final IABAdsContext A00;
    public final MetaCheckoutExperienceType A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommerceMetaCheckoutLogEventRequest) {
                CommerceMetaCheckoutLogEventRequest commerceMetaCheckoutLogEventRequest = (CommerceMetaCheckoutLogEventRequest) obj;
                if (this.A02 != commerceMetaCheckoutLogEventRequest.A02 || !0qQ.A0K(this.A00, commerceMetaCheckoutLogEventRequest.A00) || !0qQ.A0K(this.A04, commerceMetaCheckoutLogEventRequest.A04) || !0qQ.A0K(this.A06, commerceMetaCheckoutLogEventRequest.A06) || this.A01 != commerceMetaCheckoutLogEventRequest.A01 || !0qQ.A0K(this.A05, commerceMetaCheckoutLogEventRequest.A05) || !0qQ.A0K(this.A03, commerceMetaCheckoutLogEventRequest.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(RUZ.A00(this.A02));
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        Integer num = this.A02;
        return ((((((AnonymousClass7TF.A08(this.A04, ((C51971G9r.A0D(num, RUZ.A00(num)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A03);
    }

    public CommerceMetaCheckoutLogEventRequest(IABAdsContext iABAdsContext, MetaCheckoutExperienceType metaCheckoutExperienceType, Integer num, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1P(num, str);
        this.A02 = num;
        this.A00 = iABAdsContext;
        this.A04 = str;
        this.A06 = str2;
        this.A01 = metaCheckoutExperienceType;
        this.A05 = str3;
        this.A03 = str4;
    }
}
