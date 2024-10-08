package X;

public final class RR4 {
    public C13625Tdr A00;
    public boolean A01;

    public final void A00(C8589QxR qxR) {
        if (this.A01) {
            SUN.A0A("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.A00.ELI(new C8302Qni(RE0.DEFAULT, qxR));
        } catch (Throwable unused) {
            SUN.A0A("BillingLogger", "logging failed.");
        }
    }
}
