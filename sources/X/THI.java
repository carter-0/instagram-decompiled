package X;

import android.content.Intent;
import android.util.Log;

public final /* synthetic */ class THI implements Runnable {
    public final Intent A00;
    public final S2V A01;

    public THI(Intent intent, S2V s2v) {
        this.A01 = s2v;
        this.A00 = intent;
    }

    public final void run() {
        S2V s2v = this.A01;
        String action = this.A00.getAction();
        StringBuilder A14 = Pxe.A14(Pxf.A09(action) + 61);
        A14.append("Service took too long to process intent: ");
        A14.append(action);
        Log.w("EnhancedIntentService", AnonymousClass7TF.A0l(" App may get closed.", A14));
        s2v.A00();
    }
}
