package com.facebookpay.offsite.models.message;

import X.AnonymousClass7TG;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class PaymentFulfillmentOption {
    @SerializedName("amount")
    public final PaymentCurrencyAmount amount;
    @SerializedName("dateTimeRangeEnd")
    public final Date dateTimeRangeEnd;
    @SerializedName("dateTimeRangeStart")
    public final Date dateTimeRangeStart;
    @SerializedName("id")
    public final String id;
    @SerializedName("label")
    public final String label;

    public PaymentCurrencyAmount getAmount() {
        return this.amount;
    }

    public Date getDateTimeRangeEnd() {
        return this.dateTimeRangeEnd;
    }

    public Date getDateTimeRangeStart() {
        return this.dateTimeRangeStart;
    }

    public String getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }

    public PaymentFulfillmentOption(String str, String str2, PaymentCurrencyAmount paymentCurrencyAmount, Date date, Date date2) {
        AnonymousClass7TG.A1U(str, str2, paymentCurrencyAmount);
        this.id = str;
        this.label = str2;
        this.amount = paymentCurrencyAmount;
        this.dateTimeRangeStart = date;
        this.dateTimeRangeEnd = date2;
    }
}
