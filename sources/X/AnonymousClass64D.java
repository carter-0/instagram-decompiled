package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.64D  reason: invalid class name */
public final class AnonymousClass64D {
    public static final Object A01 = new Object();
    public static volatile AnonymousClass64D A02;
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final boolean A03(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return A01(context, intent, serviceConnection, this, context.getClass().getName(), i);
    }

    public static AnonymousClass64D A00() {
        if (A02 == null) {
            synchronized (A01) {
                if (A02 == null) {
                    A02 = new AnonymousClass64D();
                }
            }
        }
        AnonymousClass64D r0 = A02;
        AnonymousClass3Qk.A02(r0);
        return r0;
    }

    public final void A02(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof C301025yL)) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public static final boolean A01(Context context, Intent intent, ServiceConnection serviceConnection, AnonymousClass64D r8, String str, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((C241663Qd.A00(context).A00.getPackageManager().getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof C301025yL) {
            return context.bindService(intent, serviceConnection, i);
        }
        ConcurrentHashMap concurrentHashMap = r8.A00;
        Object putIfAbsent = concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i);
            if (!bindService) {
                return false;
            }
            return bindService;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
