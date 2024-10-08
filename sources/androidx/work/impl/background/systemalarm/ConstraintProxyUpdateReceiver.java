package androidx.work.impl.background.systemalarm;

import X.AnonymousClass0fD;
import X.AnonymousClass385;
import X.AnonymousClass389;
import X.C66580MXl;
import X.TJO;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    static {
        AnonymousClass389.A01("ConstrntProxyUpdtRecvr");
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        int A03 = C66580MXl.A03(this, context, intent, -1517976881);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            AnonymousClass389.A00();
        } else {
            AnonymousClass385.A00(context).A06.ATP(new TJO(goAsync(), context, intent, this));
        }
        AnonymousClass0fD.A0E(-1604123697, A03, intent);
    }
}
