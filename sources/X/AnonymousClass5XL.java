package X;

import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;

/* renamed from: X.5XL  reason: invalid class name */
public abstract class AnonymousClass5XL {
    public static final boolean A00() {
        Boolean bool;
        Method method;
        try {
            Object obj = null;
            if (AndroidComposeView.A1H == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                AndroidComposeView.A1H = cls;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                } else {
                    method = null;
                }
                AndroidComposeView.A1I = method;
            }
            Method method2 = AndroidComposeView.A1I;
            if (method2 != null) {
                obj = method2.invoke((Object) null, new Object[]{"debug.layout", false});
            }
            if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
