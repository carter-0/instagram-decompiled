package X;

import android.app.Activity;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Mhr  reason: case insensitive filesystem */
public abstract class C67076Mhr {
    public static boolean A00(Activity activity, String str) {
        try {
            return AnonymousClass7TE.A1a(PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(activity.getApplication().getPackageManager(), new Object[]{str}));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
