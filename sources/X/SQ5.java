package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

public final class SQ5 {
    public static ParameterizedType A00(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length == 1) {
                    return A00(upperBounds[0]);
                }
            }
        }
        return null;
    }

    public static TypeVariable A01(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length == 1) {
                    return A01(upperBounds[0]);
                }
            }
        }
        return null;
    }

    public static boolean A02(C268894eF r7, C269074eX r8, Type type) {
        C268894eF r1;
        if (!r7.A0Q(r8.EIi(type).A00)) {
            return false;
        }
        ParameterizedType A00 = A00(type);
        if (A00 != null && 2Ob.A00(r7.A00, A00.getRawType())) {
            Type[] actualTypeArguments = A00.getActualTypeArguments();
            C268894eF[] r4 = r7.A0G().A01;
            int length = r4.length;
            if (length != actualTypeArguments.length) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (i < 0 || i >= length) {
                    r1 = null;
                } else {
                    r1 = r4[i];
                }
                if (!A02(r1, r8, actualTypeArguments[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
