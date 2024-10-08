package X;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.direct.notifications.armadillo.service.IgSecureMessageOverWANotificationService;

/* renamed from: X.5jx  reason: invalid class name and case insensitive filesystem */
public abstract class C293055jx {
    public static volatile long A00 = -1;
    public static final Handler A01 = new Handler(Looper.getMainLooper());
    public static final RealtimeSinceBootClock A02;

    public static final void A00(Context context, AnonymousClass5HJ r6) {
        int i = -1;
        A00 = A02.now();
        Intent putExtra = new Intent(context, IgSecureMessageOverWANotificationService.class).putExtra("wa_push_id", r6.A0U).putExtra("push_notif_id", r6.A12);
        0qQ.A07(putExtra);
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                0kR.A00.A07().A0B(context, putExtra);
            } catch (ForegroundServiceStartNotAllowedException e) {
                0KC.A0F("IgSecureMessageOverWANotificationServiceLauncher", "Not allowed to run foreground service", e);
                0f9 AEf = 0wj.A01.AEf("not_allowed_to_run_foreground_service", 817904991);
                AEf.ABQ("thread", Thread.currentThread().getName());
                AEf.ABQ("channel", r6.A0B.A01);
                Integer num = r6.A0I;
                if (num != null) {
                    i = num.intValue();
                }
                AEf.ABO("priority", i);
                AEf.report();
            }
        } else {
            0kR.A00.A07().A0B(context, putExtra);
        }
    }

    static {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        0qQ.A07(realtimeSinceBootClock);
        A02 = realtimeSinceBootClock;
    }
}
