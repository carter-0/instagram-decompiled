package X;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Iterator;

/* renamed from: X.QkF  reason: case insensitive filesystem */
public final class C8206QkF extends C8207QkG implements Serializable {
    public Class[] A00;
    public final transient Method A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = C269574fL.A00;
            if (obj == null || obj.getClass() != cls) {
                return false;
            }
            Method method = ((C8206QkF) obj).A01;
            Method method2 = this.A01;
            if (method == null) {
                return method2 == null;
            }
            return method.equals(method2);
        }
    }

    public final C268894eF A03() {
        return this.A01.EIi(this.A01.getGenericReturnType());
    }

    public final Class A04() {
        return this.A01.getReturnType();
    }

    public final String A05() {
        return this.A01.getName();
    }

    public final /* bridge */ /* synthetic */ AnnotatedElement A07() {
        return this.A01;
    }

    public final int hashCode() {
        return this.A01.getName().hashCode();
    }

    public final String toString() {
        return 002.A0g("[method ", A0B(), "]");
    }

    public C8206QkF(C12445Suc suc, C269074eX r3, Method method, C12445Suc[] sucArr) {
        super(suc, r3, sucArr);
        if (method != null) {
            this.A01 = method;
            return;
        }
        throw AnonymousClass7TE.A0w("Cannot construct AnnotatedMethod with null Method");
    }

    public final String A0B() {
        StringBuilder sb;
        String str;
        String A0B = super.A0B();
        int A0F = A0F();
        if (A0F == 0) {
            sb = AnonymousClass7TF.A0n(A0B);
            str = "()";
        } else if (A0F != 1) {
            return String.format("%s(%d params)", C51968G9o.A1Z(super.A0B(), A0F()));
        } else {
            sb = AnonymousClass7TF.A0n(A0B);
            sb.append("(");
            Pxe.A1W(A0I(0), sb);
            str = ")";
        }
        return AnonymousClass7TF.A0l(str, sb);
    }
}
