package com.facebookpay.offsite.models.message;

import X.AnonymousClass7TG;
import com.google.gson.annotations.SerializedName;

public final class ScriptOverrideRequest {
    @SerializedName("type")
    public final String messageType;
    @SerializedName("script")
    public final String script;

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getScript() {
        return this.script;
    }

    public ScriptOverrideRequest(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.messageType = str;
        this.script = str2;
    }
}
