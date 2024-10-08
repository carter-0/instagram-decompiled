package X;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.T9d  reason: case insensitive filesystem */
public final class C12831T9d implements Serializable {
    public final Class A00;
    public final 15z[] A01;
    public final Enum[] A02;

    public static C12831T9d A00(C269144ee r8, Class cls) {
        Class cls2 = cls;
        Iterator it = C269574fL.A00;
        if (cls.getSuperclass() != Enum.class) {
            cls2 = cls.getSuperclass();
        }
        Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
        if (enumArr != null) {
            C268854eA A012 = r8.A01();
            int length = enumArr.length;
            String[] strArr = new String[length];
            A012.A0m(cls2, enumArr, strArr);
            15z[] r4 = new 15z[length];
            for (int i = 0; i < length; i++) {
                Enum enumR = enumArr[i];
                String str = strArr[i];
                if (str == null) {
                    str = enumR.name();
                }
                r4[enumR.ordinal()] = new 15y(str);
            }
            return new C12831T9d(cls, r4);
        }
        throw AnonymousClass7TF.A0W("Cannot determine enum constants for Class ", cls.getName());
    }

    public C12831T9d(Class cls, 15z[] r3) {
        this.A00 = cls;
        this.A02 = (Enum[]) cls.getEnumConstants();
        this.A01 = r3;
    }
}
