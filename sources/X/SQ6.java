package X;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public final class SQ6 {
    public static Object A01(C268894eF r4) {
        Class<String> cls = r4.A00;
        Class A01 = C269574fL.A01(cls);
        if (A01 != null) {
            if (A01 == Integer.TYPE) {
                return 0;
            }
            if (A01 == Long.TYPE) {
                return C51971G9r.A0m();
            }
            if (A01 == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (A01 == Double.TYPE) {
                return Double.valueOf(0.0d);
            }
            if (A01 == Float.TYPE) {
                return C51967G9n.A0g();
            }
            if (A01 == Byte.TYPE) {
                return (byte) 0;
            }
            if (A01 == Short.TYPE) {
                return (short) 0;
            }
            if (A01 == Character.TYPE) {
                return 0;
            }
            throw Pxg.A0c("Class ", A01.getName(), " is not a primitive type");
        } else if (r4.A0N() || r4.A02()) {
            return C269204ek.NON_EMPTY;
        } else {
            if (cls == String.class) {
                return "";
            }
            if (r4.A0Q(Date.class)) {
                return new Date(0);
            }
            if (!r4.A0Q(Calendar.class)) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0);
            return gregorianCalendar;
        }
    }

    public static String A02(C268894eF r4) {
        String str;
        String str2;
        String name = r4.A00.getName();
        if (name.startsWith("java.time.")) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else if (!name.startsWith("org.joda.time.")) {
            return null;
        } else {
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", new Object[]{str, C269574fL.A04(r4), str2});
    }

    public static Object A00(C268894eF r3) {
        Object A01 = A01(r3);
        if (A01 != null) {
            Class<?> cls = A01.getClass();
            if (cls.isArray()) {
                return new S20(cls, A01, Array.getLength(A01));
            }
        }
        return A01;
    }
}
