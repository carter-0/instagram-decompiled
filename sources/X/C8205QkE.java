package X;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.util.Iterator;

/* renamed from: X.QkE  reason: case insensitive filesystem */
public final class C8205QkE extends C8207QkG {
    public final Constructor A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = C269574fL.A00;
            if (obj == null || obj.getClass() != cls) {
                return false;
            }
            Constructor constructor = ((C8205QkE) obj).A00;
            Constructor constructor2 = this.A00;
            if (constructor == null) {
                return constructor2 == null;
            }
            return constructor.equals(constructor2);
        }
    }

    public final C268894eF A03() {
        return this.A01.EIi(this.A00.getDeclaringClass());
    }

    public final Class A04() {
        return this.A00.getDeclaringClass();
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
        String str;
        Constructor constructor = this.A00;
        int length = constructor.getParameterTypes().length;
        String A06 = C269574fL.A06(constructor.getDeclaringClass());
        Integer valueOf = Integer.valueOf(length);
        if (length == 1) {
            str = "";
        } else {
            str = "s";
        }
        return String.format("[constructor for %s (%d arg%s), annotations: %s", new Object[]{A06, valueOf, str, this.A00});
    }

    public C8205QkE(C12445Suc suc, C269074eX r3, Constructor constructor, C12445Suc[] sucArr) {
        super(suc, r3, sucArr);
        if (constructor != null) {
            this.A00 = constructor;
            return;
        }
        throw AnonymousClass7TE.A0w("Null constructor not allowed");
    }
}
