package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.8Oe  reason: invalid class name and case insensitive filesystem */
public final class C354998Oe {
    public final List A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((C354998Oe) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public C354998Oe(List list) {
        this.A00 = list;
    }
}
