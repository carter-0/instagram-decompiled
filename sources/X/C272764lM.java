package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.4lM  reason: invalid class name and case insensitive filesystem */
public final class C272764lM extends AnonymousClass07V implements AnonymousClass07Z {
    public AnonymousClass07Z A00;
    public 07U A01 = 07U.A04;
    public final AnonymousClass07V A02 = this;
    public final Set A03 = new HashSet();

    public final synchronized 07U A07() {
        07U r0;
        AnonymousClass07V lifecycle;
        AnonymousClass07Z r02 = this.A00;
        if (r02 == null || (lifecycle = r02.getLifecycle()) == null) {
            r0 = this.A01;
        } else {
            r0 = lifecycle.A07();
        }
        return r0;
    }

    public final synchronized void A09(AnonymousClass07Y r2) {
        AnonymousClass07V lifecycle;
        0qQ.A0B(r2, 0);
        this.A03.add(r2);
        AnonymousClass07Z r0 = this.A00;
        if (!(r0 == null || (lifecycle = r0.getLifecycle()) == null)) {
            lifecycle.A09(r2);
        }
    }

    public final synchronized void A0A(AnonymousClass07Y r2) {
        AnonymousClass07V lifecycle;
        0qQ.A0B(r2, 0);
        AnonymousClass07Z r0 = this.A00;
        if (!(r0 == null || (lifecycle = r0.getLifecycle()) == null)) {
            lifecycle.A0A(r2);
        }
        this.A03.remove(r2);
    }

    public final synchronized void A0B(AnonymousClass07Z r5) {
        if (!0qQ.A0K(r5, this)) {
            AnonymousClass07Z r3 = this.A00;
            if (r5 != r3) {
                if (r3 != null) {
                    for (AnonymousClass07Y A0A : this.A03) {
                        r3.getLifecycle().A0A(A0A);
                    }
                }
                AnonymousClass07V lifecycle = r5.getLifecycle();
                if (lifecycle != null) {
                    for (AnonymousClass07Y A09 : this.A03) {
                        lifecycle.A09(A09);
                    }
                }
                this.A00 = r5;
            }
        } else {
            throw new IllegalArgumentException("Cannot set a LifecycleOwnerWrapper as its own delegate");
        }
    }

    public final AnonymousClass07V getLifecycle() {
        return this.A02;
    }

    public C272764lM(AnonymousClass07Z r2) {
        this.A00 = r2;
    }
}
