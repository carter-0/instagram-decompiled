package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class TLM implements InvocationHandler {
    public final Object A00;

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = this.A00;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, Pxf.A0W(obj2)).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            throw Pxe.A0u(AnonymousClass7TG.A0m(method, "Reflection failed for method ", AnonymousClass7TE.A1A()), e2);
        }
    }

    public TLM(Object obj) {
        this.A00 = obj;
    }
}
