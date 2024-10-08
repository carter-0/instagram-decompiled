package X;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: X.SRz  reason: case insensitive filesystem */
public abstract class C11403SRz {
    public static final C239023El A00 = new C8646Qyj(new C239023El(", "));

    public static void A01(String str, Type[] typeArr) {
        for (Class cls : typeArr) {
            if (cls instanceof Class) {
                Class cls2 = cls;
                17k.A09(cls2, str, "Primitive type '%s' used as %s", !cls2.isPrimitive());
            }
        }
    }

    public static WildcardType subtypeOf(Type type) {
        return new TLS(new Type[0], new Type[]{type});
    }

    public static Type A00(Type type) {
        if (!(type instanceof WildcardType)) {
            return RDL.A00.A01(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        int length = lowerBounds.length;
        boolean z = true;
        17k.A0G(Pxg.A1T(length, 1), "Wildcard cannot have more than one lower bounds.");
        if (length == 1) {
            return supertypeOf(A00(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z = false;
        }
        17k.A0G(z, "Wildcard should have only one upper bound.");
        return subtypeOf(A00(upperBounds[0]));
    }

    public static WildcardType supertypeOf(Type type) {
        return new TLS(new Type[]{type}, new Type[]{Object.class});
    }
}
