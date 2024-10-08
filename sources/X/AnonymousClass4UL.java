package X;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.4UL  reason: invalid class name */
public final class AnonymousClass4UL implements AnonymousClass4UM {
    public WifiManager.WifiLock A00;
    public boolean A01;
    public boolean A02;
    public final WifiManager A03;

    public final void Elw(boolean z) {
        this.A02 = z;
        WifiManager.WifiLock wifiLock = this.A00;
        if (wifiLock == null) {
            return;
        }
        if (!this.A01 || !z) {
            wifiLock.release();
        } else {
            wifiLock.acquire();
        }
    }

    public final void setEnabled(boolean z) {
        if (z && this.A00 == null) {
            WifiManager wifiManager = this.A03;
            if (wifiManager == null) {
                2AG.A04("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.A00 = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.A01 = z;
        WifiManager.WifiLock wifiLock = this.A00;
        if (wifiLock == null) {
            return;
        }
        if (!z || !this.A02) {
            wifiLock.release();
        } else {
            wifiLock.acquire();
        }
    }

    public AnonymousClass4UL(Context context) {
        this.A03 = (WifiManager) context.getApplicationContext().getSystemService(NetInfoModule.CONNECTION_TYPE_WIFI);
    }
}
