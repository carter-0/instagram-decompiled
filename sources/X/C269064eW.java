package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/* renamed from: X.4eW  reason: invalid class name and case insensitive filesystem */
public abstract class C269064eW {
    public C268894eF A03() {
        return ((C269054eV) this).A03;
    }

    public Class A04() {
        return ((C269054eV) this).A05;
    }

    public String A05() {
        return ((C269054eV) this).A05.getName();
    }

    public Annotation A06(Class cls) {
        return ((C269054eV) this).A04.AXK(cls);
    }

    public boolean A08(Class[] clsArr) {
        return ((C269054eV) this).A04.CKL(clsArr);
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public AnnotatedElement A07() {
        throw AnonymousClass00P.createAndThrow();
    }
}
