package X;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.4sw  reason: invalid class name and case insensitive filesystem */
public final class C276264sw {
    public ScheduledExecutorService A00;
    public final Context A01;
    public final AnonymousClass0JP A02;
    public final AnonymousClass0JR A03;
    public final C276244su A04;
    public final C276254sv A05;
    public final C270914hb A06;

    public static boolean A00(C276264sw r2) {
        if (Build.VERSION.SDK_INT < 29 || r2.A06 == null) {
            return true;
        }
        return 0LA.A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (((android.net.wifi.WifiManager) r2.getSystemService(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_WIFI)).isScanAlwaysAvailable() == false) goto L_0x002d;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r4 = this;
            X.4su r1 = r4.A04
            r3 = 0
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            android.content.Context r2 = r1.A00
            int r0 = r2.checkCallingOrSelfPermission(r0)
            if (r0 != 0) goto L_0x003d
            boolean r0 = X.C276244su.A00(r1)
            if (r0 == 0) goto L_0x003d
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch:{ Exception -> 0x003d }
            java.lang.String r0 = "android.hardware.wifi"
            boolean r0 = r1.hasSystemFeature(r0)     // Catch:{ Exception -> 0x003d }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch:{ SecurityException -> 0x002d }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ SecurityException -> 0x002d }
            boolean r0 = r0.isScanAlwaysAvailable()     // Catch:{ SecurityException -> 0x002d }
            if (r0 != 0) goto L_0x003c
        L_0x002d:
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch:{  }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{  }
            boolean r0 = r0.isWifiEnabled()     // Catch:{  }
            if (r0 != 0) goto L_0x003c
            return r3
        L_0x003c:
            r3 = 1
        L_0x003d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276264sw.A02():boolean");
    }

    public C276264sw(Context context, AnonymousClass0JP r3, AnonymousClass0JR r4, C270914hb r5, C276244su r6, C276254sv r7, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = context.getApplicationContext();
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = scheduledExecutorService;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r5;
    }

    public final ArrayList A01(boolean z) {
        List<ScanResult> list;
        boolean z2;
        ArrayList arrayList = null;
        if (A00(this) && (z || A02())) {
            WifiManager wifiManager = (WifiManager) this.A01.getSystemService(NetInfoModule.CONNECTION_TYPE_WIFI);
            AnonymousClass0fl r0 = AnonymousClass0fl.$redex_init_class;
            if (AnonymousClass0T2.A01()) {
                try {
                    ReadWriteLock readWriteLock = AnonymousClass0T2.A01;
                    readWriteLock.readLock().lock();
                    0T1 r02 = AnonymousClass0T2.A00;
                    if (r02 != null) {
                        list = r02.DI1(wifiManager);
                    } else {
                        list = null;
                    }
                    readWriteLock.readLock().unlock();
                } catch (Throwable th) {
                    AnonymousClass0T2.A01.readLock().unlock();
                    throw th;
                }
            } else {
                list = wifiManager.getScanResults();
            }
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (ScanResult next : list) {
                    if (next != null) {
                        String str = next.SSID;
                        if (str == null || (!str.endsWith("_nomap") && !str.contains("_optout"))) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
