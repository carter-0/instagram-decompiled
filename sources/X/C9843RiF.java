package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import java.lang.reflect.Proxy;

/* renamed from: X.RiF  reason: case insensitive filesystem */
public abstract class C9843RiF {
    public static final SharedPreferences A00(ContextWrapper contextWrapper, String str, int i) {
        0qQ.A0B(contextWrapper, 0);
        Class<SharedPreferences> cls = SharedPreferences.class;
        Context baseContext = contextWrapper.getBaseContext();
        0qQ.A07(baseContext);
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new TLQ(baseContext, str, i));
        0qQ.A0C(newProxyInstance, "null cannot be cast to non-null type android.content.SharedPreferences");
        return (SharedPreferences) newProxyInstance;
    }
}
