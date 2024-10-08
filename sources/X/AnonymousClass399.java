package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: X.399  reason: invalid class name */
public abstract class AnonymousClass399 extends AnonymousClass39B {
    public final BroadcastReceiver A00 = new AnonymousClass39C(this);

    public final IntentFilter A04() {
        IntentFilter intentFilter;
        String str;
        if (this instanceof AnonymousClass398) {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else if (this instanceof AnonymousClass39J) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
            str = "android.intent.action.DEVICE_STORAGE_LOW";
        } else {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_OKAY");
            str = "android.intent.action.BATTERY_LOW";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    public AnonymousClass399(Context context, AnonymousClass38N r3) {
        super(context, r3);
    }
}
