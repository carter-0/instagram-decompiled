package X;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: X.5ON  reason: invalid class name */
public abstract class AnonymousClass5ON {
    public static void A00(Context context, AnonymousClass4R9 r4) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            AnonymousClass5OO r1 = new AnonymousClass5OO(r4);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), r1);
            telephonyManager.unregisterTelephonyCallback(r1);
        } catch (RuntimeException unused) {
            AnonymousClass4R9.A00(r4, 5);
        }
    }
}
