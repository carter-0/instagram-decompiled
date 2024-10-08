package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C10819Ryf;
import X.C11149SCe;
import X.C13062TJs;
import X.C66580MXl;
import X.C9689Rf7;
import X.DbW;
import X.RE0;
import X.Sw4;
import X.TAW;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.facebook.location.platform.api.Location;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A03 = C66580MXl.A03(this, context, intent, 208650009);
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(Location.EXTRAS);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        Sw4.A01(context);
        byte[] bArr = null;
        if (queryParameter != null) {
            RE0 re0 = (RE0) C11149SCe.A00.get(intValue);
            if (re0 != null) {
                if (queryParameter2 != null) {
                    bArr = Base64.decode(queryParameter2, 0);
                }
                C10819Ryf ryf = Sw4.A00().A01;
                ryf.A08.execute(new C13062TJs(C9689Rf7.A00(re0, queryParameter, bArr), ryf, new TAW(), i));
                AnonymousClass0fD.A0E(1270501429, A03, intent);
                return;
            }
            throw DbW.A0a("Unknown Priority for value ", intValue);
        }
        throw AnonymousClass7TE.A11("Null backendName");
    }
}
