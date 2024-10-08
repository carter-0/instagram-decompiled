package X;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* renamed from: X.38I  reason: invalid class name */
public abstract class AnonymousClass38I {
    public static final String A00 = AnonymousClass389.A01("WorkerFactory");

    public final C283015Ft A00(Context context, WorkerParameters workerParameters, String str) {
        String str2;
        StringBuilder sb;
        String str3;
        C283015Ft r4 = null;
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(C283015Ft.class);
            if (asSubclass != null) {
                try {
                    C283015Ft r0 = (C283015Ft) asSubclass.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                    r4 = r0;
                    if (r0 != null && r0.mUsed) {
                        throw new IllegalStateException(002.A11("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
                    }
                } catch (Throwable th) {
                    th = th;
                    AnonymousClass389.A00();
                    str2 = A00;
                    sb = new StringBuilder();
                    str3 = "Could not instantiate ";
                    sb.append(str3);
                    sb.append(str);
                    Log.e(str2, sb.toString(), th);
                    return r4;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            AnonymousClass389.A00();
            str2 = A00;
            sb = new StringBuilder();
            str3 = "Invalid class: ";
            sb.append(str3);
            sb.append(str);
            Log.e(str2, sb.toString(), th);
            return r4;
        }
        return r4;
    }
}
