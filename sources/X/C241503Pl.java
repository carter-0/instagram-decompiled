package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3Pl  reason: invalid class name and case insensitive filesystem */
public final class C241503Pl implements AnonymousClass4D7, AnonymousClass4D8 {
    public static final AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C241503Pl.class, Object.class, "result");
    public final AnonymousClass4D7 A00;
    public volatile Object result;

    public C241503Pl(AnonymousClass4D7 r2) {
        this(1Hj.A04, r2);
    }

    public final Object A00() {
        Object obj = this.result;
        1Hj r2 = 1Hj.A04;
        if (obj == r2) {
            if (!1Ev.A00(this, r2, 1Hj.A02, A01)) {
                obj = this.result;
            }
            return 1Hj.A02;
        }
        if (obj != 1Hj.A03) {
            if (!(obj instanceof 0eQ)) {
                return obj;
            }
            throw ((0eQ) obj).A00;
        }
        return 1Hj.A02;
    }

    public final AnonymousClass4D8 getCallerFrame() {
        AnonymousClass4D7 r1 = this.A00;
        if (r1 instanceof AnonymousClass4D8) {
            return (AnonymousClass4D8) r1;
        }
        return null;
    }

    public final C262094Cc getContext() {
        return this.A00.getContext();
    }

    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            1Hj r1 = 1Hj.A04;
            if (obj2 != r1) {
                1Hj r2 = 1Hj.A02;
                if (obj2 == r2) {
                    if (1Ev.A00(this, r2, 1Hj.A03, A01)) {
                        this.A00.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else if (1Ev.A00(this, r1, obj, A01)) {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SafeContinuation for ");
        sb.append(this.A00);
        return sb.toString();
    }

    public C241503Pl(Object obj, AnonymousClass4D7 r2) {
        this.A00 = r2;
        this.result = obj;
    }
}
