package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final /* synthetic */ class Q2L implements Runnable {
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ C68031yx A03;

    public /* synthetic */ Q2L(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent, C68031yx r4) {
        this.A03 = r4;
        this.A01 = context;
        this.A02 = intent;
        this.A00 = pendingResult;
    }

    public final void run() {
        C68031yx r3 = this.A03;
        Context context = this.A01;
        Intent intent = this.A02;
        BroadcastReceiver.PendingResult pendingResult = this.A00;
        C68031yx.A00(context, intent, r3);
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
