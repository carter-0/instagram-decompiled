package X;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

/* renamed from: X.QkN  reason: case insensitive filesystem */
public final class C8214QkN extends SIL {
    public final C269124ec A00;
    public final boolean A01;

    /* JADX WARNING: type inference failed for: r1v4, types: [X.RQd, java.lang.Object] */
    public static void A00(C8214QkN qkN, C269074eX r16, Class cls, Map map) {
        C269094eZ A03;
        if (cls != null) {
            for (Method method : C269574fL.A0M(cls)) {
                if (!Modifier.isStatic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge() && method.getParameterTypes().length <= 2) {
                    SJ6 sj6 = new SJ6(method.getName(), method.getParameterTypes());
                    Map map2 = map;
                    C9129RQd rQd = (C9129RQd) map2.get(sj6);
                    if (rQd == null) {
                        if (qkN.A00 == null) {
                            A03 = C8210QkJ.A00;
                        } else {
                            A03 = qkN.A03(method.getDeclaredAnnotations());
                        }
                        ? obj = new Object();
                        obj.A01 = r16;
                        obj.A02 = method;
                        obj.A00 = A03;
                        map2.put(sj6, obj);
                    } else {
                        if (qkN.A01) {
                            C269094eZ r14 = rQd.A00;
                            for (Annotation annotation : method.getDeclaredAnnotations()) {
                                if (!r14.A03(annotation)) {
                                    r14 = r14.A00(annotation);
                                    C268854eA r10 = qkN.A00;
                                    if (r10.A0p(annotation)) {
                                        for (Annotation annotation2 : C269574fL.A0L(annotation.annotationType())) {
                                            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !r14.A03(annotation2)) {
                                                r14 = r14.A00(annotation2);
                                                if (r10.A0p(annotation2)) {
                                                    r14 = qkN.A02(r14, annotation2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            rQd.A00 = r14;
                        }
                        Method method2 = rQd.A02;
                        if (method2 == null) {
                            rQd.A02 = method;
                        } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            rQd.A02 = method;
                            rQd.A01 = r16;
                        }
                    }
                }
            }
        }
    }

    public C8214QkN(C268854eA r1, C269124ec r2, boolean z) {
        super(r1);
        this.A00 = r1 == null ? null : r2;
        this.A01 = z;
    }
}
