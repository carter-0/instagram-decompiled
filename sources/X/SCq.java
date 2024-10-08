package X;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class SCq {
    public static Method A00;
    public static Method A01;
    public static boolean A02;

    public static final void A00(Canvas canvas, boolean z) {
        0qQ.A0B(canvas, 0);
        if (Build.VERSION.SDK_INT < 29) {
            if (!A02) {
                try {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, Object[].class});
                    Class<Canvas> cls = Canvas.class;
                    Object invoke = declaredMethod.invoke(cls, new Object[]{"insertReorderBarrier", new Class[0]});
                    0qQ.A0C(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
                    A01 = (Method) invoke;
                    Object invoke2 = declaredMethod.invoke(cls, new Object[]{"insertInorderBarrier", new Class[0]});
                    0qQ.A0C(invoke2, "null cannot be cast to non-null type java.lang.reflect.Method");
                    Method method = (Method) invoke2;
                    A00 = method;
                    Method method2 = A01;
                    if (!(method2 == null || method == null)) {
                        method2.setAccessible(true);
                        Method method3 = A00;
                        if (method3 != null) {
                            method3.setAccessible(true);
                        }
                        A02 = true;
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            if (z) {
                try {
                    Method method4 = A01;
                    if (method4 != null) {
                        method4.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else {
                Method method5 = A00;
                if (method5 != null) {
                    method5.invoke(canvas, new Object[0]);
                }
            }
        } else if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
