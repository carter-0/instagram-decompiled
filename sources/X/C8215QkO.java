package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

/* renamed from: X.QkO  reason: case insensitive filesystem */
public final class C8215QkO extends SIL {
    public final C269124ec A00;
    public final AnonymousClass4eE A01;
    public final boolean A02;

    public static Map A00(C268894eF r11, C8215QkO qkO, C269074eX r13) {
        Map map = null;
        C268894eF A05 = r11.A05();
        if (A05 != null) {
            Class cls = r11.A00;
            map = A00(A05, qkO, new C12443SuZ(A05.A0G(), qkO.A01));
            for (Field field : cls.getDeclaredFields()) {
                if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
                    if (map == null) {
                        map = AnonymousClass7TE.A1H();
                    }
                    C10584Rue rue = new C10584Rue(r13, field);
                    if (qkO.A02) {
                        C269094eZ r5 = rue.A00;
                        for (Annotation annotation : field.getDeclaredAnnotations()) {
                            r5 = r5.A00(annotation);
                            if (qkO.A00.A0p(annotation)) {
                                r5 = qkO.A02(r5, annotation);
                            }
                        }
                        rue.A00 = r5;
                    }
                    map.put(field.getName(), rue);
                }
            }
        }
        return map;
    }

    public C8215QkO(C268854eA r1, C269124ec r2, AnonymousClass4eE r3, boolean z) {
        super(r1);
        this.A01 = r3;
        this.A00 = r1 == null ? null : r2;
        this.A02 = z;
    }
}
