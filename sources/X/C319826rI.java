package X;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6rI  reason: invalid class name and case insensitive filesystem */
public abstract class C319826rI {
    public static final List A00;
    public static final List A01;

    public static final 2YL A00(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (2YL) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("A ");
            sb2.append(cls);
            sb2.append(" cannot be instantiated.");
            throw new RuntimeException(sb2.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("An exception happened in constructor of ");
            sb3.append(cls);
            throw new RuntimeException(sb3.toString(), e3.getCause());
        }
    }

    static {
        Class<C319836rJ> cls = C319836rJ.class;
        A00 = 0sr.A1P(new Class[]{Application.class, cls});
        List<C319836rJ> singletonList = Collections.singletonList(cls);
        0qQ.A07(singletonList);
        A01 = singletonList;
    }

    public static final Constructor A01(Class cls, List list) {
        Constructor[] constructors = cls.getConstructors();
        0qQ.A07(constructors);
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            0qQ.A07(parameterTypes);
            List A0J = 03t.A0J(parameterTypes);
            if (list.equals(A0J)) {
                return constructor;
            }
            if (list.size() != A0J.size() || !A0J.containsAll(list)) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Class ");
                sb.append(cls.getSimpleName());
                sb.append(" must have parameters in the proper order: ");
                sb.append(list);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        return null;
    }
}
