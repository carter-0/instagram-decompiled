package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class Q67 extends BroadcastReceiver {
    public Context A00;
    public final C9147RQy A01;

    public final synchronized void A00() {
        Context context = this.A00;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.A00 = null;
    }

    public Q67(C9147RQy rQy) {
        this.A01 = rQy;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        int i;
        int A03 = C66580MXl.A03(this, context, intent, -1153110321);
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.A01.A00();
            A00();
            i = -241227437;
        } else {
            i = -874733382;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
