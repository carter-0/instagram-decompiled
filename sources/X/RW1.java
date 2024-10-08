package X;

import android.os.Bundle;

public abstract class RW1 {
    public static Object A00(Bundle bundle, Class cls, String str) {
        if (bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (cls.isInstance(obj)) {
                Object cast = cls.cast(obj);
                if (cast != null) {
                    return cast;
                }
                throw Pxg.A0f("value for required key %s is null", new Object[]{str});
            }
            throw Pxg.A0f("value for required key %s is not of type $s", new Object[]{str, cls.getSimpleName()});
        }
        throw Pxg.A0f("key %s is missing but required", new Object[]{str});
    }
}
