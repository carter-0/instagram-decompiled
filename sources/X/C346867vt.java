package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.7vt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C346867vt implements AnonymousClass0hF {
    public final /* synthetic */ C346857vs A00;
    public final /* synthetic */ C262204Co A01;

    public /* synthetic */ C346867vt(C346857vs r1, C262204Co r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Dms(07T r5, AnonymousClass07Z r6) {
        C346857vs r3 = this.A00;
        C262204Co r2 = this.A01;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r6, 2);
        if (r6.getLifecycle().A07() == 07U.A02) {
            r2.AG7((CancellationException) null);
            r3.A00();
            return;
        }
        int compareTo = r6.getLifecycle().A07().compareTo(r3.A01);
        C346847vr r1 = r3.A00;
        if (compareTo < 0) {
            r1.A01 = true;
        } else if (!r1.A01) {
        } else {
            if (!r1.A00) {
                r1.A01 = false;
                r1.A00();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher");
        }
    }
}
