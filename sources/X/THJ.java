package X;

import android.util.Log;

public final class THJ implements Runnable {
    public final /* synthetic */ S2V A00;
    public final /* synthetic */ C7361Q6s A01;

    public THJ(S2V s2v, C7361Q6s q6s) {
        this.A01 = q6s;
        this.A00 = s2v;
    }

    public final void run() {
        Log.isLoggable("EnhancedIntentService", 3);
        C7197Pyl pyl = this.A01.A00;
        S2V s2v = this.A00;
        pyl.A01(s2v.A01);
        s2v.A00();
    }
}
