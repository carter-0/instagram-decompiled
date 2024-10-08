package X;

import java.lang.reflect.Method;

@Deprecated
/* renamed from: X.6r3  reason: invalid class name and case insensitive filesystem */
public final class C319696r3 {
    public final int A00;
    public final Method A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C319696r3)) {
            return false;
        }
        C319696r3 r4 = (C319696r3) obj;
        return this.A00 == r4.A00 && this.A01.getName().equals(r4.A01.getName());
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.getName().hashCode();
    }

    public C319696r3(Method method, int i) {
        this.A00 = i;
        this.A01 = method;
        method.setAccessible(true);
    }
}
