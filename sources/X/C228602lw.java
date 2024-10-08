package X;

import android.content.Context;

/* renamed from: X.2lw  reason: invalid class name and case insensitive filesystem */
public final class C228602lw implements AnonymousClass4D6 {
    public final Context A00;
    public final AnonymousClass07i A01;
    public final Integer A02;

    public C228602lw(Context context, AnonymousClass07i r3, Integer num) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r3, 2);
        this.A01 = r3;
        this.A02 = num;
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A00 = applicationContext;
    }

    public final void schedule(AnonymousClass11X r4) {
        if (r4 != null) {
            C228902mW.A00(this.A00, this.A01, r4, this.A02);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C228602lw(Context context, AnonymousClass07i r3) {
        this(context, r3, (Integer) null);
        0qQ.A0B(context, 1);
        0qQ.A0B(r3, 2);
    }

    public final void schedule(AnonymousClass11X r1, int i, int i2, boolean z, boolean z2) {
        schedule(r1);
    }
}
