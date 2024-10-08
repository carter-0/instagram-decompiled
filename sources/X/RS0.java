package X;

import android.content.Context;
import android.telephony.TelephonyManager;

public abstract class RS0 {
    public static void A00(Context context, SOE soe) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            Q8G q8g = new Q8G(soe);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), q8g);
            telephonyManager.unregisterTelephonyCallback(q8g);
        } catch (RuntimeException unused) {
            SOE.A01(soe, 5);
        }
    }
}
