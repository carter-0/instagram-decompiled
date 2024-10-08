package com.instagram.bugreporter;

import X.09i;
import X.0eR;
import X.0qQ;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C62810vf;
import X.C69812NsZ;
import X.C70853OOi;
import X.C70995OVq;
import X.C71132OdV;
import X.C74547Pwg;
import X.DbV;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.bugreporter.model.BugReport;

public final class BugReporterService extends C62810vf {
    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.bugreporter.BugReporterService] */
    public final void onHandleWork(Intent intent) {
        String str;
        String str2;
        0qQ.A0B(intent, 0);
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        Throwable th = null;
        if (extras != null) {
            str = extras.getString("IgSessionManager.SESSION_TOKEN_KEY");
        } else {
            str = null;
        }
        AnonymousClass0wW A04 = 09i.A0A.A04(DbV.A0C("IgSessionManager.SESSION_TOKEN_KEY", str));
        C74547Pwg A00 = C70853OOi.A00(intent.getExtras(), A04);
        Bundle extras2 = intent.getExtras();
        if (extras2 == null) {
            str2 = "BugReporterService started with null extras.";
        } else {
            Object A002 = C70995OVq.A00.A00(extras2);
            th = 0eR.A00(A002);
            if (th == null) {
                BugReport bugReport = (BugReport) A002;
                Parcelable parcelableExtra = intent.getParcelableExtra("BugReporterActivity.INTENT_EXTRA_VIEWMODEL");
                if (parcelableExtra != null) {
                    C71132OdV odV = C71132OdV.A00;
                    0qQ.A0A(applicationContext);
                    odV.A05(applicationContext, (BugReportComposerViewModel) parcelableExtra, A00, bugReport, A04);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            str2 = "Failed to load bug report from intent extras.";
        }
        C69812NsZ.A00(A00, str2, th);
    }
}
