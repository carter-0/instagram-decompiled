package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class TJN implements Runnable {
    public static Field A03;
    public final AnonymousClass120 A00;
    public final WeakReference A01;
    public final boolean A02;

    public final void run() {
        Object obj = this.A01.get();
        if (obj != null) {
            for (Class cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    if (!field.isSynthetic() && !field.getType().isPrimitive() && !Context.class.isAssignableFrom(field.getType())) {
                        boolean z = this.A02;
                        try {
                            if (!Modifier.isStatic(field.getModifiers())) {
                                boolean isFinal = Modifier.isFinal(field.getModifiers());
                                if (!z) {
                                    if (isFinal) {
                                    }
                                } else if (isFinal) {
                                    if (A03 == null) {
                                        Field declaredField = Field.class.getDeclaredField("accessFlags");
                                        A03 = declaredField;
                                        declaredField.setAccessible(true);
                                    }
                                    int modifiers = field.getModifiers();
                                    A03.setInt(field, modifiers & -17);
                                    if (!field.isAccessible()) {
                                        field.setAccessible(true);
                                        field.set(obj, (Object) null);
                                        field.setAccessible(false);
                                    } else {
                                        field.set(obj, (Object) null);
                                    }
                                    A03.setInt(field, modifiers | 16);
                                }
                                if (!field.isAccessible()) {
                                    field.setAccessible(true);
                                    field.set(obj, (Object) null);
                                    field.setAccessible(false);
                                } else {
                                    field.set(obj, (Object) null);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public TJN(AnonymousClass120 r2, Object obj, boolean z) {
        this.A01 = C51965G9l.A0v(obj);
        this.A00 = r2;
        this.A02 = z;
    }
}
