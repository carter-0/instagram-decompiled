package X;

/* renamed from: X.FRg  reason: case insensitive filesystem */
public final class C50148FRg implements 2Kw {
    public final /* synthetic */ F0I A00;

    public C50148FRg(F0I f0i) {
        this.A00 = f0i;
    }

    public final void invoke(Throwable th) {
        F0I f0i = this.A00;
        0qQ.A0A(th);
        0qQ.A0B(th, 0);
        1wg r3 = f0i.A02.A07;
        String str = f0i.A04;
        String str2 = f0i.A00.A02;
        0qQ.A07(str2);
        r3.A02(str, str2, th.getMessage());
        C363768kJ r0 = f0i.A03;
        if (r0 != null) {
            r0.onFailure();
        }
    }
}
