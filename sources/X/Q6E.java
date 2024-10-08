package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public final class Q6E extends BroadcastReceiver implements Runnable {
    public final Handler A00;
    public final TZX A01;
    public final /* synthetic */ C10343Rqg A02;

    public Q6E(Handler handler, TZX tzx, C10343Rqg rqg) {
        this.A02 = rqg;
        this.A00 = handler;
        this.A01 = tzx;
    }

    public final void run() {
    }

    public final void onReceive(Context context, Intent intent) {
        int A03 = C66580MXl.A03(this, context, intent, 665039437);
        if (C273654mx.A00(1450).equals(intent.getAction())) {
            this.A00.post(this);
        }
        AnonymousClass0fD.A0E(1045136510, A03, intent);
    }
}
