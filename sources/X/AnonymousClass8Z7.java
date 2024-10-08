package X;

import java.io.Closeable;

/* renamed from: X.8Z7  reason: invalid class name */
public final class AnonymousClass8Z7 implements Closeable, AnonymousClass0hF {
    public boolean A00;
    public final C319836rJ A01;
    public final String A02;

    public final void A00(AnonymousClass07V r3, 08Y r4) {
        if (!this.A00) {
            this.A00 = true;
            r3.A09(this);
            r4.A03(this.A01.A00, this.A02);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public final void Dms(07T r3, AnonymousClass07Z r4) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        if (r3 == 07T.ON_DESTROY) {
            this.A00 = false;
            r4.getLifecycle().A0A(this);
        }
    }

    public final void close() {
    }

    public AnonymousClass8Z7(C319836rJ r1, String str) {
        this.A02 = str;
        this.A01 = r1;
    }
}
