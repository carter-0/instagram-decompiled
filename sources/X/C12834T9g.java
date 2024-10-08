package X;

import java.io.Serializable;

/* renamed from: X.T9g  reason: case insensitive filesystem */
public final class C12834T9g implements Serializable {
    public static final C12834T9g A02 = new C12834T9g((Boolean) null, (Object) null);
    public final Boolean A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C12834T9g t9g = (C12834T9g) obj;
        Boolean bool = this.A00;
        Boolean bool2 = t9g.A00;
        if (bool == null) {
            if (bool2 != null) {
                return false;
            }
        } else if (!bool.equals(bool2)) {
            return false;
        }
        Object obj2 = this.A01;
        Object obj3 = t9g.A01;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.A01;
        int i = 1;
        if (obj != null) {
            i = AnonymousClass7TE.A0N(obj, 1);
        }
        Boolean bool = this.A00;
        if (bool != null) {
            return AnonymousClass7TE.A0N(bool, i);
        }
        return i;
    }

    public final String toString() {
        return String.format("JacksonInject.Value(id=%s,useInput=%s)", new Object[]{this.A01, this.A00});
    }

    public C12834T9g(Boolean bool, Object obj) {
        this.A01 = obj;
        this.A00 = bool;
    }
}
