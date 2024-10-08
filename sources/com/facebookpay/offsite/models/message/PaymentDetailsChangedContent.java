package com.facebookpay.offsite.models.message;

import X.AnonymousClass7TG;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class PaymentDetailsChangedContent {
    @SerializedName("changeTypes")
    public final List<String> changeTypes;
    @SerializedName("paymentDetails")
    public final PaymentDetails paymentDetails;

    public final List getChangeTypes() {
        return this.changeTypes;
    }

    public final PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public PaymentDetailsChangedContent(PaymentDetails paymentDetails2, List list) {
        AnonymousClass7TG.A1O(paymentDetails2, list);
        this.paymentDetails = paymentDetails2;
        this.changeTypes = list;
    }
}
