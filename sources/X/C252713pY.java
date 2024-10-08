package X;

import com.facebook.common.memory.leaklistener.core.KeyedWeakReference;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.3pY  reason: invalid class name and case insensitive filesystem */
public final class C252713pY {
    public C252703pX A00;
    public AnonymousClass0JR A01;
    public WeakHashMap A02;
    public ScheduledFuture A03;
    public final Runnable A04 = new C252723pZ(this);
    public final ScheduledExecutorService A05;

    public static synchronized void A00(C252713pY r6, Object obj, Map map) {
        synchronized (r6) {
            WeakHashMap weakHashMap = r6.A02;
            boolean z = true;
            if (weakHashMap.containsKey(obj)) {
                0KC.A09(C252713pY.class, "Already tracking %s ?", new Object[]{obj.toString()});
            } else {
                obj.toString();
                String str = null;
                if (!map.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Map.Entry entry : map.entrySet()) {
                        if (!z) {
                            sb.append(',');
                        }
                        sb.append((String) entry.getKey());
                        sb.append(':');
                        sb.append((String) entry.getValue());
                        z = false;
                    }
                    str = sb.toString();
                }
                weakHashMap.put(obj, new KeyedWeakReference(obj, r6.A01.now(), str));
            }
        }
    }

    public C252713pY(C252703pX r2, ScheduledExecutorService scheduledExecutorService) {
        this.A05 = scheduledExecutorService;
        this.A02 = new WeakHashMap();
        this.A01 = RealtimeSinceBootClock.A00;
        this.A00 = r2;
    }
}
