package X;

/* renamed from: X.H4u  reason: case insensitive filesystem */
public final class C54251H4u extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass6ST A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C262224Cq A06;

    public C54251H4u(AnonymousClass6ST r1, C62320sa r2, C62320sa r3, C262224Cq r4, int i, int i2, int i3) {
        this.A06 = r4;
        this.A03 = r1;
        this.A05 = r2;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = r3;
        this.A00 = i3;
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(35661715);
        this.A04.invoke();
        C46345Dco.A00.A01(this.A00, (Integer) null);
        AnonymousClass0fD.A0A(-1867961706, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(411111480);
        AnonymousClass7TE.A1Z(new C51646Fy5(this.A03, (AnonymousClass4D7) null, 45), this.A06);
        AnonymousClass0fD.A0A(-1305574455, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(205152594);
        AnonymousClass7TE.A1Z(new C51646Fy5(this.A03, (AnonymousClass4D7) null, 46), this.A06);
        AnonymousClass0fD.A0A(752393090, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1817155534);
        int A033 = AnonymousClass0fD.A03(-1632270479);
        this.A05.invoke();
        C46345Dco.A00.A01(this.A02, Integer.valueOf(this.A01));
        AnonymousClass0fD.A0A(276828597, A033);
        AnonymousClass0fD.A0A(1764299359, A032);
    }
}
