package X;

import java.lang.reflect.Field;
import java.util.HashMap;

public abstract class SCV {
    public static Object A00;
    public static final HashMap A01 = AnonymousClass7TE.A1E();

    public static final Object A00(String str, Object obj) {
        Class cls = obj.getClass();
        S5U s5u = new S5U(str, cls);
        HashMap hashMap = A01;
        Field field = (Field) hashMap.get(s5u);
        if (field == null) {
            while (cls != null) {
                Field[] declaredFields = cls.getDeclaredFields();
                0qQ.A07(declaredFields);
                int i = 0;
                int length = declaredFields.length;
                while (i < length) {
                    field = declaredFields[i];
                    if (0qQ.A0K(field.getName(), str)) {
                        field.setAccessible(true);
                        hashMap.put(s5u, field);
                    } else {
                        i++;
                    }
                }
                cls = cls.getSuperclass();
            }
            return null;
        }
        return field.get(obj);
    }
}
