package X;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* renamed from: X.Sue  reason: case insensitive filesystem */
public final class C12447Sue implements C269114eb, Serializable {
    public final Class A00;
    public final Class A01;
    public final Annotation A02;
    public final Annotation A03;

    public final int size() {
        return 2;
    }

    public final Annotation AXK(Class cls) {
        if (this.A00 == cls) {
            return this.A02;
        }
        if (this.A01 == cls) {
            return this.A03;
        }
        return null;
    }

    public final boolean CKL(Class[] clsArr) {
        int i = 0;
        do {
            Class cls = clsArr[i];
            if (cls == this.A00 || cls == this.A01) {
                return true;
            }
            i++;
        } while (i < 8);
        return false;
    }

    public C12447Sue(Class cls, Class cls2, Annotation annotation, Annotation annotation2) {
        this.A00 = cls;
        this.A02 = annotation;
        this.A01 = cls2;
        this.A03 = annotation2;
    }
}
