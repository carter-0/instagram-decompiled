package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class TA4 implements Comparable {
    public final Type A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    public TA4() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this.A00 = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            return;
        }
        throw AnonymousClass7TE.A0w("Internal error: TypeReference constructed without actual type information");
    }
}
