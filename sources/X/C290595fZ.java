package X;

import android.content.Context;
import android.view.WindowManager;

/* renamed from: X.5fZ  reason: invalid class name and case insensitive filesystem */
public abstract class C290595fZ {
    public static final WindowManager A00;
    public static final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, C290605fa.A00);

    static {
        Object obj;
        Context context = C60960kU.A00;
        WindowManager windowManager = null;
        if (context != null) {
            obj = context.getSystemService("window");
        } else {
            obj = null;
        }
        if (obj instanceof WindowManager) {
            windowManager = (WindowManager) obj;
        }
        A00 = windowManager;
    }
}
