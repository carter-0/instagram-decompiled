package X;

import java.io.Serializable;

/* renamed from: X.3jh  reason: invalid class name and case insensitive filesystem */
public final class C249413jh implements AnonymousClass0eM, Serializable {
    public Object A00 = AnonymousClass0eU.A00;
    public C62320sa A01;

    public final boolean CVQ() {
        if (this.A00 != AnonymousClass0eU.A00) {
            return true;
        }
        return false;
    }

    public final Object getValue() {
        Object obj = this.A00;
        if (obj != AnonymousClass0eU.A00) {
            return obj;
        }
        C62320sa r0 = this.A01;
        0qQ.A0A(r0);
        Object invoke = r0.invoke();
        this.A00 = invoke;
        this.A01 = null;
        return invoke;
    }

    public C249413jh(C62320sa r2) {
        this.A01 = r2;
    }

    public final String toString() {
        if (CVQ()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
