package com.facebook.rtc.platform.client.androiddevicestats;

import X.0qQ;
import X.Pxg;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.webrtc.ContextUtils;

public final class AndroidDeviceStatsCollector {
    public static final AndroidDeviceStatsCollector INSTANCE = new Object();

    public static final int getActiveNetworkInfo() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            Context context = ContextUtils.applicationContext;
            if (context == null) {
                return 0;
            }
            Object systemService = context.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager) || (connectivityManager = (ConnectivityManager) systemService) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                return type == 1 ? 2 : 0;
            }
            return 1;
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    public static final int getDeviceBatteryPercentage() {
        Context context = ContextUtils.applicationContext;
        if (context != null) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            try {
                0qQ.A0B(intentFilter, 2);
                Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, intentFilter);
                if (registerReceiver != null) {
                    int intExtra = registerReceiver.getIntExtra("level", -1);
                    int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra == -1 || intExtra2 == -1) {
                        return -1;
                    }
                    return (intExtra * 100) / intExtra2;
                }
            } catch (RuntimeException unused) {
                return -1;
            }
        }
        return -1;
    }

    public static final int getDeviceThermalStatus() {
        Context context;
        PowerManager A0O;
        if (Build.VERSION.SDK_INT < 29 || (context = ContextUtils.applicationContext) == null || (A0O = Pxg.A0O(context)) == null) {
            return -1;
        }
        return A0O.getCurrentThermalStatus();
    }

    public static final boolean getPowerSaveMode() {
        Context context;
        PowerManager A0O;
        if (Build.VERSION.SDK_INT < 29 || (context = ContextUtils.applicationContext) == null || (A0O = Pxg.A0O(context)) == null) {
            return false;
        }
        return A0O.isPowerSaveMode();
    }

    public static final boolean isBatteryCharging() {
        Context context = ContextUtils.applicationContext;
        if (context == null) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        try {
            0qQ.A0B(intentFilter, 2);
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, intentFilter);
            if (registerReceiver == null) {
                return false;
            }
            int intExtra = registerReceiver.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
