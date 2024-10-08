package com.facebook.catalyst.modules.netinfo;

import X.0Sd;
import X.0qQ;
import X.AnonymousClass000;
import X.C13773Tgo;
import X.C13904TjR;
import X.C13948Tm8;
import X.C9239RUq;
import X.Pxe;
import X.Pxf;
import X.Pxi;
import X.Q62;
import X.QZK;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.fbreact.specs.NativeNetInfoSpec;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Locale;

@ReactModule(name = "NetInfo")
public final class NetInfoModule extends NativeNetInfoSpec implements C13773Tgo {
    public static final String CONNECTION_TYPE_BLUETOOTH = "bluetooth";
    public static final String CONNECTION_TYPE_CELLULAR = "cellular";
    public static final String CONNECTION_TYPE_ETHERNET = "ethernet";
    public static final String CONNECTION_TYPE_NONE = "none";
    public static final String CONNECTION_TYPE_NONE_DEPRECATED = "NONE";
    public static final String CONNECTION_TYPE_UNKNOWN = "unknown";
    public static final String CONNECTION_TYPE_UNKNOWN_DEPRECATED = "UNKNOWN";
    public static final String CONNECTION_TYPE_WIFI = "wifi";
    public static final String CONNECTION_TYPE_WIMAX = "wimax";
    public static final C9239RUq Companion = new Object();
    public static final String EFFECTIVE_CONNECTION_TYPE_2G = "2g";
    public static final String EFFECTIVE_CONNECTION_TYPE_3G = "3g";
    public static final String EFFECTIVE_CONNECTION_TYPE_4G = "4g";
    public static final String EFFECTIVE_CONNECTION_TYPE_UNKNOWN = "unknown";
    public static final String ERROR_MISSING_PERMISSION = "E_MISSING_PERMISSION";
    public static final String MISSING_PERMISSION_MESSAGE = "To use NetInfo on Android, add the following to your AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />";
    public static final String NAME = "NetInfo";
    public String _effectiveConnectionType = "unknown";
    public String connectionType = "unknown";
    public final Q62 connectivityBroadcastReceiver = new Q62(this);
    public String connectivityDeprecated = "UNKNOWN";
    public final ConnectivityManager connectivityManager;
    public boolean noNetworkPermission;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetInfoModule(QZK qzk) {
        super(qzk);
        0qQ.A0B(qzk, 1);
        Object systemService = qzk.getBaseContext().getSystemService("connectivity");
        0qQ.A0C(systemService, AnonymousClass000.A00(326));
        this.connectivityManager = (ConnectivityManager) systemService;
    }

    public void addListener(String str) {
    }

    public void getCurrentConnectivity(C13904TjR tjR) {
        0qQ.A0B(tjR, 0);
        if (this.noNetworkPermission) {
            Pxi.A1K(ERROR_MISSING_PERMISSION, tjR, MISSING_PERMISSION_MESSAGE);
        } else {
            tjR.resolve(createConnectivityEventMap());
        }
    }

    public String getName() {
        return "NetInfo";
    }

    public void isConnectionMetered(C13904TjR tjR) {
        0qQ.A0B(tjR, 0);
        if (this.noNetworkPermission) {
            Pxi.A1K(ERROR_MISSING_PERMISSION, tjR, MISSING_PERMISSION_MESSAGE);
        } else {
            tjR.resolve(Boolean.valueOf(this.connectivityManager.isActiveNetworkMetered()));
        }
    }

    public void onHostDestroy() {
    }

    public void removeListeners(double d) {
    }

