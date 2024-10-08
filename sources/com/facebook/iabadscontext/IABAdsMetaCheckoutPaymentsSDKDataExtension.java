package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class IABAdsMetaCheckoutPaymentsSDKDataExtension extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(99);
    public final CheckoutSetupPayload A00;
    public final String A01;

    public IABAdsMetaCheckoutPaymentsSDKDataExtension(CheckoutSetupPayload checkoutSetupPayload, String str) {
        0qQ.A0B(checkoutSetupPayload, 1);
        this.A00 = checkoutSetupPayload;
        this.A01 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABAdsMetaCheckoutPaymentsSDKDataExtension) {
                IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension = (IABAdsMetaCheckoutPaymentsSDKDataExtension) obj;
                if (!0qQ.A0K(this.A00, iABAdsMetaCheckoutPaymentsSDKDataExtension.A00) || !0qQ.A0K(this.A01, iABAdsMetaCheckoutPaymentsSDKDataExtension.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }
}
