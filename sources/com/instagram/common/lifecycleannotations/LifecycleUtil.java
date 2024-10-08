package com.instagram.common.lifecycleannotations;

import X.002;
import X.00p;
import X.0KC;
import X.0qQ;
import X.AnonymousClass7TE;
import X.Pxf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public final class LifecycleUtil {
    public static final LifecycleUtil INSTANCE = new Object();
    public static final Map REFERENCE_CLEANERS = AnonymousClass7TE.A1H();
    public static final String TAG = "LifecycleUtil";

    public static final void cleanupReferences(Object obj) {
        Object[] objArr;
        String str;
        0qQ.A0B(obj, 0);
        try {
            LifecycleUtil lifecycleUtil = INSTANCE;
            Class<?> cls = obj.getClass();
            Method findReferenceCleanerForClass = lifecycleUtil.findReferenceCleanerForClass(cls);
            if (findReferenceCleanerForClass != null) {
                findReferenceCleanerForClass.invoke((Object) null, new Object[]{obj});
            } else {
                cls.getCanonicalName();
            }
        } catch (IllegalAccessException e) {
            e = e;
            objArr = new Object[]{Pxf.A0g(obj)};
            str = "unable to access cleanup for: %s";
            0KC.A0L(TAG, str, e, objArr);
        } catch (IllegalArgumentException e2) {
            e = e2;
            objArr = new Object[]{Pxf.A0g(obj)};
            str = "unable to handle argument for: %s";
            0KC.A0L(TAG, str, e, objArr);
        } catch (InvocationTargetException e3) {
            e = e3;
            objArr = new Object[]{Pxf.A0g(obj)};
            str = "unable to invoke cleanup for: %s";
            0KC.A0L(TAG, str, e, objArr);
        }
    }

    private final Method findReferenceCleanerForClass(Class cls) {
        Object[] objArr;
        String str;
        Map map = REFERENCE_CLEANERS;
        Method method = (Method) map.get(cls);
        if (method != null) {
            return method;
        }
        String name = cls.getName();
        0qQ.A0A(name);
        if (00p.A0k(name, "android.", false) || 00p.A0k(name, "java.", false)) {
            return null;
        }
        try {
            Method declaredMethod = Class.forName(002.A0R(name, TAG)).getDeclaredMethod("cleanupReferences", new Class[]{cls});
            map.put(cls, declaredMethod);
            return declaredMethod;
        } catch (ClassNotFoundException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                return findReferenceCleanerForClass(superclass);
            }
            return null;
        } catch (NoSuchMethodException e) {
            e = e;
            objArr = new Object[]{cls.getCanonicalName()};
            str = "referenceCleanerClass generated incorrectly: %s";
            0KC.A0L(TAG, str, e, objArr);
            return null;
        } catch (SecurityException e2) {
            e = e2;
            objArr = new Object[]{cls.getCanonicalName()};
            str = "referenceCleanerClass is denied to access method: %s";
            0KC.A0L(TAG, str, e, objArr);
            return null;
        }
    }
}
