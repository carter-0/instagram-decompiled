package X;

import android.content.Context;

/* renamed from: X.5I4  reason: invalid class name */
public final class AnonymousClass5I4 implements C250603lj {
    public final Context A00;

    public AnonymousClass5I4(Context context) {
        0qQ.A0B(context, 1);
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A00 = applicationContext;
    }

    public final void ATF(AnonymousClass30Y r4, C252093oY r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        if (r5.CEk(r4).intValue() == 0) {
            Object obj = r4.A04;
            0qQ.A06(obj);
            AnonymousClass3W1 r1 = (AnonymousClass3W1) obj;
            0qQ.A0B(r1, 0);
            if (r1.A34) {
                r1.A34 = false;
                r1.A0F(this.A00);
            }
        }
    }
}
