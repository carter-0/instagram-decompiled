package com.android.billingclient.api;

import X.AnonymousClass7TE;
import X.C66580MXl;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

@Deprecated
public final class SkuDetails {
    public final JSONObject A00;
    public final String A01;

    public final String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.A01));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.A01, ((SkuDetails) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public SkuDetails(String str) {
        this.A01 = str;
        JSONObject A17 = C66580MXl.A17(str);
        this.A00 = A17;
        if (TextUtils.isEmpty(A17.optString("productId"))) {
            throw AnonymousClass7TE.A0w("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(A17.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
            throw AnonymousClass7TE.A0w("SkuType cannot be empty.");
        }
    }
}
