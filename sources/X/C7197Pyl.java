package X;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Pyl  reason: case insensitive filesystem */
public abstract class C7197Pyl extends Service {
    public int A00;
    public int A01 = 0;
    public Binder A02;
    public final ExecutorService A03;
    public final Object A04 = Pxe.A0p();

    public abstract void A01(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        Binder binder;
        Log.isLoggable("EnhancedIntentService", 3);
        binder = this.A02;
        if (binder == null) {
            binder = new C7361Q6s(this);
            this.A02 = binder;
        }
        return binder;
    }

    public static final void A00(Intent intent, C7197Pyl pyl) {
        if (intent != null) {
            C7196Pyk.A01(intent);
        }
        synchronized (pyl.A04) {
            int i = pyl.A01 - 1;
            pyl.A01 = i;
            if (i == 0) {
                pyl.stopSelfResult(pyl.A00);
            }
        }
    }

    public C7197Pyl() {
        String valueOf = String.valueOf(C51968G9o.A16(this));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new PyM(Pxg.A0l(valueOf.length(), "Firebase-", valueOf)));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A03 = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final boolean A02(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!C7200Pyr.A01(intent)) {
            return true;
        }
        if (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(intent.getStringExtra("google.c.a.tc"))) {
            C3734195g A002 = C3734195g.A00();
            C3734195g.A01(A002);
            A002.A02.A03(C13489TbG.class);
            Log.isLoggable("FirebaseMessaging", 3);
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        C7200Pyr.A00(intent, "_no");
        return true;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int A012 = Pxg.A01(this, intent, 1517681828);
        synchronized (this.A04) {
            try {
                this.A00 = i2;
                this.A01++;
            } catch (Throwable th) {
                while (true) {
                    AnonymousClass0fD.A0B(1602681485, A012);
                    throw th;
                }
            }
        }
        Intent intent2 = (Intent) PyW.A00().A03.poll();
        int i4 = 2;
        if (intent2 == null) {
            A00(intent, this);
            i3 = 1320837126;
        } else if (A02(intent2)) {
            A00(intent, this);
            i3 = -2060694170;
        } else {
            this.A03.execute(new TJ7(intent2, intent, this));
            i4 = 3;
            i3 = 91601060;
        }
        AnonymousClass0fD.A0B(i3, A012);
        return i4;
    }
}
