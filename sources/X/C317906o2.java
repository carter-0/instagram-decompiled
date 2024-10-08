package X;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: X.6o2  reason: invalid class name and case insensitive filesystem */
public abstract class C317906o2 extends C317916o3 implements Serializable {
    public final Type A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C317906o2) {
            return this.A00.equals(((C317906o2) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        Type type = this.A00;
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public C317906o2(Type type) {
        type.getClass();
        this.A00 = type;
    }

    public static C317906o2 toGenericType(Class cls) {
        Type type;
        Type tlr;
        if (cls.isArray()) {
            tlr = C11403SRz.A00(toGenericType(cls.getComponentType()).A00);
        } else {
            TypeVariable[] typeParameters = cls.getTypeParameters();
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                type = null;
            } else {
                type = toGenericType(cls.getEnclosingClass()).A00;
            }
            if (typeParameters.length <= 0) {
                if (type == null || type == cls.getEnclosingClass()) {
                    return new C317906o2(cls);
                }
            } else if (type == null) {
                type = RDW.A00.A00(cls);
                tlr = new TLR(cls, type, typeParameters);
            }
            boolean z = false;
            if (cls.getEnclosingClass() != null) {
                z = true;
            }
            17k.A0A(cls, "Owner type for unenclosed %s", z);
            tlr = new TLR(cls, type, typeParameters);
        }
        return new C317906o2(tlr);
    }

    public C317906o2() {
        Type A002 = A00();
        this.A00 = A002;
        17k.A0B(A002, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", !(A002 instanceof TypeVariable));
    }
}
