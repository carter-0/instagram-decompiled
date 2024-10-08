package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Pdk  reason: case insensitive filesystem */
public final /* synthetic */ class C73503Pdk implements C62320sa {
    public final /* synthetic */ C331037Pg A00;

    public /* synthetic */ C73503Pdk(C331037Pg r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        C331037Pg r3 = this.A00;
        AnonymousClass7GP r4 = r3.A05;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r4.A00(C69475NmJ.RAISE_DEVICE, timeUnit.toSeconds((long) r3.A01()), timeUnit.toSeconds((long) r3.A02()));
        return C60340gF.A00;
    }
}
