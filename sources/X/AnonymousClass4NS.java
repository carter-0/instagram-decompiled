package X;

import java.util.EnumSet;

/* renamed from: X.4NS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4NS implements Runnable {
    public final /* synthetic */ AnonymousClass4M1 A00;

    public /* synthetic */ AnonymousClass4NS(AnonymousClass4M1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C263814Nl r0;
        C252323ov r02;
        AnonymousClass4M1 r3 = this.A00;
        EnumSet enumSet = AnonymousClass4M1.A1M;
        C263814Nl r03 = r3.A0O;
        if (!(r03 == null || r03.A0A == null || (r02 = r3.A0p) == null)) {
            r3.A0n.ClA(r02.A00.getModuleName(), r3.A0O.A0A.A0T);
        }
        if (!r3.A11.get() && r3.A0M == AnonymousClass3OB.PLAYING && r3.A0K != null && r3.A12 && (r0 = r3.A0O) != null && r0.A0A != null) {
            C252323ov r04 = r3.A0p;
            if (r04 != null) {
                r3.A0n.Cl9(r04.A00.getModuleName(), r3.A0O.A0A.A0T);
            }
            r3.A0o.EFf(r3.A0O.A0A);
        }
    }
}
