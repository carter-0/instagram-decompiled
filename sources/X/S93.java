package X;

import android.os.Bundle;

public abstract class S93 {
    public static int A00(Bundle bundle, String str) {
        return ((Integer) A01(bundle, Integer.class, str)).intValue();
    }

    public static Object A01(Bundle bundle, Class cls, String str) {
        if (bundle.containsKey(str)) {
            Object cast = cls.cast(bundle.get(str));
            if (cast != null) {
                return cast;
            }
            throw Pxg.A0f("value for required key %s is null", new Object[]{str});
        }
        throw Pxg.A0f("key %s is missing but required", new Object[]{str});
    }
}
