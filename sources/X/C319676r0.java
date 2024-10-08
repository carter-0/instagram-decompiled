package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: X.6r0  reason: invalid class name and case insensitive filesystem */
public final class C319676r0 {
    public static C319676r0 A02 = new C319676r0();
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public static C319686r2 A00(C319676r0 r12, Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C319686r2 r0 = (C319686r2) r12.A00.get(superclass);
            if (r0 == null) {
                r0 = A00(r12, superclass, (Method[]) null);
            }
            hashMap.putAll(r0.A01);
        }
        for (Class cls2 : cls.getInterfaces()) {
            C319686r2 r02 = (C319686r2) r12.A00.get(cls2);
            if (r02 == null) {
                r02 = A00(r12, cls2, (Method[]) null);
            }
            for (Map.Entry entry : r02.A01.entrySet()) {
                A01((C319696r3) entry.getKey(), (07T) entry.getValue(), cls, hashMap);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (AnonymousClass07Z.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                07T value = onLifecycleEvent.value();
                if (length > 1) {
                    if (!07T.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == 07T.ON_ANY) {
                        i = 2;
                        if (length > 2) {
                            throw new IllegalArgumentException("cannot have more than 2 params");
                        }
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                A01(new C319696r3(method, i), value, cls, hashMap);
                z = true;
            }
        }
        C319686r2 r2 = new C319686r2(hashMap);
        r12.A00.put(cls, r2);
        r12.A01.put(cls, Boolean.valueOf(z));
        return r2;
    }

    public static void A01(C319696r3 r4, 07T r5, Class cls, Map map) {
        Object obj = map.get(r4);
        if (obj == null) {
            map.put(r4, r5);
        } else if (r5 != obj) {
            Method method = r4.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(obj);
            sb.append(", new value ");
            sb.append(r5);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
