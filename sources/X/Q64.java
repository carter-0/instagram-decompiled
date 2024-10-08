package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

public final class Q64 extends BroadcastReceiver {
    public final /* synthetic */ RealtimeSinceBootClock A00;
    public final /* synthetic */ C11248SHi A01;

    public Q64(RealtimeSinceBootClock realtimeSinceBootClock, C11248SHi sHi) {
        this.A01 = sHi;
        this.A00 = realtimeSinceBootClock;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, -1809977588);
        if (intent == null) {
            i = 1277524002;
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) || "android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            Boolean valueOf = Boolean.valueOf("android.intent.action.SCREEN_ON".equals(intent.getAction()));
            C11248SHi sHi = this.A01;
            IntentFilter intentFilter = C11248SHi.A06;
            if (!valueOf.equals(sHi.A04.getAndSet(valueOf))) {
                sHi.A03.set(SystemClock.elapsedRealtime());
            }
            i = 837755770;
        } else {
            i = -620312679;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
