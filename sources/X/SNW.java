package X;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

public final class SNW {
    public static final SNW A04 = new SNW();
    public final String A00;
    public final String A01;
    public final Field A02;
    public final Field A03;

    public static Field A00(Class cls, String str) {
        Class<Class> cls2 = Class.class;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            if (!str.equals(field.getName()) || field.getType() != cls2) {
                i++;
            } else {
                field.setAccessible(true);
                return field;
            }
        }
        throw Pxf.A0Y("No field named '%s' in class '%s'", new Object[]{str, cls.getName()});
    }

    public SNW() {
        Field field;
        String str;
        String str2;
        Field field2 = null;
        try {
            field = A00(EnumSet.class, "elementType");
            str = null;
        } catch (Exception e) {
            str = e.toString();
            field = null;
        }
        this.A03 = field;
        this.A01 = str;
        try {
            str2 = null;
            field2 = A00(EnumMap.class, "keyType");
        } catch (Exception e2) {
            str2 = e2.toString();
        }
        this.A02 = field2;
        this.A00 = str2;
    }
}
