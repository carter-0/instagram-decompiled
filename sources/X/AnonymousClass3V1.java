package X;

/* renamed from: X.3V1  reason: invalid class name */
public final class AnonymousClass3V1 extends C249383je {
    public final /* synthetic */ AnonymousClass3Ux A00;

    public AnonymousClass3V1(AnonymousClass3Ux r1) {
        this.A00 = r1;
    }

    public final void onScroll(C238133Ar r3, int i, int i2, int i3, int i4, int i5) {
        AnonymousClass0fD.A0A(512482307, AnonymousClass0fD.A03(1025155683));
    }

    public final void onScrollStateChanged(C238133Ar r6, int i) {
        C238123Aq r1;
        int A03 = AnonymousClass0fD.A03(-2003433900);
        AnonymousClass3Ux r3 = this.A00;
        if (i == 0) {
            r3.A02 = true;
            Object invoke = r3.A00().A00.A04.invoke();
            if (!(invoke instanceof C238123Aq) || (r1 = (C238123Aq) invoke) == null || (!r1.A03.canScrollVertically(1))) {
                r3.A03 = true;
            }
        } else {
            r3.A02 = false;
        }
        AnonymousClass0fD.A0A(1079670182, A03);
    }
}
