package X;

/* renamed from: X.8LX  reason: invalid class name */
public final class AnonymousClass8LX implements C3510587k {
    public final /* synthetic */ AnonymousClass8LU A00;

    public AnonymousClass8LX(AnonymousClass8LU r1) {
        this.A00 = r1;
    }

    public final void Cwo(Integer num, boolean z) {
        int intValue = num.intValue();
        boolean z2 = true;
        if (!(intValue == 0 || intValue == 2 || intValue == 3)) {
            z2 = false;
        }
        AnonymousClass8LU r1 = this.A00;
        AnonymousClass3Q2 r0 = r1.A0D;
        if (r0 != null) {
            r0.A5F = z2;
            r1.A0J();
        }
        C378369Pn r02 = r1.A0B;
        if (r02 != null) {
            C378459Pw r03 = r02.A08;
            if (z2) {
                if (r03 != null) {
                    r03.A09();
                }
            } else if (r03 != null) {
                r03.A0A();
            }
        }
        if (z && r1.A0l.A18 != null) {
            int i = 2131976405;
            if (z2) {
                i = 2131976404;
            }
            AnonymousClass8LU.A0B(r1, i);
        }
    }
}
