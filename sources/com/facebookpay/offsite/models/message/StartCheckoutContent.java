package com.facebookpay.offsite.models.message;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class StartCheckoutContent {
    @SerializedName("cookieNames")
    public final List<String> cookieNames;
    @SerializedName("handle")
    public final String handle;

    public final List getCookieNames() {
        return this.cookieNames;
    }

    public final String getHandle() {
        return this.handle;
    }

    public StartCheckoutContent(String str, List list) {
        this.handle = str;
        this.cookieNames = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StartCheckoutContent(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    public StartCheckoutContent() {
        this((String) null, (List) null);
    }
}
