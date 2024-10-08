package com.facebook.rtc.notification;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C59910bu;
import X.C66580MXl;
import X.C69425NlA;
import X.NCY;
import X.O52;
import X.OX3;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meta.foa.session.FoaUserSession;
import java.util.Map;

public final class RtcMultiCallActionReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, -915029749);
        boolean A1U = AnonymousClass7TF.A1U(0, context, intent);
        if (!C59910bu.A02().A00(context, intent, this)) {
            i = 1281642503;
        } else {
            String action = intent.getAction();
            if (action == null || action.hashCode() != -1016139507 || !action.equals("com.facebook.rtc.notification.DECLINE_MULTI_CALL_ACTION")) {
                C69425NlA nlA = C69425NlA.A17;
                String action2 = intent.getAction();
                if (action2 == null) {
                    action2 = "";
                }
                OX3.A01(nlA, (FoaUserSession) null, (String) null, (String) null, AnonymousClass7TF.A0w("action", action2));
            } else {
                String stringExtra = intent.getStringExtra("local_call_id");
                if (stringExtra != null) {
                    OX3.A01(C69425NlA.A10, (FoaUserSession) null, stringExtra, (String) null, (Map) null);
                    NCY ncy = (NCY) O52.A01.invoke(stringExtra);
                    if (ncy != null) {
                        ncy.A00().removeWhenEnded();
                        ncy.A00().end(0, "decline_multi_call_via_notification", A1U);
                    }
                } else {
                    IllegalStateException A0y = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A0E(1085486319, A03, intent);
                    throw A0y;
                }
            }
            i = -1645311122;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
