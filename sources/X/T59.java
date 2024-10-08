package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

public final class T59 implements AnonymousClass2OT {
    public final /* synthetic */ Type A00;

    public T59(Type type) {
        this.A00 = type;
    }

    public final Object AJM() {
        Type type = this.A00;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException(Pxf.A0l("Invalid EnumMap type: ", type));
        }
        throw new RuntimeException(Pxf.A0l("Invalid EnumMap type: ", type));
    }
}
