package X;

import android.content.pm.PackageInfo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: X.4lc  reason: invalid class name and case insensitive filesystem */
public final class C272904lc implements InvocationHandler {
    public final /* synthetic */ C272864lY A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Callable A02;
    public final /* synthetic */ Callable A03;

    public C272904lc(C272864lY r1, Object obj, Callable callable, Callable callable2) {
        this.A00 = r1;
        this.A01 = obj;
        this.A02 = callable;
        this.A03 = callable2;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (method.getDeclaringClass() == Object.class && method.getName().equals("toString")) {
            return "java.lang.Proxy (lazy WebViewFactoryProvider)";
        }
        synchronized (this.A01) {
            C272864lY r6 = this.A00;
            Field field = r6.A00;
            obj2 = field.get((Object) null);
            if (obj2 == obj) {
                try {
                    Field field2 = r6.A01;
                    field2.set((Object) null, (PackageInfo) this.A02.call());
                    obj2 = this.A03.call();
                    if (obj2 != null) {
                        field.get((Object) null);
                        field.set((Object) null, obj2);
                    } else {
                        field2.set((Object) null, (Object) null);
                        field.get((Object) null);
                        field.set((Object) null, (Object) null);
                        obj2 = r6.A02.invoke((Object) null, new Object[0]);
                        obj2.getClass();
                    }
                } catch (Throwable th) {
                    0KC.A0F("WebViewFactoryBridge", "Failed to get PackageInfo", th);
                    throw th;
                }
            }
        }
        if (obj2 != null) {
            return method.invoke(obj2, objArr);
        }
        throw new RuntimeException("Expected non-null provider");
    }
}
