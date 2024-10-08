package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

public final class T58 implements AnonymousClass2OT {
    public final /* synthetic */ Type A00;

    public T58(Type type) {
        this.A00 = type;
    }

    public final Object AJM() {
        Type type = this.A00;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new RuntimeException(Pxf.A0l("Invalid EnumSet type: ", type));
        }
        throw new RuntimeException(Pxf.A0l("Invalid EnumSet type: ", type));
    }
}
