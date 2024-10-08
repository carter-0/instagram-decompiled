package X;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* renamed from: X.Sud  reason: case insensitive filesystem */
public final class C12446Sud implements C269114eb, Serializable {
    public final Class A00;
    public final Annotation A01;

    public final int size() {
        return 1;
    }

    public final Annotation AXK(Class cls) {
        if (this.A00 == cls) {
            return this.A01;
        }
        return null;
    }

    public final boolean CKL(Class[] clsArr) {
        int i = 0;
        while (clsArr[i] != this.A00) {
            i++;
            if (i >= 8) {
                return false;
            }
        }
        return true;
    }

    public C12446Sud(Class cls, Annotation annotation) {
        this.A00 = cls;
        this.A01 = annotation;
    }
}
