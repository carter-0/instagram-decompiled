package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.MlZ  reason: case insensitive filesystem */
public final class C67299MlZ extends C67631MrB {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = AnonymousClass0fD.A01(-99682050);
        Intent intent2 = intent;
        boolean A1Z = AnonymousClass7TG.A1Z(context, intent);
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (intent.getAction() == null) {
            if (qPLInstance != null) {
                qPLInstance.markerAnnotate(875309620, "intent_empty", A1Z);
            }
            i = -234269544;
        } else {
            if (qPLInstance != null) {
                qPLInstance.markerPoint(875309620, "wakefull_push_executor");
            }
            08y r1 = 09i.A0A;
            C67297MlX mlX = new C67297MlX(context, r1.A05(this));
            AnonymousClass0wW A05 = r1.A05(this);
            0qQ.A0B(A05, 3);
            Object systemService = context.getSystemService("power");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(A1Z ? 1 : 0, "WakefulPushExecutor");
            0BX.A02(newWakeLock, "WakefulPushExecutor");
            C60270fk.A02(newWakeLock);
            newWakeLock.acquire(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            0BX.A01(newWakeLock, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            0Tu r3 = 0Tu.A05;
            boolean A06 = 182.A06(r3, A05, 36321335832159518L);
            int i2 = 3;
            if (182.A06(r3, A05, 36321335832225055L)) {
                i2 = 2;
            }
            0nY.A00().ATE(new C67298MlY(intent2, newWakeLock, mlX, i2, A06));
            C638918c.A01(C61170le.A00).A0K(intent, AnonymousClass05K.A0N);
            i = 280916435;
        }
        AnonymousClass0fD.A0E(i, A01, intent);
    }
}
