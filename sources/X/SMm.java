package X;

import java.lang.reflect.Field;

public final class SMm {
    public static final T9l A00;
    public static final Field[] A01;

    static {
        T9l t9l = new T9l();
        A00 = t9l;
        A01 = new Field[]{T9l.A00(t9l, t9l.A01), T9l.A00(t9l, t9l.A03), T9l.A00(t9l, t9l.A00), T9l.A00(t9l, t9l.A02)};
    }

    public static T9l A00(T9E t9e, C269144ee r4) {
        if (t9e == null) {
            return A00;
        }
        new C12442SuY(r4.A01.A07);
        Field[] fieldArr = A01;
        return new T9l(fieldArr[0].getName(), fieldArr[1].getName(), fieldArr[2].getName(), fieldArr[3].getName());
    }
}
