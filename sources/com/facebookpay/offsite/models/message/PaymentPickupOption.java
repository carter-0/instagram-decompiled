package com.facebookpay.offsite.models.message;

import X.0qQ;
import X.AnonymousClass7TG;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

public final class PaymentPickupOption extends PaymentFulfillmentOption {
    @SerializedName("pickupLocationAddress")
    public final W3CShippingAddress pickupLocationAddress;
    @SerializedName("pickupStoreAvailability")
    public final boolean pickupStoreAvailability;
    @SerializedName("pickupStoreDistance")
    public final PaymentDistance pickupStoreDistance;

    public final W3CShippingAddress getPickupLocationAddress() {
        return this.pickupLocationAddress;
    }

    public final boolean getPickupStoreAvailability() {
        return this.pickupStoreAvailability;
    }

    public final PaymentDistance getPickupStoreDistance() {
        return this.pickupStoreDistance;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentPickupOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Date date, Date date2, W3CShippingAddress w3CShippingAddress, boolean z, PaymentDistance paymentDistance) {
        super(str, str2, paymentCurrencyAmount, date, date2);
        AnonymousClass7TG.A1U(str, str2, paymentCurrencyAmount);
        0qQ.A0B(w3CShippingAddress, 6);
        this.pickupLocationAddress = w3CShippingAddress;
        this.pickupStoreAvailability = z;
        this.pickupStoreDistance = paymentDistance;
    }
}
