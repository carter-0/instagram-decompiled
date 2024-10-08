package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class TLN implements InvocationHandler {
    public final 0sP A00;
    public final C62230ry A01;

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean A1U = AnonymousClass7TF.A1U(0, obj, method);
        boolean z = true;
        if (!0qQ.A0K(method.getName(), "accept") || objArr == null || objArr.length != A1U) {
            z = false;
        }
        Object obj2 = null;
        boolean z2 = false;
        if (z) {
            0Yh r0 = this.A01;
            if (objArr != null) {
                obj2 = objArr[0];
            }
            0qQ.A0B(r0, 0);
            Class cls = r0.A00;
            if (0q1.A02(cls, obj2)) {
                0qQ.A0C(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                0qQ.A0B(obj2, 0);
                this.A00.invoke(obj2);
                return C60340gF.A00;
            }
            throw new ClassCastException(002.A0R("Value cannot be cast to ", 0q1.A00(cls)));
        } else if (0qQ.A0K(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == A1U) {
            if (obj == objArr[0]) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        } else if (0qQ.A0K(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(this.A00.hashCode());
        } else {
            if (0qQ.A0K(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return this.A00.toString();
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Unexpected method call object:");
            A1A.append(obj);
            A1A.append(", method: ");
            A1A.append(method);
            throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(objArr, ", args: ", A1A));
        }
    }

    public TLN(0sP r1, C62230ry r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
