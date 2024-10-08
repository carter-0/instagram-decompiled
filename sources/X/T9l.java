package X;

import java.io.Serializable;
import java.lang.reflect.Field;

public final class T9l implements Serializable {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public T9l(String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A02 = str4;
    }

    public static Field A00(T9l t9l, String str) {
        try {
            return t9l.getClass().getField(str);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public T9l() {
        this("lowerEndpoint", "upperEndpoint", "lowerBoundType", "upperBoundType");
    }
}
