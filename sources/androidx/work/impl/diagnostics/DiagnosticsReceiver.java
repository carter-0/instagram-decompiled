package androidx.work.impl.diagnostics;

import X.AnonymousClass0fD;
import X.AnonymousClass385;
import X.AnonymousClass389;
import X.C375589Ef;
import X.C66580MXl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;

public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String A00 = AnonymousClass389.A01("DiagnosticsRcvr");

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, -568300422);
        if (intent == null) {
            i = 1341755024;
        } else {
            AnonymousClass389.A00();
            String str = A00;
            try {
                AnonymousClass385.A00(context).A03(Collections.singletonList(new C375589Ef(DiagnosticsWorker.class).A00()));
            } catch (IllegalStateException e) {
                AnonymousClass389.A00();
                Log.e(str, "WorkManager is not initialized", e);
            }
            i = -2108859493;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
