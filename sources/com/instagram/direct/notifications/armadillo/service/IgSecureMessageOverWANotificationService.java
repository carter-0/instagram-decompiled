package com.instagram.direct.notifications.armadillo.service;

import X.09i;
import X.0Sy;
import X.0eG;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass6EB;
import X.AnonymousClass9T8;
import X.C268194cw;
import X.C269474fB;
import X.C305926Kc;
import X.C60960kU;
import X.C9156RRh;
import X.F5W;
import X.PWA;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.instagram.android.R;
import java.util.concurrent.TimeUnit;

public final class IgSecureMessageOverWANotificationService extends Service {
    public String A00;
    public String A01;
    public boolean A02;
    public Handler A03;
    public final Runnable A04 = new PWA(this);

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        int A042 = AnonymousClass0fD.A04(-23833446);
        this.A03 = new Handler(Looper.getMainLooper());
        AnonymousClass0fD.A0B(-1561726481, A042);
    }

    public final void onDestroy() {
        String str;
        int A042 = AnonymousClass0fD.A04(-1291933106);
        AnonymousClass0wW A05 = 09i.A0A.A05(this);
        C268194cw r2 = new C268194cw(C269474fB.A00);
        if (this.A02) {
            str = AnonymousClass000.A00(4113);
        } else {
            str = "offline_marker";
        }
        r2.A0E("reason", str);
        AnonymousClass6EB.A01(new AnonymousClass6EB(A05), (Boolean) null, (Boolean) null, "ARMADILLO_NOTIFICATIONS_STOP_SERVICE", this.A00, this.A01, r2.toString(), (String) null);
        Handler handler = this.A03;
        if (handler != null) {
            handler.removeCallbacks(this.A04);
        }
        super.onDestroy();
        C305926Kc.A00(this);
        AnonymousClass0fD.A0B(-843460124, A042);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A042 = AnonymousClass0fD.A04(-1721804121);
        if (intent != null) {
            0eG.A01.A01(this, intent);
            this.A00 = intent.getStringExtra("push_notif_id");
            this.A01 = intent.getStringExtra("wa_push_id");
        }
        Intent A002 = F5W.A00(this, "all", AnonymousClass000.A00(3002), (String) null, 67174400);
        Context applicationContext = C60960kU.A00.getApplicationContext();
        0Sy r3 = new 0Sy();
        r3.A0A(A002);
        int i3 = 0;
        PendingIntent A012 = r3.A01(applicationContext, (int) System.currentTimeMillis(), 0);
        AnonymousClass9T8 r6 = new AnonymousClass9T8((Context) this, AnonymousClass000.A00(3308));
        r6.A04(R.drawable.notification_icon);
        r6.A0C(applicationContext.getResources().getString(2131963995));
        r6.A0B(applicationContext.getResources().getString(2131963994));
        r6.A05 = -1;
        r6.A0g = true;
        r6.A0A.when = 0;
        r6.A0E(true);
        if (A012 != null) {
            r6.A0C = A012;
        }
        Notification A032 = r6.A03();
        if (Build.VERSION.SDK_INT >= 29) {
            i3 = 1;
        }
        C9156RRh.A00(A032, this, i3);
        Handler handler = this.A03;
        if (handler != null) {
            handler.postDelayed(this.A04, TimeUnit.SECONDS.toMillis(15));
        }
        AnonymousClass0fD.A0B(-971243302, A042);
        return 2;
    }
}
