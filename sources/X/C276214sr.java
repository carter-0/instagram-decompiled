package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4sr  reason: invalid class name and case insensitive filesystem */
public final class C276214sr {
    public final Context A00;
    public final C276204sq A01;
    public final WifiManager A02;
    public final C276184so A03;
    public final C276274sx A04;

    public static final WifiInfo A00(NetworkCapabilities networkCapabilities) {
        TransportInfo transportInfo;
        if (networkCapabilities == null || (transportInfo = networkCapabilities.getTransportInfo()) == null || !(transportInfo instanceof WifiInfo)) {
            return null;
        }
        return (WifiInfo) transportInfo;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.4sy, java.lang.Object] */
    public final C276284sy A02() {
        WifiManager wifiManager;
        WifiInfo A012;
        try {
            if ((!this.A01.hasPermission("android.permission.ACCESS_WIFI_STATE")) || (wifiManager = this.A02) == null || !wifiManager.isWifiEnabled() || (A012 = A01()) == null) {
                return null;
            }
            ? obj = new Object();
            obj.A03 = null;
            obj.A05 = null;
            obj.A08 = null;
            obj.A02 = null;
            obj.A00 = null;
            obj.A01 = null;
            obj.A07 = null;
            obj.A06 = null;
            obj.A04 = null;
            obj.A00 = Boolean.valueOf(wifiManager.is5GHzBandSupported());
            ArrayList A013 = this.A04.A01();
            if (A013 != null && !A013.isEmpty()) {
                String bssid = A012.getBSSID();
                Iterator it = A013.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ScanResult scanResult = (ScanResult) it.next();
                        if (scanResult != null && 0qQ.A0K(bssid, scanResult.BSSID)) {
                            obj.A07 = scanResult.capabilities;
                            obj.A01 = Integer.valueOf(scanResult.channelWidth);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            obj.A05 = Integer.valueOf(A012.getRssi());
            obj.A08 = A012.getBSSID();
            obj.A03 = Integer.valueOf(A012.getLinkSpeed());
            obj.A02 = Integer.valueOf(A012.getFrequency());
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                obj.A06 = Integer.valueOf(A012.getWifiStandard());
                if (i >= 31) {
                    obj.A04 = Integer.valueOf(A012.getCurrentSecurityType());
                }
            }
            return obj;
        } catch (NullPointerException | SecurityException unused) {
        }
        return null;
    }

    public final String A03() {
        WifiManager wifiManager;
        WifiInfo A012;
        try {
            if ((!this.A01.hasPermission("android.permission.ACCESS_WIFI_STATE")) || (wifiManager = this.A02) == null || !wifiManager.isWifiEnabled() || (A012 = A01()) == null) {
                return null;
            }
            return A012.getBSSID();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public final WifiInfo A01() {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        WifiInfo A002 = this.A04.A00();
        if (A002 != null || Build.VERSION.SDK_INT < 29) {
            return A002;
        }
        NetworkCapabilities networkCapabilities = null;
        Object systemService = this.A00.getSystemService("connectivity");
        if (!(!(systemService instanceof ConnectivityManager) || (connectivityManager = (ConnectivityManager) systemService) == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null)) {
            networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        }
        return A00(networkCapabilities);
    }

    public C276214sr(Context context, WifiManager wifiManager, C276204sq r14, C276184so r15) {
        C270914hb r7;
        Context context2 = context;
        this.A00 = context;
        this.A02 = wifiManager;
        this.A03 = r15;
        this.A01 = r14;
        C276224ss A002 = C276224ss.A00();
        synchronized (C270914hb.class) {
            r7 = C270914hb.A04;
            if (r7 == null) {
                r7 = new C270914hb(context);
                C270914hb.A04 = r7;
            }
        }
        AnonymousClass0Gt r5 = AnonymousClass0Gt.A00;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A04 = new C276274sx(r7, new C276264sw(context2, r5, realtimeSinceBootClock, r7, new C276244su(context), new C276254sv(r5, realtimeSinceBootClock), new C276234st(new Handler(context.getMainLooper()))), A002);
    }
}
