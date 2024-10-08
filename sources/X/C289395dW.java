package X;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.5dW  reason: invalid class name and case insensitive filesystem */
public final class C289395dW {
    public final void A00(View view) {
        try {
            if (!C289385dV.A0H) {
                C289385dV.A0H = true;
                Class<Class> cls = Class.class;
                Class<String> cls2 = String.class;
                Class<View> cls3 = View.class;
                C289385dV.A0G = (Method) cls.getDeclaredMethod("getDeclaredMethod", new Class[]{cls2, new Class[0].getClass()}).invoke(cls3, new Object[]{"updateDisplayListIfDirty", new Class[0]});
                C289385dV.A0F = (Field) cls.getDeclaredMethod("getDeclaredField", new Class[]{cls2}).invoke(cls3, new Object[]{"mRecreateDisplayList"});
                Method method = C289385dV.A0G;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = C289385dV.A0F;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = C289385dV.A0F;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = C289385dV.A0G;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            C289385dV.A0I = true;
        }
    }
}
