package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.SVb  reason: case insensitive filesystem */
public final class C11440SVb implements ServiceConnection {
    public boolean A00 = false;
    public C7361Q6s A01;
    public final Context A02;
    public final Intent A03;
    public final Queue A04 = new ArrayDeque();
    public final ScheduledExecutorService A05;

    public static final synchronized void A00(C11440SVb sVb) {
        Queue queue;
        synchronized (sVb) {
            Log.isLoggable("EnhancedIntentService", 3);
            while (true) {
                queue = sVb.A04;
                if (queue.isEmpty()) {
                    break;
                }
                Log.isLoggable("EnhancedIntentService", 3);
                C7361Q6s q6s = sVb.A01;
                if (q6s == null || !q6s.isBinderAlive()) {
                    Log.isLoggable("EnhancedIntentService", 3);
                } else {
                    Log.isLoggable("EnhancedIntentService", 3);
                    S2V s2v = (S2V) queue.poll();
                    C7361Q6s q6s2 = sVb.A01;
                    if (Binder.getCallingUid() == Process.myUid()) {
                        Log.isLoggable("EnhancedIntentService", 3);
                        C7197Pyl pyl = q6s2.A00;
                        if (pyl.A02(s2v.A01)) {
                            s2v.A00();
                        } else {
                            Log.isLoggable("EnhancedIntentService", 3);
                            pyl.A03.execute(new THJ(s2v, q6s2));
                        }
                    } else {
                        throw new SecurityException("Binding only allowed within app");
                    }
                }
            }
            Log.isLoggable("EnhancedIntentService", 3);
            if (!sVb.A00) {
                sVb.A00 = true;
                try {
                    if (!AnonymousClass64D.A00().A03(sVb.A02, sVb.A03, sVb, 65)) {
                        Log.e("EnhancedIntentService", "binding to the service failed");
                        sVb.A00 = false;
                        while (!queue.isEmpty()) {
                            ((S2V) queue.poll()).A00();
                        }
                    }
                } catch (SecurityException e) {
                    Log.e("EnhancedIntentService", "Exception while binding the service", e);
                }
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Pxg.A1N("EnhancedIntentService", componentName);
        this.A00 = false;
        if (!(iBinder instanceof C7361Q6s)) {
            String valueOf = String.valueOf(iBinder);
            Log.e("EnhancedIntentService", Pxg.A0s("Invalid service connection: ", valueOf, Pxe.A14(Pxf.A09(valueOf) + 28)));
            while (true) {
                Queue queue = this.A04;
                if (queue.isEmpty()) {
                    break;
                }
                ((S2V) queue.poll()).A00();
            }
        } else {
            this.A01 = (C7361Q6s) iBinder;
            A00(this);
        }
    }

    public C11440SVb(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new PyM("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        this.A03 = Pxe.A0G("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.A05 = scheduledThreadPoolExecutor;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Pxg.A1N("EnhancedIntentService", componentName);
        A00(this);
    }
}
