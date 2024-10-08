package X;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.0fl  reason: invalid class name */
public abstract class AnonymousClass0fl {
    public static final AnonymousClass0fl $redex_init_class = null;

    static {
        AnonymousClass0T2.A02 = true;
    }

    public static WifiInfo A00(WifiManager wifiManager) {
        WifiInfo wifiInfo;
        if (!AnonymousClass0T2.A01()) {
            return wifiManager.getConnectionInfo();
        }
        try {
            ReadWriteLock readWriteLock = AnonymousClass0T2.A01;
            readWriteLock.readLock().lock();
            0T1 r0 = AnonymousClass0T2.A00;
            if (r0 != null) {
                wifiInfo = r0.DHx(wifiManager);
            } else {
                wifiInfo = null;
            }
            readWriteLock.readLock().unlock();
            return wifiInfo;
        } catch (Throwable th) {
            AnonymousClass0T2.A01.readLock().unlock();
            throw th;
        }
    }
}
