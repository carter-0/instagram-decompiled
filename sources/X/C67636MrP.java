package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.MrP  reason: case insensitive filesystem */
public final class C67636MrP extends BroadcastReceiver {
    public static final C67636MrP A01;
    public QuickPerformanceLogger A00 = QuickPerformanceLoggerProvider.getQPLInstance();

    /* JADX WARNING: type inference failed for: r1v0, types: [X.MrP, android.content.BroadcastReceiver] */
    static {
        ? broadcastReceiver = new BroadcastReceiver();
        broadcastReceiver.A00 = QuickPerformanceLoggerProvider.getQPLInstance();
        A01 = broadcastReceiver;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, 637349893);
        if (intent == null) {
            QuickPerformanceLogger quickPerformanceLogger = this.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "intent_empty", true);
                quickPerformanceLogger.markerEnd(875309620, 3);
            }
            i = -6237400;
        } else {
            0qQ.A0B(context, 0);
            O1P o1p = OT2.A01;
            OT2 ot2 = OT2.A02;
            if (ot2 == null) {
                synchronized (o1p) {
                    ot2 = OT2.A02;
                    if (ot2 == null) {
                        ot2 = new OT2(context);
                        OT2.A02 = ot2;
                    }
                }
            }
            C73280PZy pZy = new C73280PZy(context, intent, this);
            PowerManager powerManager = ot2.A00;
            if (powerManager != null) {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "IgFbnsWakefulExecutor");
                0BX.A02(newWakeLock, "IgFbnsWakefulExecutor");
                C60270fk.A02(newWakeLock);
                newWakeLock.acquire(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                0BX.A01(newWakeLock, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                0nY.A00().ATE(new NS6(newWakeLock, pZy));
            }
            i = -1225756317;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
