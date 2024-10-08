package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.Rlm  reason: case insensitive filesystem */
public abstract class C10049Rlm {
    public static Method A00;
    public static boolean A01;

    public static void A00(Rect rect, Rect rect2, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            RRT.A00(rect, rect2, view);
            return;
        }
        if (!A01) {
            A01 = true;
            Class<Rect> cls = Rect.class;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
                A00 = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    A00.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
        Method method = A00;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception unused2) {
            }
        }
    }
}
