package X;

import android.os.Bundle;

/* renamed from: X.RVz  reason: case insensitive filesystem */
public abstract class C9274RVz {
    public static Object A00(Bundle bundle, Class cls, String str) {
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
