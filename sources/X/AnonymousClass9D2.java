package X;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9D2  reason: invalid class name */
public final class AnonymousClass9D2 implements 0T1 {
    public final /* synthetic */ boolean A00;
    public final /* synthetic */ boolean A01;

    public final List DHt(TelephonyManager telephonyManager) {
        0qQ.A0B(telephonyManager, 0);
        if (this.A01 && 14i.A08()) {
            0wb.A04("IgLocationRequestDetector", "TELEPHONY_MANAGER_DETOUR_getAllCellInfo()", 1);
        }
        if (!this.A00 || !C377799Nh.A00()) {
            C60250fd r0 = C60250fd.$redex_init_class;
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                return allCellInfo;
            }
        }
        return new ArrayList();
    }

    public final CellLocation DHv(TelephonyManager telephonyManager) {
        0qQ.A0B(telephonyManager, 0);
        if (this.A01 && 14i.A08()) {
            0wb.A04("IgLocationRequestDetector", "TELEPHONY_MANAGER_DETOUR_getCellLocation()", 1);
        }
        if (this.A00 && C377799Nh.A00()) {
            return null;
        }
        C60250fd r0 = C60250fd.$redex_init_class;
        try {
            return telephonyManager.getCellLocation();
        } catch (Exception unused) {
            return null;
        }
    }

    public final WifiInfo DHx(WifiManager wifiManager) {
        0qQ.A0B(wifiManager, 0);
        if (this.A01 && 14i.A08()) {
            0wb.A04("IgLocationRequestDetector", "WIFI_MANAGER_DETOUR_getConnectionInfo()", 1);
        }
        if (this.A00 && C377799Nh.A00()) {
            return null;
        }
        AnonymousClass0fl r0 = AnonymousClass0fl.$redex_init_class;
        return wifiManager.getConnectionInfo();
    }

    public final Location DI0(LocationManager locationManager, String str) {
        0qQ.A0B(locationManager, 0);
        0qQ.A0B(str, 1);
        if (this.A01 && 14i.A08()) {
            0wb.A04("IgLocationRequestDetector", "LOCATION_MANAGER_DETOUR_getLastKnownLocation()", 1);
        }
        if (this.A00 && C377799Nh.A00()) {
            return null;
        }
        0fW r0 = 0fW.$redex_init_class;
        return locationManager.getLastKnownLocation(str);
    }

    public final List DI1(WifiManager wifiManager) {
        0qQ.A0B(wifiManager, 0);
        if (this.A01 && 14i.A08()) {
            0wb.A04("IgLocationRequestDetector", "WIFI_MANAGER_DETOUR_getScanResults()", 1);
        }
        if (this.A00 && C377799Nh.A00()) {
            return new ArrayList();
        }
        AnonymousClass0fl r0 = AnonymousClass0fl.$redex_init_class;
        List<ScanResult> scanResults = wifiManager.getScanResults();
        0qQ.A07(scanResults);
        return scanResults;
    }

    public final ServiceState DI2(TelephonyManager telephonyManager) {
        0qQ.A0B(telephonyManager, 0);
        if (this.A01 && 14i.A08()) {
            0wb.A04("IgLocationRequestDetector", "TELEPHONY_MANAGER_DETOUR_getServiceState()", 1);
        }
        if (this.A00 && C377799Nh.A00()) {
            return null;
        }
        C60250fd r0 = C60250fd.$redex_init_class;
        return telephonyManager.getServiceState();
    }

    public final void Dde(LocationListener locationListener, LocationManager locationManager) {
        0qQ.A0B(locationManager, 0);
        0qQ.A0B(locationListener, 1);
        if (this.A01 && 14i.A08()) {
            0wb.A04("IgLocationRequestDetector", "LOCATION_MANAGER_DETOUR_removeUpdates()", 1);
        }
        0fW r0 = 0fW.$redex_init_class;
        locationManager.removeUpdates(locationListener);
    }

    public final void Deb(LocationListener locationListener, LocationManager locationManager, String str, float f, int i, long j) {
        LocationManager locationManager2 = locationManager;
        0qQ.A0B(locationManager, 0);
        String str2 = str;
        0qQ.A0B(str, 1);
        LocationListener locationListener2 = locationListener;
        0qQ.A0B(locationListener, 4);
        if (this.A01 && 14i.A08()) {
            0wb.A04("IgLocationRequestDetector", "LOCATION_MANAGER_DETOUR_requestLocationUpdates()", 1);
        }
        if (!this.A00 || !C377799Nh.A00()) {
            0fW r0 = 0fW.$redex_init_class;
            locationManager2.requestLocationUpdates(str2, j, f, locationListener2);
        }
    }

    public final boolean Dma(WifiManager wifiManager) {
        0qQ.A0B(wifiManager, 0);
        if (this.A01 && 14i.A08()) {
            0wb.A04("IgLocationRequestDetector", "WIFI_MANAGER_DETOUR_startScan()", 1);
        }
        if (this.A00 && C377799Nh.A00()) {
            return false;
        }
        AnonymousClass0fl r0 = AnonymousClass0fl.$redex_init_class;
        return wifiManager.startScan();
    }

    public AnonymousClass9D2(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public final void Dea(Criteria criteria, LocationListener locationListener, LocationManager locationManager, Looper looper, float f, int i, long j) {
        LocationManager locationManager2 = locationManager;
        0qQ.A0B(locationManager, 0);
        Looper looper2 = looper;
        0qQ.A0B(looper, 5);
        if (this.A01 && 14i.A08()) {
            0wb.A04("IgLocationRequestDetector", "LOCATION_MANAGER_DETOUR_requestLocationUpdates()", 1);
        }
        if (!this.A00 || !C377799Nh.A00()) {
            0fW r0 = 0fW.$redex_init_class;
            locationManager2.requestLocationUpdates(0, 0.0f, criteria, locationListener, looper2);
        }
    }
}
