package X;

import android.content.Context;

/* renamed from: X.5we  reason: invalid class name and case insensitive filesystem */
public final class C300165we {
    public static final C300175wf A00 = new Object();
    public static volatile 1Uk A01;

    public static final synchronized 1Uk A00(Context context) {
        1Uk r1;
        synchronized (C300165we.class) {
            synchronized (A00) {
                0qQ.A0B(context, 0);
                if (A01 != null) {
                    r1 = A01;
                    0qQ.A0C(r1, "null cannot be cast to non-null type com.facebook.crudolib.prefs.LightSharedPreferences");
                } else {
                    C64791Ub r12 = new C64791Ub(context);
                    r12.A00 = 1;
                    r12.A03 = true;
                    A01 = r12.A00().A00("secureMessagePrefs");
                    r1 = A01;
                    0qQ.A0C(r1, "null cannot be cast to non-null type com.facebook.crudolib.prefs.LightSharedPreferences");
                }
            }
        }
        return r1;
    }
}
