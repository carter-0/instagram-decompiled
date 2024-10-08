package com.facebook.android.instantexperiences.payment;

import X.C7216Pzk;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;

public final class CanMakePaymentJSBridgeCallResult extends InstantExperiencesCallResult {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(99);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CanMakePaymentJSBridgeCallResult() {
        /*
            r4 = this;
            r1 = 1
            org.json.JSONObject r3 = X.DbS.A11()
            java.lang.String r0 = "canMakePayment"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x000b }
            goto L_0x0013
        L_0x000b:
            r2 = move-exception
            java.lang.String r1 = "CanMakePaymentJSBridgeCallResult"
            java.lang.String r0 = "Exception serializing return params!"
            X.0KC.A0G(r1, r0, r2)
        L_0x0013:
            java.lang.String r0 = r3.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4.<init>((java.util.List) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult.<init>():void");
    }
}
