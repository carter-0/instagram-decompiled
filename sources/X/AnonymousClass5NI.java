package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: X.5NI  reason: invalid class name */
public final class AnonymousClass5NI extends BroadcastReceiver implements Runnable {
    public final Handler A00;
    public final AnonymousClass5Mw A01;
    public final /* synthetic */ AnonymousClass5NH A02;

    public AnonymousClass5NI(Handler handler, AnonymousClass5Mw r2, AnonymousClass5NH r3) {
        this.A02 = r3;
        this.A00 = handler;
        this.A01 = r2;
    }

    public final void run() {
    }

    public final void onReceive(Context context, Intent intent) {
        int A012 = AnonymousClass0fD.A01(-2039989857);
        AnonymousClass0fQ.A01(this, context, intent);
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.A00.post(this);
        }
        AnonymousClass0fD.A0E(1559599198, A012, intent);
    }
}
