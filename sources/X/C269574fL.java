package X;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.4fL  reason: invalid class name and case insensitive filesystem */
public final class C269574fL {
    public static final Iterator A00 = Collections.emptyList().iterator();
    public static final C269584fM[] A01 = new C269584fM[0];
    public static final Annotation[] A02 = new Annotation[0];

    public static Constructor A0A(Class cls, boolean z) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                A0H(declaredConstructor, z);
                return declaredConstructor;
            } else if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                return declaredConstructor;
            } else {
                throw new IllegalArgumentException(002.A0g("Default constructor for ", cls.getName(), " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type"));
            }
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            A0G(e, 002.A0u("Failed to find default constructor of class ", cls.getName(), ", problem: ", e.getMessage()));
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static void A0H(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (!Modifier.isPublic(member.getModifiers()) || !Modifier.isPublic(declaringClass.getModifiers()) || (z && !A0J(declaringClass))) {
                accessibleObject.setAccessible(true);
            }
        } catch (SecurityException e) {
            if (!accessibleObject.isAccessible()) {
                Class<?> declaringClass2 = member.getDeclaringClass();
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot access ");
                sb.append(member);
                sb.append(" (from class ");
                sb.append(declaringClass2.getName());
                sb.append("; failed to set access: ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (RuntimeException e2) {
            Class<?> cls = e2.getClass();
            if ("InaccessibleObjectException".equals(cls.getSimpleName())) {
                throw new IllegalArgumentException(String.format("Failed to call `setAccess()` on %s '%s' (of class %s) due to `%s`, problem: %s", new Object[]{member.getClass().getSimpleName(), member.getName(), A06(member.getDeclaringClass()), cls.getName(), e2.getMessage()}), e2);
            }
            throw e2;
        }
    }

    public static Class A02(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException(002.A0g("Class ", cls.getName(), Pxd.A00(299)));
    }

    public static String A04(C268894eF r3) {
        if (r3 == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(((C268944eK) r3).A0R());
        sb.append('`');
        return sb.toString();
    }

    public static String A06(Class<?> cls) {
        String name;
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            name = cls.getSimpleName();
        } else {
            name = cls.getName();
        }
        if (i > 0) {
            StringBuilder sb = new StringBuilder(name);
            do {
                sb.append("[]");
                i--;
            } while (i > 0);
            name = sb.toString();
        }
        if (name == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(name.length() + 2);
        sb2.append('`');
        sb2.append(name);
        sb2.append('`');
        return sb2.toString();
    }

    public static String A07(Object obj) {
        Class<?> cls;
        if (obj == null) {
            return "[null]";
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return A06(cls);
    }

    public static String A08(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
        return sb.toString();
    }

    public static String A09(Throwable th) {
        if (th instanceof C65181bG) {
            return ((C65181bG) th).A05();
        }
        if ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        return th.getMessage();
    }

    public static void A0B(17Z r1, Closeable closeable, Exception exc) {
        if (r1 != null) {
            r1.A0C(15u.A03);
            try {
                r1.close();
            } catch (Exception e) {
                C9153RRe.A00(exc, e);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                C9153RRe.A00(exc, e2);
            }
        }
        if (!(exc instanceof IOException)) {
            A0F(exc);
            throw new RuntimeException(exc);
        }
        throw exc;
    }

    public static void A0C(17Z r1, Exception exc) {
        r1.A0C(15u.A03);
        try {
            r1.close();
        } catch (Exception e) {
            C9153RRe.A00(exc, e);
        }
        if (!(exc instanceof IOException)) {
            A0F(exc);
            throw new RuntimeException(exc);
        }
        throw exc;
    }

    public static void A0D(C269674fV r3, IOException iOException) {
        if (iOException instanceof AnonymousClass4iD) {
            throw iOException;
        }
        AnonymousClass4iD r0 = new AnonymousClass4iD(r3.A07, iOException.getMessage());
        r0.initCause(iOException);
        throw r0;
    }

    public static void A0F(Throwable th) {
        if (th instanceof RuntimeException) {
            throw th;
        }
    }

    public static boolean A0I(Class cls) {
        if (cls == Void.class || cls == Void.TYPE || cls == C9661Ref.class) {
            return true;
        }
        return false;
    }

    public static boolean A0K(Object obj) {
        if (obj == null || obj.getClass().getAnnotation(JacksonStdImpl.class) != null) {
            return true;
        }
        return false;
    }

    public static Annotation[] A0L(Class cls) {
        if (cls == Object.class || cls.isPrimitive()) {
            return A02;
        }
        return cls.getDeclaredAnnotations();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4.getEnclosingMethod() == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class A00(java.lang.Class r4) {
        /*
            int r0 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r0)
            r0 = 0
            if (r1 != 0) goto L_0x002c
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r4 == r3) goto L_0x001c
            boolean r1 = r4.isPrimitive()     // Catch:{ SecurityException -> 0x002c }
            if (r1 != 0) goto L_0x001c
            java.lang.reflect.Method r2 = r4.getEnclosingMethod()     // Catch:{ SecurityException -> 0x002c }
            r1 = 1
            if (r2 != 0) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 != 0) goto L_0x002b
            if (r4 == r3) goto L_0x002b
            boolean r1 = r4.isPrimitive()     // Catch:{ SecurityException -> 0x002c }
            if (r1 != 0) goto L_0x002b
            java.lang.Class r0 = r4.getEnclosingClass()     // Catch:{ SecurityException -> 0x002c }
        L_0x002b:
            return r0
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269574fL.A00(java.lang.Class):java.lang.Class");
    }

    public static Class A01(Class cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static Object A03(Class cls, boolean z) {
        Constructor A0A = A0A(cls, z);
        if (A0A != null) {
            try {
                return A0A.newInstance(new Object[0]);
            } catch (Exception e) {
                A0G(e, 002.A0u("Failed to instantiate class ", cls.getName(), ", problem: ", e.getMessage()));
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw new IllegalArgumentException(002.A0g("Class ", cls.getName(), " has no default (no arg) constructor"));
        }
    }

    public static String A05(Class cls) {
        if (cls.isAnnotation()) {
            return AnonymousClass000.A00(2609);
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static void A0E(Class cls, Object obj, String str) {
        Class<?> cls2 = obj.getClass();
        if (cls2 != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", new Object[]{cls2.getName(), cls.getName(), str}));
        }
    }

    public static void A0G(Throwable th, String str) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        A0F(th);
        if (!(th instanceof Error)) {
            throw new IllegalArgumentException(str, th);
        }
        throw th;
    }

    public static boolean A0J(Class cls) {
        String name = cls.getName();
        if (name.startsWith("java.") || name.startsWith("javax.")) {
            return true;
        }
        return false;
    }

    public static Method[] A0M(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            e = e;
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (ClassNotFoundException e2) {
                    C9153RRe.A00(e, e2);
                    throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", new Object[]{cls.getName(), e.getClass().getName(), e.getMessage()}), e);
                }
            }
            throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", new Object[]{cls.getName(), e.getClass().getName(), e.getMessage()}), e);
        } catch (Throwable th) {
            e = th;
            throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", new Object[]{cls.getName(), e.getClass().getName(), e.getMessage()}), e);
        }
    }
}
