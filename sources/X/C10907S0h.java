package X;

import java.lang.reflect.Field;

/* renamed from: X.S0h  reason: case insensitive filesystem */
public final class C10907S0h {
    public final Field A00;

    public final void A00(Object obj, Object obj2) {
        try {
            this.A00.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw Pxe.A0e(e);
        }
    }

    public C10907S0h(Field field) {
        this.A00 = field;
        field.setAccessible(true);
    }
}
