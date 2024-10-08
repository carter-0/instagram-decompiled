package X;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.NamedCompanion;

/* renamed from: X.8e6  reason: invalid class name and case insensitive filesystem */
public abstract class C360168e6 {
    public static final C255463uA A00(Object obj, C255463uA... r7) {
        Class[] clsArr;
        try {
            int length = r7.length;
            int i = 0;
            if (length != 0) {
                clsArr = new Class[length];
                while (true) {
                    clsArr[i] = C255463uA.class;
                    i++;
                    if (i >= length) {
                        break;
                    }
                }
            } else {
                clsArr = new Class[0];
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(r7, length));
            if (invoke instanceof C255463uA) {
                return (C255463uA) invoke;
            }
        } catch (NoSuchMethodException unused) {
        } catch (InvocationTargetException e) {
            e = e;
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                e = new InvocationTargetException(cause, message);
            }
            throw e;
        }
        return null;
    }

    public static final C255463uA A01(C62230ry r12, C255463uA... r13) {
        Serializable serializable;
        Field field;
        Object obj;
        C255463uA A00;
        C255463uA r9;
        C255463uA A002;
        0qQ.A0B(r13, 1);
        Class A003 = AnonymousClass2YU.A00(r12);
        C255463uA[] r6 = (C255463uA[]) Arrays.copyOf(r13, r13.length);
        0qQ.A0B(r6, 1);
        if (A003.isEnum() && A003.getAnnotation(Serializable.class) == null && A003.getAnnotation(Polymorphic.class) == null) {
            Object[] enumConstants = A003.getEnumConstants();
            String canonicalName = A003.getCanonicalName();
            0qQ.A07(canonicalName);
            0qQ.A0C(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new C258653zQ(canonicalName, (Enum[]) enumConstants);
        }
        int length = r6.length;
        C255463uA[] r2 = (C255463uA[]) Arrays.copyOf(r6, length);
        Object obj2 = null;
        try {
            Field declaredField = A003.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj2 = declaredField.get((Object) null);
        } catch (Throwable unused) {
        }
        if (obj2 != null && (A002 = A00(obj2, (C255463uA[]) Arrays.copyOf(r2, r2.length))) != null) {
            return A002;
        }
        String canonicalName2 = A003.getCanonicalName();
        Method method = null;
        if (canonicalName2 != null && !00p.A0k(canonicalName2, "java.", false) && !00p.A0k(canonicalName2, AnonymousClass000.A00(3486), false)) {
            Field[] declaredFields = A003.getDeclaredFields();
            0qQ.A07(declaredFields);
            int length2 = declaredFields.length;
            Field field2 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i < length2) {
                    Field field3 = declaredFields[i];
                    if (0qQ.A0K(field3.getName(), "INSTANCE") && 0qQ.A0K(field3.getType(), A003) && Modifier.isStatic(field3.getModifiers())) {
                        if (z) {
                            break;
                        }
                        field2 = field3;
                        z = true;
                    }
                    i++;
                } else if (z && field2 != null) {
                    Object obj3 = field2.get((Object) null);
                    Method[] methods = A003.getMethods();
                    0qQ.A07(methods);
                    int length3 = methods.length;
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        if (i2 < length3) {
                            Method method2 = methods[i2];
                            if (0qQ.A0K(method2.getName(), "serializer")) {
                                Class[] parameterTypes = method2.getParameterTypes();
                                0qQ.A07(parameterTypes);
                                if (parameterTypes.length == 0 && 0qQ.A0K(method2.getReturnType(), C255463uA.class)) {
                                    if (z2) {
                                        break;
                                    }
                                    method = method2;
                                    z2 = true;
                                }
                            }
                            i2++;
                        } else if (z2 && method != null) {
                            Object invoke = method.invoke(obj3, new Object[0]);
                            if ((invoke instanceof C255463uA) && (r9 = (C255463uA) invoke) != null) {
                                return r9;
                            }
                        }
                    }
                }
            }
        }
        C255463uA[] r7 = (C255463uA[]) Arrays.copyOf(r6, length);
        Class[] declaredClasses = A003.getDeclaredClasses();
        0qQ.A07(declaredClasses);
        int length4 = declaredClasses.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length4) {
                break;
            }
            Class cls = declaredClasses[i3];
            if (cls.getAnnotation(NamedCompanion.class) != null) {
                String simpleName = cls.getSimpleName();
                0qQ.A07(simpleName);
                Object obj4 = null;
                try {
                    Field declaredField2 = A003.getDeclaredField(simpleName);
                    declaredField2.setAccessible(true);
                    obj4 = declaredField2.get((Object) null);
                } catch (Throwable unused2) {
                }
                if (obj4 != null && (A00 = A00(obj4, (C255463uA[]) Arrays.copyOf(r7, r7.length))) != null) {
                    return A00;
                }
            } else {
                i3++;
            }
        }
        C255463uA r92 = null;
        try {
            Class[] declaredClasses2 = A003.getDeclaredClasses();
            0qQ.A07(declaredClasses2);
            int length5 = declaredClasses2.length;
            int i4 = 0;
            Class cls2 = null;
            boolean z3 = false;
            while (true) {
                if (i4 < length5) {
                    Class cls3 = declaredClasses2[i4];
                    if (0qQ.A0K(cls3.getSimpleName(), "$serializer")) {
                        if (z3) {
                            break;
                        }
                        z3 = true;
                        cls2 = cls3;
                    }
                    i4++;
                } else if (z3 && cls2 != null && (field = cls2.getField("INSTANCE")) != null) {
                    obj = field.get((Object) null);
                }
            }
            obj = null;
            if (obj instanceof C255463uA) {
                r92 = (C255463uA) obj;
                if (r92 != null) {
                    return r92;
                }
            }
        } catch (NoSuchFieldException unused3) {
        }
        if (A003.getAnnotation(Polymorphic.class) != null || ((serializable = (Serializable) A003.getAnnotation(Serializable.class)) != null && new 0Yh(serializable.with()).equals(new 0Yh(PolymorphicSerializer.class)))) {
            return new PolymorphicSerializer(new 0Yh(A003));
        }
        return null;
    }
}
