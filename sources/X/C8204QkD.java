package X;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.util.Iterator;

/* renamed from: X.QkD  reason: case insensitive filesystem */
public final class C8204QkD extends C8208QkH implements Serializable {
    public final Class A00;
    public final String A01;
    public final C268894eF A02;

    public C8204QkD(C268894eF r2, C269074eX r3, Class cls, String str) {
        super((C12445Suc) null, r3);
        this.A00 = cls;
        this.A02 = r2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = C269574fL.A00;
            if (obj == null || obj.getClass() != cls) {
                return false;
            }
            C8204QkD qkD = (C8204QkD) obj;
            if (qkD.A00 != this.A00 || !qkD.A01.equals(this.A01)) {
                return false;
            }
        }
        return true;
    }

    public final C268894eF A03() {
        return this.A02;
    }

    public final Class A04() {
        return this.A02.A00;
    }

    public final String A05() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnnotatedElement A07() {
        return null;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return 002.A0g("[virtual ", A0B(), "]");
    }
}
