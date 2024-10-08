package X;

import java.lang.reflect.Field;

/* renamed from: X.RrY  reason: case insensitive filesystem */
public final class C10396RrY {
    public final Field A00;
    public final Field A01;

    public C10396RrY(Object obj) {
        Class<?> cls = obj.getClass();
        Field declaredField = cls.getDeclaredField("paused");
        this.A01 = declaredField;
        declaredField.setAccessible(true);
        Field declaredField2 = cls.getDeclaredField("activity");
        this.A00 = declaredField2;
        declaredField2.setAccessible(true);
    }
}
