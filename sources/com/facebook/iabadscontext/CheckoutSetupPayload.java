package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public final class CheckoutSetupPayload extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(93);
    public final Availability A00;
    public final ReceiverInfo A01;
    public final PaymentConfig A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutSetupPayload) {
                CheckoutSetupPayload checkoutSetupPayload = (CheckoutSetupPayload) obj;
                if (!0qQ.A0K(this.A02, checkoutSetupPayload.A02) || !0qQ.A0K(this.A00, checkoutSetupPayload.A00) || !0qQ.A0K(this.A01, checkoutSetupPayload.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A02.writeToParcel(parcel, i);
        this.A00.writeToParcel(parcel, i);
        ReceiverInfo receiverInfo = this.A01;
        if (receiverInfo == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        receiverInfo.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A02)) + AnonymousClass7TG.A0C(this.A01);
    }

    public CheckoutSetupPayload(Availability availability, PaymentConfig paymentConfig, ReceiverInfo receiverInfo) {
        AnonymousClass7TG.A1O(paymentConfig, availability);
        this.A02 = paymentConfig;
        this.A00 = availability;
        this.A01 = receiverInfo;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CheckoutSetupPayload(paymentConfig=");
        A1A.append(this.A02);
        A1A.append(", availability=");
        A1A.append(this.A00);
        A1A.append(", receiverInfo=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
