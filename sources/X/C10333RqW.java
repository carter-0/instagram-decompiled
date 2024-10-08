package X;

import java.lang.reflect.Constructor;

/* renamed from: X.RqW  reason: case insensitive filesystem */
public final class C10333RqW {
    public static C10333RqW A01;
    public Constructor A00;

    public C10333RqW() {
        try {
            Constructor<?> constructor = Class.forName("android.app.RemoteServiceException").getConstructor(new Class[]{String.class});
            this.A00 = constructor;
            constructor.setAccessible(true);
        } catch (Throwable unused) {
            this.A00 = null;
        }
    }
}
