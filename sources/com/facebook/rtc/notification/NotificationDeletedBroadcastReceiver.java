package com.facebook.rtc.notification;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66580MXl;
import X.NCY;
import X.O52;
import X.OX3;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meta.foa.session.FoaUserSession;
import java.util.ArrayList;
import java.util.Map;

public final class NotificationDeletedBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        NCY ncy;
        int A03 = C66580MXl.A03(this, context, intent, -176658916);
        boolean A1U = AnonymousClass7TF.A1U(0, context, intent);
        String stringExtra = intent.getStringExtra("notification_type_tag");
        String stringExtra2 = intent.getStringExtra("local_call_id");
        if (stringExtra2 != null) {
            boolean booleanExtra = intent.getBooleanExtra("for_foreground", false);
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (stringExtra != null) {
                A1C.add(stringExtra);
            }
            if (booleanExtra) {
                A1C.add("foreground");
            }
            OX3.A02((FoaUserSession) null, "call_notification_dismissed", stringExtra2, (String) null, A1C, (Map) null, false);
            if (intent.getBooleanExtra("end_call_on_notification_dismiss", false) && (ncy = (NCY) O52.A01.invoke(stringExtra2)) != null) {
                ncy.A00().end(0, "call_notification_dismissed", A1U);
            }
            AnonymousClass0fD.A0E(-1062360300, A03, intent);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0E(396870345, A03, intent);
        throw A0y;
    }
}
