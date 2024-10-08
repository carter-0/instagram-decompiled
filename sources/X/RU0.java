package X;

import android.content.Context;
import android.os.Build;
import android.provider.Telephony;
import android.telephony.TelephonyManager;

public abstract class RU0 {
    public static boolean A00(Context context) {
        if (02K.A00(context, "android.permission.READ_PHONE_NUMBERS") == 0 || (((Build.VERSION.SDK_INT < 30 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 30) && 02K.A00(context, AnonymousClass000.A00(130)) == 0) || 02K.A00(context, "android.permission.READ_SMS") == 0 || context.getPackageName().equals(Telephony.Sms.getDefaultSmsPackage(context)))) {
            return true;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null && telephonyManager.hasCarrierPrivileges();
    }
}
