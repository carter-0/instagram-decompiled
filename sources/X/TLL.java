package X;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class TLL implements GenericArrayType, Serializable {
    public final Type A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GenericArrayType) || !2HD.A06(this, (Type) obj)) {
            return false;
        }
        return true;
    }

    public final Type getGenericComponentType() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return 002.A0R(2HD.A01(this.A00), "[]");
    }

    public TLL(Type type) {
        type.getClass();
        this.A00 = 2HD.A04(type);
    }
}
