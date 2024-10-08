package X;

import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.Vts  reason: case insensitive filesystem */
public final class C18540Vts {
    public static Method A00;
    public static boolean A01;
    public static final C18540Vts A02 = new Object();

    public final void A00(View view, int i, int i2, int i3, int i4) {
        0qQ.A0B(view, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            view.setLeftTopRightBottom(i, i2, i3, i4);
            return;
        }
        if (!A01) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setLeftTopRightBottom", new Class[]{cls2, cls2, cls2, cls2});
                A00 = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
                1Kn.A00((C307786Rm) null, "ChangeBoundsUtils", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            A01 = true;
        }
        Method method = A00;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
                return;
            } catch (Exception e2) {
                1Kn.A00((C307786Rm) null, "ChangeBoundsUtils", "Failed to call setLeftTopRightBottom method", e2);
            }
        }
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }
}
