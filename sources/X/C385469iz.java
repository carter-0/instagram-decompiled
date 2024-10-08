package X;

/* renamed from: X.9iz  reason: invalid class name and case insensitive filesystem */
public final class C385469iz extends 1P0 {
    public final /* synthetic */ C336257eK A00;

    public C385469iz(C336257eK r1) {
        this.A00 = r1;
    }

    public final void A00(AnonymousClass1XT r5) {
        int A03 = AnonymousClass0fD.A03(1165061821);
        0qQ.A0B(r5, 0);
        C336257eK r1 = this.A00;
        C336537em r52 = (C336537em) r5;
        r1.A04 = r52.getItems();
        r1.A01 = r52.B3J();
        r1.A03 = r52.BnF();
        r1.A06 = true;
        r1.A07 = false;
        r1.A05 = false;
        C337237fw r0 = r1.A00;
        if (r0 != null) {
            r0.Dam(r1);
        }
        AnonymousClass0fD.A0A(211463778, A03);
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-766505560);
        C336257eK r1 = this.A00;
        if (!r1.A06) {
            r1.A04 = 0sn.A00;
            r1.A07 = false;
            r1.A05 = true;
            r1.A06 = true;
            C337237fw r0 = r1.A00;
            if (r0 != null) {
                r0.Dam(r1);
            }
        }
        AnonymousClass0fD.A0A(-231976658, A03);
    }

    public final void onFinish() {
        AnonymousClass0fD.A0A(-662399746, AnonymousClass0fD.A03(-323451237));
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(2080386451);
        this.A00.A07 = true;
        AnonymousClass0fD.A0A(-923755704, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-385894203);
        A00((AnonymousClass1XT) obj);
        AnonymousClass0fD.A0A(678454643, A03);
    }
}
