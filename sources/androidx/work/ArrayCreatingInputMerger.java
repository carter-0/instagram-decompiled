package androidx.work;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C255323tw;
import X.C255333tx;
import X.C375629Ek;
import X.Pxe;
import X.Pxf;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ArrayCreatingInputMerger extends C375629Ek {
    public final C255323tw A00(List list) {
        Class cls;
        int length;
        Object newInstance;
        C255333tx r8 = new C255333tx();
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator A0u = AnonymousClass7TF.A0u(Pxf.A0x(((C255323tw) it.next()).A00));
            while (true) {
                if (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    Object key = A1J.getKey();
                    Object value = A1J.getValue();
                    if (value == null || (cls = value.getClass()) == null) {
                        cls = String.class;
                    }
                    Object obj = A1E.get(key);
                    0qQ.A05(key);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (0qQ.A0K(cls2, cls)) {
                            0qQ.A07(value);
                            int length2 = Array.getLength(obj);
                            int length3 = Array.getLength(value);
                            Class<?> componentType = cls2.getComponentType();
                            0qQ.A0A(componentType);
                            newInstance = Array.newInstance(componentType, length2 + length3);
                            System.arraycopy(obj, 0, newInstance, 0, length2);
                            System.arraycopy(value, 0, newInstance, length2, length3);
                            0qQ.A07(newInstance);
                            value = newInstance;
                            0qQ.A09(value);
                            A1E.put(key, value);
                        } else if (0qQ.A0K(cls2.getComponentType(), cls)) {
                            length = Array.getLength(obj);
                            newInstance = Array.newInstance(cls, length + 1);
                            System.arraycopy(obj, 0, newInstance, 0, length);
                        } else {
                            throw Pxe.A0g();
                        }
                    } else if (!cls.isArray()) {
                        newInstance = Array.newInstance(cls, 1);
                        length = 0;
                    } else {
                        0qQ.A09(value);
                        A1E.put(key, value);
                    }
                    Array.set(newInstance, length, value);
                    0qQ.A07(newInstance);
                    value = newInstance;
                    0qQ.A09(value);
                    A1E.put(key, value);
                }
            }
        }
        r8.A02(A1E);
        return r8.A00();
    }
}
