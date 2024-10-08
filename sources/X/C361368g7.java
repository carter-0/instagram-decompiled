package X;

import android.content.Context;
import android.provider.Settings;
import java.util.List;

/* renamed from: X.8g7  reason: invalid class name and case insensitive filesystem */
public final class C361368g7 {
    public static final C361368g7 A00 = new Object();

    public final Integer A00(Context context) {
        try {
            String string = Settings.System.getString(context.getContentResolver(), "lock_application_shortcut");
            if (string != null) {
                List A0R = 00l.A0R(string, new String[]{";"}, 0);
                if (A0R.size() <= 3) {
                    return AnonymousClass05K.A00;
                }
                String str = (String) A0R.get(1);
                String packageName = context.getApplicationContext().getPackageName();
                boolean z = false;
                if (00l.A0d(str, 002.A0R(packageName, "/com.instagram.lockscreen.LockScreenShortcutActivity"), false) || 00l.A0d(str, 002.A0R(packageName, "/com.instagram.lockscreen.LockScreenCameraCaptureActivity"), false)) {
                    z = true;
                }
                if (z) {
                    return AnonymousClass05K.A0C;
                }
                String str2 = (String) A0R.get(3);
                String packageName2 = context.getApplicationContext().getPackageName();
                boolean z2 = false;
                if (00l.A0d(str2, 002.A0R(packageName2, "/com.instagram.lockscreen.LockScreenShortcutActivity"), false) || 00l.A0d(str2, 002.A0R(packageName2, "/com.instagram.lockscreen.LockScreenCameraCaptureActivity"), false)) {
                    z2 = true;
                }
                if (z2) {
                    return AnonymousClass05K.A0N;
                }
            }
            return AnonymousClass05K.A01;
        } catch (SecurityException unused) {
            return AnonymousClass05K.A00;
        }
    }
}
