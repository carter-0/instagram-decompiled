package X;

import com.instagram.preferences.common.BoolNux;
import com.instagram.preferences.common.IntNux;
import com.instagram.preferences.common.Nux;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class RBE extends 1Am {
    public final 0xa A04(1An r13, Class cls) {
        0qQ.A0B(r13, 0);
        0tX A01 = A01(r13, "NuxDisabledUserSharedPreferences");
        if (cls == null) {
            return A01;
        }
        List A00 = A00(cls);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        LinkedHashMap A1H3 = AnonymousClass7TE.A1H();
        SAT.A01(A00, 0u4.A03(A1H2));
        SAT.A00(A00, 0u4.A03(A1H));
        Map A03 = 0u4.A03(A1H2);
        Map A032 = 0u4.A03(A1H);
        Map A033 = 0u4.A03(A1H3);
        ArrayList<Field> A1C = AnonymousClass7TE.A1C();
        for (Object next : A00) {
            if (((AccessibleObject) next).isAnnotationPresent(Nux.class)) {
                A1C.add(next);
            }
        }
        for (Field field : A1C) {
            Annotation annotation = field.getAnnotation(Nux.class);
            if (annotation != null) {
                Nux nux = (Nux) annotation;
                Object obj = field.get((Object) null);
                if (obj instanceof String) {
                    JTP.A1R(obj, A032, nux.getBooleanAlwaysReturn());
                    int intAlwaysReturn = nux.getIntAlwaysReturn();
                    C66580MXl.A1T(obj, A03, intAlwaysReturn);
                    A033.put(obj, DbS.A0j(intAlwaysReturn));
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return new WZK(A01, A1H, A1H2, A1H3);
    }

    public final 0xa A03(1An r2) {
        if (r2 == 1An.A3V) {
            return A04(r2, 1Av.class);
        }
        return A01(r2, "NuxDisabledUserSharedPreferences");
    }

    private final List A00(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList<Field> A15 = DbV.A15(declaredFields);
        for (Field field : declaredFields) {
            0qQ.A0A(field);
            if (0qQ.A0K(field.getType(), String.class) && (field.isAnnotationPresent(Nux.class) || field.isAnnotationPresent(IntNux.class) || field.isAnnotationPresent(BoolNux.class))) {
                A15.add(field);
            }
        }
        for (Field field2 : A15) {
            field2.setAccessible(true);
            int i = 1;
            int i2 = (AnonymousClass7TF.A1V(field2.getAnnotation(IntNux.class)) ? 1 : 0) + (AnonymousClass7TF.A1V(field2.getAnnotation(BoolNux.class)) ? 1 : 0);
            if (field2.getAnnotation(Nux.class) == null) {
                i = 0;
            }
            if (i2 + i > 1) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("More than one Nux annotation present on ");
                throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(field2.get((Object) null), A1A));
            }
        }
        return A15;
    }

    public final C239283Fv A02(1An r6, Class cls) {
        C239283Fv A02 = RBE.super.A02(r6, cls);
        if (cls == null) {
            return A02;
        }
        List<AccessibleObject> A00 = A00(cls);
        for (AccessibleObject isAnnotationPresent : A00) {
            if (!(!isAnnotationPresent.isAnnotationPresent(Nux.class))) {
                throw AnonymousClass7TE.A0z("AsyncKeyValueStores cannot use the @Nux annotation (use @BoolNux or @IntNux)");
            }
        }
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        SAT.A01(A00, A1H);
        SAT.A00(A00, A1H);
        return new C65549LvP(A02, A1H);
    }
}
