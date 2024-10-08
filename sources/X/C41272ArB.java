package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: X.ArB  reason: case insensitive filesystem */
public final class C41272ArB implements InvocationHandler {
    public final AnonymousClass81C A00;

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        0qQ.A0B(method, 1);
        AnonymousClass81E A002 = this.A00.A00();
        if (objArr == null) {
            objArr = new Object[0];
        }
        return method.invoke(A002, Arrays.copyOf(objArr, objArr.length));
    }

    public C41272ArB(AnonymousClass81C r1) {
        this.A00 = r1;
    }
}
