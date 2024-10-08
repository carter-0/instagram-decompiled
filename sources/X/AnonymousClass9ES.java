package X;

/* renamed from: X.9ES  reason: invalid class name */
public final class AnonymousClass9ES implements 2Kw {
    public final /* synthetic */ AnonymousClass9EN A00;

    public AnonymousClass9ES(AnonymousClass9EN r1) {
        this.A00 = r1;
    }

    public final void invoke(Throwable th) {
        AnonymousClass9EN r4 = this.A00;
        0qQ.A0A(th);
        0qQ.A0B(th, 0);
        1wg r3 = r4.A01.A07;
        String str = r4.A03;
        String str2 = r4.A00.A02;
        0qQ.A07(str2);
        r3.A02(str, str2, th.getMessage());
        C363768kJ r0 = r4.A02;
        if (r0 != null) {
            r0.onFailure();
        }
    }
}
