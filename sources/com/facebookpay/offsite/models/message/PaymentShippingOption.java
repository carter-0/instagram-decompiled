package com.facebookpay.offsite.models.message;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import com.google.gson.annotations.SerializedName;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Deprecated(message = "To be replaced with PaymentFulfillmentOption")
public final class PaymentShippingOption {
    @SerializedName("amount")
    public final PaymentCurrencyAmount amount;
    @SerializedName("id")
    public final String id;
    @SerializedName("label")
    public final String label;
    @SerializedName("secondaryLabel")
    public final String secondaryLabel;
    @SerializedName("selected")
    public final Boolean selected;

    public final PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public PaymentShippingOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Boolean bool, String str3) {
        AnonymousClass7TG.A1U(str, str2, paymentCurrencyAmount);
        this.id = str;
        this.label = str2;
        this.amount = paymentCurrencyAmount;
        this.selected = bool;
        this.secondaryLabel = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentShippingOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, paymentCurrencyAmount, (i & 8) != 0 ? AnonymousClass7TE.A0u() : bool, (i & 16) != 0 ? null : str3);
    }
}
