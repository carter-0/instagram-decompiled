package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.6r2  reason: invalid class name and case insensitive filesystem */
public final class C319686r2 {
    public final Map A00 = new HashMap();
    public final Map A01;

    public static void A00(07T r4, AnonymousClass07Z r5, Object obj, List list) {
        Method method;
        Object[] objArr;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    C319696r3 r2 = (C319696r3) list.get(size);
                    try {
                        int i = r2.A00;
                        if (i == 0) {
                            method = r2.A01;
                            objArr = new Object[0];
                        } else if (i != 1) {
                            method = r2.A01;
                            objArr = new Object[]{r5, r4};
                        } else {
                            method = r2.A01;
                            objArr = new Object[]{r5};
                        }
                        method.invoke(obj, objArr);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C319686r2(Map map) {
        this.A01 = map;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            List list = (List) this.A00.get(value);
            if (list == null) {
                list = new ArrayList();
                this.A00.put(value, list);
            }
            list.add(entry.getKey());
        }
    }
}
