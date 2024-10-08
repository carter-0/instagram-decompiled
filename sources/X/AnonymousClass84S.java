package X;

import android.content.Context;

/* renamed from: X.84S  reason: invalid class name */
public final class AnonymousClass84S {
    public static AnonymousClass84S A01;
    public final C312426eP A00;

    public static synchronized AnonymousClass84S A00(Context context, 0lg r4) {
        AnonymousClass84S r1;
        synchronized (AnonymousClass84S.class) {
            r1 = A01;
            if (r1 == null) {
                r1 = new AnonymousClass84S(context.getApplicationContext(), r4);
                A01 = r1;
            }
        }
        return r1;
    }

    public final void A01(AnonymousClass84W r5, C312136ds r6) {
        C312426eP r0 = this.A00;
        if (r0 != null) {
            AnonymousClass84X r3 = new AnonymousClass84X(r5);
            C312676ew r2 = r0.A00;
            r2.A0A.execute(new AnonymousClass84Z(r3, r2, r6));
        }
    }

    public AnonymousClass84S(Context context, 0lg r3) {
        this.A00 = C312406eN.A00(context, C312146dt.A00(r3), r3);
    }
}
