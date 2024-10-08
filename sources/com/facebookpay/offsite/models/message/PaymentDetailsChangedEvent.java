package com.facebookpay.offsite.models.message;

import X.0qQ;
import X.AnonymousClass7TG;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PaymentDetailsChangedEvent {
    @SerializedName("content")
    public final PaymentDetailsChangedContent content;
    @SerializedName("error")
    public final PaymentError error;
    @SerializedName("type")
    public final String messageType;
    @SerializedName("id")
    public final String msgId;
    @SerializedName("sourceMessageId")
    public final String sourceMessageId;
    @SerializedName("timestamp")
    public final long timeStamp;

    public final PaymentDetailsChangedContent getContent() {
        return this.content;
    }

    public final PaymentError getError() {
        return this.error;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final String getSourceMessageId() {
        return this.sourceMessageId;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public PaymentDetailsChangedEvent(String str, PaymentDetailsChangedContent paymentDetailsChangedContent, long j, String str2, String str3, PaymentError paymentError) {
        AnonymousClass7TG.A1O(str, paymentDetailsChangedContent);
        0qQ.A0B(str3, 5);
        this.msgId = str;
        this.content = paymentDetailsChangedContent;
        this.timeStamp = j;
        this.sourceMessageId = str2;
        this.messageType = str3;
        this.error = paymentError;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentDetailsChangedEvent(String str, PaymentDetailsChangedContent paymentDetailsChangedContent, long j, String str2, String str3, PaymentError paymentError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, paymentDetailsChangedContent, j, str2, (i & 16) != 0 ? MessageType$Companion.PAYMENT_DETAILS_CHANGED : str3, (i & 32) != 0 ? null : paymentError);
    }
}
