package X;

public final class FS9 implements AnonymousClass2Kv {
    public final /* synthetic */ C49479EwK A00;

    public FS9(C49479EwK ewK) {
        this.A00 = ewK;
    }

    public final void invoke(AnonymousClass3JD r8) {
        boolean z;
        C250663lr A0U;
        C250663lr optionalTreeField;
        C49479EwK ewK = this.A00;
        if (r8 == null || (A0U = C41845B3m.A0U(r8)) == null || (optionalTreeField = A0U.getOptionalTreeField(0, AnonymousClass000.A00(3180), C43229Bur.class, 1872334164)) == null) {
            z = false;
        } else {
            z = optionalTreeField.getCoercedBooleanField(0, AnonymousClass000.A00(3470));
        }
        27y r4 = ewK.A00;
        r4.A01 = z;
        r4.A00 = System.currentTimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        A002.ATE(new EIA(r4, z ? 1 : 0, currentTimeMillis));
        C363768kJ r0 = ewK.A01;
        if (r0 != null) {
            r0.onSuccess();
        }
    }
}