    private final String getCurrentConnectionType() {
        try {
            NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return CONNECTION_TYPE_NONE_DEPRECATED;
            }
            if (ConnectivityManager.isNetworkTypeValid(activeNetworkInfo.getType())) {
                String typeName = activeNetworkInfo.getTypeName();
                0qQ.A07(typeName);
                Locale locale = Locale.getDefault();
                0qQ.A07(locale);
                return Pxf.A0n(locale, typeName);
            }
            return "UNKNOWN";
        } catch (SecurityException unused) {
            this.noNetworkPermission = true;
        }
    }

    private final void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 34) {
            QZK qzk = this.mReactApplicationContext;
            0Sd.A01(qzk, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            if (qzk.getApplicationInfo().targetSdkVersion >= 34) {
                QZK qzk2 = this.mReactApplicationContext;
                0Sd.A01(qzk2, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
                qzk2.registerReceiver(this.connectivityBroadcastReceiver, intentFilter, 2);
                this.connectivityBroadcastReceiver.A00 = true;
                updateAndSendConnectionType();
            }
        }
        Pxe.A0T(this).registerReceiver(this.connectivityBroadcastReceiver, intentFilter);
        this.connectivityBroadcastReceiver.A00 = true;
        updateAndSendConnectionType();
    }

    private final void unregisterReceiver() {
        if (this.connectivityBroadcastReceiver.A00) {
            Pxe.A0T(this).unregisterReceiver(this.connectivityBroadcastReceiver);
            this.connectivityBroadcastReceiver.A00 = false;
        }
    }

    private final C13948Tm8 createConnectivityEventMap() {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putString("network_info", this.connectivityDeprecated);
        A0U.putString("connectionType", this.connectionType);
        A0U.putString("effectiveConnectionType", this._effectiveConnectionType);
        return A0U;
    }

    private final String getEffectiveConnectionType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return EFFECTIVE_CONNECTION_TYPE_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 14:
                return EFFECTIVE_CONNECTION_TYPE_3G;
            case 13:
            case 15:
                return EFFECTIVE_CONNECTION_TYPE_4G;
            default:
                return "unknown";
        }
    }

    private final void sendConnectivityChangedEvent() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A02(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) != null) {
            rCTDeviceEventEmitter.emit("networkStatusDidChange", createConnectivityEventMap());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateAndSendConnectionType() {
        /*
            r5 = this;
            java.lang.String r3 = "unknown"
            r4 = 1
            android.net.ConnectivityManager r0 = r5.connectivityManager     // Catch:{ SecurityException -> 0x0042 }
            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0042 }
            if (r2 == 0) goto L_0x003c
            boolean r0 = r2.isConnected()     // Catch:{ SecurityException -> 0x0042 }
            if (r0 == 0) goto L_0x003c
            int r1 = r2.getType()     // Catch:{ SecurityException -> 0x0042 }
            if (r1 == 0) goto L_0x0035
            if (r1 == r4) goto L_0x0031
            r0 = 4
            if (r1 == r0) goto L_0x0035
            r0 = 9
            if (r1 == r0) goto L_0x002e
            r0 = 6
            if (r1 == r0) goto L_0x002a
            r0 = 7
            if (r1 != r0) goto L_0x0044
            java.lang.String r0 = "bluetooth"
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "wimax"
            goto L_0x003f
        L_0x002e:
            java.lang.String r0 = "ethernet"
            goto L_0x003f
        L_0x0031:
            java.lang.String r0 = "wifi"
            goto L_0x003f
        L_0x0035:
            java.lang.String r0 = "cellular"
            java.lang.String r2 = r5.getEffectiveConnectionType(r2)     // Catch:{ SecurityException -> 0x0042 }
            goto L_0x0040
        L_0x003c:
            java.lang.String r0 = "none"
        L_0x003f:
            r2 = r3
        L_0x0040:
            r3 = r0
            goto L_0x0045
        L_0x0042:
            r5.noNetworkPermission = r4
        L_0x0044:
            r2 = r3
        L_0x0045:
            java.lang.String r1 = r5.getCurrentConnectionType()
            java.lang.String r0 = r5.connectionType
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r5._effectiveConnectionType
            boolean r0 = X.00p.A0j(r2, r0, r4)
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r5.connectivityDeprecated
            boolean r0 = X.00p.A0j(r1, r0, r4)
            if (r0 != 0) goto L_0x006a
        L_0x0061:
            r5.connectionType = r3
            r5._effectiveConnectionType = r2
            r5.connectivityDeprecated = r1
            r5.sendConnectivityChangedEvent()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.modules.netinfo.NetInfoModule.updateAndSendConnectionType():void");
    }

    public void initialize() {
        Pxe.A0T(this).A09(this);
    }

    public void onHostPause() {
        unregisterReceiver();
    }

    public void onHostResume() {
        registerReceiver();
    }
}
