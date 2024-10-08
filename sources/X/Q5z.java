package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class Q5z extends BroadcastReceiver {
    public final /* synthetic */ QLS A00;

    public Q5z(QLS qls) {
        this.A00 = qls;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, 405269596);
        if (isInitialStickyBroadcast()) {
            i = -1153565486;
        } else {
            this.A00.A0A.execute(new TD5(this));
            i = 1281352793;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
