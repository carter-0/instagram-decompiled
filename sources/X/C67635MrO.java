package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: X.MrO  reason: case insensitive filesystem */
public final class C67635MrO extends BroadcastReceiver {
    public final String A00;
    public final C61410nE A01 = C61410nE.A00;

    public C67635MrO(String str) {
        this.A00 = str;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A03 = C66580MXl.A03(this, context, intent, 1786194874);
        AnonymousClass7TG.A1N(context, intent);
        String action = intent.getAction();
        if (action == null || action.length() == 0) {
            i = 917025907;
        } else {
            if (action.equals("android.intent.action.ACTION_SHUTDOWN")) {
                String str = this.A00;
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                0qQ.A07(defaultSharedPreferences);
                0xY AR4 = new 0tX(defaultSharedPreferences, "IgRtcDeviceStateBroadcastReceiver").AR4();
                AR4.E5c("rtc_device_shutdown_time", System.currentTimeMillis());
                AR4.E5g("rtc_device_shutdown_local_call_id", str);
                AR4.apply();
            }
            i = 1196126792;
        }
        AnonymousClass0fD.A0E(i, A03, intent);
    }
}
