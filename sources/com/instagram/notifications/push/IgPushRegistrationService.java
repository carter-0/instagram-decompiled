package com.instagram.notifications.push;

import X.002;
import X.09i;
import X.0Jv;
import X.0wb;
import X.AnonymousClass9FP;
import X.C62810vf;
import android.content.Intent;

public class IgPushRegistrationService extends C62810vf {
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.0Js] */
    public final void onHandleWork(Intent intent) {
        if (intent == null) {
            try {
                0wb.A03("IgPushRegistrationService", "onHandleWork - Null Intent");
            } catch (RuntimeException e) {
                0wb.A05("IgPushRegistrationService", "onHandleWork - runtime exception", 1, e);
            }
        } else if (intent.getExtras() == null) {
            0wb.A03("IgPushRegistrationService", "onHandleWork - Empty extras");
        } else {
            String string = intent.getExtras().getString("PushRegistrationService.USER_ID");
            AnonymousClass9FP r3 = new AnonymousClass9FP(getApplicationContext(), intent);
            if (!09i.A0A.A0A(new Object(), (0Jv) null, r3, string)) {
                0wb.A03("IgPushRegistrationService", 002.A0R("onHandleWork - Error when adding operation, given id is not authenticated: ", string));
            }
        }
    }
}
