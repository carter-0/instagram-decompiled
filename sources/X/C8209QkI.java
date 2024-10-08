package X;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* renamed from: X.QkI  reason: case insensitive filesystem */
public final class C8209QkI extends C269094eZ {
    public Class A00;
    public Annotation A01;

    public final C269094eZ A00(Annotation annotation) {
        Annotation annotation2 = annotation;
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Class<? extends Annotation> cls = this.A00;
        if (cls != annotationType) {
            return new C8211QkK(cls, annotationType, this.A00, this.A01, annotation2);
        }
        this.A01 = annotation;
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Suc, java.lang.Object] */
    public final C12445Suc A01() {
        Class cls = this.A00;
        Annotation annotation = this.A01;
        HashMap hashMap = new HashMap(4);
        hashMap.put(cls, annotation);
        ? obj = new Object();
        obj.A00 = hashMap;
        return obj;
    }

    public final C269114eb A02() {
        return new C12446Sud(this.A00, this.A01);
    }

    public final boolean A03(Annotation annotation) {
        return AnonymousClass7TF.A1W(annotation.annotationType(), this.A00);
    }
}
