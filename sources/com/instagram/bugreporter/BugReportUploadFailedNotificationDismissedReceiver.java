package com.instagram.bugreporter;

import X.08y;
import X.09i;
import X.0eQ;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass5Kg;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C49673F1f;
import X.C66580MXl;
import X.C70995OVq;
import X.OV8;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.bugreporter.model.BugReport;

public final class BugReportUploadFailedNotificationDismissedReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A03 = C66580MXl.A03(this, context, intent, 353852769);
        AnonymousClass7TG.A1N(context, intent);
        Bundle extras = intent.getExtras();
        BugReport bugReport = null;
        if (!(extras == null || extras.getString("IgSessionManager.SESSION_TOKEN_KEY") == null)) {
            08y r1 = 09i.A0A;
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                new C49673F1f(r1.A06(extras2), "BugReportUploadFailedNotificationDismissedReceiver").A00(AnonymousClass05K.A05);
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0E(1988429158, A03, intent);
                throw A0y;
            }
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 != null) {
            Object A00 = C70995OVq.A00.A00(extras3);
            if (!(A00 instanceof 0eQ)) {
                bugReport = A00;
            }
            BugReport bugReport2 = bugReport;
            if (bugReport2 != null) {
                AnonymousClass5Kg.A07(new OV8(bugReport2.A0G).A00());
            }
        }
        AnonymousClass0fD.A0E(-1392967791, A03, intent);
    }
}
