package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.6o3  reason: invalid class name and case insensitive filesystem */
public abstract class C317916o3 {
    public final Type A00() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        17k.A0A(genericSuperclass, "%s isn't parameterized", genericSuperclass instanceof ParameterizedType);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
