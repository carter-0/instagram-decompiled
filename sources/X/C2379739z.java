package X;

import android.app.Application;
import android.content.Context;

/* renamed from: X.39z  reason: invalid class name and case insensitive filesystem */
public abstract class C2379739z {
    public static final boolean A00(Context context, AnonymousClass38C r4) {
        0qQ.A0B(context, 0);
        0qQ.A0B(r4, 1);
        String processName = Application.getProcessName();
        0qQ.A07(processName);
        String str = r4.A04;
        if (str == null || str.length() == 0) {
            str = context.getApplicationInfo().processName;
        }
        return processName.equals(str);
    }

    static {
        0qQ.A07(AnonymousClass389.A01("ProcessUtils"));
    }
}
