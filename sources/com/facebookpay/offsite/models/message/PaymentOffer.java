package com.facebookpay.offsite.models.message;

import X.0qQ;
import com.google.gson.annotations.SerializedName;

public final class PaymentOffer {
    @SerializedName("code")
    public final String code;
    @SerializedName("label")
    public final String label;

    public PaymentOffer(String str, String str2) {
        0qQ.A0B(str, 1);
        this.code = str;
        this.label = str2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getLabel() {
        return this.label;
    }
}
