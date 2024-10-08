package X;

import android.content.Context;
import android.os.PowerManager;

public abstract class SAu {
    public static final String A00;

    static {
        String A01 = AnonymousClass389.A01("WakeLocks");
        0qQ.A07(A01);
        A00 = A01;
    }

    public static final PowerManager.WakeLock A00(Context context, String str) {
        boolean A1Z = AnonymousClass7TG.A1Z(context, str);
        PowerManager A0O = Pxg.A0O(context.getApplicationContext());
        String A0R = 002.A0R("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = A0O.newWakeLock(A1Z ? 1 : 0, A0R);
        0BX.A02(newWakeLock, A0R);
        synchronized (SCT.A00) {
            SCT.A01.put(newWakeLock, A0R);
        }
        0qQ.A07(newWakeLock);
        return newWakeLock;
    }
}
