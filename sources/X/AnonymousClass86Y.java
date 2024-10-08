package X;

import android.app.Activity;
import java.util.UUID;

/* renamed from: X.86Y  reason: invalid class name */
public final class AnonymousClass86Y {
    public final Activity A00;
    public final C3502984c A01;
    public final AnonymousClass86W A02;
    public final C357638Yz A03;
    public final C62320sa A04;

    public AnonymousClass86Y(Activity activity, C3502984c r2, AnonymousClass86W r3, C357638Yz r4, C62320sa r5) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = activity;
        this.A04 = r5;
    }

    public final void A00(int i) {
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        C3494680m r4 = this.A03.A08;
        int i2 = i;
        if (r4.A00 instanceof AnonymousClass80O) {
            AnonymousClass81C r3 = this.A01.A00;
            C357648Za r2 = (C357648Za) r3.A00();
            Integer num = AnonymousClass05K.A00;
            if (r2.A04.A01 && r2.A05(num, obj)) {
                ((C357648Za) r3.A00()).A01 = Integer.valueOf(i);
                return;
            }
        }
        boolean A042 = ((C357648Za) this.A01.A00.A00()).A04();
        AnonymousClass849 A012 = C359198cG.A01((C279284yO) r4.A00);
        AnonymousClass81C r1 = this.A02.A00;
        ((C357358Xo) r1.A00()).A04(A012);
        C357358Xo r12 = (C357358Xo) r1.A00();
        Activity activity = this.A00;
        float floatValue = ((Number) this.A04.invoke()).floatValue();
        boolean z = false;
        if (A012 == AnonymousClass849.A06) {
            z = true;
        }
        r12.A03(activity, A012, floatValue, 1.0f, i2, z, A042, false);
    }
}
