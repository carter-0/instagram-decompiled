package X;

/* renamed from: X.Sv3  reason: case insensitive filesystem */
public final class C12471Sv3 implements C13736Tg8 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final void Dap(Boolean bool, Integer num, Throwable th) {
        0qQ.A0B(th, 0);
        AnonymousClass6Tm A0Q = DbY.A0Q(DbY.A0q("auth_factor_expired", bool, AnonymousClass7TE.A1L("exception", th.toString()), AnonymousClass7TE.A1L("remaining_attempts", DbX.A0t(num))));
        C299275ur.A00((C307896Rx) this.A01, A0Q, (C277014uI) this.A02);
    }

    public final void Das(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass6Tm A0Q = DbY.A0Q(str);
        C299275ur.A00((C307896Rx) this.A01, A0Q, (C277014uI) this.A03);
    }

    public C12471Sv3(C307896Rx r1, C277014uI r2, C277014uI r3, int i) {
        this.A00 = i;
        this.A03 = r2;
        this.A01 = r1;
        this.A02 = r3;
    }
}
