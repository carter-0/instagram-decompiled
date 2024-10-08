package X;

import android.content.BroadcastReceiver;

public final class TDG implements Runnable {
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;

    public TDG(BroadcastReceiver.PendingResult pendingResult) {
        this.A00 = pendingResult;
    }

    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.A00;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
