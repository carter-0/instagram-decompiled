package X;

import android.os.Binder;
import java.lang.reflect.Method;

/* renamed from: X.4mL  reason: invalid class name and case insensitive filesystem */
public final class C273324mL implements C273294mI {
    public Method A00;
    public boolean A01 = false;

    public final String getName() {
        return "BinderWatchdog";
    }

    public final void CoZ() {
        if (this.A00 == null && !this.A01) {
            this.A01 = true;
            try {
                Method method = Binder.class.getMethod("blockUntilThreadAvailable", new Class[0]);
                this.A00 = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
        }
        Method method2 = this.A00;
        if (method2 != null) {
            try {
                method2.invoke((Object) null, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }
}
