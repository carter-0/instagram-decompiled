package X;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class SIL {
    public static final C12445Suc[] A01 = new C12445Suc[0];
    public static final Annotation[] A02 = new Annotation[0];
    public final C268854eA A00;

    public final C269094eZ A03(Annotation[] annotationArr) {
        C269094eZ r4 = C8210QkJ.A00;
        for (Annotation annotation : annotationArr) {
            r4 = r4.A00(annotation);
            if (this.A00.A0p(annotation)) {
                r4 = A02(r4, annotation);
            }
        }
        return r4;
    }

    public SIL(C268854eA r1) {
        this.A00 = r1;
    }

    public final C269094eZ A02(C269094eZ r6, Annotation annotation) {
        for (Annotation annotation2 : C269574fL.A0L(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (!this.A00.A0p(annotation2)) {
                    r6 = r6.A00(annotation2);
                } else if (!r6.A03(annotation2)) {
                    r6 = A02(r6.A00(annotation2), annotation2);
                }
            }
        }
        return r6;
    }
}
