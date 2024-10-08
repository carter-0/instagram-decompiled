package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.5H8  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass5H8 {
    public static final void A02(C262094Cc r3) {
        C262204Co r0 = (C262204Co) r3.get(C262204Co.A00);
        if (r0 != null) {
            for (C262204Co AG7 : r0.AnN()) {
                AG7.AG7((CancellationException) null);
            }
        }
    }

    public static final C262204Co A00(C262094Cc r2) {
        C262204Co r0 = (C262204Co) r2.get(C262204Co.A00);
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Current context doesn't contain Job in it: ");
        sb.append(r2);
        throw new IllegalStateException(sb.toString());
    }

    public static final void A01(CancellationException cancellationException, C262094Cc r2) {
        C262204Co r0 = (C262204Co) r2.get(C262204Co.A00);
        if (r0 != null) {
            r0.AG7(cancellationException);
        }
    }

    public static final boolean A03(C262094Cc r1) {
        C262204Co r0 = (C262204Co) r1.get(C262204Co.A00);
        if (r0 != null) {
            return r0.isActive();
        }
        return true;
    }
}
