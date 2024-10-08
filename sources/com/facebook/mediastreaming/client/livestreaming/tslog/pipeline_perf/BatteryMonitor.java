package com.facebook.mediastreaming.client.livestreaming.tslog.pipeline_perf;

import X.0DH;
import X.Pxg;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class BatteryMonitor {
    public final IntentFilter batteryChangeFilter;
    public final Intent batteryIntent;
    public final PowerManager powerManager;

    public final int getBatteryLevel() {
        Intent intent = this.batteryIntent;
        if (intent == null) {
            return 0;
        }
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra < 0 || intExtra2 <= 0) {
            return 0;
        }
        return (intExtra * 100) / intExtra2;
    }

    public final int getCurrentThermalStatus() {
        PowerManager powerManager2;
        if (Build.VERSION.SDK_INT < 29 || (powerManager2 = this.powerManager) == null) {
            return -1;
        }
        return powerManager2.getCurrentThermalStatus();
    }

    public final boolean getIsBatteryCharging() {
        Intent intent = this.batteryIntent;
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    public BatteryMonitor(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        this.batteryChangeFilter = intentFilter;
        this.batteryIntent = 0DH.A00((BroadcastReceiver) null, context, intentFilter);
        this.powerManager = Pxg.A0O(context);
    }
}
