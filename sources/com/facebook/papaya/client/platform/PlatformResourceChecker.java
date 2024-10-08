package com.facebook.papaya.client.platform;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class PlatformResourceChecker {
    public static long getAvailableMemoryBytes(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return Long.MAX_VALUE;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem - memoryInfo.threshold;
    }

    public static double getBatteryLevel(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return 0.0d;
        }
        double intExtra = (double) registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra2 != 0) {
            return intExtra / ((double) intExtra2);
        }
        return 0.0d;
    }

    public static boolean hasExternalPower(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    public static boolean hasNetworkConnectivity(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public static boolean hasUnmeteredConnectivity(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || connectivityManager.isActiveNetworkMetered()) {
            return false;
        }
        return true;
    }

    public static boolean isDeviceIdle(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null || powerManager.isInteractive()) {
            return false;
        }
        return true;
    }
}
