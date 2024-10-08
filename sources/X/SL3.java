package X;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;

public final class SL3 {
    public static Object A00(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(SL3.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean A01(String str, Collection collection) {
        if (collection.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (("eng".equals(str2) || "userdebug".equals(str2)) && collection.contains(002.A0R(str, ":dev"))) {
            return true;
        }
        return false;
    }
}
