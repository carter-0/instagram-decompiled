package com.facebook.iabadscontext;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class IgPromoAdsPromoCode extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(6);
    public final String A00;
    public final String A01;

    public IgPromoAdsPromoCode(String str, String str2) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgPromoAdsPromoCode) {
                IgPromoAdsPromoCode igPromoAdsPromoCode = (IgPromoAdsPromoCode) obj;
                if (!0qQ.A0K(this.A01, igPromoAdsPromoCode.A01) || !0qQ.A0K(this.A00, igPromoAdsPromoCode.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("IgPromoAdsPromoCode(promoCodeAutofillText=", this.A01, ", offerId=", this.A00, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A00);
    }
}
