package X;

import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.Nrk  reason: case insensitive filesystem */
public abstract class C69761Nrk {
    public static final Object A00(View view, String str) {
        try {
            Field declaredField = View.class.getDeclaredField("mListenerInfo");
            0qQ.A07(declaredField);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = obj.getClass().getDeclaredField(str);
            0qQ.A07(declaredField2);
            declaredField2.setAccessible(true);
            return declaredField2.get(obj);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }
}
