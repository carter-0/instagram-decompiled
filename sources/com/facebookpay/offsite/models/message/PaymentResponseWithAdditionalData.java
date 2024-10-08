package com.facebookpay.offsite.models.message;

import X.0qQ;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

public final class PaymentResponseWithAdditionalData {
    @SerializedName("additionalData")
    public final Map<String, String> additionalData;
    @SerializedName("paymentResponse")
    public final PaymentResponse paymentResponse;

    public PaymentResponseWithAdditionalData(PaymentResponse paymentResponse2, Map map) {
        0qQ.A0B(paymentResponse2, 1);
        this.paymentResponse = paymentResponse2;
        this.additionalData = map;
    }

    public final Map getAdditionalData() {
        return this.additionalData;
    }

    public final PaymentResponse getPaymentResponse() {
        return this.paymentResponse;
    }
}
