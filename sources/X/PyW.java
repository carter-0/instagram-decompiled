package X;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public final class PyW {
    public static PyW A04;
    public Boolean A00 = null;
    public Boolean A01 = null;
    public String A02 = null;
    public final Queue A03 = new ArrayDeque();

    public static synchronized PyW A00() {
        PyW pyW;
        synchronized (PyW.class) {
            pyW = A04;
            if (pyW == null) {
                pyW = new PyW();
                A04 = pyW;
            }
        }
        return pyW;
    }

    public final boolean A01(Context context) {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(AnonymousClass7TF.A1Q(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK")));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.A00.booleanValue();
    }
}
