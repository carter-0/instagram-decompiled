package X;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class TLK implements GenericArrayType, Serializable {
    public final Type A00;

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return 2PP.A00(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    public final Type getGenericComponentType() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String obj;
        Type type = this.A00;
        if (type instanceof Class) {
            obj = ((Class) type).getName();
        } else {
            obj = type.toString();
        }
        return 002.A0R(obj, "[]");
    }

    public TLK(Type type) {
        this.A00 = RDL.A00.A02(type);
    }
}
