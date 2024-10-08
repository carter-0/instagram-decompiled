package com.facebookpay.offsite.models.message;

import X.AnonymousClass7TG;
import com.google.gson.annotations.SerializedName;

public final class StartCheckoutRequest {
    @SerializedName("content")
    public final StartCheckoutContent content;
    @SerializedName("type")
    public final String messageType;
    @SerializedName("id")
    public final String msgId;

    public final StartCheckoutContent getContent() {
        return this.content;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public StartCheckoutRequest(String str, String str2, StartCheckoutContent startCheckoutContent) {
        AnonymousClass7TG.A1U(str, str2, startCheckoutContent);
        this.msgId = str;
        this.messageType = str2;
        this.content = startCheckoutContent;
    }
}
