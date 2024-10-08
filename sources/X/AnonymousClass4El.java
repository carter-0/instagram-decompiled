package X;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.4El  reason: invalid class name */
public abstract class AnonymousClass4El {
    public static final AnonymousClass4El A00;

    public Object A01(Class cls) {
        C262494Em r0 = (C262494Em) this;
        A00(cls);
        return r0.A01.invoke(r0.A00, new Object[]{cls});
    }

    static {
        AnonymousClass4El r2;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            r2 = new C262494Em(declaredField.get((Object) null), cls.getMethod("allocateInstance", new Class[]{Class.class}));
        } catch (Exception unused) {
            Class<ObjectStreamClass> cls2 = ObjectStreamClass.class;
            Class<Class> cls3 = Class.class;
            try {
                Method declaredMethod = cls2.getDeclaredMethod("getConstructorId", new Class[]{cls3});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = cls2.getDeclaredMethod("newInstance", new Class[]{cls3, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                r2 = new C43774CCs(declaredMethod2, intValue);
            } catch (Exception unused2) {
                Class<Class> cls4 = Class.class;
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls4, cls4});
                    declaredMethod3.setAccessible(true);
                    r2 = new C43773CCr(declaredMethod3);
                } catch (Exception unused3) {
                    r2 = new C43772CCq();
                }
            }
        }
        A00 = r2;
    }

    public static void A00(Class cls) {
        String A002 = 2G9.A00(cls);
        if (A002 != null) {
            throw new AssertionError(002.A0R("UnsafeAllocator is used for non-instantiable type: ", A002));
        }
    }
}
