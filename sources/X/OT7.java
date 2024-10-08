package X;

import android.content.Context;
import android.telephony.PhoneStateListener;

public final class OT7 {
    public final PhoneStateListener A00;
    public final 1DF A01;

    public static boolean A00(Context context) {
        try {
            if (AnonymousClass1DA.A00(context, (AnonymousClass0eK) null).A00.getCallState() != 2) {
                return false;
            }
            return true;
        } catch (SecurityException e) {
            0KC.A0J("SafeTelephonyManager", "getCallState: Caught Security Exception ", e);
        }
    }

    public OT7(Context context, C74299PsY psY) {
        this.A01 = AnonymousClass1DA.A00(context, (AnonymousClass0eK) null);
        this.A00 = new C67667Mry(psY);
    }
}
