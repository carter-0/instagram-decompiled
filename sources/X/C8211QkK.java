package X;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.QkK  reason: case insensitive filesystem */
public final class C8211QkK extends C269094eZ {
    public final HashMap A00;

    public final C269094eZ A00(Annotation annotation) {
        this.A00.put(annotation.annotationType(), annotation);
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Suc, java.lang.Object] */
    public final C12445Suc A01() {
        ? obj = new Object();
        Iterator A0t = AnonymousClass7TF.A0t(this.A00);
        while (A0t.hasNext()) {
            Annotation annotation = (Annotation) A0t.next();
            HashMap hashMap = obj.A00;
            if (hashMap == null) {
                hashMap = AnonymousClass7TE.A1E();
                obj.A00 = hashMap;
            }
            Annotation annotation2 = (Annotation) hashMap.put(annotation.annotationType(), annotation);
            if (annotation2 != null) {
                annotation2.equals(annotation);
            }
        }
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Suc, X.4eb, java.lang.Object] */
    public final C269114eb A02() {
        HashMap hashMap = this.A00;
        if (hashMap.size() == 2) {
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s);
            return new C12447Sue((Class) A1J.getKey(), (Class) A1J2.getKey(), (Annotation) A1J.getValue(), (Annotation) A1J2.getValue());
        }
        ? obj = new Object();
        obj.A00 = hashMap;
        return obj;
    }

    public final boolean A03(Annotation annotation) {
        return this.A00.containsKey(annotation.annotationType());
    }

    public C8211QkK(Class cls, Class cls2, Object obj, Annotation annotation, Annotation annotation2) {
        super(obj);
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A00 = A1E;
        A1E.put(cls, annotation);
        A1E.put(cls2, annotation2);
    }
}
