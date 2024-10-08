package X;

/* renamed from: X.XwY  reason: case insensitive filesystem */
public final class C22169XwY implements Y9G {
    public final /* bridge */ /* synthetic */ void reportTo(C21292XSz xSz, Y9F y9f) {
        XIY xiy = (XIY) xSz;
        AnonymousClass7TG.A1N(xiy, y9f);
        C21302XUk.A00(y9f, Long.valueOf(xiy.A02), "pgpgin");
        C21302XUk.A00(y9f, Long.valueOf(xiy.A03), "pgpgout");
        C21302XUk.A00(y9f, Long.valueOf(xiy.A04), "pswpin");
        C21302XUk.A00(y9f, Long.valueOf(xiy.A05), "pswpout");
        C21302XUk.A00(y9f, Long.valueOf(xiy.A00), "pgfault");
        C21302XUk.A00(y9f, Long.valueOf(xiy.A01), "pgmajfault");
    }
}
