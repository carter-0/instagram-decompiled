package X;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import com.facebook.location.appstate.GeoApiLocationAppStateListener$LifecycleCallback;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.4hb  reason: invalid class name and case insensitive filesystem */
public final class C270914hb {
    public static C270914hb A04;
    public ScheduledExecutorService A00;
    public final Application A01;
    public final GeoApiLocationAppStateListener$LifecycleCallback A02 = new GeoApiLocationAppStateListener$LifecycleCallback(this);
    public final CopyOnWriteArrayList A03;

    public static Integer A00(C270914hb r3) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Application application = r3.A01;
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null)) {
            String packageName = application.getPackageName();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (packageName.equals(next.processName)) {
                    int i = next.importance;
                    if (i == 100) {
                        return AnonymousClass05K.A00;
                    }
                    if (i == 125) {
                        return AnonymousClass05K.A01;
                    }
                }
            }
        }
        return AnonymousClass05K.A0C;
    }

    public final void A01(AnonymousClass60p r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj == r5 || obj == null) {
                copyOnWriteArrayList.remove(reference);
            }
        }
        synchronized (this) {
            if (copyOnWriteArrayList.isEmpty()) {
                this.A01.unregisterActivityLifecycleCallbacks(this.A02);
            }
        }
    }

    public C270914hb(Context context) {
        this.A01 = (Application) context.getApplicationContext();
        this.A03 = new CopyOnWriteArrayList();
    }
}
