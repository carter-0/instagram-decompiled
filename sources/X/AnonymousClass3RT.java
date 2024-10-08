package X;

import java.util.NoSuchElementException;

/* renamed from: X.3RT  reason: invalid class name */
public final class AnonymousClass3RT {
    public final Object A00;

    public final Object A00() {
        Object obj = this.A00;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final String toString() {
        Object obj = this.A00;
        if (obj != null) {
            return String.format("Optional[%s]", new Object[]{obj});
        }
        return "Optional.empty";
    }

    public AnonymousClass3RT(Object obj) {
        this.A00 = obj;
    }

    public AnonymousClass3RT() {
        this.A00 = null;
    }
}
