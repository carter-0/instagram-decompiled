package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

public final class TLP implements InvocationHandler {
    public String A00;
    public boolean A01;
    public final List A02;

    public TLP(List list) {
        this.A02 = list;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = SUS.A08;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return true;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.A01 = true;
            return null;
        } else if (name.equals("protocols") && objArr.length == 0) {
            return this.A02;
        } else {
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        String A19 = AnonymousClass7TE.A19(list, i);
                        if (this.A02.contains(A19)) {
                            this.A00 = A19;
                            return A19;
                        }
                    }
                    String A192 = AnonymousClass7TE.A19(this.A02, 0);
                    this.A00 = A192;
                    return A192;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.A00 = (String) objArr[0];
            return null;
        }
    }
}
