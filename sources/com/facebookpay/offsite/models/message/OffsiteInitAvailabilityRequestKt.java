package com.facebookpay.offsite.models.message;

import X.0qQ;

public abstract class OffsiteInitAvailabilityRequestKt {
    public static final String DEFAULT_PARTNER_ID = "UNKNOWN";

    public static final String isIAWAvailabilityRequest(PaymentRequest paymentRequest) {
        0qQ.A0B(paymentRequest, 0);
        PaymentConfiguration paymentConfiguration = paymentRequest.content.paymentConfiguration;
        if (!0qQ.A0K(paymentConfiguration.partnerId, "UNKNOWN") || !0qQ.A0K(paymentConfiguration.partnerMerchantId, "UNKNOWN")) {
            return AvailabilityInitiator$Companion.INITIATOR_JS_SDK;
        }
        return AvailabilityInitiator$Companion.INITIATOR_IAW;
    }

    public static /* synthetic */ void isIAWAvailabilityRequest$annotations(PaymentRequest paymentRequest) {
    }
}
