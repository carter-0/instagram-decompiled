package X;

import android.view.View;
import java.lang.reflect.Field;

public abstract class VJV {
    public static Field A00;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mKeyedTags");
            A00 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }
}
