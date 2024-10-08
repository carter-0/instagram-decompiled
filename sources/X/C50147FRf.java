package X;

/* renamed from: X.FRf  reason: case insensitive filesystem */
public final class C50147FRf implements 2Kw {
    public final /* synthetic */ C49479EwK A00;

    public C50147FRf(C49479EwK ewK) {
        this.A00 = ewK;
    }

    public final void invoke(Throwable th) {
        C49479EwK ewK = this.A00;
        0qQ.A0A(th);
        0qQ.A0B(th, 0);
        ewK.A00.A04.A02("", "", th.getMessage());
        C363768kJ r0 = ewK.A01;
        if (r0 != null) {
            r0.onFailure();
        }
    }
}
