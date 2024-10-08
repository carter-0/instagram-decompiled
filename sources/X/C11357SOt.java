package X;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.SOt  reason: case insensitive filesystem */
public final class C11357SOt {
    public final String A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11357SOt)) {
            return false;
        }
        C11357SOt sOt = (C11357SOt) obj;
        return this.A00.equals(sOt.A00) && this.A01.equals(sOt.A01);
    }

    public static Annotation A01(C11357SOt sOt, Object obj) {
        return (Annotation) sOt.A01.get(obj);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + this.A01.hashCode();
    }

    public C11357SOt(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }

    public static C11357SOt A00(String str) {
        return new C11357SOt(str, Collections.emptyMap());
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FieldDescriptor{name=");
        A1A.append(this.A00);
        A1A.append(C273654mx.A00(1127));
        return C66582MXn.A0v(this.A01.values(), A1A);
    }
}
