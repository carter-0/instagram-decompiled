package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class T9m implements Serializable {
    public final Class A00;
    public final Enum A01;
    public final HashMap A02;
    public final boolean A03;
    public final boolean A04;
    public final Enum[] A05;

    public final C12832T9e A02() {
        int i;
        HashMap hashMap = this.A02;
        if (hashMap.isEmpty()) {
            return C12832T9e.A03;
        }
        int size = hashMap.size();
        if (size <= 5) {
            i = 8;
        } else {
            i = 16;
            if (size > 12) {
                i = 32;
                while (i < size + (size >> 2)) {
                    i += i;
                }
            }
        }
        int i2 = i - 1;
        int i3 = (i >> 1) + i;
        Object[] objArr = new Object[(i3 * 2)];
        int i4 = 0;
        Iterator A0s = AnonymousClass7TF.A0s(hashMap);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            String A13 = DbT.A13(A1J);
            if (A13 != null) {
                int hashCode = A13.hashCode() & i2;
                int i5 = hashCode + hashCode;
                if (objArr[i5] != null) {
                    i5 = ((hashCode >> 1) + i) << 1;
                    if (objArr[i5] != null) {
                        i5 = (i3 << 1) + i4;
                        i4 += 2;
                        if (i5 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i5] = A13;
                objArr[i5 + 1] = A1J.getValue();
            }
        }
        return new C12832T9e(objArr, i2, i4);
    }

    public T9m(Class cls, Enum enumR, HashMap hashMap, Enum[] enumArr, boolean z, boolean z2) {
        this.A00 = cls;
        this.A05 = enumArr;
        this.A02 = hashMap;
        this.A01 = enumR;
        this.A04 = z;
        this.A03 = z2;
    }

    public static T9m A00(C269454f9 r13, Class cls) {
        Enum enumR;
        C268854eA A012 = r13.A01();
        boolean A09 = r13.A09(C269354ez.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class cls2 = cls;
        Enum[] A013 = A01(cls);
        HashMap A1E = AnonymousClass7TE.A1E();
        int length = A013.length;
        String[][] strArr = new String[length][];
        if (A012 != null) {
            A012.A0n(cls, A013, strArr);
        }
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum enumR2 = A013[length];
            A1E.put(enumR2.toString(), enumR2);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!A1E.containsKey(str)) {
                        A1E.put(str, enumR2);
                    }
                }
            }
        }
        if (A012 != null) {
            enumR = A012.A0U(cls);
        } else {
            enumR = null;
        }
        return new T9m(cls2, enumR, A1E, A013, A09, false);
    }

    public static Enum[] A01(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw AnonymousClass7TF.A0W("No enum constants for class ", cls.getName());
    }
}
