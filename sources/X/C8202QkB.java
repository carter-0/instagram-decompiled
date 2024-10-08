package X;

import java.lang.reflect.AnnotatedElement;
import java.util.Iterator;

/* renamed from: X.QkB  reason: case insensitive filesystem */
public final class C8202QkB extends C8208QkH {
    public final int A00;
    public final C268894eF A01;
    public final C8207QkG A02;

    public final String A05() {
        return "";
    }

    public final AnnotatedElement A07() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = C269574fL.A00;
            if (obj == null || obj.getClass() != cls) {
                return false;
            }
            C8202QkB qkB = (C8202QkB) obj;
            if (!qkB.A02.equals(this.A02) || qkB.A00 != this.A00) {
                return false;
            }
        }
        return true;
    }

    public final C268894eF A03() {
        return this.A01;
    }

    public final Class A04() {
        return this.A01.A00;
    }

    public final int hashCode() {
        return this.A02.hashCode() + this.A00;
    }

    public C8202QkB(C268894eF r1, C8207QkG qkG, C12445Suc suc, C269074eX r4, int i) {
        super(suc, r4);
        this.A02 = qkG;
        this.A01 = r1;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("[parameter #");
        A1A.append(this.A00);
        A1A.append(", annotations: ");
        return Pxg.A0r(this.A00, A1A);
    }
}
