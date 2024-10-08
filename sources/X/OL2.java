package X;

import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public final class OL2 {
    public Object A00;
    public Field A01;
    public Field A02;
    public boolean A03;

    public final ArrayList A00() {
        Field field;
        if (!this.A03) {
            this.A03 = true;
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                this.A00 = C41847B3o.A17(cls, "getInstance", 0);
                Field declaredField = cls.getDeclaredField("mViews");
                this.A02 = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = cls.getDeclaredField("mParams");
                this.A01 = declaredField2;
                declaredField2.setAccessible(true);
            } catch (InvocationTargetException e) {
                e.getCause();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException unused) {
            }
        }
        Object obj = this.A00;
        if (obj == null || (field = this.A02) == null || this.A01 == null) {
            return null;
        }
        try {
            List list = (List) field.get(obj);
            List list2 = (List) this.A01.get(this.A00);
            ArrayList A1C = AnonymousClass7TE.A1C();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A1C.add(new C70535OAj((View) list.get(i), (WindowManager.LayoutParams) list2.get(i)));
            }
            return A1C;
        } catch (IllegalAccessException | RuntimeException unused2) {
            return null;
        }
    }
}
