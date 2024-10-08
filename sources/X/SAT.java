package X;

import com.instagram.preferences.common.BoolNux;
import com.instagram.preferences.common.IntNux;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class SAT {
    public static final void A00(List list, Map map) {
        ArrayList<Field> A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((AccessibleObject) next).isAnnotationPresent(BoolNux.class)) {
                A1C.add(next);
            }
        }
        for (Field field : A1C) {
            Annotation annotation = field.getAnnotation(BoolNux.class);
            if (annotation != null) {
                BoolNux boolNux = (BoolNux) annotation;
                Object obj = field.get((Object) null);
                if (obj instanceof String) {
                    JTP.A1R(obj, map, boolNux.alwaysReturn());
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public static final void A01(List list, Map map) {
        ArrayList<Field> A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((AccessibleObject) next).isAnnotationPresent(IntNux.class)) {
                A1C.add(next);
            }
        }
        for (Field field : A1C) {
            Annotation annotation = field.getAnnotation(IntNux.class);
            if (annotation != null) {
                IntNux intNux = (IntNux) annotation;
                Object obj = field.get((Object) null);
                if (obj instanceof String) {
                    C66580MXl.A1T(obj, map, intNux.alwaysReturn());
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
