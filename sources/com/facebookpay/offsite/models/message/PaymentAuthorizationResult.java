package com.facebookpay.offsite.models.message;

import X.0qQ;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PaymentAuthorizationResult {
    @SerializedName("authorizationState")
    public final AuthorizationState authorizationState;
    @SerializedName("error")
    public final PaymentDataError error;
    @SerializedName("orderId")
    public final String orderId;
    @SerializedName("retryable")
    public final boolean retryable;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentAuthorizationResult(AuthorizationState authorizationState2, PaymentDataError paymentDataError, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(authorizationState2, paymentDataError, z, (i & 8) != 0 ? null : str);
    }

    public final AuthorizationState getAuthorizationState() {
        return this.authorizationState;
    }

    public final PaymentDataError getError() {
        return this.error;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final boolean getRetryable() {
        return this.retryable;
    }

    public PaymentAuthorizationResult(AuthorizationState authorizationState2, PaymentDataError paymentDataError, boolean z, String str) {
        0qQ.A0B(authorizationState2, 1);
        this.authorizationState = authorizationState2;
        this.error = paymentDataError;
        this.retryable = z;
        this.orderId = str;
    }
}
