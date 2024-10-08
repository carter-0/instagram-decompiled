package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Dcn  reason: case insensitive filesystem */
public final class C46344Dcn implements AnonymousClass4D6 {
    public final WeakReference A00;

    public final void schedule(AnonymousClass11X r2) {
        AnonymousClass4DH r0 = (AnonymousClass4DH) this.A00.get();
        if (r0 != null) {
            r0.schedule(r2);
        }
    }

    public C46344Dcn(C227232is r2) {
        this.A00 = new WeakReference(r2);
    }

    public final void schedule(AnonymousClass11X r7, int i, int i2, boolean z, boolean z2) {
        AnonymousClass4DH r0 = (AnonymousClass4DH) this.A00.get();
        if (r0 != null) {
            r0.schedule(r7, i, i2, z, z2);
        }
    }
}
