package X;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.Iterator;

/* renamed from: X.QkC  reason: case insensitive filesystem */
public final class C8203QkC extends C8208QkH implements Serializable {
    public final transient Field A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = C269574fL.A00;
            if (obj == null || obj.getClass() != cls) {
                return false;
            }
            Field field = ((C8203QkC) obj).A00;
            Field field2 = this.A00;
            if (field == null) {
                return field2 == null;
            }
            return field.equals(field2);
        }
    }

    public final C268894eF A03() {
        return this.A01.EIi(this.A00.getGenericType());
    }

    public final Class A04() {
        return this.A00.getType();
    }

    public final String A05() {
        return this.A00.getName();
    }

    public final /* bridge */ /* synthetic */ AnnotatedElement A07() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.getName().hashCode();
    }

    public final String toString() {
        return 002.A0g("[field ", A0B(), "]");
    }

    public C8203QkC(C12445Suc suc, C269074eX r2, Field field) {
        super(suc, r2);
        this.A00 = field;
    }
}
