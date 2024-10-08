package X;

import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.63b  reason: invalid class name */
public final class AnonymousClass63b extends C3023963c {
    public final 04u A00 = new 04u(0);
    public final AnonymousClass63T A01;

    public final void A06() {
        this.A03 = true;
        if (!this.A00.isEmpty()) {
            this.A01.A07(this);
        }
    }

    public final void A07() {
        this.A03 = false;
        AnonymousClass63T r2 = this.A01;
        synchronized (AnonymousClass63T.A0I) {
            if (r2.A01 == this) {
                r2.A01 = null;
                r2.A0A.clear();
            }
        }
    }

    public AnonymousClass63b(GoogleApiAvailability googleApiAvailability, AnonymousClass63T r4, C13806ThV thV) {
        super(googleApiAvailability, thV);
        this.A01 = r4;
        this.A00.A7u(this, "ConnectionlessLifecycleHelper");
    }
}
