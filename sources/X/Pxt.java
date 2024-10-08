package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

public final class Pxt {
    public static final Pxt A00 = new Object();
    public static final Map A01 = AnonymousClass7TE.A1E();
    public static final Map A02 = AnonymousClass7TE.A1E();

    public static final AnonymousClass0hF A01(Object obj) {
        AnonymousClass0hF r0;
        C13907Tl7 tl7;
        AnonymousClass0hF r6;
        boolean z = obj instanceof C13907Tl7;
        if (obj instanceof AnonymousClass0hF) {
            if (z) {
                tl7 = (C13907Tl7) obj;
                r6 = (AnonymousClass0hF) obj;
            }
            return (AnonymousClass0hF) obj;
        } else if (z) {
            tl7 = (C13907Tl7) obj;
            r6 = null;
        } else {
            Class<?> cls = obj.getClass();
            if (A00.A00(cls) == 2) {
                Object obj2 = A01.get(cls);
                0qQ.A0A(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    A02(obj, (Constructor) list.get(0));
                    0qQ.A0B((Object) null, 1);
                    throw AnonymousClass00P.createAndThrow();
                }
                int size = list.size();
                C22518Y7p[] y7pArr = new C22518Y7p[size];
                for (int i = 0; i < size; i++) {
                    A02(obj, (Constructor) list.get(i));
                    y7pArr[i] = null;
                }
                obj = new C11622SdQ(y7pArr);
                return (AnonymousClass0hF) obj;
            }
            r0 = new C319706r4(obj);
            return r0;
        }
        r0 = new Pxu(tl7, r6);
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r0.booleanValue() != false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00(java.lang.Class r11) {
        /*
            r10 = this;
            java.util.Map r5 = A02
            java.lang.Number r0 = X.C51966G9m.A14(r11, r5)
            if (r0 == 0) goto L_0x000d
            int r0 = r0.intValue()
            return r0
        L_0x000d:
            java.lang.String r0 = r11.getCanonicalName()
            r6 = 1
            if (r0 == 0) goto L_0x0090
            java.lang.Package r0 = r11.getPackage()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.String r7 = r11.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            if (r0 == 0) goto L_0x006a
            java.lang.String r4 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
        L_0x0022:
            X.0qQ.A09(r4)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            int r3 = r4.length()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            r2 = 0
            if (r3 == 0) goto L_0x0035
            X.0qQ.A07(r7)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            int r0 = r3 + 1
            java.lang.String r7 = X.C66580MXl.A0z(r7, r0)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
        L_0x0035:
            X.0qQ.A09(r7)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.String r1 = "."
            java.lang.String r0 = "_"
            java.lang.String r1 = X.00p.A0g(r7, r1, r0, r2)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.String r0 = "_LifecycleAdapter"
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            if (r3 == 0) goto L_0x004e
            r0 = 46
            java.lang.String r1 = X.002.A0T(r4, r1, r0)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
        L_0x004e:
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>"
            X.0qQ.A0C(r1, r0)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.Class[] r0 = new java.lang.Class[]{r11}     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            java.lang.reflect.Constructor r2 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            boolean r0 = r2.isAccessible()     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            if (r0 != 0) goto L_0x006d
            r2.setAccessible(r6)     // Catch:{ ClassNotFoundException -> 0x007e, NoSuchMethodException -> 0x0078 }
            goto L_0x006d
        L_0x006a:
            java.lang.String r4 = ""
            goto L_0x0022
        L_0x006d:
            java.util.Map r1 = A01
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
            r1.put(r11, r0)
            goto L_0x0112
        L_0x0078:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x007e:
            X.6r0 r9 = X.C319676r0.A02
            java.util.Map r8 = r9.A01
            java.lang.Object r0 = r8.get(r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0095
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b2
        L_0x0090:
            r0 = 1
        L_0x0091:
            X.C66580MXl.A1T(r11, r5, r0)
            return r0
        L_0x0095:
            java.lang.reflect.Method[] r7 = r11.getDeclaredMethods()     // Catch:{ NoClassDefFoundError -> 0x0115 }
            int r4 = r7.length
            r3 = 0
            r2 = 0
        L_0x009c:
            if (r2 >= r4) goto L_0x00af
            r1 = r7[r2]
            java.lang.Class<androidx.lifecycle.OnLifecycleEvent> r0 = androidx.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            if (r0 == 0) goto L_0x00ac
            X.C319676r0.A00(r9, r11, r7)
            goto L_0x0090
        L_0x00ac:
            int r2 = r2 + 1
            goto L_0x009c
        L_0x00af:
            X.JTP.A1R(r11, r8, r3)
        L_0x00b2:
            java.lang.Class r1 = r11.getSuperclass()
            r7 = 0
            if (r1 == 0) goto L_0x00d6
            java.lang.Class<X.07Y> r0 = X.AnonymousClass07Y.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x00d6
            int r0 = r10.A00(r1)
            if (r0 == r6) goto L_0x0090
            java.util.Map r0 = A01
            java.lang.Object r0 = r0.get(r1)
            X.0qQ.A0A(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r0)
        L_0x00d6:
            java.lang.Class[] r4 = r11.getInterfaces()
            X.0qQ.A07(r4)
            r3 = 0
            int r2 = r4.length
        L_0x00df:
            if (r3 >= r2) goto L_0x010b
            r1 = r4[r3]
            if (r1 == 0) goto L_0x0108
            java.lang.Class<X.07Y> r0 = X.AnonymousClass07Y.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0108
            int r0 = r10.A00(r1)
            if (r0 == r6) goto L_0x0090
            if (r7 != 0) goto L_0x00fa
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00fa:
            java.util.Map r0 = A01
            java.lang.Object r0 = r0.get(r1)
            X.0qQ.A0A(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.addAll(r0)
        L_0x0108:
            int r3 = r3 + 1
            goto L_0x00df
        L_0x010b:
            if (r7 == 0) goto L_0x0090
            java.util.Map r0 = A01
            r0.put(r11, r7)
        L_0x0112:
            r0 = 2
            goto L_0x0091
        L_0x0115:
            r1 = move-exception
            r0 = 1394(0x572, float:1.953E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Pxt.A00(java.lang.Class):int");
    }

    public static final void A02(Object obj, Constructor constructor) {
        try {
            0qQ.A07(constructor.newInstance(new Object[]{obj}));
        } catch (IllegalAccessException e) {
            throw C41845B3m.A0j(e);
        } catch (InstantiationException e2) {
            throw C41845B3m.A0j(e2);
        } catch (InvocationTargetException e3) {
            throw C41845B3m.A0j(e3);
        }
    }
}
