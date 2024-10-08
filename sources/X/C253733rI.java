package X;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3rI  reason: invalid class name and case insensitive filesystem */
public final class C253733rI implements AnonymousClass0eM, Serializable {
    public static final AtomicReferenceFieldUpdater A02 = AtomicReferenceFieldUpdater.newUpdater(C253733rI.class, Object.class, "_value");
    public final Object A00;
    public volatile C62320sa A01;
    public volatile Object _value;

    public final boolean CVQ() {
        if (this._value != AnonymousClass0eU.A00) {
            return true;
        }
        return false;
    }

    public final Object getValue() {
        Object obj = this._value;
        AnonymousClass0eU r1 = AnonymousClass0eU.A00;
        if (obj == r1) {
            C62320sa r0 = this.A01;
            if (r0 != null) {
                obj = r0.invoke();
                if (1Ev.A00(this, r1, obj, A02)) {
                    this.A01 = null;
                }
            }
            return this._value;
        }
        return obj;
    }

    public C253733rI(C62320sa r2) {
        this.A01 = r2;
        AnonymousClass0eU r0 = AnonymousClass0eU.A00;
        this._value = r0;
        this.A00 = r0;
    }

    public final String toString() {
        if (CVQ()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
