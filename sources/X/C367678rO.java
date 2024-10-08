package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.8rO  reason: invalid class name and case insensitive filesystem */
public final class C367678rO implements C635813i, Serializable {
    public final Object A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C367678rO) {
            return 2PP.A00(this.A00, ((C367678rO) obj).A00);
        }
        return false;
    }

    public final Object get() {
        return this.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pxd.A00(571));
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }

    public C367678rO(Object obj) {
        this.A00 = obj;
    }
}
